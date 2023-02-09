#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<vector<int>> dots) {
    int answer = 0;
    
    vector<float> gradiants;
    
    for(int i = 0; i < dots.size(); ++i)
    {
        for(int j = i+1; j < dots.size(); ++j)
        {
            if(i == j) continue;
            
            float dx = dots[i][0] - dots[j][0];
            float dy = dots[i][1] - dots[j][1];
            
            if(find(gradiants.begin(), gradiants.end(), dy/dx) != gradiants.end())
            {
                return 1;
            }
            else
            {
                gradiants.push_back(dy/dx);
            }
        }
    }
    
    return answer;
}