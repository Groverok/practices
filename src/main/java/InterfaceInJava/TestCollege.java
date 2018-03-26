package InterfaceInJava;

public class TestCollege {      //Class file. No need to implement Interface.

    public static void main(String[] args) {
        //Can access Interface variable directly using Interface name.
        System.out.println(College.Collegename + " Collage student details.");

        //Created Computer class object with reference of interface College.
        College compDept = new Computer(); // обьект комп типа коледж интерфейс !!
        //Methods will be called from Computer class.
        compDept.StudentDetails();
        compDept.StudentResult();

        //Created Mechanical class object with reference of interface College.
        College mecDept = new Mechanical();
        //Methods will be called from Mechanical class.
        mecDept.StudentDetails();
        mecDept.StudentResult();
    }
}