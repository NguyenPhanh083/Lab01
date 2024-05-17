package OtherProjects.hust.soict.globalict.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args){
    String filename = "/Users/nguyenphuonganh/Documents/OOP/Lab03/OtherProjects/hust.soict.globalict.garbage/test.exe";
    byte[] inputBytes = {0};
    long startTime,endTime;
    try {
        inputBytes = Files.readAllBytes(Paths.get(filename));
    } catch (IOException e) {
        System.out.println("Error reading the file: " + e.getMessage());
    }
    startTime = System.currentTimeMillis();
    String outputString = "";
    for (byte b : inputBytes){
        outputString += (char)b;
    }

    endTime = System.currentTimeMillis();
    System.out.println(endTime - startTime);

}
}
