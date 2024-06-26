/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditcarddemo;

/**
 *
 * @author hp
 */
public class Address {
    //The street number and street name
	private String street;
	
	//The city in which the address is located
	private String city;
	
	//The state in which the address is located
	private String state;
	
	//The zip code associated with that city and street
	private String zip;

	//Constructor creates an address using four parameters
	//road describes the street number and name
	//town describes the city
	//st describes the state
	//zipCode describes the zip code
	public Address(String road, String town, String st, String zipCode)
	{
		street = road;
		city = town;
		state = st;
		zip = zipCode;
	}

	//toString method returns information about the address
	public String toString()
	{
		return (street + ", " + city + ", " + state + " " + zip);
	}
    
}
