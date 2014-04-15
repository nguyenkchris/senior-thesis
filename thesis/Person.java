
package thesis;


public class Person {

    private String name;
    private int beauty;
    private int humor;
    private int smart;

    public Person(String name, int beauty, int humor, int smart) {
	this.name = name;
	this.beauty = beauty;
	this.humor = humor;
	this.smart = smart;
    } // Person constructor

    /**
       Try to produce a set of stable matches.
       @return the pairs of people matched
     
    public static Person[][] match(Person[] females, Person[] males, int pivot) {
	// must check if the matches are STABLE!

    } // match
    */

    public String toString() {
	return "Name: " + this.name + "\n" +
	    "Beauty: " + this.beauty + "\n" +
	    "Humor: " + this.humor + "\n" +
	    "Intelligence: " + this.smart;
    } // toString
} // Person