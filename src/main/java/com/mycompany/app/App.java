package com.mycompany.app;

/**
 * Hello world!
 */
public class App {
    //static private SimpleDateFormat format = new SimpleDateFormat("HH-mm-ss");  // Noncompliant
    //static private Calendar calendar = Calendar.getInstance();  // Noncompliant
    private static final String MESSAGE = "Hello World!";
    
    public App() {
        //Esse método faz o Fernando segurar a franga
    }
    
    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
    
}
