import java.util.Scanner;
import java.io.IOException;

public class StrengthStandard {
	
	private String gender;
	private int age;
	private int bodyweight_lbs;
	private int heightFoot;
	private int heightInch;

	public void createProfile() { // POSSIBLY OBSOLETE(?)

		cls();

		Scanner settings = new Scanner(System.in);

		System.out.print("\n==============================\n *** CREATE YOUR PROFILE ***\n==============================\n\n");
		
		System.out.print("Please enter your sex (M/F): "); // SEX
		String g = settings.nextLine();
		while (!g.equals("M") && !g.equals("m") && !g.equals("F") && !g.equals("f")) {
			System.out.print("!! Please enter your sex (M/F): ");
			g = settings.nextLine();
		}
		this.gender = g.toUpperCase();

		System.out.print("\nPlease enter your age: "); // AGE
		int old = settings.nextInt();
		while (old < 0) {
			System.out.print("!! Please enter your age: ");
			old = settings.nextInt();
		}
		this.age = old;

		System.out.print("\nPlease enter your height ROUNDED DOWN to the NEAREST FOOT: "); // HEIGHT (FEET)
		int foot = settings.nextInt();
		while (foot < 0) {
			System.out.print("!! Please enter your height ROUNDED DOWN to the NEAREST FOOT: ");
			foot = settings.nextInt();				
		}
		this.heightFoot = foot;
		System.out.print("Enter the remaining inches (0-11): "); // HEIGHT (INCH)
		int inch = settings.nextInt();
		while (inch < 0 || inch > 11) {
			System.out.print("!! Enter the remaining inches (0-11): ");
			inch = settings.nextInt();			
		}
		this.heightInch = inch;

		System.out.print("\nPlease enter your bodyweight (lbs.): "); // BODYWEIGHT (LBS.)
		int weight = settings.nextInt();
		while (weight < 0) {
			System.out.print("!! Please enter your bodyweight (lbs.): ");
			weight = settings.nextInt();	
		}
		this.bodyweight_lbs = weight;
	}

	public String getGender() {
		return this.gender;
	}

	public int getAge() {
		return this.age;
	}

	public int getBodyweight() {
		return this.bodyweight_lbs;
	}

	public void chooseExercise() {
		int exercise = -1;
		String exit;

		Scanner choice = new Scanner(System.in);
		Scanner returnExit = new Scanner(System.in); // RETURN TO CHOOSEEXERCISE() AFTER MAKING CHOICE

		while (exercise != 0) {

			cls();

			System.out.print("\n==============================\n *** EXERCISES ***\n==============================\n\n   (1) Bench Press\n   (2) Squat\n   (3) Deadlift\n   (4) Shoulder Press\n   (5) Barbell Curl\n\n   (0) [BACK]\n\nPlease choose an exercise: ");
			exercise = choice.nextInt();

			switch(exercise) {

				case 0: // [EXIT MENU]
					break;

				case 1: // BENCH PRESS

					exercise = -1;

					BenchPressSS bp = new BenchPressSS(gender, bodyweight_lbs);
					bp.benchPress();

					System.out.print("\nReturn to the EXERCISES menu? (Y/N) ");
					exit = returnExit.nextLine();
					if (exit.equals("N") || exit.equals("n")) {
						exercise = 0;
						break;
					} else {
						break;
					}

				case 2: // SQUAT

					exercise = -1;

					SquatSS sq = new SquatSS(gender, bodyweight_lbs);
					sq.squat();

					System.out.print("\nReturn to the EXERCISES menu? (Y/N) ");
					exit = returnExit.nextLine();
					if (exit.equals("N") || exit.equals("n")) {
						exercise = 0;
						break;
					} else {
						break;
					}

				case 3: // DEADLIFT
					
					exercise = -1;

					DeadliftSS dl = new DeadliftSS(gender, bodyweight_lbs);
					dl.deadlift();

					System.out.print("\nReturn to the EXERCISES menu? (Y/N) ");
					exit = returnExit.nextLine();
					if (exit.equals("N") || exit.equals("n")) {
						exercise = 0;
						break;
					} else {
						break;
					}

				case 4: // SHOULDER PRESS
					
					exercise = -1;

					ShoulderPressSS sp = new ShoulderPressSS(gender, bodyweight_lbs);
					sp.shoulderPress();

					System.out.print("\nReturn to the EXERCISES menu? (Y/N) ");
					exit = returnExit.nextLine();
					if (exit.equals("N") || exit.equals("n")) {
						exercise = 0;
						break;
					} else {
						break;
					}

				case 5: // BARBELL CURL
					
					exercise = -1;

					BarbellCurlSS bc = new BarbellCurlSS(gender, bodyweight_lbs);
					bc.barbellCurl();

					System.out.print("\nReturn to the EXERCISES menu? (Y/N) ");
					exit = returnExit.nextLine();
					if (exit.equals("N") || exit.equals("n")) {
						exercise = 0;
						break;
					} else {
						break;
					}
			}
		}
	}

