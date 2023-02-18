#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<string> solution(vector<string> strings, int n) {
    vector<string> answer;
    vector<pair<char, int>> tmp;
    
    sort(strings.begin(), strings.end());
    
    for(int i = 0; i < strings.size(); ++i)
    {
        tmp.push_back(make_pair(strings[i][n], i));
    }
    
    sort(tmp.begin(), tmp.end());
    
    for(int i = 0; i < tmp.size(); ++i)
    {
        answer.push_back(strings[tmp[i].second]);
    }
    
    return answer;
}