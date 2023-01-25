#include <string>
#include <vector>
#include <sstream>
#include <string>

using namespace std;

int solution(string s) {
    int answer = 0;
    
    stringstream ss;
    ss.str(s);
    
    string num;
    int preNum;
    
    while(ss >> num)
    {
        if(num == "Z")
        {
            answer -= preNum;
            continue;
        }
        answer += stoi(num);
        preNum = stoi(num);
    }
    
    return answer;
}