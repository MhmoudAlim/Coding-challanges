package leetcode_problems.easy;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatePoints {

    public static int calculate(String[] ops) {
        int result = Integer.MIN_VALUE;
        int listSize = ops.length;
        int[] specialOp = {1, 2, 2, 3};
        Arrays.sort(specialOp);
        int len = specialOp.length;

        return result;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ops = sc.nextLine().split(" ");


        System.out.println(CalculatePoints.calculate(ops));

    }

}



