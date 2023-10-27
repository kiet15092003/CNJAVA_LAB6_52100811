package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * Hello world!
 *
 */
@ComponentScan
@Configuration
public class App 
{
    private static ApplicationContext applicationContext;

    public static void main( String[] args ) throws IOException {
        applicationContext = new AnnotationConfigApplicationContext(App.class);
        TextEditor textEditor = (TextEditor) applicationContext.getBean("textEditor");
        textEditor.input("Spring is coming");
        try{
            textEditor.save("output.txt");
        } catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}
