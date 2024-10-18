// Table of Contents
// 1.  Methods, static keyword and parameters and argument....................... Line 18
// 2.  Method Overloading ....................................................... Line 62
// 5.  Object-Oriented Programming (OOP) ........................................ Line 75
// 6.  Constructors ............................................................. Line 104
// 7.  Arrays into contructors .................................................. line 147
// 8.  Objects as arguments ..................................................... line 184
// 9.  Inheritance .............................................................. Line 221
// 10. Package and imports ...................................................... Line 269
// 11. Access modifiers ......................................................... Line 276
// 12. Method overriding ........................................................ line 320
// 13. Polymorphism ............................................................. line 344
// 14. Dynamic Polymorphism ..................................................... Line 408
// 15. Abstract Classes and Methods ............................................. Line 469
// 16. Interfaces in Java ....................................................... Line 507

/*
// Methods in java:
    
    // Methods that belong to main class should be inside of the main class followed by static keyword.
    
    // Static keyword:
    // static keyword is used to call the method of the class without creating an instance of the class.
    // we shall see how to create a class and its instance later.
    // by using static keyword, we are declaring the method to be persitant until the program dies.
    // for instance, if we create a class and a method inside of it, and if the method is non-static, the method might die after exiting the class
    // to prevent this, static keyword is used.
    // Also there cannot be a copy of a static Method or a variable.

    // syntax: static datatype return_type method_name(parameters if necessary) {block of code}
    // Methods may or may not have parameters based on the requirements.

    // parameters: variables that a Method expects while its being called.
    // arguments: variables that need to be passed while the Method is being called.

    // in the below code, add Method has two parameters. (int a, int b)
    // while calling this Method, two arguments have to be passes (a, b).

public class notes2 {
    public static void main(String[] args) {

        int a, b, c;
        a = 2;
        b = 3;
        c = 4;

        int result = add(a, b); // calling the add Method with arguments (a, b)
        System.out.println("\nresult " + result);

        int result2 = add(a, b, c); // here there are three arguments passed (a, b, c)
        System.out.println("result2 " + result2); // calling the overloaded method

    }

    static int add(int a, int b) {

        int z = a + b;
        return z;
    }
    

    // method overloading:
    // if we create a method with same name but different parameters, then it is called method overloading.


    static int add(int a, int b, int c) { // this is an overloaded method of original method `add`

        return a + b + c;
    } 
    
} */

// ================================================================================================================================

// object oriented programming (OOP)
// to create a class car and its methods:

/* 
public class notes2.java {
    
    public static void main(String[] args) {

        car car = new car(); // creating instance of the class `car`.
        System.out.println("Car name is " + car.carName); // accesing the carName variable
        car.drive(); // accessing the drive method 
    }
}
    
class car {

    String carName = "BMW"; // this variable belongs to car class

    void drive() { // static keyword is not used because we shall create an instance of the class and then call its method.
        System.out.println("you are driving " + carName);

    }
    
}

*/

// ===================================================================================================================================

// constructors:
// A constructor is a block of code similar to a method that is called when an instance (object) of a class is created. 
// It has the same name as the class and does not have a return type. 
// Constructors are used to set initial values for object attributes and perform any setup required when creating an object.

// Key Points:
// Name: The constructor must have the same name as the class.
// No Return Type: Constructors do not have a return type, not even void.
// Initialization: They are commonly used to initialize instance variables or allocate resources.

/* 
public class notes2 {

    public static void main(String[] args) {

        // creating an instance of NFSCars class
        NFSCars nfs = new NFSCars("BMW M3 GTR", 8); // passing arguments into the class constructor.
        nfs.print(); // accessing its print method
    }

} 

class NFSCars {

    String carName;
    int enginecylinders;

    NFSCars(String name, int cylinders) { // constructor that has same name as its class that takes name and cylinders as arguments
        // accepted name and cylinders values are stored in carName and engineCylinders.
        // to store these values, this keyword with a dot(.) should be used.
        this.carName = name;
        this.enginecylinders = cylinders;
    }

    void print() {

        System.out.printf("Car name is %s and number of cylinders is %d", carName, enginecylinders);
    }

}
*/
// ===================================================================================================================================

// passing an array into a constructor:

