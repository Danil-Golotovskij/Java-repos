package com.company;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws CounterException {
        Scanner in = new Scanner(System.in);

        Patient d = new Patient();

        try {
            d.Read();
        } catch (AnalisiException e) {
            throw new RuntimeException(e);
        }

        d.Display();

    }
}
