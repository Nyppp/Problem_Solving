#include <iostream>
#include <vector>
#include <algorithm>
#include <cstring>

//백준 11049 행렬 곱셈 순서
using namespace std;

#define MAX_SIZE 501
#define INF 1000000000

int N;
vector<pair<int, int>> matrix;
int DP[MAX_SIZE][MAX_SIZE] = { 0, };

void Input()
{
    cin >> N;

    for (int i = 0; i < N; ++i)
    {
        int r, c;
        cin >> r >> c;

        matrix.push_back(make_pair(r, c));
    }
}

void Solve()
{
    for (int i = 1; i < N; ++i)
    {
        for (int j = 0; i + j < N; ++j)
        {
            DP[j][i + j] = INF;
            for (int k = j; k <= i + j; ++k)
            {
                DP[j][i + j] = min(DP[j][i + j], 
                    DP[j][k] + DP[k + 1][i + j] +
                    matrix[j].first * matrix[k].second * matrix[i + j].second);
            }
        }
    }

    cout << DP[0][N-1];
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    Input();
    Solve();

    return 0;
}