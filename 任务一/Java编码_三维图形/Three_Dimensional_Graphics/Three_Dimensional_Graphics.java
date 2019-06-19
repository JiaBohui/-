/*
 *  该java程序为三维图形体系，
 *  包含5个类：点类，圆类，球类，圆柱类，圆锥类
 *  点类piont为其他所有类的父类
 *  在圆类中计算圆的面积周长，球类，圆柱类，圆锥类中计算球的表面积和体积
 * */
package sanweituxing;
/************        三维图形体系包           ***************/
import java.util.Scanner;
import java.lang.Math;
public class _2 {
     public static void main (String args[])
     {
    	 /********       类的对象的定义    ********/
    	 Point point=new Point();   //定义点类的对象
    	 Circle circle=new Circle();//定义圆类的对象
    	 Ball ball=new Ball();      //定义球类的对象
    	 Column column=new Column();//定义圆柱类的对象
    	 Cone cone=new Cone();     //定义圆锥类的对象     
    	 /***********     对象对成员函数的调用        **********/
    	 //点类成员函数的调用
    	 point.set_x();             //设置点的横坐标x函数 
    	 point.set_y();             //设置点的纵坐标y函数
    	 point.disp();              //点的参数信息输出函数
    	 //圆类成员函数的调用
    	 circle.set_r();             //获取圆的半径函数
    	 circle.disp();              //圆的信息显示函数
    	 System.out.println("圆的周长："+circle.cir());
    	 System.out.println("圆的面积："+circle.area());
    	 //球类成员函数的调用
    	 ball.set_R();             //球的半径设置函数
    	 ball.disp();              //球的参数信息输出函数
    	 System.out.println("球的表面积："+ball.area());
    	 System.out.println("球的体积："+ball.volume());
    	 //圆柱类成员函数的调用
    	 column.set_h();           //圆柱的高设置函数
    	 column.set_r();           //圆柱的半径设置函数
    	 column.disp();            //圆柱参数信息显示函数 
    	 System.out.println("圆柱的表面积："+column.area());
    	 System.out.println("圆柱的体积："+column.volume());
    	 //圆锥类成员
    	 cone.set_H();            //圆锥的高设置函数
    	 cone.set_r();            //圆锥的半径设置函数
    	 cone.disp();             //圆锥参数信息显示函数 
    	 System.out.println("圆锥的表面积："+cone.area());
    	 System.out.println("圆锥的体积："+cone.volume());
     }
}
/************       接口的定义         ****************/
interface Circumference          //周长接口
{
	public double cir();         //周长计算函数
}
interface Area                   //面积接口
{
	public double area();        //面积计算函数
}
interface Volume                 //体积接口
{
	public double volume();      //体积计算函数
}
/**********       类的定义        *********/
class Point                      //点类的定义
{ 
	private
	    float point_x,point_y;   //point_x,point_y坐标数据成员
	Scanner input=new Scanner(System.in);
	 
