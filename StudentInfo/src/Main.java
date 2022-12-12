/*
 * Main.java
 */

/*
 *
 * @author Sam Polk <sampolk@gmail.com>
 * @version 2.0
 * @exception Throws Input MisMatch Exception
 */


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//Create a Java application named StudentInfo that has a Main class and a main method.

public class Main {
	
  public static void main(String args[]){
	  
	
	
	 Scanner scn = new Scanner(System.in);
	 boolean flag = true;
	 String[] arr;
	 int inpt = 0;
	 boolean flagMnu = true;
	 
	 String sid = "562-43-0605";
	 String fn = "Sam";
	 String ln = "Polk";
	 String pn = "619-894-7328";
	 String em = "sampolk@lmail.com";
	 
	 ///=========Testing Section =================///
	 
	 System.out.println("\nBEGIN::Test default/null constructor\n");
	 
	 StudentInfo siDefault = new StudentInfo();// Testing setting data in null constructor with missing data
	 
	 System.out.println("END::Test default/null constructor\n");
	 
	 //Test input from the command line
	 if (args.length > 0 && args.length < 5) {
       }

	 if (args.length > 4){ System.out.println("\nThis record is from the command line\n");
	    siDefault.setList(args); 
	    System.out.println( siDefault.ToString(1));//Display Current state of Data method 1 display a particular record
	    }
	 
	 
	 siDefault.ToString1();//Display Current state of Data  method 2 display all records 
	 
	 
	 System.out.println("\nBEGIN::Test 4 argument constructor\n");
	 
	 StudentInfo si = new StudentInfo(sid,fn,ln,pn,em);// Testing setting data from 4 argument constructor and adding multiple records one which is incomplete
	 
	 
	 si.ToString1();// Display current state of data
	
	 System.out.println("\nEND::Test 4 argument constructor\n");
	 
	 //Test Display first name, last name and emal address then updaate email, finally display altered record
	 
	 for ( int indx = 0;indx < 5;indx++) {si.siArray[indx] = si.getList(si.list,1,indx);}//get current data
	 
	 //Get Students first name
	 System.out.print("Display first name pprogrammatically: ");
	 System.out.println(si.siArray[1]);
	 
	 //Get Students last name 
	 System.out.print("Display last name programmatically: ");
	 System.out.println(si.siArray[2]);
	 
	 //Get Student's email address
	 System.out.print("Display email address programmatically: ");
	 System.out.println(si.siArray[4]);
	 
	 si.siArray[4] = si.siArray[1]+"."+si.siArray[2]+"@ucla.edu"; //Change email address
	 si.setEmailAddress(si.siArray[4]); //update array
	 
	 System.out.println("\nChange email address and display record");
	 si.list.set(1, si.siArray);// update list
	 System.out.println("\n"+si.ToString(1));// Display updated record
	 System.out.println("\n");

	 
	 
	 //=================
	 
	   while (flagMnu){
		 
		 System.out.println("1) Add Student Information");
		 System.out.println("2) Update Student Information");
		 System.out.println("3) Remove Student Information");
		 System.out.println("4) Display all Student Records");
		 System.out.println("5) QUIT");
		 System.out.print(">>");
		 
		 try { 
			 
			 inpt = scn.nextInt();
			 
		 }
		 catch(InputMismatchException error){
		 
			//System.out.print("Your choice was invalid,try agian\n\n ");
			scn.next();
		
		 }
			menuloop: switch (inpt ) {

	        case 1: {si.init();
	                 arr = new String[5];
	                 si.getInput(arr, scn);
	                 si.setList(arr);}
	                 break;
	        case 2: si.editRec(scn);
                     break;
	        case 3: si.removeRec(scn);
                    break;
	        case 4:  si.ToString1();
                    break;
	        case 5: flagMnu = false;
	                break;
	                
                    
	        default: {System.out.print("Your choice was invalid,try agian\n\n");}
	                 break;

	        }
		 
		 }   
	      scn.close();
		  System.out.print("program has ended\n\n");       
  } 
 
  
}
	   
          
           
	 
	 
	 
	 


