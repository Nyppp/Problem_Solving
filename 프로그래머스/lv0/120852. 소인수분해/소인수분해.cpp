#include <string>
#include <vector>

using namespace std;

vector<int> solution(int n) {
    vector<int> answer;
    
    for(int i = 2; i <= n ; ++i)
    {
        bool isPrime = false;
        while(n%i == 0)
        {
            n/=i;
            isPrime = true;
        }
        
        if(isPrime)
        {
            answer.push_back(i);
        }
    }
    return answer;
}