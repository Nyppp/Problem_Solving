#include <string>
#include <vector>

using namespace std;

int solution(vector<vector<int>> lines) {
    int answer = 0;
    
    int DP[201] = {0,};
    int minIdx = 0;
    int maxIdx = 0;
    
    for(int i = 0 ; i < lines.size(); ++i)
    {
        for(int j = lines[i][0]+100; j < lines[i][1]+100; ++j )
        {
            ++DP[j];
        }
    }
    
    for(int i = 0; i <= 200; ++i)
    {
        if(DP[i] > 1)
        {
            ++answer;
        }
    }
    
    return answer;
}