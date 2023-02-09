#include <string>
#include <vector>

using namespace std;

int solution(int a, int b) {
    int answer = 0;
    
    for(int i = 1; i <= a; ++i)
    {
        if(a % i == 0 && b % i == 0)
        {
            a /= i;
            b /= i;
        }
    }
    
    while( b > 1 )
    {
        if(b%2 != 0 && b%5 != 0)
        {
            answer = 2;
            break;
        }
        
        if(b%2 == 0)
        {
            b/=2;
        }
        else if(b%5 ==0)
        {
            b/=5;
        }
    }
    
    if(b == 1)
    {
        answer = 1;
    }
    
    return answer;
}