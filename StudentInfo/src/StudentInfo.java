/*
 * StudentInfo.java
 */

/*
 *
 * @author Sam Polk <sampolk@gmail.com>
 * @version 2.0
 * @exception Throws Input MisMatch Exception
 */

import java.util.InputMismatchException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StudentInfo {
	
	 int inpt;// menu/scanner input variable
	 String[] siArray;
	 String studentID;
	 String firstName;
	 String lastName;
	 String phoneNumber;
	 String emailAddress; 
	 List<String[]> list = new ArrayList<String[]>();//List elements are 5D arrays
	 String[] siColumn = {"Student ID ","Frist Name ","Last Name ","Phone Number ","Email Address "};
	 
//Default constructor - adds one record with missing data, flags missing and dumps to a string via the ToString method	 
 public StudentInfo(){
	

	init();
    setStudentID("434-42-4343");
    //setFirstName("JoeJo");
    setLastName("");
	setPhoneNumber("1-161-858-7600");
	//setEmailAddress("jo@myserver.com");
	check();
	setList(siArray);
	System.out.print(ToString(0)+"\n\r");

	

		 
	 }

//Second constructor adds a few records to a List<String[5]> that holds student information	 
 public StudentInfo(String studentID, String firstName, String lastName,String phoneNumber,String emailAddress){
	

	
	init();
	setStudentID(studentID);
	setFirstName(firstName);
	setLastName(lastName);
	setPhoneNumber(phoneNumber);
	setEmailAddress(emailAddress);
	check();
	setList(siArray);
	
	
	init();
    setStudentID("322-22-1023");
    setFirstName("Bo");
    setLastName("Nichols");
	setPhoneNumber("858-128-4301");
	setEmailAddress("BoNic200@spawar.com");
	check();
	setList(siArray);
	
	
	init();
    setStudentID("333-32-2223");
    setFirstName("Katrina");
    setLastName("Jacobs");
	setPhoneNumber("1-349-838-3600");
	setEmailAddress("jk@yahoo.com");
	check();
	setList(siArray);
	
	
	
	//setList(siArray);
}

 
 
//ToString method that can be used to show the current state of student data
  public String ToString( int pos){
	String siData ="";
        for (int index = 0;index <5;index++){
       	 siData += siColumn[index]+": "+list.get(pos)[index].toString() + "\n";
        }
       	 return siData;
	
	
}
//Second ToString method that can be used to show the current state of all student data
  public void ToString1(){
	
     int cnt = -1;
	 for ( String[] strArr : list) {
		 cnt++;
		 System.out.println("====Student Record "+(cnt+1));
         for (int index = 0;index <5;index++){
        	 
        	 System.out.println(siColumn[index]+strArr[index]);
        	 
         }
         System.out.println("========");
	 }  
}

 
//Identify missing data
  public void check(){
	
	if (getStudentID()   == null || getStudentID().length()   < 1) setStudentID("mising data");
	if (getFirstName()   == null || getFirstName().length()   < 1) setFirstName("mising data");
	if (getLastName()    == null || getLastName().length()    < 1) setLastName("mising data");
	if (getPhoneNumber() == null || getPhoneNumber().length() < 1) setPhoneNumber("mising data");
	if (getEmailAdress() == null || getEmailAdress().length() < 1) setEmailAddress("mising data");
}
//Reset array and student data attributes
  public void init(){
	
	this.siArray = new String[5];
	this.studentID = null;
	this.lastName= null;
	this.firstName = null;
	this.phoneNumber = null;
	this.emailAddress = null;
	
}



 
 //Getter and Setters
  public void setStudentID(String studentID){
	this.studentID = studentID; 
	siArray[0] = this.studentID;
	 
 }

 
  public String getStudentID(){
	 return this.studentID;
	 
 }
 
  public void setFirstName(String firstName){
		this.firstName = firstName; 
		siArray[1] = this.firstName;
		 
 }
	 
  public String getFirstName(){
		 return this.firstName;
 }
 
	 
  public void setLastName(String lastName){
		this.lastName = lastName; 
		siArray[2] = this.lastName;
		
		 
 }
 
  public String getLastName(){
		 return this.lastName;	 
 }
 
  public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber; 
		siArray[3] = this.phoneNumber;
		
		 
}
	 
  public String getPhoneNumber(){
		 return this.phoneNumber;
 }
		  
  public void setEmailAddress(String emailAddress){ 
	 this.emailAddress = emailAddress;
	 siArray[4] = this.emailAddress;
	 
 }
 
  public String getEmailAdress(){
	 
	 return this.emailAddress;
 }
 
  public void setList(String[] arr){
	 list.add(arr); 
 }
 
  public String getList(List<String[]> siList, int index, int pos){
	 return siList.get(index)[pos].toString();
	 
 }
 
 
 
 
