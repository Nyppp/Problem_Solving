import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[][] house = new int[N][N]; //집 좌표
        int[][] moveDir = {{1,0},{0,1},{-1,0},{0,-1}}; //4방향 좌표 이동
        boolean[][] isVisited = new boolean[N][N]; //방문 기록

        List<Integer[]> list = new ArrayList<>(); //탐색 중인 좌표들 저장
        List<Integer> area = new ArrayList<>(); //집 크기 저장 리스트


        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                house[i][j] = input.charAt(j) - '0';
            }
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                //이전 탐색에서 이미 방문했거나, 아예 집이 아닌 경우 제외
                if(house[i][j] == 0 || isVisited[i][j]){
                    isVisited[i][j] = true;
                    continue;
                }

                //최초로 집 탐지
                if(house[i][j] == 1){
                    list.add(new Integer[]{i,j});
                    isVisited[i][j] = true;
                    int areaCount = 0;
                    
                    while (!list.isEmpty()) {
                        int currentX = list.get(list.size()-1)[0];
                        int currentY = list.get(list.size()-1)[1];
                        list.remove(list.size()-1);
                        areaCount++;

                        //4방향으로 탐색 시작
                        for (int k = 0; k < moveDir.length; k++) {
                            int nextX = currentX + moveDir[k][0];
                            int nextY = currentY + moveDir[k][1];

                            //인덱스 예외처리
                            if(nextX < 0 || nextX >= N || nextY < 0 || nextY >= N){
                                continue;
                            }

                            //이미 방문한 곳 , 집이 아닌 곳
                            if(isVisited[nextX][nextY] || house[nextX][nextY] == 0){
                                continue;
                            }

                            //다음 방향을 우선적으로 탐색 > 깊이 우선 탐색
                            list.add(new Integer[]{nextX, nextY});
                            isVisited[nextX][nextY] = true;
                        }
                    }

                    area.add(areaCount);
                }
            }
        }

        Collections.sort(area);
        sb.append(area.size() + "\n");
        for (int i = 0; i < area.size(); i++) {
            sb.append(area.get(i) + "\n");
        }

        System.out.println(sb);
    }
}