package ab05;

public class Aufgabe11 {
    public static void main(String[] args) {
        Cinema c = new Cinema(200);
        c.addVisitors(1, 170);
        c.addVisitors(4, 170);
        c.addVisitors(7, 170);
        c.addVisitors(4, 90);
        System.out.println(c.getSumVisitor());
    }
}

class CinemaHall {
    int visitors;
    int cap;

    public CinemaHall(int cap) {
        this.cap = cap;
        this.visitors = 0;
    }

    public int addVisitor(int amount) {
        int capLeft = cap - visitors;
        int visitorsToAdd = (visitors+amount < cap) ? amount : capLeft;
        this.visitors += visitorsToAdd;
        return amount - visitorsToAdd;
    }

    public int getVisitors() {
        return visitors;
    }

    public void setVisitors(int visitors) {
        this.visitors = visitors;
    }
}

class Cinema {

    CinemaHall[] halls = new CinemaHall[8];
    int hallCap;

    public Cinema(int hallCap) {
        this.hallCap = hallCap;
        for (int i = 0; i < halls.length; i++) {
            halls[i] = new CinemaHall(hallCap);
        }
    }

    public int getSumVisitor() {
        int sumVisitors = 0;
        for(CinemaHall h : halls) {
            sumVisitors += h.getVisitors();
        }
        return sumVisitors;
    }

    public int addVisitors(int hall, int amount) throws IllegalArgumentException {
        try {
            return halls[hall].addVisitor(amount);
        } catch(ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Hall does not exist");
        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return -1;
        }
    }

}
