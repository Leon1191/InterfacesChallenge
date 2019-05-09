import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Create a simple interface (tip: name it Saveable or ISaveable)
//        That interface allows an object to be saved to some sort of storage medium. (tip: use arraylist)
//        The exact type of medium is not known to the interface (nor to the classes that implement it).
//        The interface will just specify two methods, one to return an ArrayList of values to be saved
//        and the other to populate the object's fields from an ArrayList (parameter).
//
//        Create a few sample classes that implement your Saveable interface (we've used the idea of a game,
//        with Players and Monsters, but you can create any type of classes that you want).
//
//        Override the toString() method for each of your classes so that they can be easily printed to enable
//        the program to be tested easier.
//
//        In Main, write a method that takes an object that implements the interface as a parameter and
//        "saves" the values e.g. calls the method defined in the interface.

//        We haven't covered I/0 yet, so your method should just print the values to the screen.
//        Also in the Main class, write a method that restores the values to a Saveable object
//        e.g. calls the method from the interface for populating fields (see above).

//        Again, we are not going to use Java file I/0; instead use the readValues() method below to
//        simulate getting values from a file - this allows you to type as many values as your class
//        requires, and returns an ArrayList.
//        There is a whole Java I/0 section later in the course where you will get to use files, etc.


        ISaveable leo = new Player("Leo", 100, 5.5,7);
        System.out.println(leo.toString());
        save(leo);
//        load(leo);
//        System.out.println(leo.toString());
        ISaveable zombie = new Monster("Zombie", 50,2.2);
        System.out.println(zombie.toString());
        save(zombie);
//        load(zombie);
//        System.out.println(zombie.toString());
    }
   static void save(ISaveable person){
        for (int i = 0; i < person.save().size(); i++){
            System.out.println("Save " + person.save().get(i));
        }
    }
   static ArrayList<String> addValues(){
        ArrayList<String> values = new ArrayList<String>();
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while(flag){
            System.out.println("1 - write value\n2 - exit");
           int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Write value");
                    values.add(scanner.nextLine());
                    break;
                case 2: flag = false;
                    break;
            }
        }
        return values;
    }
    static void load(ISaveable person){
        person.load(addValues());
    }
}
