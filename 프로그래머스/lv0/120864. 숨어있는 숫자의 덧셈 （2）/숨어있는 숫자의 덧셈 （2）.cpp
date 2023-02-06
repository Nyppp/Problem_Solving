#include <string>
#include <vector>
#include <sstream>

using namespace std;

int solution(string my_string) {
    int answer = 0;
    
    string tmp;
    for(int i = 0; i < my_string.length(); ++i)
    {
        if(my_string[i] >= '0' && my_string[i] <= '9')
        {
            tmp += my_string[i];
        }
        else
        {
            if(tmp.empty() != true)
            {
                answer += stoi(tmp);
                tmp.clear();
            }
        }
    }
    
    if(tmp.empty() != true)
    {
        answer += stoi(tmp);
    }
    
    return answer;
}