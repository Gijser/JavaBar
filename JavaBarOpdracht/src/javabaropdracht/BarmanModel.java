package javabaropdracht;


public class BarmanModel {
    int bestellingId;
    int tafel;
    boolean isKlaar;

    public int getBestellingId() {
        return bestellingId;
    }

    public void setBestellingId(int bestellingId) {
        this.bestellingId = bestellingId;
    }

    public int getTafel() {
        return tafel;
    }

    public void setTafel(int tafel) {
        this.tafel = tafel;
    }

    public boolean isIsKlaar() {
        return isKlaar;
    }

    public void setIsKlaar(boolean isKlaar) {
        this.isKlaar = isKlaar;
    }
}
