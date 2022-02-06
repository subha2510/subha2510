package snakeNladder;
import java.util.Random;
public class Dice2 {

	public static void main(String[] args) {
int playerposition = 0;
    	
    	System.out.println("Welcome to Snake N ladder Program");
    	System.out.println("PlayerPosition: " + playerposition);
    	
    	Random rand = new Random();
		int dice = rand.nextInt((6)+1);
		System.out.println("Roll Dice: " + dice);
		
		if(dice == 1)
		{
			System.out.println("PlayerPosition: " + dice);
		}
		else
			System.out.println("Roll Dice Again");	

	}

}
