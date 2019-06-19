#include "vector_N.h"
//Ĭ�Ϲ��캯��������������ݳ�Ա�ֱ��ʼ��Ϊά��n=0��ָ��pָ���
vector_N::vector_N(void)
{
	n=0;                  //n��ʾά��
	p=NULL;               //����ָ���ʼָ���
}
//���帴�ƹ��캯��,���ƹ��캯���������ǽ�ʵ�ζ���ĸ����ݳ�Աֵһһ�����µĶ����е����ݳ�Ա
vector_N::vector_N(const vector_N &c)
{
	n=c.n;                
	int i=0;               //ѭ������
	p=new int [c.n];       //��̬��������
	for(i=0;i<c.n;i++)     //ѭ����ֵ
		p[i]=c.p[i];
}
//Ĭ�������������ͷŶ�̬�ڴ�
vector_N::~vector_N(void)
{
	delete []p;            //ɾ��ָ��ؼ�
	n=0;                   //�޸�ά��Ϊ0
	p=NULL;                //ָ��ָ���
}
//��������=���������������Ķ�����Ҫ�������ĳ�Ա����
vector_N vector_N::operator =(vector_N a)
{
	int i;                 //ѭ������
	n=a.n;
	p=new int [a.n];
	for(i=0;i<a.n;i++)
		p[i]=a.p[i];
	return *this;
}
//������������������
istream &operator >>(istream &input,vector_N &a)
{
	input>>a.n;            //����ά��
	int i;                 //ѭ������
	if(a.n<0)              
	{//�������ݴ������������Ϣ���˳�
		cout<<"Error Length!"<<endl;
		_exit(0);
	}
	else
	{
		a.p=new int[a.n]; //��̬������Ķ���
		for(i=0;i<a.n;i++)//ѭ���������ĸ���������Ϣ
			input>>a.p[i];
	}
	return input;
}
//�����������������
ostream &operator <<(ostream &output,vector_N &a)
{
	int i;                 //ѭ������
	output<<"(";
	for(i=0;i<a.n-1;i++)  //ѭ���������Ĳ�����Ϣ
	{
		output<<a.p[i]<<", ";
	}
	output<<a.p[i]<<")";
	return output;
}
/*������������������������ڵ��������v3=v1+v2ʱ������һ�����
����c�����β�a��ʼ������c��ϵͳΪ�β�a�Զ����ø��ƹ��캯����
p[i]��v2�����ݳ�Աָ��p��̬�ڴ��е����ݣ�a.p[i]��v1�����е�Ԫ��
��c��v1v2��ӵĽ�������ظ�v3*/
vector_N vector_N::operator+(vector_N &a)
{
	int i;
	vector_N c=vector_N(a); //������Ķ��󣬽��ж���ĸ���
	for(i=0;i<a.n;i++)      //ѭ�����
		c.p[i]=a.p[i]+p[i];    
	return c;
}
//��������-�����
vector_N vector_N::operator-(vector_N &a)
{
	int i;                 //ѭ������
	vector_N c=vector_N(a);//����Nά������Ķ����ż����Ľ��
	for(i=0;i<a.n;i++)
		c.p[i]=p[i]-a.p[i];
	return c;
}
//��������*�����
vector_N operator *(vector_N& a,int & x)
{
	int i;                 //ѭ������
	vector_N c=vector_N(a);//����Nά������Ķ���
	for(i=0;i<a.n;i++)
		c.p[i]=a.p[i]*x;
	return c;
}
//����Ȼ�����,�Ȼ�y�ļ��������������ӦԪa�س˻�y�ĺ�
int inner(vector_N&a,vector_N&b)
{
	int i;                 //ѭ������
	int s=0;               //s��ų˷�������
	for(i=0;i<a.n;i++)
		s+=a.p[i]*b.p[i];
	return s;
}
//������ʾά���ĺ���
int vector_N::dimension()
{
	return n;
}
/*��������[]��������Ķ�����Dָ��p��˽�е�����Y��Ա�����������л�ȡָ���±�����Ӧ��Ԫ��ʱ��
�ö��������ȡ���������е�Ԫ�أ�����[]�����������������ʹ��[]���Եõ���ӦԪ�صķ���ֵ*/
int& vector_N::operator[](int m)
{
	if(m<0||m>=n)
	{//���������Ϣ���˳�
		cout<<"Error Index"<<endl;
		_exit(0);
	}
	else
		return p[m];
}
