package obiektowka;

public class Samochod {
    // POLA
    private String kolor;
    private int moc;
    private String marka;
    private int rokProdukcji;

    //KONSTRUKTORY
    public Samochod(String kolor, int moc, String marka) {
        this.kolor = kolor;
        this.moc = moc;
        this.marka = marka;
    }

    public Samochod(String kolor, int moc, String marka, int rokProdukcji) {
        this.kolor = kolor;
        this.moc = moc;
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
    }

    public Samochod(String kolor, int moc, int rokProdukcji) {
        this.kolor = kolor;
        this.moc = moc;
        this.rokProdukcji = rokProdukcji;
    }

    public Samochod(int moc, String kolor, int rokProdukcji) {
        this.kolor = kolor;
        this.moc = moc;
        this.rokProdukcji = rokProdukcji;
    }


    //METODY

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }
}
