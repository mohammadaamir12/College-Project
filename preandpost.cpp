#include<iostream>
using namespace std;
int main()
{
   int i=1;
    int j=2;
    int m;
    m=i++ - --i + j++ + ++j;
    cout<<i<<""<<j<<""<<m<<endl;
    return 0;
}