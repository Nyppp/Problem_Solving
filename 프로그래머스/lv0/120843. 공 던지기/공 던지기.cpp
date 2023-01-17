#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers, int k) {
    int answer = 0;
    
    int personCnt = numbers.size();
    int key = 1 + (k-1)*2;
    
    answer = numbers[key%personCnt-1];
    
    return answer;
}