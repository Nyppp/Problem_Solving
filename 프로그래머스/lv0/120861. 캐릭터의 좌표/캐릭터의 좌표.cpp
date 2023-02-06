#include <string>
#include <vector>
#include <cstdlib>
#include <map>

using namespace std;

map<string, pair<int, int>> moveMap;

vector<int> solution(vector<string> keyinput, vector<int> board) {
    vector<int> answer;
    moveMap.insert({"up", {0,1}});
    moveMap.insert({"down", {0,-1}});
    moveMap.insert({"left", {-1,0}});
    moveMap.insert({"right", {1,0}});
    
    int x = 0;
    int y = 0;
    
    int maxWidth = board[0] / 2;
    int maxHeight = board[1] / 2;
    
    for(int i = 0; i < keyinput.size(); ++i)
    {
        x += moveMap[keyinput[i]].first;
        y += moveMap[keyinput[i]].second;
        if(abs(x) > maxWidth)
        {
            x -= moveMap[keyinput[i]].first;
        }
        if(abs(y) > maxHeight)
        {
            y -= moveMap[keyinput[i]].second;
        }
    }
    
    answer.push_back(x);
    answer.push_back(y);
    
    return answer;
}