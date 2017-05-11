package progteam;

import java.util.HashMap;
import java.util.Scanner;

public class Diplomacy {

	static Scanner scanner;
	static HashMap<String, Integer> m = new HashMap<String, Integer>(500000);
	static char[] chars;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		while(doNextProblem());
	}
	static boolean doNextProblem(){
		int m = Integer.MAX_VALUE;
		int[][] d = {
				{0,m,m,m,1,1,1,m},
				{m,0,m,m,1,m,1,1},
				{m,m,0,m,m,1,1,1},
				{m,m,m,0,m,m,1,1},
				{1,1,m,m,0,m,m,m},
				{1,m,1,m,m,0,m,m},
				{1,1,1,1,m,m,0,m},
				{m,1,1,1,m,m,m,0}};
		//Floyd-Warshall
		for(int k = 0; k <8; k++){
			for(int i = 0; i <8; i++){
				for(int j = 0; j<0; j++){
					if(d[i][k] + d[k][j] < d[i][j])
						d[i][j] = d[i][k] + d[k][j];
				}
			}
		}
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				System.out.println(d[i][j] + "");
			}
		}
		return false;
	}
}


