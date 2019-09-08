package drawing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class Square extends Shape {
	int width;
	Square(){
	Type=drawing.ElementType.SQUARE;
	OrgX=100;//ԭ������
	OrgY=100;
	BorderColor= new Color(255,0,0);//�߽���ɫ
	BorderType= BasicStroke.CAP_BUTT;//�߽�����--ʵ�ߡ����ߡ�����ߵ�
	BorderWidth=1;//�߽���
	FillColor= new Color(0,255,0);//�����ɫ
	FillType= BasicStroke.CAP_BUTT;//�������--ʵ�ġ�˫�Խǡ�ʮ�ֽ����
	width=100;
}
	Square(int x,int y,int w)
	{Type=drawing.ElementType.SQUARE;
	OrgX=x;//ԭ������
	OrgY=y;
	BorderColor=new Color(255,0,0);//�߽���ɫ
	BorderType=BasicStroke.CAP_BUTT;//�߽�����--ʵ�ߡ����ߡ�����ߵ�
	BorderWidth=1;//�߽���
	FillColor=new Color(0,255,0);//�����ɫ
	FillType=BasicStroke.CAP_BUTT;//�������--ʵ�ġ�˫�Խǡ�ʮ�ֽ����
	width=w;}
	void Draw(Graphics c) {
		c.drawRect(OrgX, OrgY, width, width);
		c.fillRect(OrgX, OrgY, width, width);
		c.setColor(BorderColor);
		//����������    
	}
	boolean IsMatched(Point pnt) {
	int radius=100;
		if ((pnt.x >= OrgX - radius / 2) && (pnt.x <= OrgX + radius / 2) && (pnt.y >= OrgY - radius / 2) && (pnt.y <= OrgY + radius / 2))
			return true;
		else
			return false;
		//���أ���pnt�Ƿ�����ͼԪ��
	}
	void SetValue(ElementType t,int x,int y,int w,int h) {
		Type=t; 
		OrgX=x;
		OrgY=y;
		w=width;
	}
	void GetValue(ElementType t,int x,int y,int w,int h) {
		t=Type;
		x=OrgX;
		y=OrgY;
		w=width;
		h=0;
	}
}
