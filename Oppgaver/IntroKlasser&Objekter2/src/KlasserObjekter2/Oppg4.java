package KlasserObjekter2;

class Klokke{

    private int timer;
    private int minutter;
    private int sekunder;

    public Klokke(int time, int minutter, int sekunder) {
        setTimer(time);
        setMinutter(minutter);
        setSekunder(sekunder);
    }


    public int getTime() { return timer; }

    public void setTimer(int time) {
        if (time >= 0 && time <= 24) {
            this.timer = time;
        }
    }

    public int getMinutter() { return minutter; }

    public void setMinutter(int minutter) {
        if (minutter >= 0 && minutter <= 59){
            this.minutter = minutter;
        }
    }

    public int getSekunder() { return sekunder; }

    public void setSekunder(int sekunder) {
        if (sekunder >= 0 && sekunder <= 59){
            this.sekunder = sekunder;
        }
    }

    public void visTiden(){ System.out.println(timer + " : " + minutter + " : " + sekunder); }
}

public class Oppg4{
    public static void main(String[] args) {
        Klokke tid1 = new Klokke(12,45,34);
        tid1.visTiden();
        Klokke tid2 = new Klokke(25,45,34);
        tid2.visTiden();
    }
}

