package InterfaceInJava;

//Class file Implemented with Interface file using implements keyword.
public class Computer implements College {

    //@Override annotation describes that methods are overridden on interface method.
    //Methods name, return type are same as methods of an Interface. !!
    @Override
    public void StudentDetails() {
        System.out.println("Computer Dept. Student Detail Part");
    }

    @Override
    public void StudentResult() {
        System.out.println("Computer Dept. Student Result Part");
    }
}
