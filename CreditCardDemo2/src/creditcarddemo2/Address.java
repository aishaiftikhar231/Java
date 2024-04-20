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
public class Address {
     String street;
    String city;
    String state;
    String zipcode;
    
    public Address(String road, String town, String st, String zip)
    {
      street=road;
      city=town;
      state=st;
      zipcode=zip;
    }
    public String toString()
    {
        return(street + ", " + city + ", " + state + " " + zipcode);
    }

}
