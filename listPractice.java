package practice1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JList;

public class listPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List
		List<String> al = new ArrayList<>();  
		  
	        // Now add the elements in the List  
	        al.add("BMW");  
	        al.add("Audi");  
	        al.add("bugati");  
	        al.add("mustang GT");  
	        al.add(2, "mini");
	        for(String a:al) {
	        	System.out.println(a);
	        }
	        
	        
	        
	        
	        
	        
//	        Sets 
	        Set<String> Set = new HashSet<String>();  
	        
	        // Adding some Elements   
	        Set.add("Java");  
	        Set.add("Python");  
	        Set.add("DBMS");  
	        Set.add("Machine Learning");  
	        Set.add("Operating System");  
	  
	        // Here Set follows unordered way.  
	        System.out.println(Set);  
	        
	        
	        
	        
	
	}

}
