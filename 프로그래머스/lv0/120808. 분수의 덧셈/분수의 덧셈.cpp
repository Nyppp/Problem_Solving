#include <string>
#include <vector>

using namespace std;

vector<int> solution(int numer1, int denom1, int numer2, int denom2) {
    vector<int> answer;
    
    int numer = (numer1 * denom2) + (numer2 * denom1);
    int denom = (denom1 * denom2);
    
    int value = max(numer, denom);
    
    for(int i = value; i > 0; --i)
    {
        if( numer % i == 0 && denom % i == 0)
        {
            value = i;
            break;
        }
    }
    
    answer.push_back(numer/value);
    answer.push_back(denom/value);
    
    
    return answer;
}