#include <string>
#include <vector>

using namespace std;

vector<vector<int>> solution(vector<int> num_list, int n) {
    vector<vector<int>> answer;
    
    vector<int> tmp;
    
    for(int i = 1; i <= num_list.size(); ++i)
    {
        tmp.push_back(num_list[i-1]);
        if(tmp.size() == n)
        {
            answer.push_back(tmp);
            tmp.clear();
        }
    }
    
    return answer;
}