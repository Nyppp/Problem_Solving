#include <string>
#include <vector>
#include <stdlib.h>

using namespace std;

string alphaNum[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

long long solution(string numbers) {
    long long answer = 0;
    
    while(numbers.length() > 0)
    {
        for(int i = 0; i < 10 ; ++i)
        {
            size_t idx = numbers.find(alphaNum[i]);
            if(idx == 0)
            {
                answer *= 10;
                answer += i;
                numbers.erase(idx, alphaNum[i].length());
                break;
            }
        }
    }
    return answer;
}