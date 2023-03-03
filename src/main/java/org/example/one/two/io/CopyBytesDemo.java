package org.example.one.two.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytesDemo {
    public static void main(String[] args) {
        try(FileInputStream fin = new FileInputStream("in.txt");
            FileOutputStream fout = new FileOutputStream("out2.txt")) {
            int jedanBajt;
            while ((jedanBajt = fin.read())!=-1) {
                char slovo = (char) jedanBajt;
                System.out.print(slovo);
                fout.write(jedanBajt);
            }

            } catch (IOException exception) {
            throw  new RuntimeException(exception);
        }

        
    }
}
