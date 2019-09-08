package drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class Text extends Shape {
	Text(){
		Type = drawing.ElementType.TEXT;//ͼԪ����
		OrgX = 100;//ԭ������
		OrgY = 100;
		BorderColor = new Color(255, 0, 0);//�߽���ɫ
		BorderType = 0;//�߽�����--ʵ�ߡ����ߡ�����ߵ�
		BorderWidth = 1;//�߽���
		FillColor = new Color(0, 255, 0);//�����ɫ
		FillType = 0;//�������--ʵ�ġ�˫�Խǡ�ʮ�ֽ����
		height = 50;
		angle = 30;
	}
	Text(int x, int y, int h, int a, String t){
		Type = drawing.ElementType.TEXT;//ͼԪ����
		OrgX = x;//ԭ������
		OrgY = y;
		height = 100;
		angle = 30;
		text = "Yangtze University";
		BorderColor = new Color(255, 0, 0);//�߽���ɫ
		BorderType = 0;//�߽�����--ʵ�ߡ����ߡ�����ߵ�
		BorderWidth = 1;//�߽���
		FillColor = new Color(0, 255, 0);//�����ɫ
		FillType = 0;//�������--ʵ�ġ�˫�Խǡ�ʮ�ֽ����
	}
	void Draw(Graphics c) {//�����ĵ�   
		int px1[]={50,400,450};
		int py1[]={50,100,200};
		c.drawPolygon(px1,py1,3);
		c.fillPolygon(px1, py1, 3);
		c.setColor(BorderColor);
	}
	boolean IsMatched(Point pnt) {//���أ���pnt�Ƿ�����ͼԪ��
		if ((pnt.x >= OrgX ) && (pnt.y >= OrgY ))
			return true;
		else
			return false;
	}
	void SetValue(ElementType t,int x,int y,int w,int h) {
		Type=t;
		OrgX = x;
		OrgY = y;
		angle = w;
		height = h;
	}
	void GetValue(ElementType t, int x, int y, int w, int h) {
		t = Type;
		x = OrgX;
		y = OrgY;
		w = angle;
		h = height;
	}
	void SetText(String a) {
		text=a;
	}
	void GetText(String a) {
		a=text;
	}
	int height;
	int angle;
	String text;
}
