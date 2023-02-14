#include <string>
#include <vector>

using namespace std;

vector<int> solution(int num, int total) {
    vector<int> answer;
    
    int key = 0;
    int sum = 0;
    
    while(true)
    {
        for(int i = key; i < key+num; ++i)
        {
            sum += i;
            answer.push_back(i);
        }
        
        if(sum > total)
        {
            --key;
            answer.clear();
            sum = 0;
        }
        else if(sum < total)
        {
            ++key;
            answer.clear();
            sum = 0;
        }
        else
        {
            break;
        }
    }
    
    return answer;
}