#include <string>
#include <vector>

using namespace std;

int solution(int n, int k) {
    int answer = 0;
    
    int lambPrice = 12000;
    int drinkPrice = 2000;
    
    int drinkNum = k - n/10;
    answer = n * lambPrice + drinkNum * drinkPrice;
    
    return answer;
}