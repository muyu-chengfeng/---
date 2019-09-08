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
		OrgX=100;//原点坐标
		OrgY=100;
		BorderColor=new Color(255,0,0);//边界颜色
		BorderType=BasicStroke.CAP_BUTT;//边界线型--实线、虚线、虚点线等
		BorderWidth=1;//边界宽度
		FillColor=new Color(0,255,0);//填充颜色
		FillType=BasicStroke.CAP_BUTT;//填充类型--实心、双对角、十字交叉等
		width=100;
		height=50;
	}
	Rectangle(int x, int y, int w, int h){
		Type=drawing.ElementType.RECTANGLE;
		OrgX=x;//原点坐标
		OrgY=y;	
		BorderColor=new Color(250,0,0);//边界颜色
		BorderType=BasicStroke.CAP_BUTT;//边界线型--实线、虚线、虚点线等
		BorderWidth=1;//边界宽度
		FillColor=new Color(0,255,0);//填充颜色
		FillType=BasicStroke.CAP_BUTT;//填充类型--实心、双对角、十字交叉等
		width=w;
		height=h;
	}
	void Draw(Graphics c) {
		c.drawRect(OrgX, OrgY, width, height);
		c.fillRect(OrgY, OrgY, width, height);
		c.setColor(BorderColor);

	}//绘制长方形    
	boolean IsMatched(Point pnt) {
		if((pnt.x >=OrgX-width/2)&&(pnt.x <=OrgX+width/2)&&(pnt.y>=OrgY- height/2)&&(pnt.y <=OrgY+height/2))
			return true;
			else	
				return false;
			
			
//		重载，点pnt是否落在图元内
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
