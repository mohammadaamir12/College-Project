#include<iostream>
using namespace std;

int add(int n)
{
    
    int ans=0;
    for(int j=0;j<=n;j++){
        ans+=j;
    }
    
    return ans;
}


int main()
{
    int n;
    cin>>n;
   
   cout<<add(n);
   
    
     return 0;
}