package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Checked
{
/*
  Checked exception - is checked by the compiler and as a programmer you have to
  handle it using try-catch-finally, throws or passing them further up the stack
  Checked exception - represent expected error conditions, which can occur during normal
  program execution and therefore always have to be handled programmatically (which the compiler enforces)
*/
    public static void main(String args[]) /* throws IOException */ {       // bad exception handling

        // no exception handling

//        FileInputStream fis = null;
//        /*This constructor FileInputStream(File filename)
//         * throws FileNotFoundException which is a checked
//         * exception
//         */
//        fis = new FileInputStream("B:/myfile.txt");
//        int k;
//
//        /* Method read() of FileInputStream class also throws
//         * a checked exception: IOException
//         */
//        while(( k = fis.read() ) != -1)
//        {
//            System.out.print((char)k);
//        }
//
//        /*The method close() closes the file input stream
//         * It throws IOException*/
//        fis.close();


        // good exception handling

        FileInputStream fis = null;
        try{
            fis = new FileInputStream("B:/myfile.txt");
        }catch(FileNotFoundException fnfe){
            System.out.println("The specified file is not " +
                    "present at the given path");
        }
        int k;
        try{
            while(( k = fis.read() ) != -1)
            {
                System.out.print((char)k);
            }
            fis.close();
        }catch(IOException ioe){
            System.out.println("I/O error occurred: "+ioe);
        }
    }
}
