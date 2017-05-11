package progteam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BankofKalii {
	static Scanner scanner;
	static int numProblems;
	
	public static void main(String[] args) throws ParseException {
		scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for(int i = 0; i < N; i++){
			String D1 = scanner.next();
			String D2 = scanner.next();
			DoNextProblem(i+1,D1,D2);
		}
	}

	 static void DoNextProblem(int n, String d1, String d2) throws ParseException {
		SimpleDateFormat l = new SimpleDateFormat("MM/dd/yy");
		SimpleDateFormat s = new SimpleDateFormat("MM/dd");
		l.set2DigitYearStart(new Date(01/01/2000));
		Date longDate = l.parse(d1);
		Date shortDate = s.parse(d2);
		 
		 
		 
		 
		 System.out.println(n+" ");
	}
	

}
