package com.codingdojo;

public class AlfredTest 
{
    /*
    * This main method will always be the launch point for a Java application
    * For now, we are using the main to test all our 
    * AlfredQuotes methods.
    */
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes to access all its methods.
        AlfredQuotes alfredBot = new AlfredQuotes();
        
       System.out.println(alfredBot.guestGreeting("Beth"));
       System.out.println(alfredBot.guestGreeting("Beth" , " afternoon"));
       
       System.out.println(alfredBot.dateAnnouncement());
       
       System.out.println(alfredBot.respondBeforeAlexis("Alfred"));
    }
}
