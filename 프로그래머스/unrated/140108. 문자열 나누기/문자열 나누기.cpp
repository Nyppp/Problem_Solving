#include <string>
#include <vector>

using namespace std;

int solution(string s) {
    int answer = 0;
    
    char key = s[0];
    int count = 0;
    
    for(int i = 0; i < s.length(); ++i)
    {
        if(key == s[i])
        {
            ++count;
        }
        else
        {
            --count;
        }
        
        if(count == 0)
        {
            key = s[i+1];
            count = 0;
            ++answer;
        }
    }
    
    if(count > 0)
    {
        ++answer;
    }
    
    return answer;
}