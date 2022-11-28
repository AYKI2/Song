import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String title = " ",author = " ";
        StringBuilder text = new StringBuilder();
        int counter = 0;
        try (FileReader file = new FileReader("file");) {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                counter++;
                if(counter == 1) {
                    title = scanner.nextLine();
                }else if (counter == 2){
                    author = scanner.nextLine();
                }else{
                    text.append("\n").append(scanner.nextLine());
                }
            }
        } catch (IOException e) {
            System.out.println("File not found!");
        }catch (NoSuchElementException e){
            System.out.println("No more elements left!");
        }
        Song song = new Song(title,author,text);
        System.out.println(song);

    }
}