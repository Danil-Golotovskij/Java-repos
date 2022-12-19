package com.company;
public class ShablonWorker<T extends Worker> {
    private T clas;
    ShablonWorker(T obj) {
        clas = obj;
    }

    public double sum(T clas1) {
        clas.salary = (clas.salary + clas1.salary) / 2;
        return clas.salary;
    }
}