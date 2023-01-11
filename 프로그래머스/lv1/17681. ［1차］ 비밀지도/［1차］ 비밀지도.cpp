#include <string>
#include <vector>

using namespace std;

vector<string> ConvertToDigit(vector<int> arr)
{
    vector<string> digit;
    for(int i = 0; i < arr.size(); ++i)
    {
        string tmp;
        for(int j = 0; j < arr.size(); ++j)
        {
            if(arr[i]%2 == 1)
            {
                tmp = "1" + tmp;
            }
            else
            {
                tmp = "0" + tmp;
            }
            arr[i] /= 2;
        }
        digit.push_back(tmp);
    }
    return digit;
}

vector<string> solution(int n, vector<int> arr1, vector<int> arr2) {
    vector<string> answer;
    
    vector<string> s1 = ConvertToDigit(arr1);
    vector<string> s2 = ConvertToDigit(arr2);
    
    for(int i = 0; i < n; ++i)
    {
        string tmp;
        for(int j = 0; j < n; ++j)
        {
            if((s1[i][j] == '1') || (s2[i][j] == '1'))
            {
                tmp = tmp + "#";
            }
            else
            {
                tmp = tmp + " ";
            }
        }
        answer.push_back(tmp);
    }
    
    return answer;
}