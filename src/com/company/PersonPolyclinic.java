package com.company;
import java.util.Scanner;


abstract class PersonPolyclinic implements InterfacePerson  {
    Scanner in = new Scanner(System.in);
    protected String fio; // ФИО
    protected int age; // возраст
    protected String pol; // пол

    public PersonPolyclinic() {
        fio = "-";
        age = 0;
        pol = "-";
    }

    public PersonPolyclinic(int age) {
        fio = "-";
        this.age = age;
        pol = "-";
    }

    public PersonPolyclinic(String fio, int age, String pol) {
        this.fio = fio;
        this.age = age;
        this.pol = pol;
    }

    //-----------------------------------------------------------------------------------------------------------------

    public String GetFio() {
        return fio;
    }

    public void SetFio(String fio) {
        this.fio = fio;
    }

    public int GetAge() {
        return age;
    }

    public void SetAge(int age) {
        this.age = age;
    }

    public String GetPol() {
        return pol;
    }

    public void SetPol(String pol) {
        this.pol = pol;
    }
}
