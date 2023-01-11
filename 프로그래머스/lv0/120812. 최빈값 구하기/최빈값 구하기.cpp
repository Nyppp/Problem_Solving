#include <string>
#include <vector>

using namespace std;

int solution(vector<int> array) {
    int Mode[1001] =  {0,};
    int answer = 1;
    int maxMode = 0;
    int cnt = 0;
    
    for(size_t i = 0; i < array.size(); ++i)
    {
        ++Mode[array[i]];
    }
    
    for(int i = 0; i < 1000; ++i)
    {
        if(maxMode < Mode[i])
        {
            answer = i;
            maxMode = Mode[i];
        }
    }
    
    for(int i = 0; i < 1000; ++i)
    {
        if(maxMode == Mode[i])
        {
            ++cnt;
        }
    }
    
    if(cnt > 1)
    {
        return -1;
    }
    
    return answer;
}