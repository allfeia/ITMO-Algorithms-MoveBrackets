package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = Integer.parseInt(scanner.nextLine());

        for (int m = 0; m < k; m++) {
            int brackets = Integer.parseInt(scanner.nextLine());
            String str = scanner.nextLine();
            char[] c = str.toCharArray();

            int openCount = 0;
            int closeCount = 0;
            int s = 0;
            int n = 0;

            for (int i = 0; i < brackets; i++) {
                if (c[i] == '(') {
                    openCount++;
                } else if (c[i] == ')') {
                    closeCount++;
                }

                s = openCount - closeCount;

                if (s < 0) {
                    n++;
                    closeCount--;
                    s = openCount - closeCount;
                }

            }

            System.out.println(n);

        }
        scanner.close();

    }
}
