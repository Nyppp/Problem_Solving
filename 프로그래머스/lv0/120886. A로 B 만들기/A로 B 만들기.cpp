#include <string>
#include <vector>

using namespace std;

int solution(string before, string after) {
    int answer = 0;
    
    int beforeAlpha[27] = {0,};
    int afterAlpha[27] = {0,};
    
    for(int i = 0; i < before.length(); ++i)
    {
        ++beforeAlpha[before[i] - 'a'];
        ++afterAlpha[after[i] - 'a'];
    }
    
    for(int i = 0; i < 27; ++i)
    {
        if(beforeAlpha[i] != afterAlpha[i])
        {
            answer = 0;
            return answer;
        }
    }
    
    answer = 1;
    return answer;
}