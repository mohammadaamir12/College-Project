#include<iostream>
using namespace std;
int main()
{
int a=2;
int b=3;
int c=print(a,b);
cout<<c;
return 0;
}

int print(int num1,int num2)
{
    
int sum=num1+num2;
return sum;
}