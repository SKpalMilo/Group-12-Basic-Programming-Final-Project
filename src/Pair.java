public class Pair
{
	private int B_x;
	private int B_y;
	private int E_x;
	private int E_y;

	public Pair(int Beginning_X,int Beginning_Y, int End_X, int End_Y)
	{
		this.B_x=Beginning_X;
		this.B_y=Beginning_Y;
		this.E_x=End_X;
		this.E_y=End_Y;
	}
	
	public int Get_Bx()
	{
		return B_x;
	}
		
	public int Get_By()
	{
		return B_y;
	}

	public int Get_Ex()
	{
		return E_x;
	}
	
	public int Get_Ey()
	{
		return E_y;
	}
}