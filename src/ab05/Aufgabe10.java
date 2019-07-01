package ab05;

public class Aufgabe10 {
    public static void main(String[] args) {
        WaterWork waterWork = new WaterWork(15);
        waterWork.addWater(5, 315);
        waterWork.addWater(6, 315);
        waterWork.addWater(7, 315);
        waterWork.addWater(5, 300);
        System.out.println(waterWork.getTotalWaterLevel());
    }
}

class WaterWork {
    private WaterTank[] tanks;

    /**
     * Constructor
     * Initializes the water tanks
     * @param amt the amount of water tanks
     */
    public WaterWork(int amt) {
        tanks = new WaterTank[amt];
        for (int i = 0; i < amt; i++) {
            tanks[i] = new WaterTank(500);
        }
    }

    /**
     * get combined water level of all tanks
     * @return water level of all tanks in liters
     */
    public double getTotalWaterLevel() {
        double level = 0;
        for(WaterTank t : tanks) {
            level += t.getWaterLevel();
        }
        return level;
    }

    /**
     * add water to a specific tank
     * @param tank the id of the tank
     * @param liters the amount of water to add
     * @return overflow
     * @throws IllegalArgumentException when tank number does not exist
     */
    public double addWater(int tank, double liters) throws IllegalArgumentException {
        try {
            return tanks[tank].addWater(liters);
        } catch(ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Tank does not exist");
        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return 0;
        }
    }
}

class WaterTank {
    private double cap;
    private double maxCap;

    /**
     * Constructor
     * @param maxCap maximum capacity
     */
    public WaterTank(double maxCap) {
        cap = 0;
        this.maxCap = maxCap;
    }

    /**
     * add water to the tank
     * @param liters the amount of water to add
     * @return the amount of water not added
     */
    public double addWater(double liters) {
        double capLeft = maxCap - cap;
        if(liters <= capLeft) {
            cap += liters;
            return 0.0;
        } else {
            cap = maxCap;
            return liters - capLeft;
        }
    }

    /**
     * get current water level
     * @return water level in liters
     */
    public double getWaterLevel() {
        return cap;
    }
}
