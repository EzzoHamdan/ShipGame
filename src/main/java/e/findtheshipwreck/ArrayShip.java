package e.findtheshipwreck;

public class ArrayShip extends LinkedShip {

    Integer location[];
    int total = 0;

    public ArrayShip() {

        this.location = new Integer[64];

        this.fill();

    }

    private void fill() {

        for (int i = 0; i <= 63; i++) {

            location[i] = i;

        }

    }

    private boolean search(int loc) {

        if (loc > 63 || loc < 0) {
            System.out.println("The range of numbers is from [0-63]... ");

        } else {
            for (int i = 0; i <= 63; i++) {
                if (location[i] == loc) {
                    return false;
                }

            }
        }
        return true;
    }

    public void remove(int loc) {

        if (loc > 63 || loc < 0) {
            System.out.println("The range of numbers is from [0-63]... ");
        } else if (search(loc)) {
            System.out.println("The number has been given before... ");
        } else {

            if (getNumber(loc)) {
                location[loc] = -1;
                total++;
                delete(loc);
 
            } else {
                location[loc] = -9;
                total++;
            }

        }

    }

    public void displayBoard() {

        for (int i = 0; i <= 63; i++) {

            if (i == 7 || i == 15 || i == 23 || i == 31 || i == 39 || i == 47 || i == 55 || i == 63) {
                System.out.println(" [ " + location[i] + " ] ");
            } else {
                System.out.print(" [ " + location[i] + " ] ");
            }
        }
    }

    public boolean endGame() {

        if (isEmpty()) {
            System.out.println("Congratulations, you have managed to find all shipwrecks in total of " + total + " attempts!");
            return true;
        } else {
            return false;
        }
    }
}
