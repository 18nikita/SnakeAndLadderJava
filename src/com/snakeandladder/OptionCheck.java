package com.snakeandladder;

public class OptionCheck {

	public static void main(String[] args) {
		// UC-3-Player checks for option. They are NoPlay,Snake,Ladder
		
		int option=(int) (Math.random()*4);
		
		switch(option) {
		case 1 :
			System.out.println("No play: Player in same position");
			break;
		case 2 :
			System.out.println("Ladder: Player moves ahead");
			break;
		case 3 :
			System.out.println("Snake: Player moves behind");
			break;
		}
	}
}
