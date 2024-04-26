package OtherProjects.hust.soict.globalict.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class NoGarbarge {
    public static void main(String[] args){
        String filename = "/Users/nguyenphuonganh/Documents/OOP/Lab03/OtherProjects/hust.soict.globalict.garbage/test.exe";
        byte[] inputBytes = {0};
        long startTime,endTime;
        try {
        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
        StringBuilder outputBuilder = new StringBuilder();
        for (byte b:inputBytes){
            outputBuilder.append((char) b);
        }
        String outputString = outputBuilder.toString();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with stringBuilder " + (endTime - startTime));
    }   catch (IOException e) {
        System.out.println("Error reading file: " + e.getMessage());
    }
    }
}
