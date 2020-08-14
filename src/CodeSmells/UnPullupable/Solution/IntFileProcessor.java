package CodeSmells.UnPullupable.Solution;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// use a template method
abstract public class IntFileProcessor {
    int processFile(File file) {
        try (FileReader r = new FileReader(file)) {
            Scanner s = new Scanner(r);
            int result = getStartVal();
            while (s.hasNextInt()) {
                result = processInt(result, s.nextInt());
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    abstract protected int getStartVal();
    abstract protected int processInt(int cur, int next);
}
