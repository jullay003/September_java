package DAY4;

//modern java uses java.nio.file.Path and files.
/**
 * Files.readString(path)
 * Files.writeString(path, content)
 * Files.readAllLines(path);
 * Files.exists(path)
 * Files.delete(path)
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileIO {

    public static void main(String[] args) {
        final Path filePath = Path.of("users.txt");
        try{
            Files.writeString(filePath, "Luke\nFlora\nShiva");
            final String content = Files.readString(filePath);
            System.out.println(content);
        } catch(IOException exception) {
            System.out.println("File operation failed: " +
                    exception.getMessage());
        }
    }

//this creates users.txt
/**
 * output: Luke
 * Flora
 * Shiva
 *
 *
 *Path -> Where
 * Files -> What to do
 *
 */



}
