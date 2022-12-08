package com.company;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Doctor d = new Doctor();
        d.Read();
        System.out.println(d.Salary3());
        System.out.println(d.GetSalary());

    }
}
