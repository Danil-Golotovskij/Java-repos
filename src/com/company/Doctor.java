package com.company;
import java.util.Scanner;

class Doctor extends Worker {
    private String specialization; // специализация
    private String category; // категория

    public boolean proverk = true; // занесен ли в счетчик
    public Doctor(){
        SetFio("-");
        SetPol("-");
        SetAge(0);
        SetNumberWorker(0);
        SetSalary(0);
        SetWorkExperience(0);
        specialization = "-";
        category = "-";
        Counter(proverk);
        proverk = false;
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
        Counter(proverk);
        proverk = false;
    }

    public Doctor(String fio, int age, String pol, int numberWorker, int salary, int workExperience, String specialization, String category) {
        super(fio, age, pol, numberWorker, salary, workExperience);
        this.specialization = specialization;
        this.category = category;
        Counter(proverk);
        proverk = false;
    }

    //-----------------------------------------------------------------------------------------------------------------

    public int Salary3() {  // Метод считает зарплату за 3 месяца
        Vosvrashator p = new Vosvrashator();
        int c = GetSalary();
        return p.Vozv(c);
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
        System.out.print("Введите категорию: ");
        String category = in.nextLine();
        SetCategory(category);
        System.out.print("Введите специализацию: ");
        String specialization = in.nextLine();
        SetSpecialization(specialization);
        System.out.print("Введите возраст: ");
        SetAge(in.nextInt());
        System.out.print("Введите зарплату: ");
        SetSalary(in.nextInt());
        System.out.print("Введите стаж: ");
        SetWorkExperience(in.nextInt());
        Counter(proverk);
        proverk = false;
    }

    public void Display() {
        System.out.print("ФИО: ");
        System.out.println(GetFio());
        System.out.print("Пол: ");
        System.out.println(GetPol());
        System.out.print("Возраст: ");
        System.out.println(GetAge());
        System.out.print("Номер работника: ");
        System.out.println(GetNumberWorker());
        System.out.print("Зарплата: ");
        System.out.println(GetSalary());
        System.out.print("Стаж: ");
        System.out.println(GetWorkExperience());
        System.out.print("Зарплата: ");
        System.out.println(GetSalary());
        System.out.print("Специализация: ");
        System.out.println(GetSpecialization());
    }

    //-----------------------------------------------------------------------------------------------------------------

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