package hust.soict.globalict.aims.media;
import java.util.ArrayList;
import java.util.List;
public class Book extends Media{
    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
        //TODO Auto-generated constructor stub
    }
   
    private List<String> authors = new ArrayList<String>();
   
       public List<String> getAuthors() {
        return authors;
    }
    public void addAuthor(String author){
        if (!authors.contains(author)){
        authors.add(author);
        System.out.println("Author \"" + author + "\" added");
        } else{
            System.out.println("Author \"" + author + "\" already exist");
        }
    }
    public void removeAuthor(String author){
        if (authors.contains(author)){
            authors.remove(author);
            System.out.println("Author \"" + author +"\" removed");
        } else{
            System.out.println("Author \"" + author + "\" does not exist");
        }
    }
}
