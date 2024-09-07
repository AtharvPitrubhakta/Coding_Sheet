#include<iostream>
#include<vector>

using namespace std;
int main(){

    vector<int> v;

    vector<int> a(5,1);

    vector<int> last(a);    
    cout << "Print Last-> "<<endl;
    for(int i:last){
        cout<<i<<" ";
    }cout<<endl;
  

    cout<<"Capacity-> "<<v.capacity()<<endl;
    
    v.push_back(1);
    cout<<"Capacity-> "<<v.capacity()<<endl;

    v.push_back(2);
    cout<<"Capacity-> "<<v.capacity()<<endl;
    
    v.push_back(3);
    cout<<"Capacity-> "<<v.capacity()<<endl;
    cout<<"Size of vector-> "<<v.size()<<endl;

    cout << "Vector is Empty or not-> "<<v.empty()<<endl;

    cout << "Front element is-> "<<v.front()<<endl;
    cout << "Back element is-> "<<v.back()<<endl;

    cout << "Element of 2nd Index is-> "<<v.at(1)<<endl;

    cout << "Before pop"<<endl;
    for(int i:v){
        cout<<i<<" ";
    }cout<<endl;

    v.pop_back();

    cout << "After pop"<<endl; 
    for(int i:v){
        cout<<i<<" ";
    }cout<<endl;

    cout << "Before clear size-> " <<v.size()<<endl;
    v.clear();  
    cout << "After clear size-> " <<v.size()<<endl;


}