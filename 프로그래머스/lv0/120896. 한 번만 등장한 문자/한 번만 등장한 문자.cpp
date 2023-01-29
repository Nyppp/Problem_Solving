#include <string>
#include <vector>

using namespace std;


int DP[27] = {0,};

string solution(string s) {
    string answer = "";
    
    for(int i = 0; i < s.length(); ++i)
    {
        DP[s[i]-'a'] += 1;
    }
    
    for(int i = 0; i < 27; ++i)
    {
        if(DP[i] == 1)
        {
            answer += 'a' + i;
        }
    }
    
    return answer;
}