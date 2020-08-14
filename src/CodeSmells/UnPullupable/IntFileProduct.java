package CodeSmells.UnPullupable;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IntFileProduct {
    int multiplyUpNumbers(File file) {
        try (FileReader r = new FileReader(file)) {
            Scanner s = new Scanner(r);
            int product = 1;
            while (s.hasNextInt()) {
                product *= s.nextInt();
            }
            return product;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

}
