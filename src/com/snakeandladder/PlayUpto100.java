package com.snakeandladder;

public class PlayUpto100 {

	public static void main(String[] args) {
		// UC-4-PlayUpto100
		
		//Startposition
		int startposition=0;
		System.out.println("Starting position of player is :"+""+startposition);
		
		//Constants

        int NO_PLAY = 0;
        int is_Ladder = 1;
        int is_Snake = 2;
        
        //variables
        int position = 0;

        while (position < 100) {

            int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("diceNumber is : " + diceNumber);

            int option = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println("selected player option : " + option);

            switch (option) {
                case 1:
                    position = diceNumber + position;
                    System.out.println("position for the player after the ladder is : " + position);
                    break;

                case 2:
                    position = position - diceNumber;
                    if(position < 0) {
                        position = 0;
                    }

                    System.out.println("position for the player after the Snake is : " + position);
                    break;

                default:
                    System.out.println("No play");
			}	
		}
	}
}
