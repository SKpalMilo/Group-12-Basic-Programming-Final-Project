import java.util.ArrayList;

public class Player
{
	private int x;
	private int y;
	private String name;
	

	public Player()
	{
		this.x=9;
		this.y=0;
		this.name="P";
	}

	public Player(String n)
	{
		this.x=9;
		this.y=0;
		this.name=n;
	}


	public int GetX()
	{
		return this.x;
	}
	
	public int GetY()
	{
		return this.y;
	}

	public void SetX(int newX)
	{
		this.x=newX;
	}

	public void SetY(int newY)
	{
		this.y=newY;
	}


	public void Update(int up,ArrayList<Pair> sl)
	{
		if(this.x%2==0)
		{
		    if(this.x==0)
		    {
		        this.y-=up;
		        if(this.y<0)
		        {
		            this.y=-this.y;
		        }
		    }
			else
			{   
			    this.y-=up;
			    if(this.y<0)
			    {
			        this.x--;
				    this.y=-this.y-1;
			    }
			}
		}
		else
		{
			this.y+=up;
			if(this.y>9)
			{
				if(this.x!=0)
				{
					this.x--;
				}
				this.y=9-(this.y%10);
			}
		}
		
		for(int i=0;i<sl.size();i++)
		{
			Pair actual=sl.get(i);
			if(x==actual.Get_Bx() && y==actual.Get_By())
			{
				x=actual.Get_Ex();
				y=actual.Get_Ey();
			}
		}
	}
}
