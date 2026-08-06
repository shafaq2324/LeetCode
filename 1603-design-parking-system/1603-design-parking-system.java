class ParkingSystem {

    private int[] count;
    public ParkingSystem(int big, int medium, int small) {
        count = new int[]{0, big, medium, small};
        // constructor initializes slots available for every car and null for 0th index
    }
    
    public boolean addCar(int carType) {
        if(count[carType] > 0){
            count[carType]--;
            return true;
            // if slot is available return true and reduce the car slot by 1
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */