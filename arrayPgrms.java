import java.util.Scanner;
public class arrayPgrms {
	public static void main (String[] args) {
		Scanner myScanObj = new Scanner(System.in);

		//7
		int[] sevenList = new int[10];
		int sevenEvenCount = 0;
		int sevenOddCount = 0;
		int sevenNegativeCount = 0;
		for (int a = 0; a < sevenList.length; a++) {
			System.out.print("Enter integer " + (a+1) + ". ");
			sevenList[a] = myScanObj.nextInt();
			if (sevenList[a]%2 == 0) {
				sevenEvenCount++;
			} else {
				sevenOddCount++;
			}
			if (sevenList[a] < 0) {
				sevenNegativeCount++;
			}
		}
		int[] sevenEvenList = new int[sevenEvenCount];
		int[] sevenOddList = new int[sevenOddCount];
		int[] sevenNegativeList = new int[sevenNegativeCount];
		sevenEvenCount = 0;
		sevenOddCount = 0;
		sevenNegativeCount = 0;
		for (int a = 0; a < sevenList.length; a++) {
			if (sevenList[a]%2 == 0) {
				sevenEvenList[sevenEvenCount] = sevenList[a];
				sevenEvenCount++;
			} else {
				sevenOddList[sevenOddCount] = sevenList[a];
				sevenOddCount++;
			}
			if (sevenList[a] < 0) {
				sevenNegativeList[sevenNegativeCount] = sevenList[a];
				sevenNegativeCount++;
			}
		}
		System.out.print("The even numbers were " + sevenEvenList[0]);
		for (int a = 1; a < sevenEvenList.length-1; a++) {
			System.out.print(", " + sevenEvenList[a]);
		}
		System.out.print(", and " + sevenEvenList[sevenEvenList.length-1] + ". The odd numbers were " + sevenOddList[0]);
		for (int a = 1; a < sevenOddList.length-1; a++) {
			System.out.print(", " + sevenOddList[a]);
		}
		System.out.print(", and " + sevenOddList[sevenOddList.length-1] + ". The negative numbers were " + sevenNegativeList[0]);
		for (int a = 1; a < sevenNegativeList.length-1; a++) {
			System.out.print(", " + sevenNegativeList[a]);
		}
		System.out.println(", and " + sevenNegativeList[sevenOddList.length-1] + ".");
		System.out.println();
		System.out.println();
		System.out.println();

		//5.2
		System.out.print("Enter an integer. ");
		int fiveTwoInput = myScanObj.nextInt();
		int fiveTwoFactorsCount = 0;
		for (int a = 1; a < fiveTwoInput; a++) {
			if (fiveTwoInput%a == 0) {
				fiveTwoFactorsCount++;
			}
		}
		int[] fiveTwoFactors = new int[fiveTwoFactorsCount];
		fiveTwoFactorsCount = 0;
		for (int a = 1; a < fiveTwoInput; a++) {
			if (fiveTwoInput%a == 0) {
				fiveTwoFactors[fiveTwoFactorsCount] = a;
				fiveTwoFactorsCount++;
			}
		}
		System.out.print("The factors of " + fiveTwoInput + " are " + fiveTwoFactors[0]);
		for (int a = 1; a < fiveTwoFactors.length-1; a++) {
			System.out.print(", " + fiveTwoFactors[a]);
		}
		System.out.println(", and " + fiveTwoFactors[fiveTwoFactors.length-1] + ".");
		System.out.println();
		System.out.println();
		System.out.println();

		//5.1
		int[] fiveOneList = new int[10];
		int fiveOneZeros = 0;
		int fiveOneOdds = 0;
		int fiveOneEvens = 0;
		for (int a = 0; a < fiveOneList.length; a++) {
			System.out.print("Enter a number. ");
			fiveOneList[a] = myScanObj.nextInt();
			if (fiveOneList[a] < 0) {
			} else if (fiveOneList[a] == 0) {
				fiveOneZeros++;
			} else if (fiveOneList[a]%2 == 0) {
				fiveOneEvens++;
			} else {
				fiveOneOdds++;
			}
		}
		System.out.println("There were " + fiveOneZeros + " zeros, " + fiveOneOdds + " odds*, and " + fiveOneEvens + " evens*.");
		System.out.println("*Not including zeros or negatives");
		System.out.println();
		System.out.println();
		System.out.println();

		//4
		String[] fourList = new String[5];
		int fourTrentonIndex = -1;
		for (int a = 0; a < fourList.length; a++) {
			System.out.print("Type a name. ");
			fourList[a] = myScanObj.nextLine();
			if (fourList[a].equals("Trenton")) {
				fourTrentonIndex = a;
			}
		}
		if (fourTrentonIndex != -1) {
			System.out.println(fourList[fourTrentonIndex]);
		} else {
			System.out.println("You didn't enter the correct name.");
		}
		System.out.println();
		System.out.println();
		System.out.println();

		//3
		double[] three = new double[10];
		for (int a = 0; a < three.length; a++) {
			System.out.print("Enter a double. ");
			three[a] = myScanObj.nextDouble();
			System.out.println(three[a] + " Entered.");
		}
		double threeSum = 0;
		for (int a = 0; a < three.length; a++) {
			threeSum = threeSum + three[a];
		}
		double threeAverage = threeSum/three.length;
		int threeLargerThanAverageCount = 0;
		for (int a = 0; a < three.length; a++) {
			if (three[a] > threeAverage) {
				threeLargerThanAverageCount++;
			}
		}
		double[] threeLargerThanAverage = new double[threeLargerThanAverageCount];
		threeLargerThanAverageCount = 0;
		for (int a = 0; a < three.length && threeLargerThanAverageCount != threeLargerThanAverage.length; a++) {
			if (three[a] > threeAverage) {
				threeLargerThanAverage[threeLargerThanAverageCount] = three[a];
				threeLargerThanAverageCount++;
			}
		}
		System.out.print("The sum is " + threeSum + ", the average is " + threeAverage + ", and the numbers larger than the average are " + threeLargerThanAverage[0]);
		for (int a = 1; a < threeLargerThanAverage.length-1; a++) {
			System.out.print(", " + threeLargerThanAverage[a]);
		}
		System.out.println(", and " + threeLargerThanAverage[threeLargerThanAverage.length-1] + ".");
		System.out.println();
		System.out.println();
		System.out.println();

		//2
		int[] two = new int[20];
		for (int a = 0; a < two.length; a++) {
			two[a] = a+1;
		}
		for (int a = 0; a < (two.length/2); a++) {
			System.out.println(two[a]);
		}
		System.out.println();
		for (int a = (two.length/2); a < two.length; a++) {
			System.out.println(two[a]);
		}
		System.out.println();
		System.out.println();
		System.out.println();

		//1
		int[] one = new int[10];
		for (int a = 0; a < one.length-1; a++) {
			one[a] = (int) ((Math.random()*10)+1);
		}
		for (int a = 0; a < one.length-1; a++) {
			System.out.println(one[a]);
		}
		System.out.println();
		for (int a = one.length-1; a > 0; a--) {
			System.out.println(one[a]);
		}
		System.out.println();
		System.out.println();
		System.out.println();
	}
}