//Data validators methods they use Regx and the pattern and matcher objects
   public boolean emailValidator(String emailAddress) {
			
 final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
						+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";		 
 Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		
 Matcher matcher = pattern.matcher(emailAddress);
 
 return matcher.matches();
	 
 }
 
   boolean studentIDValidator( String studentId){
	 
 final String ID_PATTERN = "^\\d{3}[-]?\\d{2}[-]?\\d{4}$";
 
 Pattern pattern = Pattern.compile(ID_PATTERN);
 
 Matcher matcher = pattern.matcher(studentId);
 
return matcher.matches();
 		
 
 }
 
   boolean validatePhoneNumber(String phoneNumber) {
     //validate phone numbers of format "1234567890"
     if (phoneNumber.matches("\\d{10}")) return true;
     //validating phone number with -, . or spaces
     else if(phoneNumber.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
     //validating phone number with extension length from 3 to 5
     else if(phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) return true;
     //validating phone number where area code is in braces ()
     else if(phoneNumber.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) return true;
     //return false if nothing matches the input
     else return false;
      
 }
 
 
 //Data manipulation methods
  public void getInput(String[] arr, Scanner scn){
	  boolean flag = true;
	 
	 do{
	        System.out.println("Enter Student id ###-##-####");
	        System.out.print("SID");
	        setStudentID(scn.next());
	        if( studentIDValidator(getStudentID())){
	        arr[0] = getStudentID();
	        flag = false;	
	        }
	        else
	          flag = true;
	        
	        } while(flag);
	        
	        do{
	        System.out.println("Enter First Name ");
	        System.out.print("Dn");
	        
	        setFirstName(scn.next());
	        if( getFirstName().length() > 2){
	        	arr[1] = getFirstName();
		        flag = false;	
		        }
		        else
		          flag = true;
		        
		        } while(flag);
	        
	        
	        
	       
	        System.out.println("Enter Last Name");
	        System.out.print("LN");
	        setLastName(scn.next());
	        arr[2] = getLastName();
	        
	        do {
	        System.out.println("Enter Phone Number");
	        System.out.print("PN");
	        setPhoneNumber(scn.next());
	        if( validatePhoneNumber(getPhoneNumber())){
	        	arr[3] = getPhoneNumber();
	        	flag = false;
	        }
	        else
	         flag = true;
	       } while (flag);
	        
	 
	        do {
	        System.out.println("Enter Email Address");
	        System.out.print("EM");
	        setEmailAddress(scn.next());
	        if (emailValidator(getEmailAdress())){
	          arr[4] = getEmailAdress();
	          flag =false;
	        }
	        else 
	         flag = true;
	        	
	        } while (flag);
	        
	     
	 }


  public void editRec(Scanner scn){

	int recNum = 0;
	init();
	//ToString1();
	boolean flag = true;
	while(flag){
	System.out.println("which record would like to edit");
	System.out.print(">>");
	

	 try { 
		 
		 recNum = scn.nextInt();
		 
	 }
	 catch(InputMismatchException error){
	 
		flag = false;
		scn.next();
	 }
	
	if (recNum > 0 && recNum <= list.size()-1)
	  flag = false;
	else
	  flag = true;
	}
	flag = true;
	recNum--;
	System.out.println(list.get(recNum)[0]);//
	System.out.println("Student ID");
	System.out.print("SID ");
	studentID = scn.next();
	setStudentID(studentID);
	
	System.out.println(list.get(recNum)[1]);
	System.out.println("new first name");
	System.out.print("FN ");
	firstName = scn.next();
	setFirstName(firstName);
	
	
	System.out.println(list.get(recNum)[2]);
	System.out.println("new last name");
	System.out.print("LN ");
	lastName = scn.next();
	setLastName(lastName);
	
	while(flag){
	System.out.println(list.get(recNum)[3]);
	System.out.println("new phone number");
	System.out.print("PN ");
	phoneNumber = scn.next();
	if (validatePhoneNumber(phoneNumber)) {setPhoneNumber(phoneNumber);flag = false;}
	else
    flag = true;
	
	}
	flag = true;
	while(flag){
	System.out.println(list.get(recNum)[4]);
	System.out.println("new email address");
	System.out.print("EM ");
	emailAddress = scn.next();
	if (emailValidator(emailAddress)) {setEmailAddress(emailAddress);flag = false;list.set(recNum,siArray);}
	else
	flag = true;
	}
    
	
	
}

  public void removeRec(Scanner scn){
	int recNum = 0;
	boolean flag = true;
	//ToString1();
	flag = true;
	while(flag){
	System.out.println("which record would like to remove");
	System.out.print(">>");
	recNum = scn.nextInt();
	if (recNum > 0 && recNum <= list.size() - 1) {list.remove(recNum-1);flag = false;} 
	else
		flag = true;
	}
	

	//ToString1();
}


}//End of StudentInfo class

