package proj1;
import java.util.Scanner;
import java.util.ArrayList;
public class game
	{
		static String coordinates;
		static int row;
		static int col;
		static String[][] grid=new String[2][2];
		static String[][] blankGrid={{" ", " ", " ", " "}, {" ", " ", " ", " "}, {" ", " ", " ", " "}, {" ", " ", " ", " "}};
		public static void main(String[] args)
			{	
				boolean[][] shown={{false, false, false, false}, {false, false, false, false}, {false, false, false, false}, {false, false, false, false}};
				gridRandomizing();
			}
		public static void printGrid(String[][] l, boolean[][] f)
			{
//				System.out.println("  1 2 3 4");
//				System.out.println("A  | | | |");
//				System.out.println("  --------");
//				System.out.println("B  | | | |");
//				System.out.println("  --------");
//				System.out.println("C  | | | |");
//				System.out.println("  --------");
//				System.out.println("C  | | | |");
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
		public static void coordinatesToNumbers()
			{
				Scanner input=new Scanner(System.in);
				coordinates = input.nextLine().toUpperCase();
				switch(coordinates.substring(0,1))
				{
					case "A":
					{
						row = 0;
						break;
					}
					case "B":
					{
						row = 1;
						break;
					}
					case "C":
					{
						row = 2;
						break;
					}
					case "D":
					{
						row = 3;
						break;
					}
				}
				col = Integer.parseInt(coordinates.substring(1))-1;
				blankGrid[row][col] = grid[row][col]; 
			}
		public static void gridRandomizing()
		{
			ArrayList<String> cards = new ArrayList<String>();
			cards.add("y");
			cards.add("y");
			cards.add("z");
			cards.add("z");
//			cards.add("x");
//			cards.add("x");
//			cards.add("p");
//			cards.add("p");
//			cards.add("a");
//			cards.add("a");
//			cards.add("f");
//			cards.add("f");
//			cards.add("k");
//			cards.add("k");
//			cards.add("q");
//			cards.add("q");
			int k = 0;
			for (int i = 0; i<2; i++)
				{
					for (int j = 0; j<2; j++)
						{
							
							int random = (int) (Math.random()*(4 - k));
							grid[i][j] = cards.get(random);
							cards.remove(random);
							System.out.print(grid[i][j] + " ");
							k++;
						}
					System.out.println();
				}
		}
	}