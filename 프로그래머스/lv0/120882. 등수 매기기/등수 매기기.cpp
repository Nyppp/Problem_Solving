#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<vector<int>> score) {
    vector<int> answer(score.size(), 1);
    vector<int> averScore(score.size());
    
    int minScore = 200;
    
    for(int i = 0; i < score.size(); ++i)
    {
        averScore[i] = score[i][0] + score[i][1];
    }
    
    for(int i = 0; i < score.size(); ++i)
    {
        for(int j = 0;  j < score.size(); ++j)
        {
            if(i == j) continue;
            
            if(averScore[i] > averScore[j])
            {
                ++answer[j];
            }
        }

    }
    return answer;
}