/* 
public class notes2 {
    public static void main(String[] args) {

        // initialize the class and pass the array elements as shown below.
        Car[] car = {new Car("BMW"), new Car("DB9"), new Car("McLaren")};
        System.out.println(car[0].name);

        // OR
        
        // If only length is known and not the elements:
        // initialize the class as an array with the array size and then add the elements as shown below.
        Car[] car1 = new Car[3]; 
        car1[0] = new Car("BMW");
        car1[1] = new Car("McLaren");
        car1[2]= new Car("DB9");

        System.out.println(car1[2].name); // car[2].name; .name is necessary here. else the address will be printed.
    
    
    }
}
// create a constructor

class Car {

    String name;

    Car(String name) {
        this.name = name;
    }
}*/

// ===================================================================================================================================

// passsing objects as arguments.
// Instantiate the classes and pass the initiated class variable as argument into the class that accpets objects as argument.
/* 
public class notes2 {
    public static void main(String[] args) {

        Garage g = new Garage(); 
        CarName cn = new CarName(); 
        cn.print(g, "BMW");

    }

}

// passing objects as arguments:
// you can pass objects as arguments into a class.
// declare a class and a method. The method's parameter should contain a datatype which is the class name of the object that you wanna pass.


class Garage { 

    void park(String name) {

        System.out.println(name + " is parked in your garage!");
    }
}

class CarName { 

    void print(Garage g, String name) {
        g.park(name);
        
    }
} */

// ===================================================================================================================================

// inheritane in java: when a child class inherits from a parent class, all the methods in parent class will be accessible from child class.
// extends keyword is used to inherit a class
// super keyword: super keyword is used to inherit the contructor variables from the parent class to child class without the need of defining them again in child class.
// super keyword can also be used to call the parent class' method inside of child class.
// NOTE: a class can inherit only from one class. Multiple inheritance in java is not allowed.
/* 
public class notes2 {
    public static void main(String[] args) {
        // inheritance and super keyword.
        SportsCar bmw = new SportsCar("BMW", "Silver and Blue", 8);
        bmw.run();
    }
}

class Car { // parent class
    String name;
    String color;

    Car(String name, String color) { // parent class' constructor

        this.name = name; // constructor variables
        this.color = color;
    }

    String show() {

        return "This is a " + name + ", its color is " + color;
    }
}

class SportsCar extends Car{ // extends keyword is used to inherit from the parent class. 
    int pistons;

    SportsCar(String name, String color, int pistons) { // child class' constructor. Prarent class' variables should also be accepted as arguments.

        super(name, color); // super keyword used to inherit parent class' constructor variables without the need of initializing them.
        this.pistons = pistons;
        
    }

    void run() {
        // super keyword is used to call the show method from parent class
        System.out.println(super.show() + " and this car has " + pistons + " pistons");
    }
} */

// ===================================================================================================================================

// packages and imports
// to convert notes2.java into a package, add this at the top of everything. `package notes2;` or any other name you would like to give.
// to import this package in any other project, put this line of code at top of everthing:
// `import notes2` or any other name that you have given.

// ===================================================================================================================================

// public, protected and private access modifiers:
// consider two packages and two classes in them (main and the other you created)
// if public keyword is prefixed to any variable inside of sub class of a package, it can be accessed by all the other classes inside of the other package.
// if protected keyword is prefixed to any variable inside of sub class of a package, it can only be access by the class in the other package that is the child class of the class that contains the protected variable.
// if private keyword is prefixed to any variable inside of sub class of a packgage, that variable can only be accessed by that class itself and not by any other class.

// example

// package 1: 
// public class main {
//     public static void main(String[], args) {
//         System.out.println("This is the main class");
        
//     }
// }

// public class sub {
//     public int a = 1; // this can be accessed by any class
//     private int b = 2; // this can be accessed only by this class
//     protected int c = 3; // this can be access by sub2 class as it inherits sub class

//     public static void main(String[] args) {
//         // your code
//     }
// }

// package 2: 
// public class main2 {
//     public static void main(String[], args) {
//         System.out.println("This is the main class");
        
//     }
// }

// public class sub2 extends sub1{

//     public static void main(String[] args) {
//         // this class can access `int a` and `int b`
//         // because int a is public and int c is in sub1 (parent of sub2)
//     }
// }

// ===================================================================================================================================

// method overriding:
// assume two classes:
// if a child class has the same method name as the first class, then it is called overridden method

/* 
class Class1 {

    void run() { // overriding method

        System.out.println("hi from class 1");
    }
}

class Class2 extends Class1 {

    @Override // common convention to let users know this is an overridden method.
    void run() { // overridden method

        System.out.println("hi from class 2");
    }
}*/

// ===================================================================================================================================

