/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testresults;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Testresults {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number of students");
        int n = input.nextInt();
        int[][] scores = new int[n][4];
        String[] subjects = {"Subject 1", "Subject 2", "Subject 3", "Subject 4"};
        for (int i = 0; i < n; i++) {
            System.out.println("enter scores of students " + (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.print(subjects[j]);
                scores[i][j] = input.nextInt();
            }
        }
        for (String subject : subjects) {
            System.out.print(subject);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.print(scores[i][j]);
            }
            System.out.println();
        }
        for (int j = 0; j < 4; j++) {
            int min = scores[0][j];
            int max = scores[0][j];
            for (int i = 1; i < n; i++) {
                if (scores[i][j] < min) min = scores[i][j];
                if (scores[i][j] > max) max = scores[i][j];
            }
            System.out.println(subjects[j] + "min: " + min + ", max: " + max);
        }
        input.close();
    }
}
