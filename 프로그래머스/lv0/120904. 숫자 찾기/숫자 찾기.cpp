#include <string>
#include <vector>

using namespace std;

int solution(int num, int k) {
    int answer = 0;
    string tmp = to_string(num);
    
    for(int i = 0; i < tmp.length(); ++i)
    {
        if(tmp[i] - '0' == k)
        {
            answer = i+1;
            break;
        }
    }
    
    if(answer == 0)
    {
        return -1;
    }
    
    return answer;
}