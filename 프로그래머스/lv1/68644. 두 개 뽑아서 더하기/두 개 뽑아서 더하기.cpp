#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int DP[201] = {0,};

vector<int> solution(vector<int> numbers) {
    vector<int> answer;
    
    for(int i = 0; i < numbers.size(); ++i)
    {
        for(int j = 1; j < numbers.size(); ++j)
        {
            if(i == j)
            {
                continue;
            }
            
            if(DP[numbers[i] + numbers[j]] == 0)
            {
                answer.push_back(numbers[i] + numbers[j]);
            }
            ++DP[numbers[i] + numbers[j]];
        }
    }
    
    sort(answer.begin(), answer.end());
    
    return answer;
}