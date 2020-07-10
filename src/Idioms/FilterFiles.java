package Idioms;

import java.io.File;
import java.io.FileFilter;

public class FilterFiles {

    private static Object FileFilter;

    // refer to lecture notes on Anonymous Classes
    private static void demoFileFilter() {
        File folder = new File("C:\\t\\");
        // Create filter (anonymous object of an anonymous class)
        FileFilter = createExtensionFilter();
        File[] fileList = folder.listFiles();
        // Some code to print the results
    }

    // anonymous class
    private static Object createExtensionFilter() {
        return new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".txt");
            }
        };
    }

}


