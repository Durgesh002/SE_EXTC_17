#include <bits/stdc++.h>

using namespace std;

class Car{
	public:
	string name;
	int d;
	void info(){
		cout<<"Enter your car name: ";
		cin>>name;
		cout<<"Year of manufacturing: ";
		cin>>d;
		cout<<name <<" " <<d <<"\n";
		}
	};
	
int main(){
	Car mycar;
	mycar.info();
	}
