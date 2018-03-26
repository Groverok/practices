package Constructor;

public class Constr {
    public static void main(String[] args) {
        //Two different objects created with value.
        Constr stdn1 = new Constr("Michael");
        Constr stdn2 = new Constr("Robert");
    }

    //Constructor with parameter to pass values of object
    //Name of constructor Is same as class name.
    public Constr(String name) {
        String stdnname = name;
        System.out.println("Student's Name Is " + stdnname);
    }
}
//Name of the constructor must be same as class name in java software development language.
//Means If your class name Is Student then constructor name must be Student.
//Constructor must have not any return types.