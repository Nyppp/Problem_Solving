#include <string>
#include <vector>

using namespace std;

bool isNumber3(int num)
{
    if(num % 3 == 0 || to_string(num).find('3') != string::npos)
    {
        return true;
    }
    else
        return false;
}


int solution(int n) {
    int answer = 0;
    
    for(int i = 1; i <= n; ++i)
    {
        ++answer;
        
        while(isNumber3(answer))
        {
            ++answer;
        }
        
    }
    return answer;
}