//Package Declaration is necessary
package javaProject_Assignment9;

/*Write a program to copy all the elements from set2 to set1 so that the set1 becomes the union
of set1 and set2.*/

//importing packages
import java.util.HashSet;
import java.util.Set;

public class CopyCollection {
	//Main method started
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//hashset and adding values
		 Set<String> set1 = new HashSet<String>();		
		 set1.add("a");
		 set1.add("b");
		 set1.add("c");
		 //Printing 1st set
		 System.out.println(set1);
		    Set<String> set2 = new HashSet<String>();
		    set2.add("r");
			 set2.add("y");
			 set2.add("u");
			 //printing 2nd set
			 System.out.println(set2);

			 //add set2 values into set1
		    set1.addAll(set2);
		    //printing set after merging
		    System.out.println(set1);

	}

}
