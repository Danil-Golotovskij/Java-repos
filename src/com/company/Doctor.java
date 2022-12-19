package com.company;
import java.util.Scanner;

class Doctor extends Worker implements Cloneable {
    protected String specialization; // специализация
    protected String category; // категория

    protected boolean proverk = true; // занесен ли в счетчик
    Worker worker;


    //public Object clone() throws CloneNotSupportedException {
    //    return super.clone();
    //}

    public Doctor clone() throws CloneNotSupportedException{
        Doctor doctor = (Doctor) super.clone();
        doctor.worker = worker.clone();
        return doctor;
    }

    public Doctor(){
        SetFio("-");
        SetPol("-");
        SetAge(0);
        SetNumberWorker(0);
        SetSalary(1000);
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

    void ChangeWorker(String category) {  // метод для перегрузки с вызовом
        ChangeWorker();
        this.category = category;
    }

    void ChangeWorker(int age) {     // метод для перегрузки без вызова
        this.age = age;
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
        System.out.print("Введите номер работника: ");
        SetNumberWorker(in.nextInt());
        System.out.print("Введите зарплату: ");
        SetSalary(in.nextInt());
        System.out.print("Введите стаж: ");
        SetWorkExperience(in.nextInt());
        Counter(proverk);
        proverk = false;
    }

    public String toString()
    {
        return fio+"  "+pol+"  "+age+"  "+numberWorker+"  "+salary+"  "+workExperience+"  "+specialization
                +"  "+worker.numberWorker+"  "+worker.salary+"  "+worker.workExperience;
    }


    public void Display() {
        System.out.print("ФИО: ");
        System.out.println(fio);
        System.out.print("Пол: ");
        System.out.println(pol);
        System.out.print("Возраст: ");
        System.out.println(age);
        System.out.print("Номер работника: ");
        System.out.println(numberWorker);
        System.out.print("Зарплата: ");
        System.out.println(salary);
        System.out.print("Стаж: ");
        System.out.println(workExperience);
        System.out.print("Специализация: ");
        System.out.println(specialization);
        System.out.print("Категория: ");
        System.out.println(category);

        System.out.print("\nФИО вл.: ");
        System.out.println(worker.fio);
        System.out.print("Пол вл.");
        System.out.println(worker.pol);
        System.out.print("Возраст вл.: ");
        System.out.println(worker.age);
        System.out.print("Номер работника вл.: ");
        System.out.println(worker.numberWorker);
        System.out.print("Зарплата вл.: ");
        System.out.println(worker.salary);
        System.out.print("Стаж вл.: ");
        System.out.println(worker.workExperience);

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