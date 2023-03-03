package org.example.one.two.io;

import java.io.*;
import java.util.Scanner;

public class ScanDemo2 {
    public static void main(String[] args) {

        try{

            Scanner scanner = new Scanner(new File("in.txt"));
            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            System.err.println(e.getMessage());
        }
        catch (Exception ex)
        {

        }
    }
}

