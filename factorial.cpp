#include<iostream>
using namespace std;

int fac(int num)
{
    
    int fac=1;
    
    for(int i=2;i<=num;i++)
    {
        fac*=i;
    }
    return fac;
}


int main()
{
    int n;
    cin>>n;
   int ans=fac(n);
   cout<<ans;
    return 0;
}