package hust.soict.globalict.aims.media;

public class Track implements Playable{
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength(){
        return length;
    }

    public Track(String title){
        this.title= title;
    }

    public Track(String title, int length){
        this.title = title;
        this.length=length;
    }
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
        return false;
      }
      Track otherTrack = (Track) obj; // Cast to Track
      return title.equals(otherTrack.title) && length == otherTrack.length; // Compare title and length
    }
}
