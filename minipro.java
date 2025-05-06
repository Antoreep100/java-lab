class Parent {
    // Method of parent class (default)
    void Print() {
        System.out.println("Parent: no parameters");
    }

    // Overloaded method in parent
    void Print(String message) {
        System.out.println("Parent: " + message);
    }
}

class Subclass1 extends Parent {
    // Overriding the no-arg method
    @Override
    void Print() {
        System.out.println("Subclass1: no parameters");
    }

    // Overloading: different parameter
    void Print(int number) {
        System.out.println("Subclass1: number = " + number);
    }
}

class Subclass2 extends Parent {
    // Overriding the no-arg method
    @Override
    void Print() {
        System.out.println("Subclass2: no parameters");
    }

    // Overloading: different parameter
    void Print(double value) {
        System.out.println("Subclass2: value = " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        Parent a;

        // Using Parent class methods
        a = new Parent();
        a.Print();                    // calls Parent's Print()
        a.Print("Hello!");           // calls Parent's overloaded Print(String)

        // Using Subclass1
        a = new Subclass1();
        a.Print();                    // overridden method in Subclass1

        // Need to cast to access overloaded Print(int) in Subclass1
        ((Subclass1) a).Print(100);  // overloading in Subclass1

        // Using Subclass2
        a = new Subclass2();
        a.Print();                    // overridden method in Subclass2

        // Need to cast to access overloaded Print(double) in Subclass2
        ((Subclass2) a).Print(3.14); // overloading in Subclass2
    }
}
