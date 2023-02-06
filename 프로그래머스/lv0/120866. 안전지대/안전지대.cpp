#include <string>
#include <vector>

using namespace std;

pair<int, int> moveDir[] = {{-1,-1}, {-1, 0}, {-1,1}, {0,-1}, {0,1}, {1,-1}, {1,0}, {1,1}};

int solution(vector<vector<int>> board) {
    int answer = 0;
    
    for(int i = 0 ; i < board.size(); ++i)
    {
        for(int j = 0; j < board[i].size(); ++j)
        {
            if(board[i][j] == 1)
            {
                for(int k = 0; k < 8; ++k)
                {
                    int nextX = i + moveDir[k].first;
                    int nextY = j + moveDir[k].second;
                    
                    if(nextX >= board.size() || nextY >= board.size())
                    {
                        continue;
                    }
                    
                    if(board[nextX][nextY] == 0)
                    {
                        board[nextX][nextY] = -1;
                    }
                }
            }
        }
    }
    
    for(int i = 0 ; i < board.size(); ++i)
    {
        for(int j = 0; j < board[i].size(); ++j)
        {
            if(board[i][j] == 0)
            {
                ++answer;
            }
        }
    }
    
    return answer;
}