#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers) {
    int answer = -100000001;
    
    for(int i = 0 ; i < numbers.size(); ++i)
    {
        for(int j = i+1; j < numbers.size(); ++j)
        {
            if(i==j)
            {
                continue;
            }
            
            if(numbers[i] * numbers[j] > answer)
            {
                answer = numbers[i] * numbers[j];
            }
            
        }
    }
    
    return answer;
}