package drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.io.ObjectOutputStream;

public abstract class Circle extends Shape {
	int radius;
	Circle(){
		Type = drawing.ElementType.CIRCLE;//图元类型
		OrgX = 550;//原点坐标
		OrgY = 100;
		BorderColor = new Color(255, 0, 0);//边界颜色
		BorderType = 0;//边界线型--实线、虚线、虚点线等
		BorderWidth = 1;//边界宽度
		FillColor = new Color(0, 255, 0);//填充颜色
		FillType = 0;//填充类型--实心、双对角、十字交叉等
		radius = 100;
	}
	Circle(int x, int y, int r){
		Type = drawing.ElementType.CIRCLE;//图元类型
		OrgX = x;//原点坐标
		OrgY = y;
		BorderColor =new Color(250,0,0);//边界颜色
		BorderType = 0;//边界线型--实线、虚线、虚点线等
		BorderWidth = 1;//边界宽度
		FillColor =new Color(0,250,0);//填充颜色
		FillType = 0;//填充类型--实心、双对角、十字交叉等
		radius = r;
	}
	void Draw(Graphics c) {
		c.drawRect(OrgX, OrgY, radius, radius);
		c.fillRect(OrgX, OrgY, radius, radius);
		c.setColor(BorderColor);
		//绘制圆   
	}
	boolean IsMatched(Point pnt) {
		if ((pnt.x >= OrgX - radius / 2) && (pnt.x <= OrgX + radius / 2) && (pnt.y >= OrgY - radius / 2) && (pnt.y <= OrgY + radius / 2))
			return true;
		else
			return false;
		//重载，点pnt是否落在图元内
	}
   void Serialize(ObjectOutputStream ar) {
		
	}
	//序列化圆图元
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
