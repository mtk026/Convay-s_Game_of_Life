package org.example;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {


        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Please Enter the Matrix row number");
        int row = scan.nextInt();
        System.out.println("Please Enter the Matrix column ");
        int col = scan.nextInt();
        int[][] arr = new int[row][col];
        int[][] arrTemp = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = rand.nextInt(2);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" -----------");

        while (true) {

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {


                    if ((i - 1 >= 0) && (j - 1 >= 0) && arr[i - 1][j - 1] >= 1) {
                        arrTemp[i][j]++;
                    }

                    if ((i - 1 >= 0) && arr[i - 1][j] == 1) {
                        arrTemp[i][j]++;

                    }
                    if ((i - 1 >= 0) && (j + 1 <row) && arr[i - 1][j + 1] == 1) {
                        arrTemp[i][j]++;

                    }
                    if ((j - 1 >= 0) && (arr[i][j - 1] == 1)) {
                        arrTemp[i][j]++;

                    }

                    if ((j + 1 < col) && arr[i][j + 1] == 1) {
                        arrTemp[i][j]++;

                    }
                    if ((i + 1 <row) && (j - 1 >= 0) && arr[i + 1][j - 1] == 1) {
                        arrTemp[i][j]++;

                    }
                    if ((i + 1 <row) && arr[i + 1][j] == 1) {
                        arrTemp[i][j]++;

                    }
                    if ((i + 1 <row) && (j + 1 <col) && arr[i + 1][j + 1] == 1) {
                        arrTemp[i][j]++;

                    }

                    if (arrTemp[i][j] == 2 || arrTemp[i][j] == 3) {
                        arrTemp[i][j] = 1;
                    } else {
                        arrTemp[i][j] = 0;
                    }

                    System.out.print(arrTemp[i][j] + " ");

                }
                System.out.println(" ");
            }

            System.out.println(" -----------");
            if (Arrays.deepEquals(arr, arrTemp)) {
                break;
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j] = arrTemp[i][j];
                    arrTemp[i][j] = 0;

                }


            }
            
        }

    }

}





