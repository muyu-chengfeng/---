package drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class Triangle extends Shape {
	Triangle(){
		Type = drawing.ElementType.TRIANGLE;//ͼԪ����
		OrgX = 100;//ԭ������
		OrgY = 100;
		BorderColor = new Color(255, 0, 0);//�߽���ɫ
		BorderType = 0;//�߽�����--ʵ�ߡ����ߡ�����ߵ�
		BorderWidth = 1;//�߽���
		FillColor = new Color(0, 255, 0);//�����ɫ
		FillType = 0;//�������--ʵ�ġ�˫�Խǡ�ʮ�ֽ����
		width = 100;
	}
	Triangle(int x, int y, int w){
		Type = drawing.ElementType.TRIANGLE;//ͼԪ����
		OrgX = x;//ԭ������
		OrgY = y;
		BorderColor = new Color(255, 0, 0);//�߽���ɫ
		BorderType = 0;//�߽�����--ʵ�ߡ����ߡ�����ߵ�
		BorderWidth = 1;//�߽���
		FillColor = new Color(0, 255, 0);//�����ɫ
		FillType = 0;//�������--ʵ�ġ�˫�Խǡ�ʮ�ֽ����
		width = w;
	}
	void Draw(Graphics c) {//����������    
		int px1[]={50,400,450};
		int py1[]={50,100,200};
		c.drawPolygon(px1,py1,3);
		c.fillPolygon(px1, py1, 3);
		c.setColor(BorderColor);
	}
	boolean IsMatched(Point pnt) {
		//���أ���pnt�Ƿ�����ͼԪ��
		if ((pnt.x >= OrgX - width / 2) && (pnt.x <= OrgX + width / 2) && (pnt.y >= OrgY - width / 2) && (pnt.y <= OrgY + width / 2))
			return true;
		else
			return false;
	}
	void SetValue(ElementType t,int x,int y,int w,int height) {
		Type=t;
		OrgX=x;
		OrgY=y;
		w=width;
	}
	void GetValue(ElementType t,int x,int y,int w,int height) {
		t=Type;
		x=OrgX;
		y=OrgY;
		w=width;
	}
	int width;
}
