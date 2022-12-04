package com.company;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MedicalStaff p = new MedicalStaff();
        p.Read();
        System.out.print(p.GetFio());
    }
}
