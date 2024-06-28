import java.util.ArrayList;

public class SnakeandLadder
{

	private Player P1;
	private Player P2;
	private Player P3;
	private Player P4;
	private Player P5;
	private Player P6;
	public int num;
	public int starting;
	public ArrayList<Pair> sl=new ArrayList<>();
	

	private int[][] SL = {
	{100,99,98,97,96,95,94,93,92,91},
	{81,82,83,84,85,86,87,88,89,90},
	{80,79,78,77,76,75,74,73,72,71},
	{61,62,63,64,65,66,67,68,69,70},
	{60,59,58,57,56,55,54,53,52,51},
	{41,42,43,44,45,46,47,48,49,50},
	{40,39,38,37,36,35,34,33,32,31},
	{21,22,23,24,25,26,27,28,29,30},
	{20,19,18,17,16,15,14,13,12,11},
	{1,2,3,4,5,6,7,8,9,10}
	}; 	

	public SnakeandLadder(int n,int start,boolean standard)
	{
		num=n;
		starting=start;
		P1=new Player("P1");
		P2=new Player("P2");
		P3=new Player("P3");
		P4=new Player("P4");
		P5=new Player("P5");
		P6=new Player("P6");
		if(standard)
		{
			sl.add(new Pair(1,1,0,0));
			sl.add(new Pair(0,3,7,4));
			sl.add(new Pair(0,8,3,9));
			sl.add(new Pair(1,4,0,5));
			sl.add(new Pair(1,5,4,6));
			sl.add(new Pair(2,6,1,7));
			sl.add(new Pair(3,1,6,3));
			sl.add(new Pair(4,7,6,7));
			sl.add(new Pair(5,0,2,1));
			sl.add(new Pair(5,6,9,4));
			sl.add(new Pair(6,2,1,5));
			sl.add(new Pair(6,8,3,7));
			sl.add(new Pair(7,8,9,8));
			sl.add(new Pair(8,0,2,3));
			sl.add(new Pair(9,1,7,2));
			sl.add(new Pair(9,7,6,6));
		}
		else
		{
			int x1;
			int y1;
			int x2;
			int y2;
			for(int i=0;i<18;i++)
			{
				x1=(int)(Math.random()*10+1);
				x2=(int)(Math.random()*10+1);
				y1=(int)(Math.random()*10+1);
				y2=(int)(Math.random()*10+1);
				sl.add(new Pair(x1,y1,x2,y2));
			}
		}
	}
	
	public Player GetP1()
	{
	    return P1;
	}
	
	public Player GetP2()
	{
	    return P2;
	}

	public Player GetP3()
	{
	    return P3;
	}

	public Player GetP4()
	{
	    return P4;
	}

	public Player GetP5()
	{
	    return P5;
	}

	public Player GetP6()
	{
	    return P6;
	}


