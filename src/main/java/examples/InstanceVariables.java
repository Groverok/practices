package examples;

public class InstanceVariables {

    public String name;     // Переменная экземпляра открыта для любого дочернего класса.
    private double salary;  // Переменная salary видна только в Employee.


    public InstanceVariables(String empName) { // Имя переменной присваивается в конструкторе.
        name = empName;
    }

    public void setSalary(double empSal) { // Переменной salary присваивается значение.
        salary = empSal;
    }

    // Этот метод выводит на экран данные сотрудников.
    public void printEmp() {
        System.out.println("имя: " + name);
        System.out.println("зарплата:" + salary);
    }

    public static void main(String args[]) {
        InstanceVariables empOne = new InstanceVariables("Олег");
        empOne.setSalary(1000);
        empOne.printEmp();
    }
}