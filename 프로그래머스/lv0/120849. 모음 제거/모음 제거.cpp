#include <string>
#include <vector>

using namespace std;

string solution(string my_string) {
    string answer = "";
    const char vowel[] = {'a', 'e', 'i', 'o', 'u'};
    
    for(int i = 0 ; i < my_string.size(); ++i)
    {
        answer += my_string[i];
        for(int j = 0; j < 5; ++j)
        {
            if(my_string[i] == vowel[j])
            {
                answer.pop_back();
            }
        }
    }
    
    return answer;
}