package com.pb.gora.hw2;

import java.util.Scanner;

public class Calculator {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int operand1;
    int operand2;
    String sign;

    System.out.println("Пожалуйста введите первое число");
    operand1 = scan.nextInt();

    System.out.println("Пожалуйста введите второе число");
    operand2 = scan.nextInt();

    System.out.println("Пожалуйста введите знак арифметической операции + - / или *");
     sign = scan.next();

    switch(sign) {
        case "+":
            System.out.print("Ваш ответ" + (operand1 + operand2));
            break;
        case "-":
                System.out.println("Ваш ответ" + (operand1 - operand2));
            break;
        case "*":
            System.out.println("Ваш ответ" + (operand1 * operand2));
            break;
        case  "/":
            if(operand2 == 0) {
                System.out.println("Ваш ответ" + (operand1 / operand2));
                System.out.println("Ошибка. На ноль делить нельзя");
                break;
            }
            }
        }
    }
 }
