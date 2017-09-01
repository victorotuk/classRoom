package classroom;

import java.util.*;

 class Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;
    
    // constructor
    
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    
    // Print person data
    
    public void printPerson(){
        System.out.println(
                "NAME: " + lastName + ", " +firstName
              + "\nID: " + idNumber);
    }
    
}
