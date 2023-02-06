#include <string>
#include <vector>

using namespace std;

int solution(vector<int> sides) {
    int answer = 0;
    
    int maxSide = max(sides[0], sides[1]);
    int minSide = min(sides[0], sides[1]);
    
    for(int i = 1; i <= maxSide; ++i)
    {
        if(maxSide < i + minSide)
        {
            ++answer;
        }
    }
    
    for(int i = maxSide+1; ; ++i)
    {
        if(i < maxSide + minSide)
        {
            ++answer;
        }
        else
        {
            break;
        }
    }
    return answer;
}