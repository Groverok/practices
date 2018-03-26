package RoomProject;

class Base implements Capacity {
    public double width;
    public double height;
    public double length;

    @Override
    public double getCapacity() {
        return width * height * length;
    }
}