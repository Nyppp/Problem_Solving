#include <string>
#include <vector>

using namespace std;

int solution(vector<int> common) {
    int answer = 0;
    
    int diff = common[1] - common[0];
    
    bool isDiff = true;
    
    for(int i = 1; i < common.size(); ++i)
    {
        if(diff != common[i] - common[i-1])
        {
            isDiff = false;
            break;
        }
    }
    
    if(isDiff)
    {
        answer = common[common.size()-1] + diff;
    }
    else
    {
        float multi = common[1] / common[0];
        answer = common[common.size()-1] * multi;
    }
    
    
    return answer;
}