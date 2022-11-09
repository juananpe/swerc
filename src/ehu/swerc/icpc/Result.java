package ehu.swerc.icpc;

import java.util.*;

class Result {

    /*
     * Complete the 'acmTeam' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY topic as parameter.
     */

    public static List<Integer> acmTeam(List<String> topic) {
        int N = topic.size();
        int M = topic.get(0).length();

        String[] bin = new String[N];
        boolean[][] b = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            bin[i] = topic.get(i);
            for (int k = 0; k < M; k++) {
                if (bin[i].charAt(k) == '1')
                    b[i][k] = true;
                else
                    b[i][k] = false;
            }
        }
        int max = 0;
        int res = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                int cnt = 0;
                if (i != j) {
                    for (int k = 0; k < M; k++) {
                        if ((b[i][k] == true) || (b[j][k] == true)) {
                            cnt++;
                        }
                    }
                    if (cnt > max) {
                        max = cnt;
                        res = 1;
                    } else if (cnt == max){
                        res++;
                    }
                }

            }
        }

/*

        System.out.println(max);
        System.out.println(res / 2);
*/

        return Arrays.asList(max, res/2);

    }

}