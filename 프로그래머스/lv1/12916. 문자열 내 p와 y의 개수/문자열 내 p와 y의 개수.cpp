#include <string>
#include <iostream>
using namespace std;

bool solution(string s)
{
    bool answer = true;
    
    int flag = 0;
    for(int i = 0 ; i < s.length(); ++i)
    {
        if(s[i] == 'p' || s[i] =='P')
        {
            ++flag;
        }
        if(s[i] == 'y' || s[i] == 'Y')
        {
            --flag;
        }
    }
    
    if(flag == 0)
    {
        answer = true;
    }
    else
        answer = false;

    return answer;
}