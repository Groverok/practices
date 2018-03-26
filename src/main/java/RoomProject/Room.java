package RoomProject;

class Room extends Base {
    public Capacity inner;

    @Override  // это из интерфейса
    public double getCapacity() {
        return super.getCapacity() - inner.getCapacity();
    }
}