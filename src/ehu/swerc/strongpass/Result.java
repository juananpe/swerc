package ehu.swerc.strongpass;

import java.util.*;

class Result {

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String pass) {
    // Return the minimum number of characters to make the password strong
        
        var numbers = "0123456789";
        var lower_case = "abcdefghijklmnopqrstuvwxyz";
        var upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        var special_characters = "!@#$%^&*()-+";

        var NUMBERS=0; 
        // var pass = "2bbbb";
        // var pass = "2bb#A";
        var conditions = new Boolean[4];
        Arrays.fill(conditions, Boolean.FALSE);


        for(int i=0; i<pass.length(); i++){
            var caracter = ""+pass.charAt(i);

            if (numbers.contains(caracter)){
                 conditions[0] = true ;
            } else if (lower_case.contains(caracter)){
                 conditions[1] = true ;
            } else if (upper_case.contains(caracter)){
                 conditions[2] = true ;
            } else if (special_characters.contains(caracter)){
                 conditions[3] = true ;
            }

        }

        // System.out.println(Arrays.asList(conditions));

        int res = 0; for(int i=0; i<conditions.length; i++){  if (!conditions[i]) res++; }

        // System.out.println( Math.max(res, 6-pass.length())  )

        return Math.max(res, 6-pass.length());

    }

}
