#include<iostream>
using namespace std;

int add(int a,int b);
int main()
{
    int a;
    int b;
    int c;

    cin>>a;
    cin>>b;
    c=add(a,b);
    cout<<c<<endl;
    return 0;

}

add(int a, int b)
{
    return (a*b);
}