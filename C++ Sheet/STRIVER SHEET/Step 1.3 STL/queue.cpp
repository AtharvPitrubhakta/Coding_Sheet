#include<iostream>
#include<queue>

using namespace std;
int main() {
    queue<string> q;

    q.push("Atharv");
    q.push("Rajesh");
    q.push("Pitrubhakta");

    cout << "Size Before Pop-> " << q.size() << endl;

    cout << "First Element-> " << q.front() << endl;
    q.pop();
    cout << "First Element-> " << q.front() << endl;

    cout << "Size after pop-> " << q.size() << endl;
}