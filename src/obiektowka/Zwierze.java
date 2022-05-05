package obiektowka;

public class Zwierze {
    private String nazwa;
    private String kolor;

    public Zwierze(String nazwa, String kolor) {
        this.nazwa = nazwa;
        this.kolor = kolor;
    }

    public void dajGlos(){
        System.out.println("Brak brak!");
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
}
