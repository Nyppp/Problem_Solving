#include <string>
#include <vector>
#include <map>
#include <sstream>

using namespace std;

map<string, char> morseToCharMap;

string morse[26]={".-","-...","-.-.","-..",".","..-.","--.","....","..",
				".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-","-.--","--.."};

string solution(string letter) {
    string answer = "";
    string str = "";
    stringstream stream(letter);
    
    for(int i = 0; i < 26; ++i)
    {
        morseToCharMap[morse[i]] = 'a' + i;
    }
    
    while(stream >> str)
    {
        answer += morseToCharMap[str];
    }
    return answer;
}