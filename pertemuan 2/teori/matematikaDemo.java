/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bayu
 */
import java.util.Scanner;
public class matematikaDemo {
    public static void main(String[] args) {
        matematika hitung = new matematika();
        hitung.pertambahan(20, 20);
        hitung.pengurangan(10, 5);
        hitung.perkalian(10, 20);
        hitung.pembagian(20, 2);
    }
}

class matematika {
    public void pertambahan(int a, int b) {
        int N = a + b;
        System.out.println("Pertambahan     : " + a + " + " + b + " = " + N);
    }

    public void pengurangan(int a, int b) {
        int N = a - b;
        System.out.println("Pengurangan     : " + a + " - " + b + "  = " + N);
    }

    public void perkalian(int a, int b) {
        int N = a * b;
        System.out.println("Perkalian       : " + a + " x " + b + " = " + N);
    }

    public void pembagian(int a, int b) {
        int N = a / b;
        System.out.println("Pembagian       : " + a + " / " + b + "  = " + N);
    }
}
