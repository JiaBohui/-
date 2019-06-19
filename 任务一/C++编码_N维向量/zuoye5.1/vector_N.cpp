#include "vector_N.h"
//默认构造函数，将对象的数据成员分别初始化为维数n=0，指针p指向空
vector_N::vector_N(void)
{
	n=0;                  //n表示维数
	p=NULL;               //设置指针初始指向空
}
//定义复制构造函数,复制构造函数的作用是将实参对象的各数据成员值一一赋给新的对象中的数据成员
vector_N::vector_N(const vector_N &c)
{
	n=c.n;                
	int i=0;               //循环变量
	p=new int [c.n];       //动态创建变量
	for(i=0;i<c.n;i++)     //循环赋值
		p[i]=c.p[i];
}
//默认析构函数，释放动态内存
vector_N::~vector_N(void)
{
	delete []p;            //删除指针控件
	n=0;                   //修改维数为0
	p=NULL;                //指针指向空
}
//定义重载=运算符，两边是类的对象，需要定义成类的成员类型
vector_N vector_N::operator =(vector_N a)
{
	int i;                 //循环变量
	n=a.n;
	p=new int [a.n];
	for(i=0;i<a.n;i++)
		p[i]=a.p[i];
	return *this;
}
//定义重载输入流函数
istream &operator >>(istream &input,vector_N &a)
{
	input>>a.n;            //输入维数
	int i;                 //循环变量
	if(a.n<0)              
	{//输入数据错误，输出错误信息并退出
		cout<<"Error Length!"<<endl;
		_exit(0);
	}
	else
	{
		a.p=new int[a.n]; //动态创建类的对象
		for(i=0;i<a.n;i++)//循环输入对象的各个参数信息
			input>>a.p[i];
	}
	return input;
}
//定义重载输出流函数
ostream &operator <<(ostream &output,vector_N &a)
{
	int i;                 //循环变量
	output<<"(";
	for(i=0;i<a.n-1;i++)  //循环输出对象的参数信息
	{
		output<<a.p[i]<<", ";
	}
	output<<a.p[i]<<")";
	return output;
}
/*定义重载运算符，主函数中在调用运算符v3=v1+v2时，定义一个类的
对象c并用形参a初始化对象c，系统为形参a自动调用复制构造函数，
p[i]是v2的数据成员指针p动态内存中的数据，a.p[i]是v1向量中的元素
，c是v1v2相加的结果，返回给v3*/
vector_N vector_N::operator+(vector_N &a)
{
	int i;
	vector_N c=vector_N(a); //定义类的对象，进行对象的复制
	for(i=0;i<a.n;i++)      //循环相加
		c.p[i]=a.p[i]+p[i];    
	return c;
}
//定义重载-运算符
vector_N vector_N::operator-(vector_N &a)
{
	int i;                 //循环变量
	vector_N c=vector_N(a);//定义N维向量类的对象存放减法的结果
	for(i=0;i<a.n;i++)
		c.p[i]=p[i]-a.p[i];
	return c;
}
//定义重载*运算符
vector_N operator *(vector_N& a,int & x)
{
	int i;                 //循环变量
	vector_N c=vector_N(a);//定义N维向量类的对象
	for(i=0;i<a.n;i++)
		c.p[i]=a.p[i]*x;
	return c;
}
//定义內积函数,內积y的计算等于向量各对应元a素乘积y的和
int inner(vector_N&a,vector_N&b)
{
	int i;                 //循环变量
	int s=0;               //s存放乘法运算结果
	for(i=0;i<a.n;i++)
		s+=a.p[i]*b.p[i];
	return s;
}
//定义显示维数的函数
int vector_N::dimension()
{
	return n;
}
/*定义重载[]函数，类的对象中D指针p是私有的数据Y成员，在主函数中获取指定下标括对应的元素时，
用对象运算符取不到向量中的元素，定义[]运算符，在主函数中使用[]可以得到对应元素的返回值*/
int& vector_N::operator[](int m)
{
	if(m<0||m>=n)
	{//输出错误信息并退出
		cout<<"Error Index"<<endl;
		_exit(0);
	}
	else
		return p[m];
}
