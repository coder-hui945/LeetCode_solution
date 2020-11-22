package solution1603;

class ParkingSystem {
    int[] place = new int[3];

    public ParkingSystem(int big, int medium, int small) {
        place[0] = big;
        place[1] = medium;
        place[2] = small;
    }
    
    public boolean addCar(int carType) {
        if(place[carType-1] > 0){
            place[carType-1] --;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */