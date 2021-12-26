package MyProject;

import java.util.Scanner;

public class Prediction_Of_Personality_Traits_Of_a_Person {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
		
	
	System.out.println("WELCOMR TO CHECK YOUR PERSONALITY TRAITS");
	System.out.println();
		
	System.out.print("Enter First name:");
	String name=input.next();
	System.out.println();
	
	System.out.printf("Hello Mr./Ms./Mrs. %s",name);
   System.out.println(".Hope you are doing great!!");
	
	System.out.println();
   
   System.out.println("The process of knowing your personality traits starts. ");
	
	System.out.println();
	
	System.out.println("First, please enter some information of yours to know more about yourself.");
	
	System.out.println();
	
	System.out.println("====================================================================================================");	//50 equals sign
		
	System.out.println();
	
	System.out.println("Select and Enter your favourite colour: (white,red,yellow,green.)");
	String colour=input.next();
	System.out.println();
	    
   System.out.println("Select and Enter your favourite Fruit: (mango,papaya,watermelon,grapes,orange,apple)");
    String fruit=input.next();
	System.out.println();
    
    System.out.println("Select and Enter your favourite Season: (winter,summer,spring,autumn.)");
	String season=input.next();
	System.out.println();
	
	 System.out.println("Select and Enter your favourite Movie type: (action,comedy,science fiction.)");
	 String movie=input.next();
		System.out.println();
	 
	 System.out.println("Select and Enter your favourite Subject: (history,science,mathematics,geography,psychology.)");
	 String subject=input.next();
		System.out.println();
		
	  	
	System.out.println("====================================================================================================");	
  
	System.out.println();
	
	
	System.out.println("Some features of your personality are as follows:");	
	System.out.println();
    
	System.out.println("====================================================================================================");		
	System.out.println();

	
    
  if(colour.equals("red"))
  {
	  System.out.println("You are an energetic and passionate person.");
  }
	
  else if(colour.equals("yellow"))
  {
	  System.out.println("You are a  happy and positive person.");
  }
		
  else if(colour.equals("white"))
  {
	  System.out.println("You are a peace loving person. You believe in fresh start.");
	  
  }
  
  else if(colour.equals("green"))
  {
	  System.out.println("You are an enthusiastic person and believe in continous progress.");
	  
  }
  
  System.out.println();

  System.out.println("====================================================================================================");		
  System.out.println();

 
  if(fruit.equals("mango"))
  {
	  System.out.println("You like sweet things most.You are a soft spoken person.");
  }

  else if(fruit.equals("papaya")) 
  {
	  System.out.println("You like sweet things most.You are a soft spoken person.");
  }
  else if(fruit.equals("watermelon"))
  {
	  System.out.println("You like sweet things most.You are a sweet spoken person.");
  }
  else if(fruit.equals("grapes"))
  {
	  System.out.println("You like mixture of sweet and bitter things.");
  }
  else if(fruit.equals("apple"))
  {
	  System.out.println("You like mixture of sweet and bitter things.");
  }
  
  else if(fruit.equals("orange"))
  {
      System.out.println("You like mixture of sweet and bitter things.");
  }
  
  System.out.println();

  System.out.println("====================================================================================================");		
  System.out.println();

  
  
  if(season.equals("winter"))
  {
	  System.out.println("You are a bit of an introverted homebody.");
  }
  
  if(season.equals("summer"))
  {
	  System.out.println("You like outing.You are an  upbeat,personable and assertive.");
  }
  
  if(season.equals("spring"))
  {
	  System.out.println("You like craving new experiences. ");
  }
  
  if(season.equals("autumn"))
  {
	  System.out.println("You constantly desire for a change.");
  }
  
  
  System.out.println();

  System.out.println("====================================================================================================");		
  System.out.println();

  
  
  if(movie.equals("action"))
  {
	  System.out.println("You like watching violence,fights and explosion.");
  }
  
  if(movie.equals("comedy"))
  {
	  System.out.println("You are a happy and cheerful person.You like laughing and smiling.");
  }
  if(movie.equals("science fiction"))
  {
	  System.out.println("You like learning about Science and technology.");
  }
  
  
  System.out.println();

  System.out.println("====================================================================================================");		
  System.out.println();

  
  
  if(subject.equals("history"))
  {
	  System.out.println("You like knowing and collecting records of past events.Past of anything excites you the most");
  }
  
  if(subject.equals("science"))
  {
	  System.out.println("You like to develop solutions of a real life problems.You believe and like practical knowledge and activity.");
  }
  
  if(subject.equals("mathematics"))
  {
	  System.out.println("You like to spend your maximum time on logical thinking,creative thinking,critical thinking and on problem solving.");
  }
  
  if(subject.equals("psychology"))
  {
	  System.out.println("You are curious about how mind works and how it affects behaviour of a person.");
  }
  
  
  System.out.println();

  System.out.println("====================================================================================================");		
  System.out.println();

  
  
		
  System.out.println("THANK YOU !!!");
  System.out.printf("Hope you find the real yourself.Wish you All The Luck for your life Mr./Mrs./Ms. %s",name);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
		// TODO Auto-generated method stub

	}

}
