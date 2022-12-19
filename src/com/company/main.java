package com.company;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        Doctor d = new Doctor();
        d.SetSalary(2500);
        Worker w = new Worker();
        w.SetSalary(10000);

        ShablonWorker s = new ShablonWorker<Worker>(d);
        System.out.print(s.sum(w));



    }
}
