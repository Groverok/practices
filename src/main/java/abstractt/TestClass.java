package abstractt;

public class TestClass {
    public static void main(String[] args) {

        Employee employee = new Employee("Sergey", "Zh", "Mastercard");
        employee.displayInfo();

        Client client = new Client("Ann", "Zhil", "Ubs");
        client.displayInfo(); // унаследован от абстрактного

    //смысл абстрактных классов = чтобы их реализовать в твоём классе, унаследованном от абстрактного.
    }
}
