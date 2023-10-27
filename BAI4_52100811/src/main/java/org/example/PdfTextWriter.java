package org.example;

import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class PdfTextWriter implements TextWriter{
    @Override
    public void write(String filename, String text) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(filename));
        printWriter.print("PRINTING IN PDF FORMAT: ");
        printWriter.print(text);
        printWriter.close();
    }
}
