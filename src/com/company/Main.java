package com.company;

import java.util.Scanner;

public class Main {
    // Произведите ввод данных с клавиатуры в матрицу,
    // а после этого произведите вывод первой строки матрицы на экран,
    // где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        int a = in.nextInt();

        System.out.print("Введите количество столбцов массива: ");
        int b = in.nextInt();

        int newArray[][] = new int[a][b];

        for (int i = 0; i<a; i++){
            for (int j = 0; j<b; j++){
                newArray[i][j] = in.nextInt();
            }
        }


 //       for (int i = 0; i<a; i++){
            for (int j = 0; j<b; j++){
                System.out.print(" " + newArray[0][j]*3 + " ");
 //   }
        }

    }
}
