package com.company;
import java.util.Scanner;

abstract class PersonPolyclinic {
    private String fio; // ФИО
    private int age; // возраст
    private String pol; // пол

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
