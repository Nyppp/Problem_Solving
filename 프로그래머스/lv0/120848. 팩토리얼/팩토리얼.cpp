#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 1;
    int key = 1;
    
    while(true)
    {
        n /= key;
        if(n < 1)
        {
            answer = key;
            break;
        }
        else
        {
            key++;
        }
    }
    
    return answer-1;
}