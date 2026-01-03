public class Main {
    public static void main(String[] args) {
        // To determine the start index of a particular substring, you’ll employ the indexOf(String stringToSearchFor) method as in the example below. Review the code and then select Run to view the output.

        // Create a string variable
        String testString = "This is a test which is nice";

        // Use indexOf to search for substrings
        int indexOfSearch1= testString.indexOf("Java"); // returns -1
    	int indexOfSearch2 = testString.indexOf("is"); // returns 2
    	int indexOfSearch3 = testString.indexOf("est"); // returns 11

        // Print the results
        System.out.println("");
        System.out.println("testString.indexOf(\"Java\") : " + testString.indexOf("Java"));

        System.out.println(indexOfSearch1 + " Meaning not found");
        System.out.println("");
        
        System.out.println("testString.indexOf(\"is\") : " + testString.indexOf("is"));
        System.out.println(indexOfSearch2 + " Meaning found at index 2");
        System.out.println("");
        
        System.out.println("testString.indexOf(\"est\") : " + testString.indexOf("est"));
        System.out.println(indexOfSearch3 + " Meaning found at index 11");
        System.out.println("");
    }
}
