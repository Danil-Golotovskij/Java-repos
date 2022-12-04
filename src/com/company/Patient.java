package com.company;
import java.util.Scanner;

class Patient extends PersonPolyclinic {
    private int numberPatient;
    private int numberDoctor;
    private String diagnosis;

    public Patient() {
        SetFio("-");
        SetPol("-");
        SetAge(0);
        numberPatient = 0;
        numberDoctor = 0;
        diagnosis = "-";
    }

    public Patient(int numberPatient) {
        SetFio("-");
        SetPol("-");
        SetAge(0);
        numberPatient = numberPatient;
        numberDoctor = 0;
        diagnosis = "-";
    }

    public Patient(int numberPatient, String fio, int age, String pol, int numberDoctor, String diagnosis) {
        super(fio, age, pol);
        this.numberPatient = numberPatient;
        this.numberDoctor = numberDoctor;
        this.diagnosis = diagnosis;
    }

    public void Read() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input FIO: ");
        String fio = in.nextLine();
        SetFio(fio);
        System.out.print("Input pol: ");
        String pol = in.nextLine();
        SetPol(pol);
        System.out.print("Input diagnosis: ");
        String diagnosis = in.nextLine();
        SetDiagnosis(diagnosis);
        System.out.print("Input number patient: ");
        SetNumberPatient(in.nextInt());
        System.out.print("Input number doctor: ");
        SetNumberDoctor(in.nextInt());
        System.out.print("Input age: ");
        SetAge(in.nextInt());
    }

    public void Display() {
        System.out.print("FIO: ");
        System.out.println(GetFio());
        System.out.print("Pol: ");
        System.out.println(GetPol());
        System.out.print("Age: ");
        System.out.println(GetAge());
        System.out.print("Diagnosis: ");
        System.out.println(GetDiagnosis());
        System.out.print("Number patient: ");
        System.out.println(GetNumberPatient());
        System.out.print("Number doctor: ");
        System.out.println(GetNumberDoctor());
    }

    void FindAll(int numberDoctor1) {
        if (GetNumberDoctor() == numberDoctor1) {
            System.out.print("FIO patient: ");
            System.out.println(GetFio());
        }
    }

    public int GetNumberPatient() {
        return numberPatient;
    }

    public void SetNumberPatient(int numberPatient) {
        this.numberPatient = numberPatient;
    }

    public int GetNumberDoctor() {
        return numberDoctor;
    }

    public void SetNumberDoctor(int numberDoctor) {
        this.numberDoctor = numberDoctor;
    }

    public String GetDiagnosis() {
        return diagnosis;
    }

    public void SetDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
