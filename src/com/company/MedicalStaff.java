package com.company;
import java.util.Scanner;

class MedicalStaff extends Worker {
    private String education;
    private boolean student;

    public MedicalStaff(){
        SetFio("-");
        SetPol("-");
        SetAge(0);
        SetNumberWorker(0);
        SetSalary(0);
        SetWorkExperience(0);
        education = "-";
        student = false;
    }

    public MedicalStaff(String education) {
        SetFio("-");
        SetPol("-");
        SetAge(0);
        SetNumberWorker(0);
        SetSalary(0);
        SetWorkExperience(0);
        this.education = education;
        student = false;
    }

    public MedicalStaff(String fio, int age, String pol, int numberWorker, int salary, int workExperience, String education, boolean student) {
        super(fio, age, pol, numberWorker, salary, workExperience);
        this.education = education;
        this.student = student;
    }

    void Find(int a, int b) {
        if (GetAge() >= a && GetAge() <= b) {
            Display();
        }
    }

    public void Read() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input FIO: ");
        String fio = in.nextLine();
        SetFio(fio);
        System.out.print("Input pol: ");
        String pol = in.nextLine();
        SetPol(pol);
        System.out.print("Input education: ");
        String educ = in.nextLine();
        SetEducation(educ);
        System.out.print("Input age: ");
        SetAge(in.nextInt());
        System.out.print("Input salary: ");
        SetSalary(in.nextInt());
        System.out.print("Input work experience: ");
        SetWorkExperience(in.nextInt());
        System.out.print("Input student: ");
        SetStudent(in.nextBoolean());
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
        System.out.print("Education: ");
        System.out.println(GetEducation());
        System.out.print("To be student: ");
        System.out.println(GetStudent());
    }

    public String GetEducation() {
        return education;
    }

    public void SetEducation(String education) {
        this.education = education;
    }

    public boolean GetStudent() {
        return student;
    }

    public void SetStudent(boolean student) {
        this.student = student;
    }
}