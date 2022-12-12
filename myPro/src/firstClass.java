import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 

public class firstClass {
	
	 List<String[]> list = new ArrayList<String[]>();
	 String[] ary;
	 String studentId;
	 String firstName;
	 String lastName;
	 String phoneNumber;
	 String emailAddress;
	  
	 public firstClass(){
		 
	 }
	 
	 public firstClass(String studentId, String firstName, String lastName, String emailAddress, String phoneNumber){
		 
	 }
	 
	 public void setStudentId(String studentId){
		this.studentId = studentId; 
		 
	 }
	 
	 public String getStudentId(){
		 return this.studentId;
	 }
	 
	 
	 public void setFirstName(String firstName){
			this.firstName = firstName; 
			 
	 }
		 
	 public String getFirstName(){
			 return this.firstName;
	 }
		 
	 
	 public void setLastName(String lastName){
			this.lastName = lastName; 
			 
	 }
		 
	 public String getLastNamed(){
			 return this.lastName;
	 }
	 
	 public void setPhoneNumbere(String phoneNumber){
			this.phoneNumber = phoneNumber; 
			 
	}
		 
	 public String getPhoneNumber(){
			 return this.phoneNumber;
	}
		 
	 
	 public void setEmailAddress(String emailAddress){
		 
		 this.emailAddress = emailAddress;
	 }
	 
	 public String getEmailAdress(){
		 
		 return this.emailAddress;
	 }
	 
	 
     public boolean emailValidator(String emailAdress) {
				
     final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
							+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";		 
	 Pattern pattern = Pattern.compile(EMAIL_PATTERN);
			
     Matcher matcher = pattern.matcher(emailAdress);
	 
     return matcher.matches();
		 
	 }
     
     private boolean studentIdValidator( String studentId){
    	 
     final String ID_PATTERN = "^\\d{3}[-]?\\d{2}[-]?\\d{4}$";
     Pattern pattern = Pattern.compile(ID_PATTERN);
		
     Matcher matcher = pattern.matcher(ID_PATTERN);
	 
     return true;
    // return matcher.matches();
     		
     
     }
     
     
     private boolean validatePhoneNumber(String phoneNumber) {
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
     
    
		 
	
	public static void main(String args[]){
		
		 firstClass fc = new  firstClass();
		 Scanner scn = new Scanner(System.in);
		 boolean flag = true;

	       
	        for ( int ii=0;ii<1;ii++){
	        fc.ary = new String[5];
	        
	        
	        
	        do{
	        System.out.println("Student id");
	        fc.setStudentId(scn.next());
	        if( fc.studentIdValidator(fc.getStudentId())){
	        fc.ary[0] = fc.getStudentId();
	        flag = false;	
	        }
	        else
	          flag = true;
	        
	        } while(flag);
	        
	        do{
	        System.out.println("First Name");
	        
	        fc.setFirstName(scn.next());
	        if( fc.getFirstName().length() > 2){
	        	fc.ary[1] = fc.getFirstName();
		        flag = false;	
		        }
		        else
		          flag = true;
		        
		        } while(flag);
	        
	        
	        
	       
	        System.out.println("Last Name");
	        fc.setLastName(scn.next());
	        fc.ary[2] = fc.getLastNamed();
	        
	        do {
	        System.out.println("Phone Number");
	        fc.setPhoneNumbere(scn.next());
	        if( fc.validatePhoneNumber(fc.getPhoneNumber())){
	        	fc.ary[3] = fc.getPhoneNumber();
	        	flag = false;
	        }
	        else
	         flag = true;
	       } while (flag);
	        
	 
	        do {
	        System.out.println("Email Address");
	        fc.setEmailAddress(scn.next());
	        if (fc.emailValidator(fc.getEmailAdress())){
	          fc.ary[4] = fc.getEmailAdress();
	          flag =false;
	        }
	        else 
	         flag = true;
	        	
	        } while (flag);
	        	
	        }
	        //scn.close();
	        fc.list.add(fc.ary);
	
	
	      
	        for ( String[] strArr : fc.list) {
	            System.out.println(Arrays.toString(strArr));
	        }  
	  }

	

}
	
		

 
