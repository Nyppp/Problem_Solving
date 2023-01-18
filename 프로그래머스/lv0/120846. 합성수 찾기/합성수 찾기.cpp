#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    int DP[101] = {0,};
    
    for(int i = 1; i <= 100; ++i)
    {
        int coCnt = 0;
        for(int j = 1; j <= i; ++j)
        {
            if(i%j == 0)
            {
                coCnt++;
            }
        }
        if(coCnt >= 3)
        {
            DP[i] = 1;
        }
    }
    
    for(int i = 1; i <= n; ++i)
    {
        if(DP[i] == 1)
        {
            answer++;
        }
    }
    
    
    return answer;
}