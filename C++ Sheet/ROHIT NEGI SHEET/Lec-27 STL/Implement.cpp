#include<iostream>
// #include<vector>
#include<bits/stdc++.h>
using namespace std;

int main()
{
    // // Create vector, declare   
    // vector<int>v;
    // // Jab hum initialize karte hai kisi bhi vector ko tab jo uski size hoti utnihi uski capacity aati hai.
    // vector<int>v1(5,1);
    // // size and capacity
    // cout <<"Size of v: " <<v.size() << endl;
    // cout <<"Capacity of v: " <<v.capacity() << endl;

    // v.push_back(2);
    // v.push_back(3);
    // v.push_back(10);
    // cout <<"Size of v: " <<v.size() << endl;
    // cout <<"Capacity of v: " <<v.capacity() << endl;

    // // Update value
    // v[1] = 5;

    // cout <<"Size of v1: " <<v1.size() << endl;
    // cout <<"Capacity of v1: " <<v1.capacity() << endl;
    // v1.push_back(8);
    // cout <<"Size of v1: " <<v1.size() << endl;
    // cout <<"Capacity of v1: " <<v1.capacity() << endl;

    // vector<int>v3 = {1,2,3,4,5};
    // cout <<"Size of v3: " <<v3.size() << endl;
    // cout <<"Capacity of v3: " <<v3.capacity() << endl;
    // v3.push_back(6);
    // cout <<"Size of v3: " <<v3.size() << endl;
    // cout <<"Capacity of v3: " <<v3.capacity() << endl;

    // Delete value from vector
    // vector<int>vnew;
    // vnew.push_back(1);
    // vnew.push_back(2);
    // vnew.push_back(3);
    // vnew.push_back(4);
    // vnew.push_back(5);
    // vnew.pop_back();
    // cout <<"Size of Vnew: " <<vnew.size() << endl;
    // cout <<"Capacity of Vnew: " <<vnew.capacity() << endl;

    // // Erase the element
    // vnew.erase(vnew.begin()+1);
    // cout <<"Size of Vnew: " <<vnew.size() << endl;
    // cout <<"Capacity of Vnew: " <<vnew.capacity () << endl;

    // for(int i = 0; i <vnew.size(); i++)
    // cout <<vnew[i] << " ";
    // cout << endl;
    
    // vnew.insert(vnew.begin()+1,2);//Insert the value
    // for(int i = 0; i <vnew.size(); i++)
    // cout <<vnew[i] << " ";
    // cout << endl;

    // vnew[1]=37;
    // for(int i = 0; i <vnew.size(); i++)
    // cout <<vnew[i] << " ";

    // vnew.clear();//Remove all the elements
    // cout <<"Size of Vnew: " <<vnew.size() << endl;
    // cout <<"Capacity of Vnew: " <<vnew.capacity () << endl;


    // vector<int>arr;
    // arr.push_back(2);
    // arr.push_back(12);
    // arr.push_back(21);
    // arr.push_back(122);
    // cout<<arr[0]<<endl;
    // cout<<arr.front()<<endl;
    // cout<<arr[arr.size()-1]<<endl;
    // cout<<arr.back()<<endl;

    // vector<int>a;
    // // copy value of 1 vector to another vector

    // a = arr;
    // cout<<a.size()<<endl;
    // for(auto it = arr.begin(); it != arr.end(); it++)
    // cout<<*it<<" ";
    // cout<<endl;

    // for(auto i: arr)
    // cout<<i<<" ";

    vector<int>ans;
    ans.push_back(5);
    ans.push_back(445);
    ans.push_back(52);
    ans.push_back(13);
    ans.push_back(343);

    // Sort in increasing order of elements in the vector
    sort(ans.begin(), ans.end());
    for(int i = 0; i < ans.size(); i++)
    cout<<ans[i] << " ";  

    cout<<endl;

    // Sort the element in decreasing order 
    // sort(ans.begin(), ans.end(), greater<int>());
    // for(int i = 0; i < ans.size(); i++)
    // cout << ans[i] << " ";

    // cout<<endl;

    // Other Method to Sort the element in decreasing order 
    // sort(ans.rbegin(), ans.rend());
    // for(int i = 0; i < ans.size(); i++)
    // cout << ans[i] << " ";

    // search in binary search
    // cout << binary_search(ans.begin(), ans.end(), 52)<< endl;
    // cout << binary_search(ans.begin(), ans.end(), 522)<< endl;

    // cout << find(ans.begin(), ans.end(), 343)-ans.begin()<<endl; 

}