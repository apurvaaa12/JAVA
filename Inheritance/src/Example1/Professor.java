package Example1;

import Example1.Person;

public class Professor extends Person {

    public Professor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void print(){
        super.print();
        System.out.println("Welcome");
    }
}
