package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scan.nextInt();
        System.out.print("\n");

        double number; //число
        int n1 = n;
        int n2 = 0;
        int n3 = 0;
        int den = 1; //делитель
        int denominators = 0; // кол-во делителей

        while (n1 != 0) {
            System.out.print("Введите число: ");
            number = scan.nextDouble();
            numbers.add(number);
            n1--;
        }

        while (n2 < numbers.size()) {
            if (numbers.get(n2) % 1 != 0) {
                numbers.remove(n2);
            } else {
                while (den <= numbers.get(n2)) {
                    if (numbers.get(n2) % den == 0) {
                        den++; //делитель
                        denominators++; //кол-во делителей
                    } else {
                        den++; //делитель
                    }
                }
                den = 1;
                if (denominators > 2) {
                    numbers.remove(n2);
                }
                denominators = 0;
                n2++;
            }
        }

        System.out.println("\n");

        if (numbers.size() == 0) {
            System.out.println("Простых чисел нет");
        } else {
            while (n3 < numbers.size()) {
                System.out.print(numbers.get(n3) + "\n");
                n3++;
            }
        }
    }
}
