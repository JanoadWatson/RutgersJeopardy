package introfinal;


import java.util.Scanner;

import java.io.*; 

public class Main {


	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		
		
		
 Scanner reader = new Scanner(System.in);
		 
		 // calls the QuestionAns class
		 QuestionAns QuestionPlayed = new QuestionAns();
		 // calls the SectionCom class
		 SectionCom  CompletedSect = new SectionCom();
		 

		 
				 
				 
	        //Create an empty variable n to store our choices.
	        String n = null;
	        //create variable for score and set to zero
	        int score=0;
	        //create booleans for  the different questions and section which will indicate
	        //whether you have completed the question or done the section before
	        boolean  hsect,sect,fsect,bsect,
	        h100,h200,h300,h400, 
	        f100,f200,f300,f400,
	        b100,b200,b300,b400,
	        s100,s200,s300, s400 ,gameOver;
	        h100 = false;
	        h200 = false;
	        h300 = false;		
	        h400 = false;
	        hsect=false;
	        f100 =false;
	        f200= false;
	        f300= false;
	        f400= false;
	        fsect= false;
	        b100= false;
	        b200=false;
	        b300 =false;
	        b400= false;
	        bsect=false;
	        s100= false;
	        s200 = false;
	        s300= false;
	        s400 = false;
	        sect= false;
	        
	        gameOver=false;
	        
	        // checks to see if all sections have been played if so it sets game over to true
	        if(fsect==true && sect==true && bsect==true && hsect== true) {
        		gameOver=true;
            	}
	        
