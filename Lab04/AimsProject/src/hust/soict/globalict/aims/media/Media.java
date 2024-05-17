package hust.soict.globalict.aims.media;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    public Media(int id, String title, String category, float cost){
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public int getID(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public boolean isMatch(String title) {
        return getTitle().equalsIgnoreCase(title);
    }
    public boolean isIntMatch(int id){
        return getID() == id;
    }
    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                '}';
    }
    public boolean equals(Object obj) {
        if (this == obj) {
          return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
          return false;
        }
        Media otherMedia = (Media) obj; 
        return title.equals(otherMedia.title); // Compare titles
      }
     public static void testMedia(){
        List<Media> mediae = new ArrayList<Media>();

        Disc cd = new Disc("My Favorite CD", "Category", 10.0f, 60, "a");
        DigitalVideoDisc dvd = new DigitalVideoDisc("Action Movie", "Director 1","a", 120, 15.0f);
        Book book = new Book(0,"Great Book", "Author 1", 20.0f);

        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);

        for (Media m : mediae) {
            System.out.println(m.toString()); 
        }
     }
     public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
     public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
 
     public static class MediaComparatorByTitleCost implements Comparator<Media> {
 
         @Override
         public int compare(Media m1, Media m2) {
             int titleComparison = m1.getTitle().compareToIgnoreCase(m2.getTitle());
             if (titleComparison == 0) {
                 return Float.compare(m2.getCost(), m1.getCost()); // Descending cost
             }
             return titleComparison;
         }
     }
 
     public static class MediaComparatorByCostTitle implements Comparator<Media> {
 
         @Override
         public int compare(Media m1, Media m2) {
             int costComparison = Float.compare(m2.getCost(), m1.getCost()); // Descending cost
             if (costComparison == 0) {
                 return m1.getTitle().compareToIgnoreCase(m2.getTitle());
             }
             return costComparison;
         }
     }
 }
 


