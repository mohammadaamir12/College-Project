#include<iostream>
using namespace std;

int fac(int num)
{
    
    int fact=1;
    
    for(int i=2;i<=num;i++)
    {
        fact*=i;
    }
    return fact;
}


int main()
{
    int n;
    cin>>n;
    for(int i=0;i<=n;i++){
        for(int j=0;j<=i;j++){
            cout<<fac(i)/(fac(j)*fac(i-j))<<" ";
        }
        cout<<endl;
    }
   
    return 0;
}