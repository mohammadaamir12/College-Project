#include<iostream>
using namespace std;

int mul(int n)
{
    
    int ans=0;
    for(int i=1;i<=n;i++){
        ans*=i;
    }
    
    return ans;
}


int main()
{
    int n;
    cin>>n;
   
   cout<<mul(n);
    return 0;
}