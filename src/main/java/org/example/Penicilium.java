package org.example;

public class Penicilium extends  Component{
    public Penicilium(String name, int power, String weight) {
        super(name, power, weight); // super - вызываем конструктор родительского класса
    }

    public Penicilium(String weight) {
        this("Пенициллин", 20, weight); // this - вызываем конструктор этого же класса, который более полный
    }

}