	public double calculateBMI() {
		double weightKG = (bodyweight_lbs * 0.453592);
		double heightMetres = ((heightFoot * 0.3048) + (heightInch * 0.0254));

		return Math.round((weightKG / Math.pow(heightMetres, 2)) * 10.0) / 10.0;
	}

	public double calculateVO2Max() {
		return 0.0;
	}

	public double calculateFFMI(double bfpercent) {
		double weightKG = (bodyweight_lbs * 0.453592);
		double leanWeightKG = (weightKG - (weightKG * (bfpercent/100)));

		double upperValue = (leanWeightKG/2.2);
		double lowerValue = Math.pow(((heightFoot * 12.0 + heightInch) * 0.0254), 2);

		return Math.round(((upperValue/lowerValue) * 2.20462) * 10.0) / 10.0;
	}

	public void changeSettings() {	
		int choice = -1;
		String exit;
		Scanner change = new Scanner(System.in); // STRING
		Scanner change2 = new Scanner(System.in); // INT
		Scanner returnExit = new Scanner(System.in);

		while (choice != 0) {

			cls();

			System.out.print("\n==============================\n");
			System.out.println("\nCURRENT SETTINGS:");
			System.out.println(" | Sex: " + gender);
			System.out.println(" | Age: " + age);
			System.out.println(" | Height: " + heightFoot + "'" + heightInch + "\"");
			System.out.println(" | Bodyweight: " + bodyweight_lbs + " lbs.");

			System.out.print("\n==============================\n *** SETTINGS ***\n==============================\n\n   (1) Sex\n   (2) Age\n   (3) Height\n   (4) Bodyweight\n\n   (0) [BACK]\n\nChoose a setting: ");
			choice = change2.nextInt();

			switch(choice) {

				case 0: // [BACK TO SUBMENU]
					break;

				case 1: // SEX
					System.out.print("\nPlease enter your sex (M/F): "); // SEX
					String g = change.nextLine();
					while (!g.equals("M") && !g.equals("m") && !g.equals("F") && !g.equals("f")) {
						System.out.print("!! Please enter your sex (M/F): ");
						g = change.nextLine();
					}
					this.gender = g.toUpperCase();
					break;

				case 2: // AGE
					System.out.print("\nPlease enter your age: "); // AGE
					int old = change2.nextInt();
					while (old < 0) {
						System.out.print("!! Please enter your age: ");
						old = change2.nextInt();
					}
					this.age = old;
					break;

				case 3: // HEIGHT
					System.out.print("\nPlease enter your height ROUNDED DOWN to the NEAREST FOOT: "); // HEIGHT (FEET)
					int foot = change2.nextInt();
					while (foot < 0) {
						System.out.print("!! Please enter your height ROUNDED DOWN to the NEAREST FOOT: ");
						foot = change2.nextInt();				
					}
					this.heightFoot = foot;
					System.out.print("Enter the remaining inches (0-11): "); // HEIGHT (INCH)
					int inch = change2.nextInt();
					while (inch < 0 || inch > 11) {
						System.out.print("!! Enter the remaining inches (0-11): ");
						inch = change2.nextInt();			
					}
					this.heightInch = inch;
					break;

				case 4: // BODYWEIGHT
					System.out.print("\nPlease enter your bodyweight (lbs.): "); // BODYWEIGHT (LBS.)
					int weight = change2.nextInt();
					while (weight < 0) {
						System.out.print("!! Please enter your bodyweight (lbs.): ");
						weight = change2.nextInt();	
					}
					this.bodyweight_lbs = weight;
					break;
			}

		}

	}

