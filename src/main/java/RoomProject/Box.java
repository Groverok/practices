package RoomProject;

class Box implements Capacity {
    public double width;
    public double height;
    public double length;

    @Override
    public double getCapacity() {
        return width * height * length;
    }
}