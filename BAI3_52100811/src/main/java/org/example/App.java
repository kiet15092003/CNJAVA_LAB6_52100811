package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        TextEditor textEditor = context.getBean("textEditor",TextEditor.class);
        textEditor.input("Bean");
        textEditor.save("output.txt");
    }
}
