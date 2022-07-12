package org.biblioteka;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sveiki atvyke i biblioteka!");
        Author autr1 = new Author("Steven","King", 1930);
        Author autr2 = new Author("Garry","Potter", 2003);
        Author autr3 = new Author("Sherlock","Holmes", 1965);


        Knyga kn1 = new Knyga("star Wars", 1990);
        Knyga kn2 = new Knyga("Garry Potter", 2005);
        Knyga kn3 = new Knyga("Witch of blare", 2010);

        Biblioteka bbl1 = new Biblioteka("Vilniaus");




        bbl1.addKnyga(kn1, autr1);
        bbl1.addKnyga(kn2, autr2);
        bbl1.addKnyga(kn3, autr3);

        bbl1.getKnyguSar().forEach(knyga -> knyga.spausdKnygInfo());
        System.out.println("___________________________________");

    }
}