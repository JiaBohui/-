#include"vector_N.h"
int main()
{
    vector_N v1,v2,v3,v4,v5;                          //����vector_N�Ķ���                           
    int x,n;                                          //�������͵ĳ���x���±�ֵn
    cin>>v1>>v2>>x>>n;                                //��������v1v2�е�Ԫ��
    if(v1.dimension()!=v2.dimension())                //�ж�v1v2��ά���Ƿ���ͬ
    {
	    cout<<"Mismatch Length!"<<endl;               //�������ͬ�����������ʾ
    } 
    else
    {
	    v3=v1+v2;                                     //��ͬʱ������+��-����
	    v4=v1-v2;                                     
	    cout<<v3<<endl<<v4<<endl<<inner(v1,v2)<<endl; //���v1v2��ӡ�����õ����������������ăȻ�y
    }
    v5=v1*x;                                          //��������v1�����x��˵Ľ��
    cout<<v5<<endl;                                   // �����˵Ľ��
    cout<<v1[n]<<endl;                                //���v1���±���Ϊn��Ԫ��ֵ
    return 0; 
}