package drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class Text extends Shape {
	Text(){
		Type = drawing.ElementType.TEXT;//图元类型
		OrgX = 100;//原点坐标
		OrgY = 100;
		BorderColor = new Color(255, 0, 0);//边界颜色
		BorderType = 0;//边界线型--实线、虚线、虚点线等
		BorderWidth = 1;//边界宽度
		FillColor = new Color(0, 255, 0);//填充颜色
		FillType = 0;//填充类型--实心、双对角、十字交叉等
		height = 50;
		angle = 30;
	}
	Text(int x, int y, int h, int a, String t){
		Type = drawing.ElementType.TEXT;//图元类型
		OrgX = x;//原点坐标
		OrgY = y;
		height = 100;
		angle = 30;
		text = "Yangtze University";
		BorderColor = new Color(255, 0, 0);//边界颜色
		BorderType = 0;//边界线型--实线、虚线、虚点线等
		BorderWidth = 1;//边界宽度
		FillColor = new Color(0, 255, 0);//填充颜色
		FillType = 0;//填充类型--实心、双对角、十字交叉等
	}
	void Draw(Graphics c) {//绘制文档   
		int px1[]={50,400,450};
		int py1[]={50,100,200};
		c.drawPolygon(px1,py1,3);
		c.fillPolygon(px1, py1, 3);
		c.setColor(BorderColor);
	}
	boolean IsMatched(Point pnt) {//重载，点pnt是否落在图元内
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
