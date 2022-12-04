package com.company;
import java.util.Scanner;

class Doctor extends Worker {
    private String specialization;
    private String category;


    public Doctor(){
        SetFio("-");
        SetPol("-");
        SetAge(0);
        SetNumberWorker(0);
        SetSalary(0);
        SetWorkExperience(0);
        specialization = "-";
        category = "-";
    }

    public Doctor(String specialization) {
        SetFio("-");
        SetPol("-");
        SetAge(0);
        SetNumberWorker(0);
        SetSalary(0);
        SetWorkExperience(0);
        this.specialization = specialization;
        category = "-";
    }

    public Doctor(String fio, int age, String pol, int numberWorker, int salary, int workExperience, String specialization, String category) {
        super(fio, age, pol, numberWorker, salary, workExperience);
        this.specialization = specialization;
        this.category = category;
    }

    public void Read() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input FIO: ");
        String fio = in.nextLine();
        SetFio(fio);
        System.out.print("Input pol: ");
        String pol = in.nextLine();
        SetPol(pol);
        System.out.print("Input category: ");
        String category = in.nextLine();
        SetCategory(category);
        System.out.print("Input specialization: ");
        String specialization = in.nextLine();
        SetSpecialization(specialization);
        System.out.print("Input age: ");
        SetAge(in.nextInt());
        System.out.print("Input salary: ");
        SetSalary(in.nextInt());
        System.out.print("Input work experience: ");
        SetWorkExperience(in.nextInt());
    }

    public void Display() {
        System.out.print("FIO: ");
        System.out.println(GetFio());
        System.out.print("Pol: ");
        System.out.println(GetPol());
        System.out.print("Age: ");
        System.out.println(GetAge());
        System.out.print("Number worker: ");
        System.out.println(GetNumberWorker());
        System.out.print("Salary: ");
        System.out.println(GetSalary());
        System.out.print("Work experience: ");
        System.out.println(GetWorkExperience());
        System.out.print("Salary: ");
        System.out.println(GetSalary());
        System.out.print("Specialization: ");
        System.out.println(GetSpecialization());
    }

    public String GetSpecialization() {
        return specialization;
    }

    public void SetSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String GetCategory() {
        return category;
    }

    public void SetCategory(String category) {
        this.category = category;
    }
}