	public void nextTurn()
	{
		//Player 1 turn
		if(num==1)
		{
			int d1=(int)(Math.random()*6+1);

			//If you want to follow the advencement alongside with the table
			System.out.println("Player1 moves "+d1+" places forward");
			
			P1.Update(d1,sl);
		}

		//Player 2 turn
		else if(num==2)
		{
		    	int d1=(int)(Math.random()*6+1);
			int d2=(int)(Math.random()*6+1);

			//If you want to follow the advencement alongside with the table
			System.out.println("Player2 moves "+d2+" places forward");
			
			//If you want to follow the advencement alongside with the table
			System.out.println("Player1 moves "+d1+" places forward");
			
			P1.Update(d1,sl);
			P2.Update(d2,sl);
		}

		//Player 3 turn
		else if(num==3)
		{
			int d3=(int)(Math.random()*6+1);
            		int d1=(int)(Math.random()*6+1);
			int d2=(int)(Math.random()*6+1);
			
			//If you want to follow the advencement alongside with the table
			System.out.println("Player3 moves "+d3+" places forward");
			
			//If you want to follow the advencement alongside with the table
			System.out.println("Player2 moves "+d2+" places forward");
			
			//If you want to follow the advencement alongside with the table
			System.out.println("Player1 moves "+d1+" places forward");
			
			P3.Update(d3,sl);
			P1.Update(d1,sl);
			P2.Update(d2,sl);
		}

		//Player 4 turn
		else if(num==4)
		{
		    	int d3=(int)(Math.random()*6+1);
            		int d1=(int)(Math.random()*6+1);
			int d2=(int)(Math.random()*6+1);
			
			//If you want to follow the advencement alongside with the table
			System.out.println("Player3 moves "+d3+" places forward");
			
			//If you want to follow the advencement alongside with the table
			System.out.println("Player2 moves "+d2+" places forward");
			
			//If you want to follow the advencement alongside with the table
			System.out.println("Player1 moves "+d1+" places forward");
			
			P3.Update(d3,sl);
			P1.Update(d1,sl);
			P2.Update(d2,sl);
			int d4=(int)(Math.random()*6+1);

			//If you want to follow the advendement alongside with the table
			System.out.println("Player4 moves "+d4+" places forward");
			
			P4.Update(d4,sl);
		}

		//Player 5 turn
		else if(num==5)
		{
		    	int d3=(int)(Math.random()*6+1);
            		int d1=(int)(Math.random()*6+1);
			int d2=(int)(Math.random()*6+1);
			
			//If you want to follow the advencement alongside with the table
			System.out.println("Player3 moves "+d3+" places forward");
			
			//If you want to follow the advencement alongside with the table
			System.out.println("Player2 moves "+d2+" places forward");
			
			//If you want to follow the advencement alongside with the table
			System.out.println("Player1 moves "+d1+" places forward");
			
			P3.Update(d3,sl);
			P1.Update(d1,sl);
			P2.Update(d2,sl);
			int d4=(int)(Math.random()*6+1);

			//If you want to follow the advendement alongside with the table
			System.out.println("Player4 moves "+d4+" places forward");
			
			P4.Update(d4,sl);
			int d5=(int)(Math.random()*6+1);

			//If you want to follow the advendement alongside with the table
			System.out.println("Player5 moves "+d5+" places forward");
			
			P5.Update(d5,sl);
		}

		//Player 6 turn
		else if(num==6)
		{
		    	int d3=(int)(Math.random()*6+1);
            		int d1=(int)(Math.random()*6+1);
			int d2=(int)(Math.random()*6+1);
			
			//If you want to follow the advencement alongside with the table
			System.out.println("Player3 moves "+d3+" places forward");
			
			//If you want to follow the advencement alongside with the table
			System.out.println("Player2 moves "+d2+" places forward");
			
			//If you want to follow the advencement alongside with the table
			System.out.println("Player1 moves "+d1+" places forward");
			
			P3.Update(d3,sl);
			P1.Update(d1,sl);
			P2.Update(d2,sl);
			int d4=(int)(Math.random()*6+1);

			//If you want to follow the advendement alongside with the table
			System.out.println("Player4 moves "+d4+" places forward");
			
			P4.Update(d4,sl);
			int d5=(int)(Math.random()*6+1);

			//If you want to follow the advendement alongside with the table
			System.out.println("Player5 moves "+d5+" places forward");
			
			P5.Update(d5,sl);
			int d6=(int)(Math.random()*6+1);

			//If you want to follow the advendement alongside with the table
			System.out.println("Player6 moves "+d6+" places forward");
			
			P6.Update(d6,sl);
		}
	} 
	
	public void printTheTab()
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("|");
			for(int j=0;j<10;j++)
			{
				if(P1.GetX()==i && P1.GetY()==j)
				{
					System.out.print(" P1 |");
				}
				else if(P2.GetX()==i && P2.GetY()==j)
				{
					System.out.print(" P2 |");
				}
				else if(P3.GetX()==i && P3.GetY()==j)
				{
					System.out.print(" P3 |");
				}
				else if(P4.GetX()==i && P4.GetY()==j)
				{
					System.out.print(" P4 |");
				}
				else if(P5.GetX()==i && P5.GetY()==j)
				{
					System.out.print(" P5 |");
				}
				else if(P6.GetX()==i && P6.GetY()==j)
				{
					System.out.print(" P6 |");
				}
				else
				{
					System.out.print(SL[i][j]+"|");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
}