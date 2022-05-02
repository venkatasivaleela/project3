
package world;
public class Sumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[][]=new int[2][2];
		int y[][]=new int[2][2];
		int z[][]=new int[2][2];
	    //intializing values of x and y matrices
		x[0][0]=1;
		x[0][1]=2;
		x[1][0]=3;
		x[1][1]=4;
		y[0][0]=5;
		y[0][1]=6;
		y[1][0]=7;
		y[1][1]=8;
		//summing the matrices
		int i,j,k,l,m,n,sum=0;
		for(i=0;i<=1;i++)
		{
			for(j=0;j<=1;j++)
			{
				       z[i][j] = x[i][j]+y[i][j];
					  System.out.println(z[i][j]);
			}
		}
	}
			

}
