package e.findtheshipwreck;

public class LinkedShip extends LogicalSequence {

    Node firstNode;

    public LinkedShip() {
        firstNode = null;

    }

    protected boolean getNumber(int loc) {

        Node temp = firstNode;

        while (temp != null) {

            if (temp.location.equals(loc)) {
                return true;

            }

            temp = temp.next;
        }

        return false;

    }

    private void placeNode(int shipNo, int location) {

        Node newNode = new Node(shipNo, location);

        if (isEmpty()) {
            firstNode = newNode;
        } else {
            newNode.next = firstNode;
            firstNode = newNode;
        }

    }

    public void placeShip() {

        for (int i = 0; i <= sum; i++) {

            switch (i) {
                case 1:
                    ship1Loc = operation(getShip1());
                    placeNode(getShip1(), ship1Loc);
                    break;
                case 2:
                case 3:
                    if (ship2Loc != 0) {

                        ship2Loc = advanced(ship2Loc, getShip2());

                        placeNode(getShip2(), ship2Loc);

                    } else {

                        ship2Loc = operation(getShip2());

                        placeNode(getShip2(), ship2Loc);
                    }
                    break;
                case 4:
                case 5:
                case 6:
                    if (ship3Loc != 0) {

                        ship3Loc = advanced(ship3Loc, getShip3());

                        placeNode(getShip3(), ship3Loc);

                    } else {

                        ship3Loc = operation(getShip3());

                        placeNode(getShip3(), ship3Loc);
                    }
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                    if (ship4Loc != 0) {

                        ship4Loc = advanced(ship4Loc, getShip4());

                        placeNode(getShip4(), ship4Loc);

                    } else {

                        ship4Loc = operation(getShip4());

                        placeNode(getShip4(), ship4Loc);
                    }
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    if (ship5Loc != 0) {

                        ship5Loc = advanced(ship5Loc, getShip5());

                        placeNode(getShip5(), ship5Loc);

                    } else {

                        ship5Loc = operation(getShip5());

                        placeNode(getShip5(), ship5Loc);
                    }
                    break;
                default:
                    break;
            }

        }

    }

    public void print() {

        Node temp;

        temp = firstNode;
        int i = 1;
        while (temp != null) {
            System.out.println("Node no." + i + " : Ship no." + temp.shipNO + " in Location: " + temp.location);
            temp = temp.next;
            i++;
        }

    }

    public boolean isEmpty() {
        if (firstNode == null) {
            return true;
        } else {
            return false;
        }
    }

    public void delete(int given) {

        Node temp = firstNode;
        if (firstNode.next == null) {
            firstNode = null;
        } else if (temp.location == given) {
            firstNode = temp.next;

        } else {

            while (temp != null) {

                if (temp.next == null) {

                    deleteFromEnd(given);
                    break;

                } else if (temp.next.location == given) {

                    temp.next = temp.next.next;
                    break;

                }

                temp = temp.next;

            }
        }
    }

    public void deleteFromEnd(int given) {

        Node temp = firstNode;
        while (temp.next.next != null) {

            temp = temp.next;
        }

        temp.next = null;

    }

}
