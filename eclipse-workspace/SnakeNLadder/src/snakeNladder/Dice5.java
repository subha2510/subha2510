package snakeNladder;
import java.util.Random;
public class Dice5 {

	public static void main(String[] args) {
		int Position;
		for(Position = 0; Position <= 100; Position++)
		{
			Random rand = new Random();
			int dice = rand.nextInt((6)+1);
					Position = Position + dice;
					System.out.println("Roll dice:" + dice);
		}
		while(Position > 100)
		{
			Position--;
		}
		System.out.println("Winpoint: " + Position);

	}

}
