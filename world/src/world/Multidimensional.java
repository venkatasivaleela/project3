package world;

public class Multidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][]=new int[2][4];
		x[0][0]=1;
		x[0][1]=2;
		x[0][2]=3;
		x[0][3]=4;
		x[1][0]=1;
		x[1][1]=2;
		x[1][2]=3;
		x[1][3]=4;
		for(int i=0; i<2; i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println(x[i][j]);
			}
		}
		
		
		


	}

}