// polymorphism in java
// it is the ability of the objects to identify themselves as more than one datatype.
// lets declare few classes
// vehicle is the parent class and all the other classes inherit Vehicle class
/* 
class Vehicle {

    void go() { // empty method that will be overridden in its child classes

    }

}

class Car extends Vehicle{

    @Override
    void go() {

        System.out.println("Car is running");
    }
}

class Bike extends Vehicle{

    @Override
    void go() {

        System.out.println("Bike is running");
    }
}

class Truck extends Vehicle{

    @Override
    void go() {

        System.out.println("Truck is running");
    }
}

// now lets initialize these classes

public class notes2 {

    public static void main(String[] args) {

        Car car = new Car();
        Bike bike = new Bike();
        Truck truck = new Truck();
        
        // lets store these vehicle objects in an array
        Vehicle[] vehicles = {car, bike, truck}; // we shall use the class Vehicle as the datatype to store these objects
        // here Vehicle is the parent class of all the other classes. so it can be used as the datatype to store its children as objects in an array.
        // this property is known as polymorphism.

        // access these objects using a for each loop
        for (Vehicle i : vehicles){
            i.go(); // accessing all the overridden methods.
        }
    }
}*/

// ===================================================================================================================================

// dynamic polymorphism: polymorphism that occurs during code execution or runtime.
// again, lets start off with creating some classes.
/* 
import java.util.Scanner;

class Vehicle {

    void go(){ // override this method in child classes
        
    }
}

class Car extends Vehicle{

    @Override
    void go() {

        System.out.println("This car is running");
    }
}

class Bike extends Vehicle{

    @Override
    void go() {

        System.out.println("This bike is running");
    }
}


public class notes2 {
    // now lets instantiate the classes
    public static void main(String[] args) {

        Vehicle vehicle; // instantiate the Vehicle class.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which object would you like to instantiate? \nEnter 1 for car and 2 for bike");
        int choice = scanner.nextInt();

        // We are instantiating the class based on user input (during runtime).
        // hence this is called dynamic polymorphism.
        if (choice == 1) {

            vehicle = new Car();
            vehicle.go();
        } else if (choice == 2) {

            vehicle = new Bike();
            vehicle.go();
        } else {

            System.out.println("Invalid choice!");
        }
        scanner.close(); // do not forget to close the scanner.
    }
}*/

// ===================================================================================================================================

// abstract classes and methods.
// when a class is declared abstract, it cannot be instantiated. It has to be inherited by its child class.
// abstract method inside of an abstract class should be overridden by the child class and then be used.
// it is necessary to prevent users from instantiating a huge class that has the blueprint of all the other classes.
// to put it in simple words, imagine you go to a vehicle store where all kinds of vehicles are sold.
// you need to specify what kind of vehicle you need to purchase.
// you cannot say "i wanna purchase a vehicle in genera", or the dealer might think you are crazy.

// to create an abstract class, use abstract keyword:
/* 
abstract class Vehicle {

    abstract void purchase(); // do not create a body
}

class Car extends Vehicle {

    void purchase() { // purchase method should be overridden

        System.out.println("You purchased a car");
    }
}

// lets call the purchase method.

public class notes2 {

    public static void main(String[] args) {

        // Vehicle vehicle = new Vehicle(); // this is not allowed as Vehicle is an abstract class
        Car car = new Car();
        car.purchase();
    }
}
*/

// ===================================================================================================================================

// interfaces in java
// interfaces are like defining the blueprint of a class stating that what a class should exactly do.
// interfaces contain empty methods that should be overridden in the class that impletements the interface.
// basically telling the class what it is supposed to do.
// to create an interface, `interface` keyword is used.
// a class can implement multiple interfaces unlike inheritance.
/* 
interface Vehicle {

    // do not add curly braces {} after declaring the method. End it with semicolon (;) instead
    void go(); // this method should be overridden in the class that implements this interface
}

class Car implements Vehicle { // implements keyword is used to implement Vehicle class 

    // method inside of an interface is always public. Hence public keyword should be prefixed to match the accessiblity
    @Override
    public void go() { // override the go method

        System.out.println("Car goes vrooommmm!"); 
    }
}

class Bike implements Vehicle { // implements keyword is used to implement Vehicle class 

    // method inside of an interface is always public. Hence public keyword should be prefixed to match the accessiblity
    @Override
    public void go() { // override the go method

        System.out.println("Bike goes brrrrrr!"); 
    }
}

// instantiate and use these classes
public class notes2 {

    public static void main(String[] args) {

        Car car = new Car();
        Bike bike = new Bike();

        car.go();
        bike.go();
    }
}
*/
// ======================================== THANK YOU ==================================================================================================================
