package drawing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class Square extends Shape {
	int width;
	Square(){
	Type=drawing.ElementType.SQUARE;
	OrgX=100;//原点坐标
	OrgY=100;
	BorderColor= new Color(255,0,0);//边界颜色
	BorderType= BasicStroke.CAP_BUTT;//边界线型--实线、虚线、虚点线等
	BorderWidth=1;//边界宽度
	FillColor= new Color(0,255,0);//填充颜色
	FillType= BasicStroke.CAP_BUTT;//填充类型--实心、双对角、十字交叉等
	width=100;
}
	Square(int x,int y,int w)
	{Type=drawing.ElementType.SQUARE;
	OrgX=x;//原点坐标
	OrgY=y;
	BorderColor=new Color(255,0,0);//边界颜色
	BorderType=BasicStroke.CAP_BUTT;//边界线型--实线、虚线、虚点线等
	BorderWidth=1;//边界宽度
	FillColor=new Color(0,255,0);//填充颜色
	FillType=BasicStroke.CAP_BUTT;//填充类型--实心、双对角、十字交叉等
	width=w;}
	void Draw(Graphics c) {
		c.drawRect(OrgX, OrgY, width, width);
		c.fillRect(OrgX, OrgY, width, width);
		c.setColor(BorderColor);
		//绘制正方形    
	}
	boolean IsMatched(Point pnt) {
	int radius=100;
		if ((pnt.x >= OrgX - radius / 2) && (pnt.x <= OrgX + radius / 2) && (pnt.y >= OrgY - radius / 2) && (pnt.y <= OrgY + radius / 2))
			return true;
		else
			return false;
		//重载，点pnt是否落在图元内
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
