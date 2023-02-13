#include <string>
#include <vector>
#include <algorithm>

using namespace std;

bool compare(pair<int, int>a, pair<int, int>b) {
	if (a.first == b.first) {
		return a.second > b.second;
	}
	else {
		return a.first < b.first;
	}
}

vector<int> solution(vector<int> numlist, int n) {
    vector<int> answer;
    
    vector<pair<int, int>> comp;
    
    for(int i = 0; i < numlist.size(); ++i)
    {
        comp.push_back(make_pair(abs(n - numlist[i]), numlist[i]));
    }
    
    sort(comp.begin(), comp.end(), compare);
    
    for(int i = 0; i < numlist.size(); ++i)
    {
        answer.push_back(comp[i].second);
    }
    
    
    return answer;
}