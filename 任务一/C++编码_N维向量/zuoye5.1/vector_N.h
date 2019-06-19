#pragma once
#include<iostream>
using namespace std;

class vector_N                                        //定义vector_N类
{
public:
	vector_N(void);                                   //声明构造函数
	vector_N(const vector_N&);                        //声明用于复制对象的复制构造函数一般约定加const声明，使参数值不能改变，以免在调用此函数时因不慎而使对象值被修改
	~vector_N(void);                                  //声明析构函数
	vector_N operator=(vector_N );                    //重载=运算符
	friend istream &operator >>(istream&,vector_N&);  //重载输入流>>，实现对向量中元素的输入
	friend ostream &operator <<(ostream&,vector_N&);  //重载输出流<<，实现对向量中元素的输出
	vector_N operator +(vector_N&);                   //重载+号运算符，将向量中对应元素相加
	vector_N operator -(vector_N&);                   //重载-号运算符
	friend vector_N operator *(vector_N&,int &);      //重载*号运算符
	friend int inner(vector_N&,vector_N&);            //声明友元內积函数
	int& operator [](int);                            //重载[]运算符
	int dimension();                                  //声明显示维数的函数
private:
	int n;                                            //私有成员维数n
	int *p;                                           //私有成员指针p
};