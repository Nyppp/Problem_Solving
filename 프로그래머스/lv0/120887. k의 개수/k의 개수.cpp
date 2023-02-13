#include <string>
#include <vector>

using namespace std;

int solution(int i, int j, int k) {
    int answer = 0;
    
    for(int num = i; num <= j; ++num)
    {
        string tmp = to_string(num);
        
        for(int i = 0; i < tmp.length(); ++i)
        {
            if(tmp[i] - '0' == k)
            {
                ++answer;
            }
        }
    }
    
    return answer;
}