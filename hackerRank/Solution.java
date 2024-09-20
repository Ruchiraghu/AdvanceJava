package hackerRank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int positiveCount =0;
        int negativeCount =0;
        int zeroCount =0;
        for(int num:arr){
            if(num>0){
                positiveCount++;
            }
            else if (num<0){
                negativeCount++;
            }
            else{
                zeroCount++;

            }
        }
        System.out.printf("%.6f\n",(double)positiveCount/n);
        System.out.printf("%.6f\n",(double)negativeCount/n);
        System.out.printf("%.6f\n",(double)zeroCount/n);


    }

}
class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

