#include <string>
#include <vector>
#include <algorithm>
#include <math.h>

using namespace std;

long long solution(long long n) {
    long long answer = 0;
    
    string tmp = to_string(n);
    
    sort(tmp.begin(), tmp.end());
    
    for(int i = 0; i < tmp.length(); ++i)
    {
        answer += (tmp[i]-'0') * pow(10,i);
    }
    return answer;
}