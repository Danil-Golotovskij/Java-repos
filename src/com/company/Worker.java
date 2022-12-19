package com.company;
import java.util.Scanner;

class Worker extends PersonPolyclinic implements Cloneable{
    protected int numberWorker; // номер работника
    protected int salary; // зарплата
    protected int workExperience; // стаж
    protected Worker worker;


    public static int counter=0;   // кол-во работников в больнице


    public static void Counter(boolean proverk){ // метод занесения в счетчик
        if (proverk == true) {
            counter++;
        }
    }
    public static void CounterPrint(){
        System.out.printf("Кол-во работников: ");
        System.out.println(counter);
    }

    //-----------------------------------------------------------------------------------------------------------------

    public Worker()  {
        SetFio("-");
        SetPol("-");
        SetAge(0);
        numberWorker = 0;
        salary = 1000;
        workExperience = 2;
    }

    public Worker(int numberWorker) {
        SetFio("-");
        SetPol("-");
        SetAge(0);
        this.numberWorker = numberWorker;
        salary = 0;
        workExperience = 0;
    }

    public Worker(String fio, int age, String pol, int numberWorker, int salary, int workExperience) {
        super(fio, age, pol);
        this.numberWorker = numberWorker;
        this.salary = salary;
        this.workExperience = workExperience;
    }

    //-----------------------------------------------------------------------------------------------------------------


    public Worker clone() throws CloneNotSupportedException {
        return (Worker) super.clone();
    }


    //-----------------------------------------------------------------------------------------------------------------

    void ChangeWorker() {       // метод для перегрузки
        System.out.print("Введите номер работника: ");
        numberWorker = in.nextInt();
    }

    public void Read(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String fio = in.nextLine();
        SetFio(fio);
        System.out.print("Введите пол: ");
        String pol = in.nextLine();
        SetPol(pol);
        System.out.print("Введите возраст: ");
        SetAge(in.nextInt());
        System.out.print("Введите номер работника: ");
        SetNumberWorker(in.nextInt());
        System.out.print("Введите зарплату: ");
        SetSalary(in.nextInt());
        System.out.print("Введите стаж: ");
        SetWorkExperience(in.nextInt());

    }

    //-----------------------------------------------------------------------------------------------------------------



    //-----------------------------------------------------------------------------------------------------------------

    public int GetNumberWorker() {
        return numberWorker;
    }

    public void SetNumberWorker(int numberWorker) {
        this.numberWorker = numberWorker;
    }

    public int GetSalary() {
        return salary;
    }

    public void SetSalary(int salary) {
        this.salary = salary;
    }

    public int GetWorkExperience() {
        return workExperience;
    }

    public void SetWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }
}
