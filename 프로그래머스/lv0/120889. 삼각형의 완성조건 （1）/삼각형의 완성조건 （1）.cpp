#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> sides) {
    int answer = 0;
    
    sort(sides.begin(), sides.end());
    
    int hypo = sides[2];
    
    int sum = sides[0] + sides[1];
    
    if(hypo >= sum)
    {
        answer = 2;
    }
    else
    {
        answer = 1;
    }
    
    return answer;
}