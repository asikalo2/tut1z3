package rpr.etf.unsa.ba;

public class Sat {
    int sati = 0;
    int minute = 0;
    int sekunde = 0;

    public Sat(int sati, int minute, int sekunde) {
        Postavi(sati, minute, sekunde);
    }

    public void Postavi(int sati, int minute, int sekunde) {
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }

    public void Sljedeci() {
        sekunde++;
        if (sekunde == 60) {
            sekunde = 0;
            minute++;
        }
        if (minute == 60) {
            minute = 0;
            sati++;
        }
        if (sati == 24) sati = 0;
    }

    public void Prethodni() {
        sekunde--;
        if (sekunde == -1) {
            sekunde = 59;
            minute--;
        }
        if (minute == -1) {
            minute = 59;
            sati--;
        }
        if (sati == -1) sati = 23;
    }

    public void PomjeriZa(int pomak) {
        int i = 0;
        if (pomak > 0) for (i = 0; i < pomak; i++) Sljedeci();
        else for (i = 0; i < -pomak; i++) Prethodni();
    }

    public int DajSate() {
        return sati;
    }

    public int DajMinute() {
        return minute;
    }

    public int DajSekunde() {
        return sekunde;
    }

    public void Ispisi() {
        System.out.print(sati);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(":");
        System.out.println(sekunde);
    }

}