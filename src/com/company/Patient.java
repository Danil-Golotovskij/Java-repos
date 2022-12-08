package com.company;
import java.util.Scanner;

class Patient extends PersonPolyclinic {
    Scanner in = new Scanner(System.in);
    private int numberPatient; // номер пациента
    private int numberDoctor;  // номер доктора
    private String diagnosis;  // диагноз
    private String[] weak=new String[20]; // массив болезней пациента

    public Patient() {
        SetFio("-");
        SetPol("-");
        SetAge(0);
        int i = 0;
        while (i < weak.length) {
            weak[i] = "-";
            i++;
        }
        numberPatient = 0;
        numberDoctor = 0;
        diagnosis = "-";
    }

    public Patient(int numberPatient) {
        SetFio("-");
        SetPol("-");
        SetAge(0);
        int i = 0;
        while (i < weak.length) {
            weak[i] = "-";
            i++;
        }
        numberPatient = numberPatient;
        numberDoctor = 0;
        diagnosis = "-";
    }

    public Patient(int numberPatient, String fio, int age, String pol, int numberDoctor, String diagnosis) {
        super(fio, age, pol);
        int i = 0;
        while (i < weak.length) {
            weak[i] = "-";
            i++;
        }
        this.numberPatient = numberPatient;
        this.numberDoctor = numberDoctor;
        this.diagnosis = diagnosis;
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
        System.out.print("Введите кол-во болезней: ");
        int tmp = in.nextInt();
        SetWeak(tmp);
        System.out.print("Введите диагноз: ");
        String diagnosis = in.nextLine();
        SetDiagnosis(diagnosis);
        System.out.print("Введите номер пациента: ");
        SetNumberPatient(in.nextInt());
        System.out.print("Введите номер доктора: ");
        SetNumberDoctor(in.nextInt());
        System.out.print("Введите возраст: ");
        SetAge(in.nextInt());
    }

    public void Display() {
        System.out.print("ФИО: ");
        System.out.println(GetFio());
        System.out.print("Пол: ");
        System.out.println(GetPol());
        System.out.print("Возраст: ");
        System.out.println(GetAge());
        System.out.print("Диагноз: ");
        System.out.println(GetDiagnosis());
        System.out.print("Номер пациента: ");
        System.out.println(GetNumberPatient());
        System.out.print("Номер доктора: ");
        System.out.println(GetNumberDoctor());
        System.out.print("Все болезни пациента: ");

        String[] tmpWeak=new String[20];
        tmpWeak = weak;
        int i = 0;
        while (i < 20) {
            if(tmpWeak[i] != "-"){
                System.out.print("Болезнь: ");
                System.out.println(tmpWeak[i]);}

            i++;
        }

    }

    //-----------------------------------------------------------------------------------------------------------------

    void FindAll(int numberDoctor1) {
        if (GetNumberDoctor() == numberDoctor1) {
            System.out.print("ФИО пациента: ");
            System.out.println(GetFio());
        }
    }

    //-----------------------------------------------------------------------------------------------------------------

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

    public String GetWeak() {
        return weak[20];
    }
    public void SetWeak(int counter) {
        int i = 0;
        while (i < counter) {
            System.out.print("Введите болезнь: ");
            weak[i] = in.nextLine() ;
            i++;
        }
    }
}
