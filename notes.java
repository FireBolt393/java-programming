// Table of Contents
// 1.  Imports .................................................................. Line 30
// 2.  Escape Characters ........................................................ Line 51
// 3.  Datatypes ................................................................ Line 64
// 4.  Creating Variables ....................................................... Line 77
// 5.  Taking User Inputs (java.util.Scanner) ................................... Line 93
// 6.  Operators ................................................................ Line 118
// 7.  Math Class ............................................................... Line 126
// 8.  Generating Random Numbers (java.util.Random) ............................. Line 149
// 9.  Conditional Statements ................................................... Line 162
// 10. Switch cases ............................................................. Line 177
// 11. Logical and comparison operators ......................................... Line 204
// 12. String operations ........................................................ Line 218
// 13. while loop ............................................................... Line 259
// 14. do loop .................................................................. Line 271
// 15. for loop ................................................................. Line 282
// 16. arrays ................................................................... Line 290
// 17. wrapper classses ......................................................... Line 310
// 18. ArrayList ................................................................ Line 327
// 19. 2D ArrayList ............................................................. Line 356
// 20. for each loop ............................................................ Line 372
// 10. Methods and Functions (Refer to notes2.java) ............................. notes2 Line 15
// 11. Formatted Print Statements ............................................... Line 388
// 12. Final Keyword ............................................................ Line 411
// 13. Object Oriented Programming (Refer to notes2.java) ....................... notes2 Line 72
// 14. Exception Handling ....................................................... Line 426
// 15. File Operations .......................................................... Line 469

// imports
import java.util.Scanner; // necessary to take user inputs
import java.util.ArrayList; // to create an ArrayList
import java.util.InputMismatchException; // to catch InputMismatchException errors
import java.util.Random; // to generate random numbers
import java.io.File; // for file operations
import java.io.FileNotFoundException; // for file not found exception
import java.io.FileReader; // to read files
import java.io.FileWriter; // to write into a file
import java.io.IOException; // for IOException
// import java.io.Reader; // used for reading character streams

