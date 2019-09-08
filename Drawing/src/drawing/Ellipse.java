package drawing;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Ellipse extends Shape {
	Ellipse(){
		Type =drawing.ElementType. ELLIPSE;//ͼԪ����
		OrgX = 200;//ԭ������
		OrgY = 200;
		BorderColor = new Color(255, 0, 0);//�߽���ɫ
		BorderType = 0;//�߽�����--ʵ�ߡ����ߡ�����ߵ�
		BorderWidth = 1;//�߽���
		FillColor = new Color(0, 255, 0);//�����ɫ
		FillType = 0;//�������--ʵ�ġ�˫�Խǡ�ʮ�ֽ����
		radiusa = 25;
		radiusb = 50;
	}
	Ellipse(int x, int y, int sa, int sb){
			Type = drawing.ElementType.ELLIPSE;//ͼԪ����
			OrgX = x;//ԭ������
			OrgY = y;
			BorderColor = new Color(255, 0, 0);//�߽���ɫ
			BorderType = 0;//�߽�����--ʵ�ߡ����ߡ�����ߵ�
			BorderWidth = 1;//�߽���
			FillColor = new Color(0, 255, 0);//�����ɫ
			FillType = 0;//�������--ʵ�ġ�˫�Խǡ�ʮ�ֽ����
			radiusa = sa;
			radiusb = sb;
		
	}
	void Draw(Graphics c) {
		c.drawRect(OrgX, OrgY, radiusa, radiusb);
		c.fillRect(OrgX, OrgY, radiusa, radiusb);
		c.setColor(BorderColor);
		//������Բ   
	}
	void SetValue(ElementType t,int x,int y,int w,int h) {
		Type=t; 
		OrgX=x;
		OrgY=y;
		radiusa=w;
		radiusb=h;
	}
	void GetValue(ElementType t,int x,int y,int w,int h) {
		t=Type;
		x=OrgX;
		y=OrgY;
		w=radiusa;
		h=radiusb;
	}
	int radiusa;
	int radiusb;
}
