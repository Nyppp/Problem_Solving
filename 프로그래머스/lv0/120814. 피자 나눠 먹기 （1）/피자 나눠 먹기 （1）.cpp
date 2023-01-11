#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    
    answer = n/7;
    
    int mod = n % 7;
    
    if(mod > 0)
    {
        answer++;
    }
    
    return answer;
}