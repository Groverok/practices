package abstractt;

class Client extends Person {
    private String bank;

    public Client(String name, String surname, String company) {

        super(name, surname);
        this.bank = company;
    }

    public void displayInfo() {

        System.out.println("Имя: " + super.getName() + " Фамилия: "
                + super.getSurname() + " Клиент банка: " + bank); // тут берет имя фамилию у абстрактного класса !!
    }
}