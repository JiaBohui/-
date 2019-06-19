#include"vector_N.h"
int main()
{
    vector_N v1,v2,v3,v4,v5;                          //定义vector_N的对象                           
    int x,n;                                          //定义整型的乘数x，下标值n
    cin>>v1>>v2>>x>>n;                                //输入向量v1v2中的元素
    if(v1.dimension()!=v2.dimension())                //判断v1v2的维数是否相同
    {
	    cout<<"Mismatch Length!"<<endl;               //如果不相同，输出错误提示
    } 
    else
    {
	    v3=v1+v2;                                     //相同时，进行+、-运算
	    v4=v1-v2;                                     
	    cout<<v3<<endl<<v4<<endl<<inner(v1,v2)<<endl; //输出v1v2相加、相减得到的向量，两向量的內积y
    }
    v5=v1*x;                                          //计算向量v1与乘数x相乘的结果
    cout<<v5<<endl;                                   // 输出相乘的结果
    cout<<v1[n]<<endl;                                //输出v1中下标括为n的元素值
    return 0; 
}