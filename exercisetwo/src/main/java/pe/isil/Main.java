package pe.isil;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        File outputFile = new File("output.txt");
        FileOutputStream flowOutputFile;

        try {
            flowOutputFile = new FileOutputStream(outputFile);

            // flowOutputFile.close();
        } catch (Exception e) {
            flowOutputFile = null;
            System.out.println(e);

            e.printStackTrace();
        }

        PrintStream output = new PrintStream(flowOutputFile);
        System.setOut(output);

        System.out.println("Hola mundo");
        output.close();
    }
}