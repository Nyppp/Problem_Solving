#include <string>
#include <vector>
#include <cstdlib>

using namespace std;

int solution(vector<int> array, int n) {
    int answer = 0;
    int sub = 100;
    
    for(int i = 0; i < array.size(); ++i)
    {
        if(abs(n - array[i]) < sub)
        {
            answer = array[i];
            sub = abs(n - array[i]);
        }
        
        if(abs(n - array[i]) == sub)
        {
            answer = min(answer, array[i]);
        }
    }
    
    return answer;
}