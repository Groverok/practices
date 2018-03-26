package RoomProject;

public class Test {
    //https://ru.wikibooks.org/wiki/Java/%D0%9E%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D1%8B%D0%B5_%D0%BF%D0%BE%D0%BD%D1%8F%D1%82%D0%B8%D1%8F

    public static void main(String[] args) {
        Box box1 = new Box();
        box1.width = 1.0;
        box1.height = 2.0;
        box1.length = 3.0;

        Room workRoom = new Room();
        workRoom.width = 10.0;
        workRoom.height = 20.0;
        workRoom.length = 30.0;
        workRoom.inner = box1;

        System.out.println("Объем ящика : " + box1.getCapacity());
        System.out.println("Объем комнаты : " + workRoom.getCapacity());
    }
}
