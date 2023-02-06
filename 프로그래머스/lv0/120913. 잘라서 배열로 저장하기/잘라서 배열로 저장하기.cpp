#include <string>
#include <vector>

using namespace std;

vector<string> solution(string my_str, int n) {
    vector<string> answer;
    string tmp;
    
    for(int i = 0; i < my_str.length(); ++i)
    {
        if(i % n == 0 && i > 0)
        {
            answer.push_back(tmp);
            tmp.clear();
        }
        
        tmp += my_str[i];
    }
    
    
    if(tmp.length() > 0)
    {
        answer.push_back(tmp);
    }
    
    return answer;
}