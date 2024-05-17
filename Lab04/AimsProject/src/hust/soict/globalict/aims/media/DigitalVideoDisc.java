package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

    private String director;
    private int length;

    public DigitalVideoDisc(String title) {
        super(title, "", 0.0f, 0, "");
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost, 0, "");
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, cost, 0, director);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, length, director);
        this.length = length;
    }

    @Override
    public String toString() {
        return "[" + getTitle() + "] - [" + getCategory() + "] - [" + director + "] - [" + length + "]";
    }

    public boolean isMatch(String title) {
        return getTitle().equalsIgnoreCase(title);
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
