package com.company;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws CounterException {
        Scanner in = new Scanner(System.in);

        Doctor d = new Doctor();
        d.SetSalary(230);
        System.out.print("Зарплата за 3 месяца: ");
        System.out.println(d.Salary3());
    }
}
