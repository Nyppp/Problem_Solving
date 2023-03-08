#include <string>
#include <vector>

using namespace std;

int solution(string t, string p) {
    long answer = 0;
    
    int numSize = p.length();
    long key = stol(p);
    string tmp;
    
    for(int i = 0; i <= t.length()-numSize; ++i)
    {
        for(int j = 0; j < numSize; ++j)
        {
            tmp = tmp + t[i+j];
        }
        
        if(stol(tmp) <= key)
        {
            ++answer;
        }
        
        tmp.clear();
    }
    
    return answer;
}