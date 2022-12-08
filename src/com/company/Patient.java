package com.company;
import java.util.Scanner;

class Patient extends PersonPolyclinic {
    Scanner in = new Scanner(System.in);
    private int numberPatient; // номер пациента
    private int numberDoctor;  // номер доктора
    private String diagnosis;  // диагноз
    private String[] weak=new String[20]; // массив болезней пациента
    private String[][] analisi=new String[3][2];  // анализы: 0-вич, 1-гепатит В, 2-гепатит С
    // в 2 элементе прописывается "пол" - положительный тест или "отр" - отрицательный или "-" - нет результата



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
        analisi[0][0] = "Тест на вич: ";
        analisi[1][0] = "Тест на гепатит B: ";
        analisi[2][0] = "Тест на гепатит С: ";
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
        analisi[0][0] = "Тест на вич: ";
        analisi[1][0] = "Тест на гепатит B: ";
        analisi[2][0] = "Тест на гепатит С: ";
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
        analisi[0][0] = "Тест на вич: ";
        analisi[1][0] = "Тест на гепатит B: ";
        analisi[2][0] = "Тест на гепатит С: ";
    }

    //-----------------------------------------------------------------------------------------------------------------

    public void Read() throws CounterException, AnalisiException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String fio = in.nextLine();
        SetFio(fio);
        System.out.print("Введите пол: ");
        String pol = in.nextLine();
        SetPol(pol);
        SetWeak(); // Ввод болезней
        SetAnalisi(); // Ввод рез анализов
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

        System.out.print("\nВсе болезни пациента: \n");
        int i = 0;
        while (i < 20) {
            if(weak[i] != "-"){
                System.out.print("Болезнь: ");
                System.out.println(weak[i]);}
            i++;
        }

        System.out.println("\nРезультаты анализов");
        int j = 0;
        while (j < 3) {
            System.out.println(analisi[j][0] + analisi[j][1]);
            j++;
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
    public String GetAnalisi() {
        return analisi[3][2];
    }
    public void SetWeak() throws CounterException {
            System.out.print("Введите кол-во болезней от 0 до 20: ");
            int counter = in.nextInt();
            in.nextLine();
            if(counter>20 || counter <0){
                throw new CounterException("НЕККОРЕКТНЫЙ ВВОД!!!");
            }
            int i = 0;
            while (i < counter) {
                System.out.print("Введите болезнь: ");
                weak[i] = in.nextLine();
                i++;
            }
    }
    public void SetAnalisi() throws AnalisiException {
            int i = 0;
            System.out.println("Результаты анализа вводить: 'пол' - положительный тест, 'отр' - отрицательный, '-' - нет результата");
            while (i < 3) {
                System.out.print(analisi[i][0]);

                analisi[i][1] = in.nextLine();


                if(analisi[i][1].equals("пол") || analisi[i][1].equals("отр") || analisi[i][1].equals("-")){}
                else {
                    analisi[0][1] = "-";
                    analisi[1][1] = "-";
                    analisi[2][1] = "-";
                    throw new AnalisiException("НЕККОРЕКТНЫЙ ВВОД!!!");}
                i++;
            }
    }
}
