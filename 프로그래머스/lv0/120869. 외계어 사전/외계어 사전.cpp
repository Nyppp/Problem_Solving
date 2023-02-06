#include <string>
#include <vector>

using namespace std;

int solution(vector<string> spell, vector<string> dic) {
    int answer = 0;
    
    bool isSpell = false;
    for(int i = 0 ; i < dic.size(); ++i)
    {
        for(int j = 0 ; j < spell.size(); ++j)
        {
            if(dic[i].find(spell[j]) == string::npos)
            {
                break;
            }
            if(j == spell.size() -1)
            {
                isSpell = true;
                break;
            }
        }
    }
    
    if(isSpell)
    {
        answer = 1;
    }
    else
    {
        answer = 2;
    }
    return answer;
}