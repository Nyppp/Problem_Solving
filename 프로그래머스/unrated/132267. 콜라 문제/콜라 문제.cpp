#include <string>
#include <vector>

using namespace std;

int solution(int a, int b, int n) {
    int answer = 0;
    int flag = 0;
    
    while(n >= a)
    {    
        answer += (n/a)*b;
        flag = n % a;
        
        n = (n/a)*b + flag;
    }
    
    return answer;
}