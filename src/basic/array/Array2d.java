package basic.array;

import java.util.Arrays;

public class Array2d {
    public static void main(String[] args) {
        /*
        int[][] arr = new int[3][4];
        arr[1][1] = 100;
        System.out.println(Arrays.deepToString(arr));
        */

        int[][] score = {
                {79, 80, 99}, // A학생
                {95, 85, 89}, // B학생
                {90, 65, 56}, // C학생
                {69, 78, 77}, // D학생
        };

        String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
        String[] subName = {"국어", "영어", "수학"};

        /*
         1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
         2. 각 과목의 평균을 출력해 보세요.
         3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)
         */
        
        double tatalAvg = 0.0; // 학생들의 평균 점수의 총합

        int idx = 0;
        for (int[] stu : score) {
            int tatal = 0;
            for (int s : stu) {
                tatal += s;
            }
            double avg = (double)tatal / subName.length;
            tatalAvg += avg;
            System.out.printf("%s의 평균: %.1f점\n",stuName[idx],avg);
            idx++;
        }

        System.out.println("===================================================");


        for (int j = 0; j < subName.length; j++) {
            int tatal = 0;
            for (int i = 0; i < stuName.length; i++) {
                tatal += score[i][j];
            }
            double avg = (double)tatal / stuName.length;
            System.out.printf("%s의 평균 점수: %.1f점\n", subName[j], avg);
        }

        System.out.println("===================================================");

        System.out.printf("반 평균: %.1f점\n", tatalAvg/stuName.length);
    }
}
