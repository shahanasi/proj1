package proj1;
import java.util.Scanner;

public class game
	{
		public static void main(String[] args)
			{
				Scanner input=new Scanner(System.in);
				//sets answer positions
				int answers=(int)(Math.random()*99)+1;
				//creating the grid
				char[][] grid=new char[2][2];
				//sets the boolean for printing characters
				boolean[][] shown={{false, false}, {false, false}};
				//sets the grid
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
				
				//repeats input until boolean contains all true
				while(!allTrue(shown)){
					printGrid(grid, shown);
					System.out.println("Choose the first position. Ex. 1A");
					String userChoice=input.nextLine();
					int previousRow;
					int previousCol;
					//processes the input; sets first row and column inputs
					if(userChoice.equals("1A")){
						shown[0][0]=true;
						previousRow=0;
						previousCol=0;
					}
					else if(userChoice.equals("2A")){
						shown[0][1]=true;
						previousRow=0;
						previousCol=1;
					}
					else if(userChoice.equals("1B")){
						shown[1][0]=true;
						previousRow=1;
						previousCol=0;
					}
					else{
						shown[1][1]=true;
						previousRow=1;
						previousCol=1;
					}
					printGrid(grid, shown);
					
					//start of second input
					System.out.println("Choose the second position.");
					String userChoice2=input.nextLine();
					//processes the input; compares first and second rows and columns
					if(userChoice2.equals("1A")||userChoice2.equals("1a")){
						shown[0][0]=true;
						if(grid[0][0]!=grid[previousRow][previousCol]){
							printGrid(grid, shown);
							shown[0][0]=false;
							shown[previousRow][previousCol]=false;
						}
					}
					else if(userChoice2.equals("2A")||userChoice2.equals("2a")){
						shown[0][1]=true;
						if(grid[0][1]!=grid[previousRow][previousCol]){
							printGrid(grid, shown);
							shown[0][1]=false;
							shown[previousRow][previousCol]=false;
						}
					}
					else if(userChoice2.equals("1B")||userChoice2.equals("1b")){
						shown[1][0]=true;
						if(grid[1][0]!=grid[previousRow][previousCol]){
							printGrid(grid, shown);
							shown[1][0]=false;
							shown[previousRow][previousCol]=false;
						}
					}
					else{
						shown[1][1]=true;
						if(grid[1][1]!=grid[previousRow][previousCol]){
							printGrid(grid, shown);
							shown[1][1]=false;
							shown[previousRow][previousCol]=false;
						}
					}
				}
				if(allTrue(shown))
					{
						printGrid(grid, shown);
						System.out.println("You won!");
					}
			}
		//method for what to print in the grid
		public static void printGrid(char[][] l, boolean[][] f)
			{
				System.out.println("  1 2");
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
						//if true, print character; if false, print nothing
						if(f[i][j])
						{
							System.out.print(l[i][j]+" ");
						}
						else{
							System.out.print("  ");
						}
					}
					System.out.println();
				}
			}
		//method for checking if all true in 'shown' array
		private static boolean allTrue(boolean[][] f){
			for(int i=0; i<2; i++){
				for(int j=0; j<2; j++){
					if(f[i][j]==false){
						return false;
					}
				}
			}
			return true;
		}
	}