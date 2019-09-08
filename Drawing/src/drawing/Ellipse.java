package drawing;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Ellipse extends Shape {
	Ellipse(){
		Type =drawing.ElementType. ELLIPSE;//图元类型
		OrgX = 200;//原点坐标
		OrgY = 200;
		BorderColor = new Color(255, 0, 0);//边界颜色
		BorderType = 0;//边界线型--实线、虚线、虚点线等
		BorderWidth = 1;//边界宽度
		FillColor = new Color(0, 255, 0);//填充颜色
		FillType = 0;//填充类型--实心、双对角、十字交叉等
		radiusa = 25;
		radiusb = 50;
	}
	Ellipse(int x, int y, int sa, int sb){
			Type = drawing.ElementType.ELLIPSE;//图元类型
			OrgX = x;//原点坐标
			OrgY = y;
			BorderColor = new Color(255, 0, 0);//边界颜色
			BorderType = 0;//边界线型--实线、虚线、虚点线等
			BorderWidth = 1;//边界宽度
			FillColor = new Color(0, 255, 0);//填充颜色
			FillType = 0;//填充类型--实心、双对角、十字交叉等
			radiusa = sa;
			radiusb = sb;
		
	}
	void Draw(Graphics c) {
		c.drawRect(OrgX, OrgY, radiusa, radiusb);
		c.fillRect(OrgX, OrgY, radiusa, radiusb);
		c.setColor(BorderColor);
		//绘制椭圆   
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
