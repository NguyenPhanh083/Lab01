package hust.soict.globalict.aims.media;

public class Disc extends Media{
    public int length;
    public String director;
    
    public int getLength() {
        return length;
    }
    public String getDirector() {
        return director;
    }
    public Disc(String title) {
        super(0,title, "", 0.0f); 
    }

    public Disc(String title, String category, float cost) {
        super(0,title, category, cost); 
    }
    
    public Disc(String title, String category, String director, float cost) {
        super(0,title, category, cost); 
        this.director = director;
    }
    
    public Disc(String title, String category, float cost, int length, String director) {
        super(0,title, category, cost); 
        this.director = director;
        this.length = length;
    }

}
