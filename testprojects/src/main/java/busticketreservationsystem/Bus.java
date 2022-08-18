package busticketreservationsystem;

public class Bus {

    private int busNo;
    private boolean ac;
    private int capacity; // get and set methods

    Bus(int busNo, boolean ac, int capacity) {
        this.busNo = busNo;
        this.ac = ac;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void displayBusInfo(){
        System.out.println("Bus No: " +busNo+ " Ac: " +ac+ " Total Capacity: " +capacity);
    }



}
