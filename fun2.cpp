#include <iostream>
using namespace std;

int addition(int a,int b);

int main()
{
	int num1;
	int num2;	
	int add;
	
	
	cout<<"Enter first number: ";
	cin>>num1;
	cout<<"Enter second number: ";
	cin>>num2;
	
	
	add=addition(num1,num2);
	
	
	cout<<"Addition is: "<<add<<endl;
	
	return 0;
}


int addition(int a,int b)
{
	return (a+b);
}