	public static void cls() // CLEAR SCREEN for WINDOWS OS
	{
		String os = null;
		if (os == null) { os = System.getProperty("os.name"); }

		if (os.contains("Windows")) {
			try
			{
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else {
			System.out.print("\033[H\033[2J");
		}
	}

	public int subMenu() {
		int choice = -1;
		String exit;
		Scanner newScanner = new Scanner(System.in); // EXIT SUBMENU()
		Scanner returnExit = new Scanner(System.in); // RETURN TO SUBMENU() AFTER MAKING CHOICE

		while (choice != 0) {

			cls();

			System.out.print("\n==============================\n *** FITNESS DASHBOARD ***\n==============================\n\n   (1) Body Mass Index (BMI)\n   (2) VO2 Max [WIP]\n   (3) Fat Free Mass Index (FFMI)\n   (4) Exercises - Strength Standards\n\n   (5) [INFO]\n\n   (6) [SETTINGS]\n\n   (0) [EXIT]\n\nSelect from the above options: ");
			choice = newScanner.nextInt();

			switch(choice) {

				case 0: // [EXIT SUBMENU]
					cls();
					break;

				case 1: // BMI

					choice = -1;

					System.out.print("\n**Your BMI is: " + calculateBMI());
					System.out.print("\n\nBMI Categories:\n | Underweight = below 18.5\n | Normal = 18.5-24.9\n | Overweight = 25.0-29.9\n | Obese = 30.0 or greater");

					System.out.print("\n\nReturn to the FITNESS DASHBOARD? (Y/N) ");
					exit = returnExit.nextLine();
					if (exit.equals("N") || exit.equals("n")) {
						choice = 0;
						break;
					} else {
						break;
					}

				case 2: // VO2 MAX [UNFINISHED]

					choice = -1;

					System.out.print("\n!! This feature is a work in progress. Please come back later. !!\n");

					System.out.print("\nReturn to the FITNESS DASHBOARD? (Y/N) ");
					exit = returnExit.nextLine();
					if (exit.equals("N") || exit.equals("n")) {
						choice = 0;
						break;
					} else {
						break;
					}

				case 3: // FFMI

					choice = -1;
					Scanner ffmiScan = new Scanner(System.in);

					double ffmiBF;

					System.out.print("\nPlease enter your Body Fat (%): ");
					ffmiBF = ffmiScan.nextDouble();

					System.out.print("\n**Your FFMI is: " + calculateFFMI(ffmiBF));

					System.out.print("\n\nReturn to the FITNESS DASHBOARD? (Y/N) ");
					exit = returnExit.nextLine();
					if (exit.equals("N") || exit.equals("n")) {
						choice = 0;
						break;
					} else {
						break;
					}		

				case 4: // CHOOSE EXERCISE

					chooseExercise();
					break;

				case 5: // [INFO]

					choice = -1;

					System.out.print("\n==============================\n");

					System.out.println("\nBody Mass Index (BMI):");
					System.out.println(" | A key index for relating weight to height. Body Mass Index, or BMI, is a person's weight in kilograms (kg)");
					System.out.println(" | divided by his or her height in metres squared. The result of a BMI measurement can give an idea about whether");
					System.out.println(" | a person has a healthy weight for their height.");

					System.out.println("\nVO2 Max:");
					System.out.println(" | VO2 Max, also known as Maximal Oxygen Consumption, refers to the maximum amount of oxygen you can utilize during");
					System.out.println(" | exercise of increasing intensity (incremental exercise). VO2 Max is measured in millilitres of oxygen consumed");
					System.out.println(" | consumed in one minute, per kilogram of body weight (mL/kg/min).");

					System.out.println("\nFat Free Mass Index (FFMI):");
					System.out.println(" | Fat Free Mass Index, or FFMI, is an alternative to Body Mass Index (BMI) which accounts for a person's muscle mass.");
					System.out.println(" | Rather than measuring the total mass of your body, FFMI only considers the lean (or fat-free) mass.");

					System.out.print("\n\nReturn to the FITNESS DASHBOARD? (Y/N) ");
					exit = returnExit.nextLine();
					if (exit.equals("N") || exit.equals("n")) {
						choice = 0;
						break;
					} else {
						break;
					}

				case 6: // [SETTINGS]
					changeSettings();
					break;

				default:
					System.out.print("Please make a selection (0-3): ");
					break;
			}
		}
		return -1;
	}

/*
==================================================================
	PROGRAM START [MAIN]
==================================================================
*/
	public static void main(String[] args) {
		StrengthStandard s1 = new StrengthStandard();
		s1.createProfile();
		s1.subMenu();
	}
}

/*
Exercise:
	(1) Bench Press
	(2) Squat
	(3) Deadlift
	(4) Shoulder Press
	(5) Barbell Curl




INPUTS:
	- BMI


GETTER:
	- Age
	- Bodyweight
	- Gender
	- 

	exit = return -1;


*/
