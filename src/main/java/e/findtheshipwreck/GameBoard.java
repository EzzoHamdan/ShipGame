package e.findtheshipwreck;

import java.util.Scanner;

public class GameBoard {

    public static void main(String[] args) {
        
        ArrayShip newGame = new ArrayShip();

        Scanner input = new Scanner(System.in);
        boolean once = true;
        newGame.placeShip();
        
        
        while (!newGame.endGame()) {
            
            newGame.displayBoard();
            while (once) {
                System.out.println("You are now standing on the edge and looking towards a vast sea that drowned a lot of ships.");
                System.out.println("Your mission is to find the sunken ships at the lowest costs.");
                System.out.println("The sea is now divided into 64 inspection areas. good luck");
                once = false;
            }
            System.out.println("-1 means there is a shipwreck, -9 means there is not... ");
            System.out.println("From [0-63], choose wisely: ");

            int choice = input.nextInt();
            //input.nextLine();

            newGame.remove(choice);

        }

    }

}
