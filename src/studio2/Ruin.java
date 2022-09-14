package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner game = new Scanner (System.in);
	System.out.println ("What is start amount? ");
	double startAmount = game.nextDouble();
	System.out.println ("What is the win chance? ");
	double winChance = game.nextDouble();
	System.out.println ("What is the win limit? ");
	double winLimit = game.nextDouble();
	double currentAmount = startAmount;
	double simulator = Math.random();
	System.out.println("How many simulations? ");
	double numberofSim = game.nextDouble();
	double losses = 0;
	double ruinRate = 
	
	for (int i = 0; i<=numberofSim ;i++ )
	{
	int counterPlays = 0; 
	while (currentAmount > 0 && winLimit > currentAmount)
	{
		//System.out.println("Simulation " );
	}
	if (simulator < winChance)
	{
		currentAmount++;
		//ystem.out.println("Win");
	}
	else 
	{
		currentAmount--;
		//System.out.println("Lose");
	}
	System.out.println("Simulation " + counterPlays + ": ");
	counterPlays++;
	}
	if (currentAmount == winLimit)
	{
	System.out.println("WIN");
	}
	else 
	{
	System.out.println("LOSE");
	losses ++;
	}
	
}
}