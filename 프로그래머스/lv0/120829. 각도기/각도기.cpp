#include <string>
#include <vector>

using namespace std;

int solution(int angle) {
    int answer = 1;
    int num = angle - 90;
    
    if(num < 0)
        return answer;
    
    if(num == 0)
    {
        ++answer;
    }
    else if(num > 0 && num < 90)
    {
        answer += 2;
    }
    else
    {
        answer += 3;
    }
    
    return answer;
}