#include <string>
#include <vector>
#include <sstream>

using namespace std;

string solution(string polynomial) {
    string answer = "";
    
    stringstream ss;
    ss.str(polynomial);
    
    string tmp;
    
    int xCount = 0;
    int num = 0;
    
    while(ss >> tmp)
    {
        if(tmp == "+")
            continue;
        
        if(tmp.length() > 1 && tmp.find("x") != string::npos)
        {
            string xtmp;
            for(int i = 0; i < tmp.length()-1; ++i)
            {
                xtmp += tmp[i];
            }
            
            xCount += stoi(xtmp);
        }
        else if(tmp == "x")
        {
            ++xCount;
        }
        else
        {
            num += stoi(tmp);
        }
    }
    
    if(xCount > 0)
    {
        if(xCount > 1)
        {
            answer += to_string(xCount);
        }
        answer += "x";
    }
    
    if(num > 0)
    {
        if(answer.empty() != true)
        {
            answer += " + ";
        }
        answer += to_string(num);
    }
    
    if(answer.empty())
    {
        answer += "0";
    }
    
    return answer;
}