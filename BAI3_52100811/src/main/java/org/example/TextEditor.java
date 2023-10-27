package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.io.IOException;

public class TextEditor {
    private String text;
    @Autowired
    @Qualifier("plainTextWriter")
    private TextWriter writer;
    public void input(String text){
        this.text = text;
    }
    public void save(String filename) throws IOException {
        writer.write(filename,this.text);
    }
}
