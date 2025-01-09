package assignment2.OOPpart1;

public class task4 {
    public class Entity {
        public void move() {
            System.out.println("I'm moving.");
        }
    
        public void eat() {
            System.out.println("I'm eating.");
        }
    }
    
    public class Human extends Entity {
        public void speak() {
            System.out.println("I can communicate.");
        }
    }   
    
    public class JavaDeveloper extends Human {
        public void code() {
            System.out.println("I know how to communicate in Java.");
        }
    }
}
