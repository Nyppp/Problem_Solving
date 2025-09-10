#include <iostream>
#include <vector>

//백준 15649 N 과 M
using namespace std;
int N, M;
int level = 1;
bool visit[9] = { 0, };

vector<int> Num;

void DFS()
{
    if (Num.size() == M)
    {
        for (int i = 0; i < M; ++i)
        {
            cout << Num[i] << " ";
        }
        cout << '\n';
        return;
    }

    for (int i = 1; i <= N; ++i)
    {
        if (visit[i] == true)
            continue;

        Num.push_back(i);
        visit[i] = true;

        DFS();

        Num.pop_back();
        visit[i] = false;
    }
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> N >> M;

    DFS();

    
    return 0;
}