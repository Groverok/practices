package examples;

public class ConstructorParameterized {
    int id;
    String name;

    // parameterized Constructor
    ConstructorParameterized(int i, String n) {  //Constructor with parameter is called Parameterized constructor.
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        ConstructorParameterized c1 = new ConstructorParameterized(1, "New York");
        ConstructorParameterized c2 = new ConstructorParameterized(2, "London");
        c1.display();
        c2.display();
    }
}