package ehu.swerc.icpc;

import java.util.*;

class ResultIncorrect {

    /*
     * Complete the 'acmTeam' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY topic as parameter.
     */

    public static List<Integer> acmTeam(List<String> topic) {
    // Write your code here
        int max = 0;
        int howmany = 0;

        for (int i=0; i<topic.size(); i++){
            for (int j=0; j<topic.size(); j++){
                if (j!=i){
                    int left = Integer.parseInt(topic.get(i),2);
                    int right = Integer.parseInt(topic.get(j),2);
                    int res = left | right;

                    int ones = (int) Integer.toBinaryString(res).chars().filter(ch -> ch == '1').count();
                    if (ones > max) {
                        max = ones;
                        howmany = 1;
                    } else if (ones == max){
                        howmany++;
                    }
                }
            }
        }

        /*System.out.println("Max: " + max );
        System.out.println("Howmany: " + howmany/2 );*/

        return Arrays.asList(max, howmany/2);
    }

}
