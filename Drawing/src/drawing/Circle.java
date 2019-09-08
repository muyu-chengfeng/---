package drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.io.ObjectOutputStream;

public abstract class Circle extends Shape {
	int radius;
	Circle(){
		Type = drawing.ElementType.CIRCLE;//ͼԪ����
		OrgX = 550;//ԭ������
		OrgY = 100;
		BorderColor = new Color(255, 0, 0);//�߽���ɫ
		BorderType = 0;//�߽�����--ʵ�ߡ����ߡ�����ߵ�
		BorderWidth = 1;//�߽���
		FillColor = new Color(0, 255, 0);//�����ɫ
		FillType = 0;//�������--ʵ�ġ�˫�Խǡ�ʮ�ֽ����
		radius = 100;
	}
	Circle(int x, int y, int r){
		Type = drawing.ElementType.CIRCLE;//ͼԪ����
		OrgX = x;//ԭ������
		OrgY = y;
		BorderColor =new Color(250,0,0);//�߽���ɫ
		BorderType = 0;//�߽�����--ʵ�ߡ����ߡ�����ߵ�
		BorderWidth = 1;//�߽���
		FillColor =new Color(0,250,0);//�����ɫ
		FillType = 0;//�������--ʵ�ġ�˫�Խǡ�ʮ�ֽ����
		radius = r;
	}
	void Draw(Graphics c) {
		c.drawRect(OrgX, OrgY, radius, radius);
		c.fillRect(OrgX, OrgY, radius, radius);
		c.setColor(BorderColor);
		//����Բ   
	}
	boolean IsMatched(Point pnt) {
		if ((pnt.x >= OrgX - radius / 2) && (pnt.x <= OrgX + radius / 2) && (pnt.y >= OrgY - radius / 2) && (pnt.y <= OrgY + radius / 2))
			return true;
		else
			return false;
		//���أ���pnt�Ƿ�����ͼԪ��
	}
   void Serialize(ObjectOutputStream ar) {
		
	}
	//���л�ԲͼԪ
	void SetValue(ElementType t,int x,int y,int width,int height) {
		Type=t; 
		OrgX=x;
		OrgY=y;
		radius=width;
	}
	void GetValue(ElementType t,int x,int y,int w,int h) {
		t=Type;
		x=OrgX;
		y=OrgY;
		w=radius;
		h=0;
	}
}