public class notes { // class name should be same as file name
    public static void main(String[] args) { // static function: where the program starts. No necessity of calling it.
        /* // System is the class, out is the object, println or print is the method of that object. 
        // dot(.) is used as the access operator, which is used to access objects from a package and method in an object
        // String[] is the datatype and args is the variable that is used to store the string objects from command line interface.
        System.out.println("Hello, World!"); // to print statements. println adds a new line character at the end
        System.out.print("Hello ");
        System.out.print("World"); // print does not add a new line character at the end. This prints (Hello World)
    
        
// ===================================================================================================================================

        // escape characters
        // \t : adds a tab space
        // \n: adds a new line charcter
        
        System.out.print("\t Hello World\n");

        // to print something within quotes:
        System.out.println("\"Hello World\"");

// ===================================================================================================================================

        // datatypes

        // byte -128 - 127
        // short: -32768 - 32767
        // int: -2b to 2b
        // long: -9 quit to 9 quint
        // float: 6-7 digits
        // double: upto 15 digits
        // char: single letter
        // String: sequece of characters

// ===================================================================================================================================

        // creating variables:
        int printX = 1;
        // or 
        int printY;
        printY= 1;
        
        // printing the variables:    
        System.out.println("printX value is: " + printX);
        System.out.println("printY value is: " + printY); // use + to concatanate string and variable

        // to store floating points, f should be added at the end;
        float floatingX = 3.14f;
        System.out.println("value of floatingx: "+ floatingX); 

// ===================================================================================================================================

        // taking user inputs: requires importing java.util.Scanner
        Scanner src = new Scanner(System.in); // we are creating a scanner object using 'Scanner' and 'new' keyword. 
        // 'src' is the objec name used to create a new instance of Scanner.

        // use the newly created instance to get user input.
        System.out.println("Enter a string: ");
        String user = src.nextLine();
        System.out.println("You entered: " + user);

        // scanner methods to accept differnt datatypes:
        // nextLine(): To accept string. New line will be used to accept user input
        // next(): To accept string. Same line will be used to accept user input
        // nextDouble(): To accept double.
        // nextInt(): To accept integers.

        System.out.println("Enter an integer: ");
        int userX = src.nextInt();
        System.out.println("You entered the number: " + userX);
        src.close(); // close the scanner to prevent leaks
        // If there are series of input statements, the next input statement might throw an error.
        // This happes if the first user input statement suffixes a new line character, the second input will be skipped without accepting anything.
        // to fix this, add an extra input statement bewteen the two input statements to remove the new line character. 

// ===================================================================================================================================

        // operators:
        int variable = 10;
        variable++; // increments the variable value by 1 
        variable--; // decrements the variable value by 1
        // final output: 10 

// ===================================================================================================================================

        // math class:
        // to find min/ max value
        double x = 3.14;
        double y = - 10;

        double z = Math.max(x, y);
        double w = Math.min(x, y);

        System.out.println(z);
        System.out.println(w);

        System.out.println(Math.abs(y)); // returns the mod of the number

        System.out.println(Math.sqrt(25)); // returns the square root of the number

        System.out.println(Math.round(x)); // rounds the number

        System.out.println(Math.ceil(x)); // rounds up the number

        System.out.println(Math.floor(x)); // rounds down the number 

// ===================================================================================================================================

        // generating random numbers: import java.util.Random
        Random r = new Random();
        int random = r.nextInt(6); // returns a random number between 1 and 6
        System.out.println("\n" + random);

        double randomD = r.nextDouble(); // returns a random double from 0 to 1
        System.out.println(randomD);

        boolean randomB = r.nextBoolean(); // returns a randoml boolean value
        System.out.println(randomB);

// ===================================================================================================================================

        // conditional statements
        // syntax: if (condition) {block of code} else if(condition) {block of code} else {block of code}
        int a = 0;
        if (a < 0) {
            System.out.println("Negative number");
        } else if (a == 0) {

            System.out.println("Equal to zero");
        } else {

            System.out.println("Positive number");
        }

// ===================================================================================================================================

        // switch cases: Similar to if else. but much faster.
        Scanner s = new Scanner(System.in);
        String day = s.nextLine().toLowerCase(); // toLowerCase() converts all the characters to lower case
        s.close();
        switch (day) {
            
            case "sunday" : System.out.println("Today is a weekend. yaay :)");
            break;
            case "monday" : System.out.println("Today is a weekday :(");
            break;
            case "tuesday" : System.out.println("Today is a weekday :(");
            break;
            case "wednesday" : System.out.println("Today is a weekday :(");
            break;
            case "thursday" : System.out.println("Today is a weekday :(");
            break;
            case "friday" : System.out.println("Today is a weekday :(");
            break;
            case "saturday" : System.out.println("Today is a weekend. yaay :)");
            break;
            default: System.out.println("Thats not a valid day");
            break; 
            
        }

// ===================================================================================================================================

        // logical operators:
        // &&: logical AND
        // ||: logical OR
        // !: logical NOT

        // comparison operators:
        // <: less than
        // >: geater than
        // <=: less than or equal to 
        // >=: greater than or equal to
        // ==: equals
        // !=: not equals

// ===================================================================================================================================
        // operations on string.

        // to compare two strings, use the method .equals("").
        // to check whether the string is empty, use .isEmpty() method.
        // isEmpty() method is used to check whether the string is "" ie, no return characters, white spaces or tabs.
        // isBlank() method is used to check whether the string contains only white spaces or tabs.
        // .equalsIgnoreCase() checks whether two strings are equal (This is not case sensitive)
        // .length() returns the length of the string
        // .indexOf(char) returns the index of specified character.
        // .charAt(0) takes the index and returns the character at that particular index
        // .trim() removes all the white spaces
        // .replace(target char/sequence, replacement char/sequence) replaces a particular character with specified one.
        // .toUpperCase() converts the string to uppercase
        // .toLowerCase() converts the string to lowercase

        String name = "Razor Callahan";
        System.out.println(name.length());
        System.out.println(name.trim());
        System.out.println(name.equalsIgnoreCase("razor callahan"));
        System.out.println(name.replace("Razor", "Clarence"));
        System.out.println(name.indexOf("n"));
        System.out.println(name.charAt(2));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String name = "Razor Callahan";
        System.out.println("Enter your name: ");
        Scanner s = new Scanner(System.in);
        String verify = s.nextLine();
        s.close();
        
        if (name.equals(verify)) {
            System.out.println("You have been verified");
        } else if (verify.isEmpty()) {
            System.out.println("You did not enter your name");
        } else {
            System.out.println("You are the wrong person");
        }

// ===================================================================================================================================

        // while loop: It first checks for the condition and then executes the code.
        String input = "";
        Scanner in = new Scanner(System.in);
        while (! input.equals("quit")) { // syntax: while (condition) {block of code}
            System.out.println("Enter: ");
            input = in.nextLine();
            System.out.println("You entered: " + input);
        }
        in.close();

// ===================================================================================================================================

        // do loop: Do loop ensures that the code is executed atleast once. It first executes the code and then checks for the condition
        // syntax: do {block of code} while (condition);

        String doInput = "hello";
        do {

            System.out.println("doInput: " + doInput);
        } while (! doInput.equals("hello")); 

// ===================================================================================================================================

        // for loop: it is used to run a block of code for a fixed number of times
        // syntax: for (variable declaration; break condition; increment or decrement operator) {block of code}
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        } 

// ===================================================================================================================================

        // arrays: a collection of similar type of elements
        // to create a static array:

        String[] cars = {"BMW", "McLaren SLR", "DB9"};

        System.out.println(cars[0]); // to access the contents of the array (at index 0)
        System.out.println(cars.length); // to get the length of the array

        // to create array of fixed length and unknown elements:
        String[] cars = new String[3]; // here 3 is the length of the array
        
        // adding elements to the array:
        cars[0] = "BMW"; // adds an element to 0th position
        cars[1] = "McLaren"; // adds an element to 1st position
        cars[2] = "DB9"; // adds an element to 2nd position
        
        // note: .indexOf() or charAt() methods will not work on static arrays

// ===================================================================================================================================

        // wrapper classes
        // primitive and reference data types
        // All primitive data types have their corresponding reference data types.
        // Reference data types usually begin with an upper case. They provide multiple methods.
        // But they are slower when compared to primitive data types.
        // autoboxing: java converts the primitive data type to its corresponding refernce data type automatically
        // unboxing: reference datatypes can be used as primitive datatypes as well.

        // examples of some primitive and reference datatypes:
        // Primitive:        Reference:
        // boolean           Boolean
        // char              Character
        // int               Integer
        // double            Double
        
// ===================================================================================================================================

        // Array List: (Static arrays and Array lists are completely differnt)
        // to create a list:
        // syntax: ArrayList<Reference datatype> listName = new ArrayList<Reference datatype(optional)>();
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW"); // adding elements into the list
        cars.add("McLaren");
        cars.add("DB9");

        System.out.println(cars.get(0));  // accessing elements from the list
        System.out.println(cars.indexOf("BMW")); // to get the index of a particular element

        cars.set(0, "Mustang"); // to set the element of a particular index
        cars.remove("DB9"); // to remove a particular element
        cars.add(2, "Lamborghini"); // to add an element at a particular index

        System.out.println(cars);

        // to store different datatypes in a single list:
        ArrayList<Object> objects = new ArrayList<>();

        objects.add("Razor Callahan");
        objects.add(1);
        objects.add("Bull");
        objects.add(2);

        System.out.println(objects);

// ===================================================================================================================================

        // 2D array list: syntax: ArrayList<ArrayList<String>> = arrayName = new ArrayList<>();
        // Declare another list that goes inside the 2d list.
        ArrayList<ArrayList<String>> twoDList = new ArrayList<>();
        ArrayList<String> cars = new ArrayList<>();

        twoDList.add(cars); // add the inner list inside the 2d list
        
        cars.add("BMW");
        cars.add("McLaren");
        cars.add("DB9");
        cars.add("Corvette");

        System.out.println(twoDList.get(0).get(0));

// ===================================================================================================================================

        // for each loop: This loop is used to iterate over an iterable.
        // syntax: for (datatype iterator_variable: array) {block of code}

        String[] cars = {"BMW", "McLaren", "DB9"};

        for (String i: cars) {

            System.out.println(i);
        }

// ===================================================================================================================================

        // methods and functions: check out notes2.java for methods and functions.

// ===================================================================================================================================

        // formatted print statements. This makes printing variables and strings mixed statements much easier
        // syntax System.out.printf("%format specifier", variable);

        String name = "Razor Callahan";
        int age = 21;
        String hobby = "coding";
        // print "My name is variable(name), my age is variable(age), and my hobby is (hobby)"
        // using print() or println() woulde be
        System.out.println("My name is " + name + "My age is " + age + " My hobby is " + hobby);

        // as we can see, the above print statemnt is complicated. it can be simplified using printf statement below.
        // this is similar to printf statement in c language.

        System.out.printf("My name is %s, my age is %d, and my hobby is %s", name, age, hobby);

        // in place of name, we used %s (format specifier for string)
        // in place of age, we used %d (format specifier for integer)
        // in place of hobby, we used %s (format specifer for string)
        // at the end, we used name, age and hobby variables. 
        // note: these variables should be in the same order as we used the format specifiers.

// ===================================================================================================================================

        // final keyword:
        // variables followed by final keyword cannot be changed. Tampering their values would throw an error.

        final float PI = 3.14f;

        System.out.println(PI);

        // PI = 3.1415f; // this would throw an error.

// ===================================================================================================================================

        // object oriented programming (OOP). Refer notes2.java

// ===================================================================================================================================

        // exception handling:

        // while executing some code, unexpected error might occur.
        // to handle such dangerous code, exceptions are used to prevent the program from crashing.

        // try and catch blocks are used to decide whats gonna happen if the program crashes.
        Scanner scr = new Scanner(System.in);
        try { // bascially we are telling, hey.. try this code
            int dividend;
            int divisor;

            int quotient;

            System.out.println("Enter the divident value: ");
            dividend = scr.nextInt();
            System.out.println("Enter the divisor");
            divisor = scr.nextInt();
            
            quotient = dividend / divisor;
            System.out.println("Quotient: " + quotient);
        } 

        catch (ArithmeticException e) { // ArithmeticException catches not divisible by zero error
            System.out.println("Cannot divide by zero!8");
        }

        catch (InputMismatchException e){ // similarly, you can add as many catch blocks if you want
            // this catches if there's any mismatch in the input values. InputMismatchException should be imported before using this.

            System.out.println(e);
        }

        catch (Exception e) { // to catch any other error, Exception can be used
            System.out.println(e);
        }
        
        finally { // finally block can be used to execute code after everthing is executed.
            // this block will be executed always.
            scr.close();
        }

// ===================================================================================================================================

        // file operations

        File file = new File("test.txt"); // create a file object and provide the name or the path of the file. 
        // The file should be in java working directory if just the name is provided. else full path
        if (file.exists()) { // if the file exits
            
            System.out.println(file.getPath()); // returns the name of the file
            System.out.println(file.getAbsolutePath()); // returns the full path of the file
            System.out.println(file.isFile()); // returns true if the file is a file (not a directory)
            file.delete(); // deletes the file
        } else {

            System.out.println("the file doesnt exists");
        } 

        // file write and read
        try {
            FileWriter writer = new FileWriter("Test.txt"); // create a file writer object and pass the file name that is to be created or opened.
            writer.write("BMW: Razor Callahan \nMclaren: Bull \nRonnie: DB9"); // use write method to write things into the file
            writer.append("\nWebster: Corvette"); // append method adds more content to the file. if write is used again, it will overwrite the previous content
            writer.close(); // do not forget to close the writer after writing.
        } catch (IOException e) { // this is considered dangerous code and might throw an error. so this is automatically generated by the IDE
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // reading from a file
        FileReader reader = new FileReader("Test.txt"); // create a file reader object and pass in the file name

        
        try {
            int bytes = reader.read(); // the data will be read in bytes. so use int dataype to store the data

            bytes = reader.read();
            while (bytes != -1) { // use a loop to continously read the next lines until everything is read completely
                System.out.print((char) bytes); // convert the bytes into char before printing. also use print method. println prints every character in a new line
                bytes = reader.read(); // keep reading the file until we reach the end of the data
            }
            
        } catch (IOException e) { // system auto generated to handle errors
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try { // this is also auto generated by the IDE
            reader.close(); // do not forget to close the reader
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } */
    }
}

// ======================================== THANK YOU ==================================================================================================================

