/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditcarddemo2;

/**
 *
 * @author hp
 */
public class Person { 
    
         private String lastName;
	
	//The person's first name
	private String firstName;
	
	//The person's address
	//private Address home;

	//Constructor creates a person from a last name,
	//first name, and address
	public Person(String last, String first)
	{
		lastName = last;
		firstName = first;
		//home = residence;
	}

    

	//toString method returns information about the person
	public String toString()
	{
		return(firstName + " " + lastName + ", " );
	}

    
}
