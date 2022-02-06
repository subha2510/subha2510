package snakeNladder;
import java.util.Random;
public class Dice4 {
	public static final int NoPlay = 0;
	public static final int ladder = 1;
	public static final int snake = 2;
	public static final int other = 3;
	public static void main(String[] args) {
		int Position;
		for(Position = 0; Position < 100; Position++)
		{
			Random rand = new Random();
			int dice = rand.nextInt((6)+1);
					Position = Position + dice;
					System.out.println("Roll dice:" + dice);
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
					}// TODO Auto-generated method stub
		}
		System.out.println("Winpoint: " + Position);
	}

}
