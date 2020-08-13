package CustomException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        String fileName = null;
        String file = getFile(fileName);


        // checks to see if closed at the end of the statement
//        File sampleFile = new File("./sampleFile.txt");
//        try (Scanner fileReader = new Scanner(sampleFile)) {
//            int numLines = 0;
//            while(fileReader.hasNextLine()){
//                fileReader.nextLine();
//                numLines++;
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }

     static String getFile(String fileName) {
        if (fileName == null) {
            throw new NoFileSelectedException("File not selected");
        }
        return fileName;
    }
}
