#include <string>
#include <vector>
#include <sstream>
#include <stdlib.h>

using namespace std;

int solution(string my_string) {
    int answer = 0;
    stringstream ss(my_string);
    int flag = 1;
    string tmp;
    
    while(ss >> tmp)
    {
        if(tmp == "-")
        {
            flag = -1;
        }
        else if(tmp == "+")
        {
            flag = 1;
        }
        else
        {
            answer += stoi(tmp) * flag;
        }
    }
    
    
    return answer;
}