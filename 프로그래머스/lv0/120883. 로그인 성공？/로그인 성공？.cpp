#include <string>
#include <vector>

using namespace std;

string solution(vector<string> id_pw, vector<vector<string>> db) {
    string answer = "";
    bool isIDcorrect = false;
    
    for(int i = 0; i < db.size(); ++i)
    {
        if(id_pw[0] == db[i][0])
        {
            isIDcorrect = true;
            if(id_pw[1] == db[i][1])
            {
                answer = "login";
                return answer;
            }
        }
    }
    
    if(isIDcorrect)
    {
        answer = "wrong pw";
    }
    else
        answer = "fail";
    
    return answer;
}