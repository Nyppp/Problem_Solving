#include <string>
#include <vector>
#include <cstdlib>

using namespace std;

int solution(vector<vector<int>> dots) {
    int answer = 0;
    
    int x1 = dots[0][0];
    int y1 = dots[0][1];
    
    int x2;
    int y2;
    
    for(int i = 1; i < dots.size(); ++i)
    {
        if(x1 != dots[i][0])
        {
            x2 = dots[i][0];
        }
        
        if(y1 != dots[i][1])
        {
            y2 = dots[i][1];
        }
    }
    
    answer = abs(x1 - x2) * abs(y1 - y2);
    
    
    
    return answer;
}