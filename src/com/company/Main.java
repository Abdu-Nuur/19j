package com.company;

public class Main {

    public static void main(String[] args) {

        Kvartira kvartira1 = new Kvartira(new People[]{
                new People("Asyl", 45, "father"),
                new People("Kenje", 40, "mother"),
                new People("Abdunur", 16, "brother"),
                new People("Elvira", 20, "sister")}, true);
        System.out.print(kvartira1);
        kvartira1.komUsluga();

        Kvartira kvartira2 = new Kvartira(new People[]{
                new People("Azamat", 38, "father"),
                new People("Aygul", 34, "mother"),
                new People("Ramazan", 14, "brother")}, false);
        System.out.print(kvartira2);
        kvartira2.komUsluga();


        Obshejytie obshejytie1 = new Obshejytie(new People[]{
                new People("Elnur", 52, "father"),
                new People("Aijan", 47, "mother"),
                new People("Janara", 27, "sister"),
                new People("Jyldyz", 23, "sister"),
                new People("Sanjar", 16, "brother")}, true);
        System.out.print(obshejytie1);
        obshejytie1.arenda();

        Obshejytie obshejytie2 = new Obshejytie(new People[]{
                new People("Belek", 57, "father"),
                new People("Albina", 52, "mother"),
                new People("Jakyp", 29, "brother"),
                new People("Jysyp", 25, "brother"),
                new People("Nuska",19,"sister")}, false);
        System.out.print(obshejytie2);
        obshejytie2.arenda();
    }
}
