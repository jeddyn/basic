package obiektowka;

public class Kot extends Zwierze {

    private String rasa;
    private int wiek;

    public Kot(String rasa, int wiek, String nazwa, String kolor) {
        super(nazwa, kolor);
        this.rasa = rasa;
        this.wiek = wiek;
    }

    @Override
    public void dajGlos(){
        System.out.println("Miau miau!");
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
