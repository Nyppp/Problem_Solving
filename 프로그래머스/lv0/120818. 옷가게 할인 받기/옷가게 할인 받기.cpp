#include <string>
#include <vector>

using namespace std;

int solution(int price) {
    int answer = 0;
    
    int noOption = 100000;
    int middleOption = 300000;
    int fullOption = 500000;
    
    if(price < noOption)
    {
        answer = price;
    }
    else if(price >= noOption && price < middleOption)
    {
        answer = price * 95 / 100;
    }
    else if(price >= middleOption && price < fullOption)
    {
        answer = price * 90 / 100;
    }
    else
    {
        answer = price * 80 / 100;
    }
    
    
    return answer;
}