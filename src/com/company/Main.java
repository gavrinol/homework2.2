package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


// Задание 6

        System.out.println("Ваш возраст:");
        Scanner Age = new Scanner(System.in);
        int age = Age.nextInt();
        System.out.println("Ваша зарплата:");
        Scanner Sallary = new Scanner(System.in);
        double sallary = Sallary.nextInt();
        double limitMax;
        if (age >= 23) {
            limitMax = 3 * sallary;
            if (sallary >= 50000 && sallary < 80000) {
                limitMax = limitMax * 1.2;
            } else if (sallary >= 80000) {
                limitMax = limitMax * 1.5;
            }
        } else {
            limitMax = 2 * sallary;
            if (sallary >= 50000 && sallary < 80000) {
                limitMax = limitMax * 1.2;
            } else if (sallary >= 80000) {
                limitMax = limitMax * 1.5;
            }
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limitMax + " рублей");

        // Задание 7
        System.out.println("Желаемый лимит:");
        Scanner Limit = new Scanner(System.in);
        double limit = Limit.nextInt();
        double maxMonthly = sallary / 2;
        double rate;
        if (age < 23) {
            if (sallary > 80000) {
                rate = limit + limit * (0.1 + 0.01 - 0.007);
            } else {
                rate = limit + limit * (0.1 + 0.01);
            }
        } else if (age < 30) {
            if (sallary > 80000) {
                rate = limit + limit * (0.1 + 0.05 - 0.007);
            } else {
                rate = limit + limit * (0.1 + 0.05);
            }
        } else {
            rate = limit + limit * 0.1;
        }
        rate = rate / 12;
        String approve;
        if (maxMonthly > rate) {
            approve = "Одобрено";
        } else {
            approve = "Отказано. Мы готовы выдать вам кредитную карту с лимитом " + limitMax + " рублей";
        }
        System.out.println(rate);
        System.out.println("Максимальный платеж при " + sallary + " равен " + maxMonthly + " рублей. Платеж по кредиту " + rate + " рублей. " + approve);
    }
}