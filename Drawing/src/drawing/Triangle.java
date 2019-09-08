package drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class Triangle extends Shape {
	Triangle(){
		Type = drawing.ElementType.TRIANGLE;//图元类型
		OrgX = 100;//原点坐标
		OrgY = 100;
		BorderColor = new Color(255, 0, 0);//边界颜色
		BorderType = 0;//边界线型--实线、虚线、虚点线等
		BorderWidth = 1;//边界宽度
		FillColor = new Color(0, 255, 0);//填充颜色
		FillType = 0;//填充类型--实心、双对角、十字交叉等
		width = 100;
	}
	Triangle(int x, int y, int w){
		Type = drawing.ElementType.TRIANGLE;//图元类型
		OrgX = x;//原点坐标
		OrgY = y;
		BorderColor = new Color(255, 0, 0);//边界颜色
		BorderType = 0;//边界线型--实线、虚线、虚点线等
		BorderWidth = 1;//边界宽度
		FillColor = new Color(0, 255, 0);//填充颜色
		FillType = 0;//填充类型--实心、双对角、十字交叉等
		width = w;
	}
	void Draw(Graphics c) {//绘制三角形    
		int px1[]={50,400,450};
		int py1[]={50,100,200};
		c.drawPolygon(px1,py1,3);
		c.fillPolygon(px1, py1, 3);
		c.setColor(BorderColor);
	}
	boolean IsMatched(Point pnt) {
		//重载，点pnt是否落在图元内
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
