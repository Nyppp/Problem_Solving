#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> emergency) {
    vector<int> answer(emergency.size());
    
    for(int i = 0; i < emergency.size(); ++i)
    {
        int key = emergency[i];
        for(int j = 0; j < emergency.size(); ++j)
        {
            if(key <= emergency[j])
            {
                answer[i]++;
            }
        }
    }
    return answer;
}