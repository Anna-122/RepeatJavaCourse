package lesson9.ex8;

public class Horse extends Animal {
    String voice;

    public String getVoice() {
        return voice;
    }

    public void setVoice( String voice ) {
        this.voice = voice;
    }

    public Horse( String food, String location, String voice ) {
        super(food, location);
        this.voice = voice;
    }
}
