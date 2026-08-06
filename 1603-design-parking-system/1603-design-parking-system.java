class ParkingSystem {

    int big, medium, small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1){
            return (big > 0) ? (big-- > 0) : false;
            // if big car has slot available then return true after comparing and reducing the value otherwise return false
        }
        if(carType == 2){
            return (medium > 0) ? (medium-- > 0) : false;
        }
        if(carType == 3){
            return (small > 0) ? (small-- > 0) : false;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */