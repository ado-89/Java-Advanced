package org.example.one.two.io;

import java.io.*;

public class CopyLineDemo {
    public static void main(String[] args) {
        try(

                BufferedReader reader = new BufferedReader(new FileReader("in.txt"));
                PrintWriter out = new PrintWriter(new FileWriter("out4.txt"));
                ) {
            String line;
            while ((line = reader.readLine())!=null){
            System.out.println(line);
            out.println(line);}
        } catch (IOException exception) {

        }
    }
}
