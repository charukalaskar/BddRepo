package PracticeRegularExpressions;

import java.util.regex.Pattern;

public class Ex1 {

	public static void main(String[] args) {
		//Pattern is a class of java and matches is method 
	//ex. 1	
	//boolean result = Pattern.matches(".*Arun.*", "My name is Arun Motorri");
		
	//ex. 2	
	//boolean result = Pattern.matches("Java", "java"); //case  should also match
	//boolean result = Pattern.matches("[jJ]ava", "java"); // either j /J should match
	//boolean result = Pattern.matches("[jJ]ava", "Python"); 
	
	//ex. 3
	//boolean result = Pattern.matches("ye[sp]", "yes"); 
	//boolean result = Pattern.matches("ye[sp]", "yet");
	//boolean result = Pattern.matches("[spe]ak", "sak"); //first letter should be s/p/e
	// boolean result = Pattern.matches("[spe]ak", "speak"); //first letter should be s/p/e other only ak
	
	//ex. 4
	//boolean result = Pattern.matches(".ava", "1ava"); 	//. means anything (single) (number/letter/Chara)
	//boolean result = Pattern.matches(".ava", "22ava"); 	//Not Matched - as single charater/num should match but given 2 numb
		
	//ex. 5
	//boolean result = Pattern.matches("[0-9]ava", "0ava");	
	//boolean result = Pattern.matches("[a-b]ava", "0ava");
	//boolean result = Pattern.matches("[!)]ava", "^ava");
		
	//ex. 6
	//boolean result = Pattern.matches("[A-Za-z0-9]ava", "0ava");
	//boolean result = Pattern.matches("[A-Za-z0-9]ava", "#ava");
	
	//ex. 7
	//boolean result = Pattern.matches("[^A-Z]ava", "Aava"); //^ -means should not match
	//boolean result = Pattern.matches("[^A-Z]ava", "$ava"); 	
		
	//ex. 8
	//boolean result = Pattern.matches("Se[A-Z]", "SeT"); 
	
	//ex. 9
	//boolean result = Pattern.matches("S[^AEIOU]T", "SCT");
	
	//ex. 9
	//boolean result = Pattern.matches("\\dam", "9am"); // \\d means 0-9
	
	//ex. 10
	//boolean result = Pattern.matches("\\Dam", "jam"); // \\D means   ^0-9
	
	//ex. 11
	//boolean result = Pattern.matches("[A-Za-z0-9_]am", "jam");
	//boolean result = Pattern.matches("\\wam", "_am");
	//boolean result = Pattern.matches("\\wam", "xam");
			
	//ex. 12
	//boolean result = Pattern.matches("[^A-Za-z0-9_]am", "jam");
	//boolean result = Pattern.matches("\\Wam", "_am");
	//boolean result = Pattern.matches("\\Wam", "xam");
	//boolean result = Pattern.matches("\\Wam", "8am");
	//boolean result = Pattern.matches("\\Wam", "&am");	
	 
	//ex. 13
	//boolean result = Pattern.matches("^My", "My");
	//boolean result = Pattern.matches("^My", "My Name Is Charu!");	//Not Matched - Start with My but here ending have lot of stuff
	//boolean result = Pattern.matches("^My.*", "My Name is charu");//Matched
	
	//ex. 14
	//boolean result = Pattern.matches("Charu$", "Charu"); //$- end with Charu
	//boolean result = Pattern.matches("Charu$", "My name is Charu");
	//boolean result = Pattern.matches(".*Charu$", "My name is Charu"); //Matched
		
	//ex. 15
	//boolean result = Pattern.matches("C...u", "Charu");
	
	//ex. 16
	//boolean result = Pattern.matches("^My.*Charu$", "My name is Charu");
	//boolean result = Pattern.matches("^My.+Charu$", "MyCharu"); //.+ after My atleast 1 char/num should be there then it match but here nothing
	//boolean result = Pattern.matches("^My.+Charu$", "My_Charu");
	//boolean result = Pattern.matches("^My.+Charu$", "My   Charu");
	
	//ex. 17
	// boolean result = Pattern.matches("^Myn*Charu$", "MyCharu");
	//boolean result = Pattern.matches("^Myn*Charu$", "MynnnCharu");
	 //boolean result = Pattern.matches("^Myn+Charu$", "MyCharu"); //Not Matched
	//boolean result = Pattern.matches("^Myn+Charu$", "MynnnCharu");
		
	//ex. 18
    //boolean result = Pattern.matches("My.?Charu", "MyCharu"); //.? contain char 0 /1 
	//boolean result = Pattern.matches("My.?Charu", "My_Charu");
	//boolean result = Pattern.matches("My.?Charu", "My_ Charu"); //Not Matched  //as 2 charater in beteen My and Charu
	
	//ex. 19
	//boolean result = Pattern.matches("My.{2}Charu", "My_ Charu"); 
	
	//ex. 20
	//boolean result = Pattern.matches("Java|java", "Java"); //either Java or java
	
	//ex. 21
	//boolean result = Pattern.matches("[a-d[m-p]]", "a");
	//boolean result = Pattern.matches("[a-d[m-p]]", "o");
	//boolean result = Pattern.matches("[a-d[m-p]]", "z");
	
		//ex.22
	//	boolean result = Pattern.matches("[a-d[m-p]]", "z"); //any char among two condition should match
	//	boolean result = Pattern.matches("[a-d[m-p]]", "am");
	//	boolean result = Pattern.matches("[a-d[m-p]]", "a"); //Matched
	//	boolean result = Pattern.matches("[a-d[m-p]]", "n"); //Matched
		
		//ex. 23
		//boolean result = Pattern.matches("[a-p&&[mnop]]", "o");  //single char should match from bothcondition
	
		//ex. 24
		//boolean result = Pattern.matches("[a-p&&[^mnop]]", "a"); //Matched
				
		//ex. 25
		//boolean result = Pattern.matches("[a-p&&[m-p]]", "o"); 
		
		//ex. 26
		//boolean result = Pattern.matches("[a-p&&[^m-p]]", "z"); 
		
		//ex. 27
		//boolean result = Pattern.matches("b?t", "bt");//Matched //b should match 0/1 time
		 // boolean result = Pattern.matches("b?t", "t");//Matched
		 // boolean result = Pattern.matches("b?t", "bbbbbt");//Not Matched
		  
		//ex. 28
		//boolean result = Pattern.matches("b+t", "bt"); //Matched 1 to any time repeted
		 //boolean result = Pattern.matches("b+t", "t"); //Not Matched   - as here 0 time
		 // boolean result = Pattern.matches("b+t", "bbbbbt");//Matched
		  
		//ex. 29
		//boolean result = Pattern.matches("b*t", "bt");  //matched 0 to any
		//boolean result = Pattern.matches("b*t", "t"); //Matched
		//boolean result = Pattern.matches("b*t", "bbbbbt"); //Matched
		
		//ex. 30
		//boolean result = Pattern.matches("b{2}t", "bbt"); //Matched
		//boolean result = Pattern.matches("b{2}t", "bt");  //Not Matched
		
		//ex. 31
		//boolean result = Pattern.matches("b{2,}t", "bt"); //Not Matched minimum 2 maximum any
		//boolean result = Pattern.matches("b{2,}t", "bbbbt"); //Matched
		
		//ex. 32
	   // boolean result = Pattern.matches("b{2,4}t", "bt");//Not Matched minimum 2 , maximum 4
	   // boolean result = Pattern.matches("b{2,4}t", "bbbt");//Matched
	   boolean result = Pattern.matches("b{2,4}t", "bbbbbt");//Not Matched
	    
	    if(result) {
		System.out.println("Matched");
	}
	else {
		System.out.println("Not Matched");
	}
	}

}
