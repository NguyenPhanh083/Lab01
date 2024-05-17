package hust.soict.globalict.aims.media;
import java.util.ArrayList;
import java.util.List;
public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<>();
    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist) {
        super(title, category, cost, length, director);
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }
    
    public String getArtist() {
        return artist;
    }
    
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track \"" + track.getTitle() + "\" added to the CD.");
        } else {
            System.out.println("Track \"" + track.getTitle() + "\" is already in the CD.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track \"" + track.getTitle() + "\" removed from the CD.");
        } else {
            System.out.println("Track \"" + track.getTitle() + "\" is not in the CD.");
        }
    }
    
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    @Override
    public void play() {
      System.out.println("Playing CD: " + this.getTitle());
      System.out.println("CD length: " + this.getLength() + " minutes");
      System.out.println("Tracks:");
      for (Track track : tracks) {
        track.play();
      }
    }
  
}
