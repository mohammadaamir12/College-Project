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
    int n,r;
    cin>>n>>r;
   int ans=fac(n)/(fac(r)*fac(n-r));
   cout<<ans;
    return 0;
}