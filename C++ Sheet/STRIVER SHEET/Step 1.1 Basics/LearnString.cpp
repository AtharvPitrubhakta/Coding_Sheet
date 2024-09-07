#include <bits/stdc++.h>
using namespace std;


int main()
{
    string s = "Yash";

    int len = s.size();
    s[len - 1] = 'a';
    cout << s[len - 1];
    return 0;
}