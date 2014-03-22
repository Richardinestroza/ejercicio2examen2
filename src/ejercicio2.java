
public class ejercicio2
{
	static int Frecursiva(int num)
	{
			if(num==0)
		{
				return 0;
			}
				if(num==1)
			{
				return 1;
		}
		return Frecursiva(num-1)*Frecursiva(num-2)+num;
	}
	  
	public static void main(String[] args)
		{
		// TODO Auto-generated method stub
			System.out.print(Frecursiva (6));
		}

}