	        if(gameOver==false) {
		        
//	        reads from file to get instructions 
	        
	        File file = new File("C:\\Users\\jayda\\introtocomputerconcepts\\FinalProject\\src\\introfinal\\test.txt"); 
	        
	        BufferedReader br = new BufferedReader(new FileReader(file)); 
	        
	        String st; 
	        while ((st = br.readLine()) != null) 
	          System.out.println(st); 
	        
	      
	      
	        
	      
	        
	        while (gameOver==false) {
	            //Print out our categories
	            System.out.println("Choose a category. \n "
	                    + "1. Rutgers History. \n "
	                    + "2. Rutgers Superstitions. \n "
	                    + "3. Rutgers Bus System. \n "
	                    + "4. Food around Rutgers\n"
	                    );
	            
	            

	            //Get our choice and stores it in the variable n
	            n = reader.nextLine();
	            // checks to see if each section has been played if section has been played value will be true
         
	            
	            if(h100==true && h200==true && h300==true && h400== true) {
            		hsect=true;
	            	}
	            
	            if(s100==true && s200==true && s300==true && s400== true) {
            		sect=true;
	            	}
	            
	            
	            if(b100==true && b200==true && b300==true && b400== true) {
            		bsect=true;
	            	}
	            
	            
	            
	            if(f100==true && f200==true && f300==true && f400== true) {
            		fsect=true;
	            	}
	            
	            
	            
	         
	            //Create the menu.
	            //If n equals 1 show the rutgers history category 
	            if (n.equals("1")) {
	            	// if hsect is false it will show the question if false it will say you complete this question 
	            	if(hsect==false) {
	           // calls history method 		
	            	 history();
	                n = reader.nextLine();
	                
	                // list the values of the category
	                
	                if (n.equals("100")) {
	                	if(h100==false) {
		                System.out.println("When founded in 1766, Rutgers was originally known as this \n"
		                	);
		                n = reader.nextLine();
		                
		                
		                //  if 100 is inputed then show this question .
		                
		                if (n.toLowerCase().equals("what is queen's college")) {
			                System.out.println("You are Correct "
			                	);
			                
			                //increases and prints out the score
			                System.out.println("score:"+(score+100));
			                  score= score+100;
			                  h100=true;
			                 
			                
			            }
			            else {
			        // lets the use know the answer in incorrect, shows the correct answer and decreases score
			            	System.out.println("Your Answer is Incorrect the correct answer is: \n  ");
			            	System.out.println(" What is Queen's College \n \n");
			            	 score= score-100;
			            	System.out.println("score:"+(score));
			                 
			            	h100=true;
			            }
	                	}else {
	                		QuestionPlayed.PrintAnswer();
	                	}
		                
	                	
	                }   
	            
		                if (n.equals("200")) {
		                	if(h200==false) {
			                System.out.println("Rutgers recently celebrated his 100th anniversary. He also has a cultural center and an open air plaza named after him in the New Brunswick campus \n"
			                	);
			                n = reader.nextLine();
			                
			                
			                
			                if (n.toLowerCase().equals("who is paul robeson")) {
				                System.out.println("You are Correct "
				                	);
				                score= score+200;
				                System.out.println("score:"+(score));
				                 
				                  h200=true;
				                  
				                
				             
				            }else {
				            
				            	System.out.println("Your Answer is Incorrect the correct answer is: \n  ");
				            	System.out.println("Who is Paul Robeson \n \n");
				            	System.out.println("score:"+(score-200));
				                  score= score-200;
				            	  h200=true;
				            	}
			              
		                	}else {
		                		QuestionPlayed.PrintAnswer();
		                	}
		                	
		                	
		                	
				            }
			        
			   
		            if (n.equals("300")) {
		            	if(h300==false) {
		                System.out.println("Rutgers is also referred to as this, especially when talking about their historic win against Princeton University \n"
		                	);
		                n = reader.nextLine();
		                
		                if (n.toLowerCase().equals("what is the birthplace of college football ?")) {
			                System.out.println("You are Correct "
			                	);
			                System.out.println("score:"+(score+300));
			                  score= score+300;
			                  h300=true;
			            }
			            else {
			            	System.out.println("Your Answer is Incorrect the correct answer is: \n  ");
			            	System.out.println("What is the Birthplace of College Football? \n \n");
			            	  System.out.println("score:"+(score-300));
			                  score= score-300;
			            	h300=true;
			            }
		            	}else {
		            		QuestionPlayed.PrintAnswer();
	                	}
		                
		            }
		            
		         
		           if (n.equals("400")) {
		        	   if(h400 == false) {
		                System.out.println("This residential college, which recently celebrated their centennial anniversary, continues to provide programs for women in leadership and STEM fields \n"
		                	);
		                n = reader.nextLine();
		                
		                
		                
		                if (n.toLowerCase().equals("what is douglass residential college?")) {
			                System.out.println("You are Correct "
			                	);
			                System.out.println("score:"+(score+400));
			                  score= score+400;
			                  h400=true;
			            }
		            else {
			            	System.out.println("Your Answer is Incorrect the correct answer is: \n  ");
	            	System.out.println("What is Douglass Residential College? \n \n");
	            	System.out.println("score:"+(score-400));
	                  score= score-400;
	            	h400=true;
		            }
			            
		            }
		        	   else {
		        		   // prints message from the QuestionAns class
		        		   QuestionPlayed.PrintAnswer();
                	}
		           }  
	            }else {
	            	// prints message from the SectionCom class
            		CompletedSect.SectionComplete();
            	}
	            
	            }
		            
	// Some variables repeat 	           
	            
	            //is the second category
	            if (n.equals("2")) {
	            	if(sect==false) {
	            		
	            		// calls superstition method
	            		Superstitions();
	                				n = reader.nextLine();	
	                		
	                		
	            
	            if (n.equals("100")) {
	            	if(s100==false) {
	                System.out.println("Rumour has it that walking around this body of water three times while holding hands with your significant other will result in lifelong happiness with each other\n"
	                	);
	                n = reader.nextLine();
	                
	                
	                if (n.toLowerCase().equals("what is passion puddle?")) {
		                System.out.println("You are Correct "
		                	);
		                System.out.println("score:"+(score+100));
		                  score= score+100;
		                  s100=true;
		            }
		            else {
		            	System.out.println("Your Answer is Incorrect the correct answer is: \n  ");
		            	System.out.println("What is Passion Puddle? \n \n");
		            	 System.out.println("score:"+(score-100));
		                  score= score-100;
		            	s100=true;
		            }
		            }else {
		            	QuestionPlayed.PrintAnswer();
		            }
	           
	            }
	      
	            
	            
	            if (n.equals("200")) {
	            	if(s200==false) {
	                System.out.println("Also known as the ‘Lady in the Lake’, this respected dean is said to haunt the local area where she drowned and has a library as well as a residential college named after her \n"
	                	);
	                n = reader.nextLine();
	                
	                
	                if (n.toLowerCase().equals("who is mabel smith douglass?")) {
		                System.out.println("You are Correct "
		                	);
		                System.out.println("score:"+(score+200));
		                  score= score+200;
		                  s200=true;
		            }
		            else {
		            	System.out.println("Your Answer is Incorrect the correct answer is: \n  ");
		            	System.out.println("Who is Mabel Smith Douglass? \n \n");
		            	System.out.println("score:"+(score-200));
		                  score= score-200;
		            	s200=true;
		            }
	            	}else {
	            		QuestionPlayed.PrintAnswer();
	            	}
	                
	            }
	            
	      
	            if (n.equals("300")) {
	            	if(s300==false) {
	                System.out.println("One of the more inappropriate superstitions around campus, this statue is rumoured to whistle at virgins in their senior year passing by \n"
	                	);
	                n = reader.nextLine();
	                
	                if (n.toLowerCase().equals("who is william the silent?")) {
		                System.out.println("You are Correct "
		                	);
		                System.out.println("score:"+(score+300));
		                  score= score+300;
		                  s300=true;
		            }
		            else {
		            	System.out.println("Your Answer is Incorrect the correct answer is: \n  ");
		            	System.out.println("Who is William the Silent? \n \n");
		            	System.out.println("score:"+(score-300));
		                  score= score-300;
		                  s300=true;
		            }
	            	}else {
	            		QuestionPlayed.PrintAnswer();
	            	}
	                
	            }
	           
	            
	            if (n.equals("400")) {
	            	if(s400==false) {
	                System.out.println("Students are often told that they are only allowed to walk through this arch twice: once when they first arrive to campus and again when they graduate. Walking through this arch any other time would result in not graduating in four years. \n"
	                	);
	                n = reader.nextLine();
	                
	                if (n.toLowerCase().equals("what is the memorial gateway?")) {
		                System.out.println("You are Correct "
		                	);
		                System.out.println("score:"+(score+400));
		                  score= score+400;
		                  s400=true;
		            }
		            else {
		            	System.out.println("Your Answer is Incorrect the correct answer is: \n  ");
		            	System.out.println("What is the Memorial Gateway? \n \n");
		            	System.out.println("score:"+(score-400));
		                  score= score-400;
		                  s400=true;
		            }
	            	}else {
	            		QuestionPlayed.PrintAnswer();
	            	}
	                
	            }
	            
	            	}else {
	            		CompletedSect.SectionComplete();
	            	}
	            }
	            
	            
	            // is the the category
	            if (n.equals("3")) {
	            	if(bsect==false) {
	            		// calls busses method
	              Busses();
	               n = reader.nextLine();	
	                		
	                	
	            
	            if (n.equals("100")) {
	            	if(b100==false) {
	                System.out.println("This bus is the only one that goes through the Livingston campus that routinely skips the Quads bus stop \n"
	                	);
	               
	                n = reader.nextLine();
	                
		            if (n.toLowerCase().equals("what is the rexl?")) {
		                System.out.println("You are Correct "
		                	);
		                System.out.println("score:"+(score+100));
		                  score= score+100;
		                  b100=true;
		            }
		            else {
		            	System.out.println("Your Answer is Incorrect the correct answer is: \n  ");
		            	System.out.println("What is the REXL? \n \n");
		            	  System.out.println("score:"+(score-100));
		                  score= score-100;
		                  b100=true;
		            }
	            	}else {
	            		QuestionPlayed.PrintAnswer();
	            	}
	           
	            }
	      
	           
	            
	            if (n.equals("200")) {
	            	if(b200==false) {
	                System.out.println("This bus service provides rides to Rutgers-affiliated people after hours on weekdays and will pick up and drop off passengers directly to locations on campus \n"
	                	);
	                n = reader.nextLine();
	                
	                
	                
	                if (n.toLowerCase().equals("what is the knight mover?")) {
		                System.out.println("You are Correct "
		                	);
		                System.out.println("score:"+(score+200));
		                  score= score+200;
		                  b200=true;
		            }
		            else {
		            	System.out.println("Your Answer is Incorrect the correct answer is: \n  ");
		            	System.out.println("What is the Knight Mover? \n \n");
		            	  System.out.println("score:"+(score-200));
		                  score= score-200;
		                  b200=true;
		            }
	            	}else {
	            		QuestionPlayed.PrintAnswer();
	            	}
	                
	            }
	            
	      
	            
	            if (n.equals("300")) {
	            	if(b300==false) {
	                System.out.println("This bus takes passengers to the College of Nursing \n"
	                	);
	                n = reader.nextLine();
	                
	                
	                if (n.toLowerCase().equals("what is the new brunsquick?")) {
		                System.out.println("You are Correct "
		                	);
		                System.out.println("score:"+(score+300));
		                  score= score+300;
		                  b300=true;
		            }
		            else {
		            	System.out.println("Your Answer is Incorrect the correct answer is: \n  ");
		            	System.out.println("What is the New BrunsQuick? \n \n");
		            	   System.out.println("score:"+(score-300));
			                  score= score-300;
			                  b300=true;
		            }
	            	}else {
	            		QuestionPlayed.PrintAnswer();
	            	}
	                
	            }
	            
	         
	            
	            if (n.equals("400")) {
	            	if(b400==false) {
	                System.out.println("This bus is only active on Busch campus. It is also referred to as a ‘loop’ \n"
	                	);
	                n = reader.nextLine();
	                
	                if (n.toLowerCase().equals("what is the c-bus or the commuter loop?")) {
		                System.out.println("You are Correct "
		                	);
		                System.out.println("score:"+(score+400));
		                  score= score+400;
		                  b400=true;
		               
		            }
		            else {
		            	System.out.println("Your Answer is Incorrect the correct answer is: \n  ");
		            	System.out.println("What is the C-bus or the ‘Commuter Loop? \n \n");
		            	  System.out.println("score:"+(score-400));
		                  score= score-400;
		                  b400=true;
		            }
	            	}else {
	            		QuestionPlayed.PrintAnswer();
	            	}
	                
	            }
	            	}else {
	            		CompletedSect.SectionComplete();
	            	}
	            
	        
	            
	            
	            }  
	            
	            
	            //is the 4th category
	            
	            if (n.equals("4")) {
	            	if(fsect==false) {
	            		
	            // calls Food method		
	              Food();
	                				n = reader.nextLine();	
	        
	            
	            if (n.equals("100")) {
	            	if(f100==false) {
	                System.out.println("This pizza place is located at The Yard \n"
	                	);
	                n = reader.nextLine();
	                
	                if (n.toLowerCase().equals("what is krispy pizza?")) {
		                System.out.println("You are Correct "
		                	);
		                System.out.println("score:"+(score+100));
		                  score= score+100;
		                  f100=true;
		            }
		            else {
		            	System.out.println("Your Answer is Incorrect the correct answer is: \n  ");
		            	System.out.println("What is Krispy Pizza? \n \n");
		            	 System.out.println("score:"+(score-100));
		                  score= score-100;
		                  f100=true;
		            }
	            	}else {
	            		QuestionPlayed.PrintAnswer();
	            	}
	           
	            }
	      
	           
	            
	            if (n.equals("200")) {
	            	if(f200==false) {
	                System.out.println("Brower Commons is one of four of these locations where students can use a “meal swipe” to enter  \n"
	                	);
	                n = reader.nextLine();
	                
	                if (n.toLowerCase().equals("what is a dining hall?")) {
		                System.out.println("You are Correct "
		                	);
		                System.out.println("score:"+(score+200));
		                  score= score+200;
		                  f200=true;
		            }
		            else {
		            	System.out.println("Your Answer is Incorrect the correct answer is: \n  ");
		            	System.out.println("What is a dining hall? \n \n");
		            	 System.out.println("score:"+(score-200));
		                  score= score-200;
		                  f200=true;
		            }
	            	}else {
	            		QuestionPlayed.PrintAnswer();
	            	}
	                
	            }
	            
	      
	            
	       
	            
	            
	            if (n.equals("300")) {
	            	if(f300==false) {
	                System.out.println("This truck is only one of 6 in the entire country and it serves this coffee shop’s entire menu of coffee, sandwiches, and pastries  \n"
	                	);
	                n = reader.nextLine();
	                
	                
	                if (n.toLowerCase().equals("what is the starbucks truck?")) {
		                System.out.println("You are Correct "
		                	);
		                System.out.println("score:"+(score+300));
		                  score= score+300;
		                  f300=true;
		            }
		            else {
		            	System.out.println("Your Answer is Incorrect the correct answer is: \n  ");
		            	System.out.println("What is the Starbucks truck? \n \n");
		            	System.out.println("score:"+(score-300));
		                  score= score-300;
		                  f300=true;
		            }
	            	}else {
	            		QuestionPlayed.PrintAnswer();
	            	}
	                
	            }
	            
	        
	            
	            if (n.equals("400")) {
	            	if(f400==false)
	                System.out.println("Available for one night only, Rutgers has an all you can eat lobster, crab, and shrimp and it is known as this \n"
	                	);
	                n = reader.nextLine();
	                
	                if (n.toLowerCase().equals("what is king neptune night? ")) {
		                System.out.println("You are Correct "
		                	);
		                System.out.println("score:"+(score+400));
		                  score= score+400;
		                  f400=true;
		            }
		            else {
		            	System.out.println("Your Answer is Incorrect the correct answer is: \n  ");
		            	System.out.println("What isbKing Neptune Night? \n \n");
		            	  System.out.println("score:"+(score-400));
		                  score= score-400;
		                  f400=true;
		            }
	            }else {
	            	QuestionPlayed.PrintAnswer();
	                
	            }
	            }else {
	            	CompletedSect.SectionComplete();
	            }
	          
	            
	            }
	}
	        //if game over is true it well trigger this else statement and print game over
	        }else {System.out.println("Game Over");
	        	
	        }
		
		
		
	}
	
	
	
	
	public static void history() {
		//prints out history category amount choices 
		System.out.println("Rutgers History:Choose and Amount \n "
        		+"100 \n"
        		+" 200 \n"
        		+" 300 \n"
        		+" 400" );
        
	}
	

	public static void Superstitions() {
		//prints out history category amount choices 
		System.out.println("Rutgers Superstitions:Choose and Amount \n "
        		+"100 \n"
        		+" 200 \n"
        		+" 300 \n"
        		+" 400" );
        
	}


public static void Busses() {
	//prints out history category amount choices 
	System.out.println("Rutgers Bus System:Choose and Amount \n "
    		+"100 \n"
    		+" 200 \n"
    		+" 300 \n"
    		+" 400" );
    
}


public static void Food() {
	//prints out history category amount choices 
	System.out.println("Food around Rutgers:Choose and Amount \n "
    		+"100 \n"
    		+" 200 \n"
    		+" 300 \n"
    		+" 400" );
    
}

}
