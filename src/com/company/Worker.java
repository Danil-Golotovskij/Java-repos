package com.company;
import java.util.Scanner;

abstract class Worker extends PersonPolyclinic {
    private int numberWorker;
    private int salary;
    private int workExperience;

    public Worker() {
        SetFio("-");
        SetPol("-");
        SetAge(0);
        numberWorker = 0;
        salary = 0;
        workExperience = 0;
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
