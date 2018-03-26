package InterfaceInJava;

//Class file Implemented with Interface file using implements keyword.
public class Mechanical implements College{

    @Override
    public void StudentDetails() {
        System.out.println("Mechanical Dept. Student Detail Part");
    }

    @Override
    public void StudentResult() {
        System.out.println("Mechanical Dept. Student Result Part");
    }
}
