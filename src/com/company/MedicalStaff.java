package com.company;
import java.util.Scanner;

class MedicalStaff extends Worker {
    protected String education; // образование
    protected boolean student; // является студентом

    protected boolean proverk = true; // занесен ли в счетчик


    public MedicalStaff(){
        SetFio("-");
        SetPol("-");
        SetAge(0);
        SetNumberWorker(0);
        SetSalary(0);
        SetWorkExperience(0);
        education = "-";
        student = false;
        Counter(proverk);
        proverk = false;
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
        Counter(proverk);
        proverk = false;
    }

    public MedicalStaff(String fio, int age, String pol, int numberWorker, int salary, int workExperience, String education, boolean student) {
        super(fio, age, pol, numberWorker, salary, workExperience);
        this.education = education;
        this.student = student;
        Counter(proverk);
        proverk = false;
    }

    //-----------------------------------------------------------------------------------------------------------------

    void Find(int a, int b) {
        if (GetAge() >= a && GetAge() <= b) {
            Display();
        }
    }

    //-----------------------------------------------------------------------------------------------------------------

    public void Read() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String fio = in.nextLine();
        SetFio(fio);
        System.out.print("Введите пол: ");
        String pol = in.nextLine();
        SetPol(pol);
        System.out.print("Введите образование: ");
        String educ = in.nextLine();
        SetEducation(educ);
        System.out.print("Введите возраст: ");
        SetAge(in.nextInt());
        System.out.print("Введите зарплату: ");
        SetSalary(in.nextInt());
        System.out.print("Введите стаж: ");
        SetWorkExperience(in.nextInt());
        System.out.print("Является ли студентом (True или False): ");
        SetStudent(in.nextBoolean());
        Counter(proverk);
        proverk = false;
    }

    public void Display() {
        System.out.print("ФИО: ");
        System.out.println(GetFio());
        System.out.print("Пол: ");
        System.out.println(GetPol());
        System.out.print("Востраст: ");
        System.out.println(GetAge());
        System.out.print("Номер работника: ");
        System.out.println(GetNumberWorker());
        System.out.print("Зарплата: ");
        System.out.println(GetSalary());
        System.out.print("Стаж: ");
        System.out.println(GetWorkExperience());
        System.out.print("Образование: ");
        System.out.println(GetEducation());
        System.out.print("Является ли студентом: ");
        System.out.println(GetStudent());
    }

    //-----------------------------------------------------------------------------------------------------------------

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