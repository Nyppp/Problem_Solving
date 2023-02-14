#include <string>
#include <vector>

using namespace std;

int solution(string A, string B) {
    int answer = 0;
    
    B += B;
    
    if(B.find(A) != string::npos)
    {
        answer = B.find(A);
    }
    else
    {
        answer = -1;
    }
    
    return answer;
}