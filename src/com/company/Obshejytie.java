package com.company;

import java.util.Arrays;

public class Obshejytie implements Arenda {

    private People[] people;
    private boolean oplata;

    public Obshejytie(People[] people, boolean oplata) {
        this.people = people;
        this.oplata = oplata;
    }

    public People[] getPeople() {
        return people;
    }

    public void setPeople(People[] people) {
        this.people = people;
    }

    public boolean isOplata() {
        return oplata;
    }

    public void setOplata(boolean oplata) {
        this.oplata = oplata;
    }

    @Override
    public String toString() {
        return "Obshejytie " +
                "people = " + Arrays.toString(people) +
                " oplata = " + oplata +
                ':';
    }

    @Override
    public void arenda() {
        if (oplata == true) {
            System.out.println("good\n");
        } else {
            System.out.println(" Pay your rent or we'll evict you\n");
        }
    }
}
