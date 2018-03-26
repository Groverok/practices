package abstractt;

class Employee extends Person {

    private String bank; // объявили 3 параметр

    public Employee(String name, String surname, String company) {

        super(name, surname);
        this.bank = company;
    }

    public void displayInfo() {

        System.out.println("Имя: " + super.getName() + " Фамилия: "
                + super.getSurname() + " Работает в банке: " + bank);
    }
}