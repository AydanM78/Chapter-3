package game_zone;

public class Card {

    private String suit;
    private int value;



    public void setSuit(String s) {
        suit = s;
    }
    public String getSuit()
    {
        return suit;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int v) {
        value = v;
    }
}
