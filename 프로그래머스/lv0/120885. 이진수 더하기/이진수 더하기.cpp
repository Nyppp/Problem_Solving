#include <string>
#include <vector>

using namespace std;

string solution(string bin1, string bin2) {
    string answer = "";
    bool isFlag = false;
    string tmp;
    
    if(bin1.length() < bin2.length())
    {
        int idx = bin2.length() - bin1.length();
        for(int i = 0; i < idx; ++i)
        {
            tmp += '0';
        }
        bin1 = tmp + bin1;
    }
    else
    {
        int idx = bin1.length() - bin2.length();
        for(int i = 0; i < idx; ++i)
        {
            tmp += '0';
        }
        bin2 = tmp + bin2;
    }
    
    
    for(int i = bin1.size()-1; i >= 0; --i)
    {
        if(bin1[i] == '0' && bin2[i] == '0')
        {
            if(isFlag)
            {
                answer = "1" + answer;
            }
            else
            {
                answer = "0" + answer;
            }
            
            isFlag = false;
        }
        
        else if(bin1[i] == '1' && bin2[i] == '1')
        {
            if(isFlag)
            {
                answer = "1" + answer;
            }
            else
            {
                answer = "0" + answer;
            }
            
            isFlag = true;
        }
        
        else
        {
            if(isFlag)
            {
                answer = "0" + answer;
                isFlag = true;
            }
            else
            {
                answer = "1" + answer;
            }
        }
    }
    
    if(isFlag)
    {
        answer = "1" + answer;
    }
    
    return answer;
}