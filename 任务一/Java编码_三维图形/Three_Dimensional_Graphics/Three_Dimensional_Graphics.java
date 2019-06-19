/*
 *  ��java����Ϊ��άͼ����ϵ��
 *  ����5���ࣺ���࣬Բ�࣬���࣬Բ���࣬Բ׶��
 *  ����piontΪ����������ĸ���
 *  ��Բ���м���Բ������ܳ������࣬Բ���࣬Բ׶���м�����ı���������
 * */
package sanweituxing;
/************        ��άͼ����ϵ��           ***************/
import java.util.Scanner;
import java.lang.Math;
public class _2 {
     public static void main (String args[])
     {
    	 /********       ��Ķ���Ķ���    ********/
    	 Point point=new Point();   //�������Ķ���
    	 Circle circle=new Circle();//����Բ��Ķ���
    	 Ball ball=new Ball();      //��������Ķ���
    	 Column column=new Column();//����Բ����Ķ���
    	 Cone cone=new Cone();     //����Բ׶��Ķ���     
    	 /***********     ����Գ�Ա�����ĵ���        **********/
    	 //�����Ա�����ĵ���
    	 point.set_x();             //���õ�ĺ�����x���� 
    	 point.set_y();             //���õ��������y����
    	 point.disp();              //��Ĳ�����Ϣ�������
    	 //Բ���Ա�����ĵ���
    	 circle.set_r();             //��ȡԲ�İ뾶����
    	 circle.disp();              //Բ����Ϣ��ʾ����
    	 System.out.println("Բ���ܳ���"+circle.cir());
    	 System.out.println("Բ�������"+circle.area());
    	 //�����Ա�����ĵ���
    	 ball.set_R();             //��İ뾶���ú���
    	 ball.disp();              //��Ĳ�����Ϣ�������
    	 System.out.println("��ı������"+ball.area());
    	 System.out.println("��������"+ball.volume());
    	 //Բ�����Ա�����ĵ���
    	 column.set_h();           //Բ���ĸ����ú���
    	 column.set_r();           //Բ���İ뾶���ú���
    	 column.disp();            //Բ��������Ϣ��ʾ���� 
    	 System.out.println("Բ���ı������"+column.area());
    	 System.out.println("Բ���������"+column.volume());
    	 //Բ׶���Ա
    	 cone.set_H();            //Բ׶�ĸ����ú���
    	 cone.set_r();            //Բ׶�İ뾶���ú���
    	 cone.disp();             //Բ׶������Ϣ��ʾ���� 
    	 System.out.println("Բ׶�ı������"+cone.area());
    	 System.out.println("Բ׶�������"+cone.volume());
     }
}
/************       �ӿڵĶ���         ****************/
interface Circumference          //�ܳ��ӿ�
{
	public double cir();         //�ܳ����㺯��
}
interface Area                   //����ӿ�
{
	public double area();        //������㺯��
}
interface Volume                 //����ӿ�
{
	public double volume();      //������㺯��
}
/**********       ��Ķ���        *********/
class Point                      //����Ķ���
{ 
	private
	    float point_x,point_y;   //point_x,point_y�������ݳ�Ա
	Scanner input=new Scanner(System.in);
	 
