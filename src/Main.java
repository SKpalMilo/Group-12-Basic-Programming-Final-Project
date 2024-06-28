import java.util.Random;
import java.util.Scanner;

public class Main
{
	public static boolean finish=false;

	public static SnakeandLadder game;

	public static void main(String[] args)
	{
		System.out.println("Welcome to our Snake&Ladder Game!");
		System.out.println("How many player will be playing ? (max 6)");
		Scanner read=new Scanner(System.in);
		
		int n=read.nextInt();
		
		System.out.println("Which player will be starting? (1,2,3,4,5,6)");
		
		read.nextLine();
		
		int start=read.nextInt();
		
		System.out.println("Play with the standard board? (yes:1/no:0)");

		boolean stand;
		int res=read.nextInt();
		if(res==1)
		{
			stand=true;
		}
		else
		{
			stand=false;
		}
		
		game=new SnakeandLadder(n,start,stand);

		//If you want to print the table of the game
        	game.printTheTab();

		while(finish==false)
		{
			//If you would like to see the evolution of the game, turn by turn
            		System.out.println("Would you like to continue?");
            		read.nextLine();
            		game.nextTurn();
    
            		game.printTheTab();
    
			if(game.GetP1().GetX()==0 && game.GetP1().GetY()==0)
			{
				finish=true;
				System.out.println("Player 1 win this Game! Congratulations!");
				break;
			}

			else if(game.GetP2().GetX()==0 && game.GetP2().GetY()==0)
			{
				finish=true;
				System.out.println("Player 2 win this Game! Congratulations!");
				break;
			}
				
			else if(game.GetP3().GetX()==0 && game.GetP3().GetY()==0)
			{
				finish=true;
				System.out.println("Player 3 win this Game! Congratulations!");
				break;
			}

			else if(game.GetP4().GetX()==0 && game.GetP4().GetY()==0)
			{
				finish=true;
				System.out.println("Player 4 win this Game! Congratulations!");
				break;
			}
	
			else if(game.GetP5().GetX()==0 && game.GetP5().GetY()==0)
			{
				finish=true;
				System.out.println("Player 5 win this Game! Congratulations!");
				break;
			}
			
			else if(game.GetP6().GetX()==0 && game.GetP6().GetY()==0)
			{
				finish=true;
				System.out.println("Player 6 win this Game! Congratulations!");
				break;
			}


		}
        	System.out.println("Thanks for playing !");
        	read.close();
	}
}
