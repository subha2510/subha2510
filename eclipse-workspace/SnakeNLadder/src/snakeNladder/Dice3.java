package snakeNladder;
import java.util.Random;
public class Dice3 {
	public static final int NoPlay = 0;
	public static final int ladder = 1;
	public static final int snake = 2;
	public static final int other = 3;
	public static void main(String[] args) {
		int PlayerPosition = 0;
		int Position = 0;
		System.out.println("Welcome to Snake N Ladder Program");
		System.out.println("PlayerPosition:" + PlayerPosition);
		Random rand = new Random();
		int dice = rand.nextInt((6)+1);
		System.out.println("Roll Dice: " + dice);
		switch (dice) {
		case  NoPlay:
			System.out.println("Player stays in same Position");
			break;
		case ladder:
			System.out.println("Player move ahead with the ladder");
			break;
		case snake:
			System.out.println("Player moves behind the number");
			break;
		case other:
		System.out.println("Next turn");
		break;
		default:
				System.out.println("Play next time");
		}

	}

}
