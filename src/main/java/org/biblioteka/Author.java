package org.biblioteka;

public class Author {
    private String vardas;
    private String pavard;
    private int gimM;

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public void setPavard(String pavard) {
        this.pavard = pavard;
    }

    public void setGimM(int gimM) {
        this.gimM = gimM;
    }
//-----------------------
    public String getVardas() {
        return vardas;
    }

    public String getPavard() {
        return pavard;
    }

    public int getGimM() {
        return gimM;
    }


}
