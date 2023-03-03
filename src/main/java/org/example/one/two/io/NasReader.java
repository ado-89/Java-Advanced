package org.example.one.two.io;

import java.io.Closeable;
import java.io.IOException;

public class NasReader implements Closeable {
    @Override
    public void close()  {
        System.out.println("Neko pozvao funkciju close");
    }
}
