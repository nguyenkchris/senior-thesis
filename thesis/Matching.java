
package thesis;


public class Matching {

    public static void main(String[] args) {
	// females
	Person angela = new Person("Angela",1,2,3);
	Person becky = new Person("Becky",2,3,1);
	Person crystal = new Person("Crystal",3,1,2);
	Person[] females = new Person[] {angela, becky, crystal};

	// males
	Person adam = new Person("Adam",1,2,3);
	Person bob = new Person("Bob",2,3,1);
	Person charlie = new Person("Charlie",3,1,2);
	Person[] males = new Person[] {adam, bob, charlie};
	
	System.out.println("Trying to match Adam, Bob, and Charlie with Angela, Becky, Crystal");
	System.out.println();

	System.out.println(adam); 	System.out.println();
	System.out.println(bob);	System.out.println();
	System.out.println(charlie);	System.out.println();
	System.out.println();

	System.out.println(angela);	System.out.println();
	System.out.println(becky);	System.out.println();
	System.out.println(crystal);	System.out.println();
	System.out.println();
    }  // main


} // Matching