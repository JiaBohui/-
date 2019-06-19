#pragma once
#include<iostream>
using namespace std;

class vector_N                                        //����vector_N��
{
public:
	vector_N(void);                                   //�������캯��
	vector_N(const vector_N&);                        //�������ڸ��ƶ���ĸ��ƹ��캯��һ��Լ����const������ʹ����ֵ���ܸı䣬�����ڵ��ô˺���ʱ������ʹ����ֵ���޸�
	~vector_N(void);                                  //������������
	vector_N operator=(vector_N );                    //����=�����
	friend istream &operator >>(istream&,vector_N&);  //����������>>��ʵ�ֶ�������Ԫ�ص�����
	friend ostream &operator <<(ostream&,vector_N&);  //���������<<��ʵ�ֶ�������Ԫ�ص����
	vector_N operator +(vector_N&);                   //����+����������������ж�ӦԪ�����
	vector_N operator -(vector_N&);                   //����-�������
	friend vector_N operator *(vector_N&,int &);      //����*�������
	friend int inner(vector_N&,vector_N&);            //������Ԫ�Ȼ�����
	int& operator [](int);                            //����[]�����
	int dimension();                                  //������ʾά���ĺ���
private:
	int n;                                            //˽�г�Աά��n
	int *p;                                           //˽�г�Աָ��p
};