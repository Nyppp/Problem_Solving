#include <string>
#include <vector>
#include <sstream>

using namespace std;

vector<string> solution(vector<string> quiz) {
    vector<string> answer;
    
    for(int i = 0; i < quiz.size(); ++i)
    {
        stringstream ss(quiz[i]);
        
        int num1;
        string flag;
        int num2;
        string equal;
        int tmpResult;
        
        ss >> num1 >> flag >> num2 >> equal >> tmpResult;
        
        int result;
        
        if(flag == "+")
        {
            result = num1 + num2;
        }
        else
        {
            result = num1 - num2;
        }
        
        if(tmpResult == result)
        {
            answer.push_back("O");
        }
        else
        {
            answer.push_back("X");
        }
    }
    return answer;
}