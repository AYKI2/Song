import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String title = " ",author = " ";
        StringBuilder text = new StringBuilder();
        int counter = 0;
        try(FileWriter fileWriter = new FileWriter("file.txt")){
            fileWriter.write("Another Love");
            fileWriter.append("\nTom Odell");
            fileWriter.append("""
                    \nI wanna take you somewhere so you know I care
                    But it's so cold, and I don't know where
                    I brought you daffodils in a pretty string
                    But they won't flower like they did last spring
                                        
                    And I wanna kiss you, make you feel alright
                    I'm just so tired to share my nights
                    I wanna cry and I wanna love
                    But all my tears have been used up
                                        
                    On another love, another love
                    All my tears have been used up
                    On another love, another love
                    All my tears have been used up
                    On another love, another love
                    All my tears have been used up
                    Oh, ooh
                                        
                    And if somebody hurts you, I wanna fight
                    But my hands been broken, one too many times
                    So I'll use my voice, I'll be so fucking rude
                    Words, they always win, but I know I'll lose
                                        
                    And I'd sing a song, that'd be just ours
                    But I sang 'em all to another heart
                    And I wanna cry I wanna learn to love
                    But all my tears have been used up
                                        
                    On another love, another love
                    All my tears have been used up
                    On another love, another love
                    All my tears have been used up
                    On another love, another love
                    All my tears have been used up
                    Oh, oh, oh
                                        
                    (Oh, need a love, now, my heart is thinking of)
                    I wanna sing a song, that'd be just ours
                    But I sang 'em all to another heart
                    And I wanna cry, I wanna fall in love
                    But all my tears have been used up
                                        
                    On another love, another love
                    All my tears have been used up
                    On another love, another love
                    All my tears have been used up
                    On another love, another love
                    All my tears have been used up
                    Oh, oh
                    """);
        }catch (IOException e){
            System.out.println("File ");
        }
        try (FileReader file = new FileReader("file.txt");) {
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