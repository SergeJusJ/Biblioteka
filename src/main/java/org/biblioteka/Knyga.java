package org.biblioteka;

public class Knyga {
    private String pavadinimas;
    private int iSlData;
    private Author author;

    public Knyga(String pavadinimas, int islData) {
        this.pavadinimas = pavadinimas;
        this.iSlData = islData;

    }
    public void spausdKnygInfo (){
        System.out.println(String.format("Knygos pavadinimas -  %s, -  Isledimo data:  %s, Autorius:  |Vardas:  %s, |  Pavarde  %s | Amzius %s",
                this.pavadinimas,
                this.iSlData,
                this.author.getVardas(),
                this.author.getPavard(),
                2022 - this.author.getGimM()
                        )
                );


    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
