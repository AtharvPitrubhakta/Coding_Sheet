#include<iostream>
#include<stack>

using namespace std;
int main() {

    stack<string> s;
    
    s.push("Atharv");
    s.push("Rajesh");
    s.push("Pitrubhakta");

    cout << "Top Element-> " << s.top() << endl;
    s.pop();
    cout << "Top Element-> " << s.top() << endl;
    s.pop();
    cout << "Top Element-> " << s.top() << endl;
    
    cout << "Size Of Stack-> " << s.size() << endl;

    cout << "Empty Or Not-> " << s.empty() << endl;

}