	public void set_x()          //����x���꺯��
	    {
		    float x1;
		    System.out.print("����x���꣺");
	        x1=input.nextFloat();//���븡���͵���������
		    point_x=x1;
		}
	    void set_y()             //����y���꺯��
	    {
	    	float y1;
	    	System.out.print("����y���꣺");
	    	y1=input.nextFloat();
	    	point_y=y1;
	    }
	    float get_x()            //��ȡx���꺯��
	    {
	    	return point_x;
	    }
	    float get_y()            //��ȡy���꺯��
	    {
	    	return point_y;
	    }
	    void disp()              //��ʾx����y���꺯��
	    {
	    	System.out.println("x���꣺"+point_x);
	        System.out.println("y���꣺"+point_y);
	    }
}
//�ɵ���������Բ��
class Circle extends Point implements Circumference,Area
{
	private
	    float circle_r;          //�뾶���ݳ�Ա
	public
	    void set_r()             //���ð뾶����
	    {
		    float r1;
		    System.out.print("����Բ�İ뾶��");
		    r1=input.nextFloat();
		    circle_r=r1;
		}
	    float get_r()            //��ȡ�뾶����
	    {
	    	return circle_r;
	    }  
        void disp()              //������ʾ��������ʾ�뾶����
        {
        	System.out.println("�뾶r��"+circle_r);
        }
    public double cir()          //����Բ���ܳ�����
    {
    	double C;
    	C=2*3.14*circle_r;
    	return C;
    }
    public double area()         //����Բ���������
    {
    	double S;
    	S=3.14*circle_r*circle_r;
    	return S;
    }
}
//��Բ����������
class Ball extends Circle implements Volume,Area
{
	private
	    float ball_r;           //��İ뾶��Ա����
	public
	    void set_R()            //���ð뾶R����
	    {
		    float R1;
		    System.out.print("������İ뾶��");
		    R1=input.nextFloat();
		    ball_r=R1;
	    }
	    float get_R()            //��ȡR��ֵ����
	    {
	    	return ball_r;
	    }
	    void disp()              //��ʾ��İ뾶����
	    {
	    	System.out.println("��İ뾶R��"+ball_r);
	    }
	    public double volume()   //����������
	    {
	    	double V;
	    	V=3.14*ball_r*ball_r*ball_r*4;      
	    	return V;            //����������
	    }
	    public double area()     //��ı����
	    {
	    	double S;
	    	S=3.14*ball_r*ball_r*4/3;      
	    	return S;
	    }
}
//��Բ������Բ����
class Column extends Circle implements Volume,Area
{
	private
	    float column_h,column_r;  //Բ���ĸ߳�Ա����
	public
	    void set_h()              //����Բ���ĸߺ���
	    {
		    float h1;
		    System.out.print("����Բ���ĸߣ�");
		    h1=input.nextFloat();
		    column_h=h1;
	    }
	    public void set_r()       //���ð뾶����
        {
	        float r1;
	        System.out.print("����Բ���İ뾶��");
	        r1=input.nextFloat();
	        column_r=r1;
	    }
	    float get_h()             //��ȡԲ���ĸߺ���
	    {
	    	return column_h;
	    }
	    void disp()               //��ʾԲ���ĵ���뾶�͸ߺ���
	    {
	    	System.out.println("Բ���ĵ���뾶R��"+column_r+" ��"+column_h);
	    }
	    public double volume()    //Բ�����������
	    {
	    	double V;
	    	V=3.14*column_r*column_r*column_h;
	    	return V;
	    }
	    public double area()      //Բ���ı��������
	    {
	    	double S;
	    	S=3.14*column_r*column_r*2+2*3.14*column_r*column_h;
	    	return S;
	    }
}
//��Բ������Բ׶��
class Cone extends Circle implements Volume,Area
{
	private
    float cone_h,cone_r;         //Բ׶�ĸߡ��뾶
    public void set_H()                 //����Բ׶�ĸߺ���
    {
	    float H1;
	    System.out.print("����Բ׶�ĸߣ�");
	    H1=input.nextFloat();
	    cone_h=H1;
    }
    public void set_r()          //���ð뾶����
    {
        float r1;
        System.out.print("����Բ�İ뾶��");
        r1=input.nextFloat();
        cone_r=r1;
    }
    float get_H()                //��ȡԲ׶�ĸߺ���
    {
    	return cone_h;
    }
    void disp()                  //��ʾԲ׶�ĵ���뾶�͸ߺ���
    {
    	System.out.println("Բ���ĵ���뾶R��"+cone_r+" ��"+cone_h);
    }
    public double volume()       //Բ׶���������
    {
    	double V;
    	V=3.14*cone_r*cone_r*cone_h/3;//����Բ׶���
    	return V;
    }
    public double area()         //Բ׶�ı��������
    {
    	double S;
    	double L;                //LΪĸ�߳�
    	L=cone_r*cone_r+cone_h*cone_h;//����ĸ�߳���
    	S=3.14*cone_r*cone_r*2+2*3.14*cone_r*Math.sqrt(L);
    	return S;
    }
}