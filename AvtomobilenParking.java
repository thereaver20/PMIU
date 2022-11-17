package com.company;
import java.util.Scanner;

public class AvtomobilenParking {

    static void parkingA() {
        String parkingA[] = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < parkingA.length; i++) {
            System.out.print("Enter Car number: ");
            String car = sc.nextLine();
            parkingA[i] = car;
        } System.out.print("Parking A full!\n");
    }
    static void parkingB() {
        String parkingB[] = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < parkingB.length; i++) {
            System.out.print("Enter Car number: ");
            String car = sc.nextLine();
            parkingB[i] = car;
        } System.out.print("Parking B full!\n");
    }
    static void parkingC() {
        String parkingC[] = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < parkingC.length; i++) {
            System.out.print("Enter Car number: ");
            String car = sc.nextLine();
            parkingC[i] = car;
        } System.out.print("Parking C full!\n");
    }

    public static void main(String[] args) {
        parkingA();
        parkingB();
        parkingC();

    }
}