	public void set_x()          //设置x坐标函数
	    {
		    float x1;
		    System.out.print("输入x坐标：");
	        x1=input.nextFloat();//输入浮点型的坐标数据
		    point_x=x1;
		}
	    void set_y()             //设置y坐标函数
	    {
	    	float y1;
	    	System.out.print("输入y坐标：");
	    	y1=input.nextFloat();
	    	point_y=y1;
	    }
	    float get_x()            //获取x坐标函数
	    {
	    	return point_x;
	    }
	    float get_y()            //获取y坐标函数
	    {
	    	return point_y;
	    }
	    void disp()              //显示x坐标y坐标函数
	    {
	    	System.out.println("x坐标："+point_x);
	        System.out.println("y坐标："+point_y);
	    }
}
//由点类派生出圆类
class Circle extends Point implements Circumference,Area
{
	private
	    float circle_r;          //半径数据成员
	public
	    void set_r()             //设置半径函数
	    {
		    float r1;
		    System.out.print("输入圆的半径：");
		    r1=input.nextFloat();
		    circle_r=r1;
		}
	    float get_r()            //获取半径函数
	    {
	    	return circle_r;
	    }  
        void disp()              //重载显示函数，显示半径函数
        {
        	System.out.println("半径r："+circle_r);
        }
    public double cir()          //计算圆的周长函数
    {
    	double C;
    	C=2*3.14*circle_r;
    	return C;
    }
    public double area()         //计算圆的面积函数
    {
    	double S;
    	S=3.14*circle_r*circle_r;
    	return S;
    }
}
//由圆类派生球类
class Ball extends Circle implements Volume,Area
{
	private
	    float ball_r;           //球的半径成员变量
	public
	    void set_R()            //设置半径R函数
	    {
		    float R1;
		    System.out.print("输入球的半径：");
		    R1=input.nextFloat();
		    ball_r=R1;
	    }
	    float get_R()            //获取R的值函数
	    {
	    	return ball_r;
	    }
	    void disp()              //显示球的半径函数
	    {
	    	System.out.println("球的半径R："+ball_r);
	    }
	    public double volume()   //球的体积函数
	    {
	    	double V;
	    	V=3.14*ball_r*ball_r*ball_r*4;      
	    	return V;            //返回球的体积
	    }
	    public double area()     //球的表面积
	    {
	    	double S;
	    	S=3.14*ball_r*ball_r*4/3;      
	    	return S;
	    }
}
//由圆类派生圆柱类
class Column extends Circle implements Volume,Area
{
	private
	    float column_h,column_r;  //圆柱的高成员变量
	public
	    void set_h()              //设置圆柱的高函数
	    {
		    float h1;
		    System.out.print("输入圆柱的高：");
		    h1=input.nextFloat();
		    column_h=h1;
	    }
	    public void set_r()       //设置半径函数
        {
	        float r1;
	        System.out.print("输入圆柱的半径：");
	        r1=input.nextFloat();
	        column_r=r1;
	    }
	    float get_h()             //获取圆柱的高函数
	    {
	    	return column_h;
	    }
	    void disp()               //显示圆柱的底面半径和高函数
	    {
	    	System.out.println("圆柱的底面半径R："+column_r+" 高"+column_h);
	    }
	    public double volume()    //圆柱的体积函数
	    {
	    	double V;
	    	V=3.14*column_r*column_r*column_h;
	    	return V;
	    }
	    public double area()      //圆柱的表面积函数
	    {
	    	double S;
	    	S=3.14*column_r*column_r*2+2*3.14*column_r*column_h;
	    	return S;
	    }
}
//由圆类派生圆锥类
class Cone extends Circle implements Volume,Area
{
	private
    float cone_h,cone_r;         //圆锥的高、半径
    public void set_H()                 //设置圆锥的高函数
    {
	    float H1;
	    System.out.print("输入圆锥的高：");
	    H1=input.nextFloat();
	    cone_h=H1;
    }
    public void set_r()          //设置半径函数
    {
        float r1;
        System.out.print("输入圆的半径：");
        r1=input.nextFloat();
        cone_r=r1;
    }
    float get_H()                //获取圆锥的高函数
    {
    	return cone_h;
    }
    void disp()                  //显示圆锥的底面半径和高函数
    {
    	System.out.println("圆柱的底面半径R："+cone_r+" 高"+cone_h);
    }
    public double volume()       //圆锥的体积函数
    {
    	double V;
    	V=3.14*cone_r*cone_r*cone_h/3;//计算圆锥体积
    	return V;
    }
    public double area()         //圆锥的表面积函数
    {
    	double S;
    	double L;                //L为母线长
    	L=cone_r*cone_r+cone_h*cone_h;//计算母线长度
    	S=3.14*cone_r*cone_r*2+2*3.14*cone_r*Math.sqrt(L);
    	return S;
    }
}