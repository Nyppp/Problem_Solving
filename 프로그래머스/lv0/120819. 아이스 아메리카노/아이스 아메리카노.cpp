#include <string>
#include <vector>

using namespace std;

vector<int> solution(int money) {
    vector<int> answer;
    int coffePrice = 5500;
    
    answer.push_back(money/coffePrice);
    answer.push_back(money%coffePrice);
    return answer;
}