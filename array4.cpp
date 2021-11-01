#include <iostream>
using namespace std;


int array(int a)
{
    int i;
    int arr[a];
    for( i=0;i<arr[a];i++)
    {
        cin>>arr[i];
    }
   return arr[i];
}

int main()
{

    int a;
    cin>>a;
    
    cout<<array(a)<<endl;
    return 0;

}