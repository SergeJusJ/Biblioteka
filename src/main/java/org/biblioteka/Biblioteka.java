package org.biblioteka;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {
    String pavadinimas;
    List<Knyga> knyguSar;

    public Biblioteka(String pavadinimas) {
        this.pavadinimas = pavadinimas;
        this.knyguSar = new ArrayList<>();
    }

    public List<Knyga> getKnyguSar() {
        return knyguSar;
    }

    public void addKnyga (Knyga knyga, Author autorius){
        this.knyguSar.add(knyga);
        knyguSar.size();
        knyga.setAuthor(autorius);

    }


}
