package proj1;
import java.util.Scanner;

public class game
	{
		public static void main(String[] args)
			{
				Scanner input=new Scanner(System.in);
				
				//sets answer positions
				int answers=(int)(Math.random()*99)+1;
				char[][] grid=new char[2][2];
				boolean[][] shown={{false, false}, {false, false}};
				if(answers<50)
				{
					grid[0][0]='y';
					grid[0][1]='x';
					grid[1][0]='x';
					grid[1][1]='y';
					
				}
				else
				{
					grid[0][0]='x';
					grid[0][1]='y';
					grid[1][0]='y';
					grid[1][1]='x';
				}
				printGrid(grid, shown);
			}
		public static void printGrid(char[][] l, boolean[][] f)
			{
				System.out.println("  1 2");
//				System.out.println("A        |       ");
//				System.out.println("  ---------------");
//				System.out.println("B        |       ");
				for(int i=0; i<2; i++)
				{
					if(i==0){
					System.out.print("A ");
					}
					else{
						System.out.print("B ");
					}
					for(int j=0; j<2; j++)
					{
						if(f[i][j])
						{
							
							System.out.print(l[i][j]+" ");
							
						}
					}
					
					System.out.println();
				}
			}
		private static void allTrue(boolean[][] f){
			
		}
	}