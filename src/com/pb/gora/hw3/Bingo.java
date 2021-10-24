package com.pb.gora.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random number = new Random();
        int x = number.nextInt(101);
        System.out.println("Вам нужно отгадать случайное число в диапазоне 0-100");
        System.out.println("Для выхода из программы введите - 111");
        final int MAX_ATTEMPT = 101;
        int attempt = 0;
        Scanner scan = new Scanner(System.in);
        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Ваше число : ");
            int y;
            y = scan.nextInt();
            if (y<x){ System.out.println("Число должно быть больше");

            }
            if (y>x){ System.out.println("Число должно быть меньше");

            }
            if (y==x){ System.out.println("Поздравляем, число угадано с " + attempt + " попытки!");
                System.out.println("Конец игры!");
                break; }
            if (y==111){ System.out.println("выход!");
                System.out.println("Конец игры!");
                break;

            }



        }


    }

}
