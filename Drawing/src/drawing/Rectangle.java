package drawing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class Rectangle extends Shape {
	int width;
	int height;
	Rectangle(){
		Type=drawing.ElementType.RECTANGLE;
		OrgX=100;//ԭ������
		OrgY=100;
		BorderColor=new Color(255,0,0);//�߽���ɫ
		BorderType=BasicStroke.CAP_BUTT;//�߽�����--ʵ�ߡ����ߡ�����ߵ�
		BorderWidth=1;//�߽���
		FillColor=new Color(0,255,0);//�����ɫ
		FillType=BasicStroke.CAP_BUTT;//�������--ʵ�ġ�˫�Խǡ�ʮ�ֽ����
		width=100;
		height=50;
	}
	Rectangle(int x, int y, int w, int h){
		Type=drawing.ElementType.RECTANGLE;
		OrgX=x;//ԭ������
		OrgY=y;	
		BorderColor=new Color(250,0,0);//�߽���ɫ
		BorderType=BasicStroke.CAP_BUTT;//�߽�����--ʵ�ߡ����ߡ�����ߵ�
		BorderWidth=1;//�߽���
		FillColor=new Color(0,255,0);//�����ɫ
		FillType=BasicStroke.CAP_BUTT;//�������--ʵ�ġ�˫�Խǡ�ʮ�ֽ����
		width=w;
		height=h;
	}
	void Draw(Graphics c) {
		c.drawRect(OrgX, OrgY, width, height);
		c.fillRect(OrgY, OrgY, width, height);
		c.setColor(BorderColor);

	}//���Ƴ�����    
	boolean IsMatched(Point pnt) {
		if((pnt.x >=OrgX-width/2)&&(pnt.x <=OrgX+width/2)&&(pnt.y>=OrgY- height/2)&&(pnt.y <=OrgY+height/2))
			return true;
			else	
				return false;
			
			
//		���أ���pnt�Ƿ�����ͼԪ��
	}
	void SetValue(ElementType t,int x,int y,int w,int h) {
		Type=t;
		OrgX=x;
		OrgY=y;
		w=width;
		h=height;
	}
	void GetValue(ElementType t,int x,int y,int w,int h) {
		t=Type;
		x=OrgX;
		y=OrgY;
		w=width;
		h=height;
	}
}
