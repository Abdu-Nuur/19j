package com.company;

import java.util.Arrays;

public class Kvartira implements KomUsluga {
    private People[] people;
    private boolean oplata;

    public Kvartira(People[] people, boolean oplata) {
        this.people = people;
        this.oplata = oplata;
    }

    public People[] getPeople() {
        return people;
    }

    public void setPeople(People[] people) {
        this.people = people;
    }

    public boolean getOplata() {
        return oplata;
    }

    public void setOplata(boolean oplata) {
        this.oplata = oplata;
    }

    @Override
    public String toString() {
        return "Kvartira " +
                "famaly = " + Arrays.toString(people) +
                " oplata = " + oplata +
                ':';
    }

    @Override
    public void komUsluga() {
        if (oplata == true) {
            System.out.println(" good\n");
        } else {
            System.out.println(" Warning pay utility bills otherwise we will turn off the light, water...\n");
        }
    }
}
