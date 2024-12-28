package dastan.hard;

public class ShuffleTheName {
    public String nameShuffle(String s) {
        String [] name = s.split(" ");
        return name[1] + " " + name[0];
    }
}
