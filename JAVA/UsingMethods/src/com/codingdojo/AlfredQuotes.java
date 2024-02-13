package com.codingdojo;
import java.util.*;
public class AlfredQuotes {
	
	
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) 
    {
        return "Hello " +name + ".Lovely to see you!";
    }
    
    public String guestGreeting(String name ,String dayPeriod) 
    {
        return "Good " + dayPeriod +" " + name + ".Lovely to see you " ;
    }
    
    
    
    public String dateAnnouncement()
    {
    	
    	Date date = new Date();
		
    	Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        
        int hour = Calendar.HOUR_OF_DAY;
        		
        		//calendar.get(Calendar.HOUR_OF_DAY);
    	
    	if (hour > 5)
    	{
    		System.out.println("Hi good morning there");
    		
    	}
    	else if(hour >12 && hour <16)
    	{
    		System.out.println("Hi good afternoon there");
    		
    	}
    	
    	else if(hour >16 && hour <19)
    	{
    		System.out.println("Hi good evening there");
    		
    	}
    	else 
    	{
    		System.out.println("Hi good night, sleep tight !!");
    		
    	}
    	return "current date is " + date;
    }
    
    public String respondBeforeAlexis(String conversation) 
    {
        // YOUR CODE HERE
    	if(conversation.contains("Alexis"))
    		return "Right away, sir. She certainly isn't sophisticated enough for that.";
    	else if(conversation.contains("Alfred"))
    		return   "At your service. As you wish, naturally.";
    	else
    		return "Right. And with that I shall retire.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
}


