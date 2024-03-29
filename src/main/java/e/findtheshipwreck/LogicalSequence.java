package e.findtheshipwreck;

public class LogicalSequence extends Platform {

    int localInfoForOperation[] = new int[5];
    Integer localInfoForAdvanced[] = new Integer[sum];
    int newloc;

    public int operation(int shipNO) {

        boolean terminator = false;

        while (terminator == false) {

            int re = minLocation + (int) (Math.random() * ((maxLocation - minLocation) + 1));

            if (!isOccupied(re)) {
                localInfoForOperation[shipNO - 1] = re;
                return re;
            }

        }
        return 0;
    }

    int ran, count = 0;

    int label = getShip1();

    public int advanced(int loc, int shipNo) {

        if (label != shipNo) {
            label = shipNo;

            boolean terminator = false;
            boolean miniTerm = false;
            while (terminator == false) {

                ran = (int) (Math.random() * ((4 - 1) + 1));

                if (ran == 0) {

                    newloc = loc+1;

                    if (0 <= (newloc + (1 * label)) && (newloc + (1 * label)) < 63) {

                        if ((0 <= (newloc + (1 * label)) && (newloc + (1 * label)) <= 7) || (7 < (newloc + (1 * label))
                                && (newloc + (1 * label)) <= 15) || (15 < (newloc + (1 * label)) && (newloc + (1 * label)) <= 23)
                                || (23 < (newloc + (1 * label)) && (newloc + (1 * label)) <= 31) || (31 < (newloc + (1 * label))
                                && (newloc + (1 * label)) <= 39) || (39 < (newloc + (1 * label)) && (newloc + (1 * label)) <= 47)
                                || (47 < (newloc + (1 * label)) && (newloc + (1 * label)) <= 55) || (55 < (newloc + (1 * label))
                                && (newloc + (1 * label)) <= 63)) {

                            if (!isOccupied(newloc)) {

                                for (int i = 1; i <= label; i++) {

                                    if (isOccupied(newloc + (1 * i))) {

                                        break;
                                    }
                                    if (i == label) {
                                        miniTerm = true;
                                    }

                                }
                                if (miniTerm == true) {
                                    for (int i = 0; i < sum; i++) {
                                        if (localInfoForAdvanced[i] == null) {
                                            localInfoForAdvanced[i] = newloc;
                                            return newloc;
                                        }

                                    }

                                }

                            }

                        }

                    }

                } else if (ran == 1) {
                    newloc = loc-1;
                    if (0 <= (newloc - (1 * label)) && (newloc - (1 * label)) < 64) {
                        if ((0 <= (newloc - (1 * label)) && (newloc - (1 * label)) <= 7) || (7 < (newloc - (1 * label))
                                && (newloc - (1 * label)) <= 15) || (15 < (newloc - (1 * label)) && (newloc - (1 * label)) <= 23)
                                || (23 < (newloc - (1 * label)) && (newloc - (1 * label)) <= 31) || (31 < (newloc - (1 * label))
                                && (newloc - (1 * label)) <= 39) || (39 < (newloc - (1 * label)) && (newloc - (1 * label)) <= 47)
                                || (47 < (newloc - (1 * label)) && (newloc - (1 * label)) <= 55) || (55 < (newloc - (1 * label))
                                && (newloc - (1 * label)) <= 63)) {
                            if (!isOccupied(newloc)) {
                                for (int i = 1; i <= label; i++) {

                                    if (isOccupied(newloc - (1 * i))) {
                                        break;
                                    }
                                    if (i == label) {
                                        if (i == label) {
                                            miniTerm = true;
                                        }

                                    }

                                }
                                if (miniTerm == true) {
                                    for (int i = 0; i < sum; i++) {
                                        if (localInfoForAdvanced[i] == null) {
                                            localInfoForAdvanced[i] = newloc;
                                            return newloc;

                                        }

                                    }

                                }
                            }
                        }
                    } else if (ran == 2) {
                        newloc = loc + 8;
                        if (0 < (newloc + (8 * label)) && (newloc + (8 * label)) < 64) {
                            if (!isOccupied(newloc)) {
                                for (int i = 1; i <= label; i++) {

                                    if (isOccupied(newloc + (8 * i))) {
                                        break;
                                    }
                                    if (i == label) {
                                        miniTerm = true;
                                    }

                                }
                                if (miniTerm == true) {
                                    for (int i = 0; i < sum; i++) {
                                        if (localInfoForAdvanced[i] == null) {
                                            localInfoForAdvanced[i] = newloc;
                                            return newloc;
                                        }

                                    }

                                }
                            }
                        }

                    }
                } else {
                    newloc = loc - 8;
                    if (0 <= (newloc - (8 * label)) && (newloc - (8 * label)) < 64) {

                        if (!isOccupied(newloc)) {
                            for (int i = 1; i <= label; i++) {

                                if (isOccupied(newloc - (8 * i))) {
                                    break;
                                }
                                if (i == label) {
                                    miniTerm = true;
                                }

                            }
                            if (miniTerm == true) {
                                for (int i = 0; i < sum; i++) {
                                    if (localInfoForAdvanced[i] == null) {
                                        localInfoForAdvanced[i] = newloc;
                                        return newloc;
                                    }

                                }

                            }

//                                if (!isOccupied(newloc - (8 * i))) {
//                                    return newloc;
//
//                                }
                        }
                    }
                }
            }
        } else {

            if (ran == 0) {

                for (int i = 0; i < sum; i++) {

                    if (localInfoForAdvanced[i] == null) {
                        localInfoForAdvanced[i] = loc + 1;
                        break;
                    }
                }
                return loc + 1;

            } else if (ran == 1) {
                for (int i = 0; i < sum; i++) {

                    if (localInfoForAdvanced[i] == null) {
                        localInfoForAdvanced[i] = loc - 1;
                        break;
                    }
                }
                return loc - 1;

            } else if (ran == 2) {
                for (int i = 0; i < sum; i++) {

                    if (localInfoForAdvanced[i] == null) {
                        localInfoForAdvanced[i] = loc + 8;
                        break;
                    }
                }
                return loc + 8;

            } else {
                for (int i = 0; i < sum; i++) {

                    if (localInfoForAdvanced[i] == null) {
                        localInfoForAdvanced[i] = loc - 8;
                        break;
                    }
                }
                return loc - 8;
            }

        }
        return loc;
    }

    private boolean isOccupied(int givenLocation) {

        for (int i = 0; i < 5; i++) {

            if (localInfoForOperation[i] == givenLocation) {
                return true;
            }
        }
        for (int i = 0; i < sum; i++) {

            if (localInfoForAdvanced[i] == null) {
                break;
            }
            if (localInfoForAdvanced[i] == givenLocation) {
                return true;
            }

        }
        return false;
    }

    public void printLoc() {
        for (int i = 0; i < 5; i++) {
            System.out.println(localInfoForOperation[i]);
        }
        for (int i = 0; i < sum; i++) {
            System.out.println(localInfoForAdvanced[i]);
        }

    }

}
