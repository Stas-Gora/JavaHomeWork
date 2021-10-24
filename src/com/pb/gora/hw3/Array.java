package com.pb.gora.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Заполните массив");
        int mas[] = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scan.nextInt();
        }


        System.out.println("Заполненый массив");
        for (int i=0;i < mas.length;i++){
            System.out.print(mas[i]+ " ");
        }
        System.out.println();



        int num = 0;
        for (int i=0 ; i< mas.length; i++){
            if (mas[i]>0 ){  // находим нечетные элементы
                num++;
            }
        }
        System.out.println("Количество элементов больше нуля  =  "+ num);

        for (int element : mas)
            num += element;
        System.out.println("сумма всех элементов массива  =  "+ num);

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i=0 ; i< mas.length; i++)
                if (mas[i] < mas[i + 1]) {
                    int temp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = temp;
                    isSorted = false;

                }
            }
        System.out.println();
        }



}