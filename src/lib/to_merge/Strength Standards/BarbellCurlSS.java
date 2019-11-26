import java.util.Scanner;

public class BarbellCurlSS extends StrengthStandard
{
	private int bbcStandard;

	private String gender;
	private int bodyweight_lbs;

	public BarbellCurlSS(String gender, int bodyweight_lbs)
	{
		this.gender = gender.toUpperCase();
		this.bodyweight_lbs = bodyweight_lbs;
	}

	public void barbellCurl()
	{
		Scanner standard = new Scanner(System.in);

		System.out.print("\nEnter your one-rep max lift (lbs.): ");
		bbcStandard = standard.nextInt();

		if (gender.equals("M")) {
			maleBBCStandard();
		} else if (gender.equals("F")) {
			femaleBBCStandard();
		}
	}

	public void maleBBCStandard() // https://strengthlevel.com/strength-standards/barbell-curl
	{
		int temp_bodyweight = bodyweight_lbs;
		temp_bodyweight = ((temp_bodyweight + 5) / 10) * 10; // round to nearest ten

		switch(temp_bodyweight)
		{
			case 110:

				if (bbcStandard < 20) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 20 && bbcStandard < 39) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 39 && bbcStandard < 67) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 67 && bbcStandard < 102) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 102 && bbcStandard < 142) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 142) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 120:

				if (bbcStandard < 23) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 23 && bbcStandard < 44) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 44 && bbcStandard < 73) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 73 && bbcStandard < 110) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 110 && bbcStandard < 151) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 151) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 130:

				if (bbcStandard < 27) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 27 && bbcStandard < 49) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 49 && bbcStandard < 80) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 80 && bbcStandard < 117) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 117 && bbcStandard < 160) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 160) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 140:

				if (bbcStandard < 30) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 30 && bbcStandard < 54) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 54 && bbcStandard < 86) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 86 && bbcStandard < 125) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 125 && bbcStandard < 169) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 169) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 150:

				if (bbcStandard < 34) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 34 && bbcStandard < 58) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 58 && bbcStandard < 91) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 91 && bbcStandard < 132) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 132 && bbcStandard < 177) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 177) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 160:

				if (bbcStandard < 37) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 37 && bbcStandard < 63) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 63 && bbcStandard < 97) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 97 && bbcStandard < 138) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 138 && bbcStandard < 185) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 185) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 170:

				if (bbcStandard < 41) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 41 && bbcStandard < 67) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 67 && bbcStandard < 102) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 102 && bbcStandard < 145) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 145 && bbcStandard < 192) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 192) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 180:

				if (bbcStandard < 44) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 44 && bbcStandard < 72) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 72 && bbcStandard < 108) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 108 && bbcStandard < 151) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 151 && bbcStandard < 199) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 199) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 190:

				if (bbcStandard < 47) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 47 && bbcStandard < 76) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 76 && bbcStandard < 113) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 113 && bbcStandard < 157) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 157 && bbcStandard < 206) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 206) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 200:

				if (bbcStandard < 51) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 51 && bbcStandard < 80) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 80 && bbcStandard < 118) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 118 && bbcStandard < 163) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 163 && bbcStandard < 213) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 213) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 210:

				if (bbcStandard < 54) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 54 && bbcStandard < 84) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 84 && bbcStandard < 123) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 123 && bbcStandard < 169) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 169 && bbcStandard < 220) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 220) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 220:

				if (bbcStandard < 57) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 57 && bbcStandard < 88) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 88 && bbcStandard < 127) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 127 && bbcStandard < 174) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 174 && bbcStandard < 226) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 226) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 230:

				if (bbcStandard < 60) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 60 && bbcStandard < 91) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 91 && bbcStandard < 132) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 132 && bbcStandard < 179) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 179 && bbcStandard < 232) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 232) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 240:

				if (bbcStandard < 63) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 63 && bbcStandard < 95) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 95 && bbcStandard < 136) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 136 && bbcStandard < 185) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 185 && bbcStandard < 238) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 238) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 250:

				if (bbcStandard < 66) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 66 && bbcStandard < 99) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 99 && bbcStandard < 140) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 140 && bbcStandard < 190) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 190 && bbcStandard < 243) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 243) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 260:

				if (bbcStandard < 69) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 69 && bbcStandard < 102) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 102 && bbcStandard < 145) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 145 && bbcStandard < 194) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 194 && bbcStandard < 249) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 249) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 270:

				if (bbcStandard < 71) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 71 && bbcStandard < 106) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 106 && bbcStandard < 149) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 149 && bbcStandard < 199) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 199 && bbcStandard < 254) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 254) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 280:

				if (bbcStandard < 74) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 74 && bbcStandard < 109) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 109 && bbcStandard < 153) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 153 && bbcStandard < 204) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 204 && bbcStandard < 259) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 259) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 290:

				if (bbcStandard < 77) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 77 && bbcStandard < 112) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 112 && bbcStandard < 157) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 157 && bbcStandard < 208) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 208 && bbcStandard < 265) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 265) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 300:

				if (bbcStandard < 80) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 80 && bbcStandard < 116) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 116 && bbcStandard < 161) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 161 && bbcStandard < 213) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 213 && bbcStandard < 269) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 269) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 310:

				if (bbcStandard < 82) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 82 && bbcStandard < 119) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 119 && bbcStandard < 164) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 164 && bbcStandard < 217) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 217 && bbcStandard < 274) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 274) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			default:

				System.out.println("\n!! Bodyweight not found within database (110-310 lbs.). Initializing averaged standards. !!");

				if (bbcStandard < 38) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 38 && bbcStandard < 66) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 66 && bbcStandard < 104) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 104 && bbcStandard < 149) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 149 && bbcStandard < 201) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 201) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;
		}
	}

	public void femaleBBCStandard()
	{
		int temp_bodyweight = bodyweight_lbs;
		temp_bodyweight = ((temp_bodyweight + 5) / 10) * 10; // round to nearest ten

		switch(temp_bodyweight)
		{
			case 90:

				if (bbcStandard < 7) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 7 && bbcStandard < 19) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 19 && bbcStandard < 37) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 37 && bbcStandard < 62) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 62 && bbcStandard < 91) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 91) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 100:

				if (bbcStandard < 9) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 9 && bbcStandard < 22) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 22 && bbcStandard < 41) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 41 && bbcStandard < 66) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 66 && bbcStandard < 96) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 96) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 110:

				if (bbcStandard < 10) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 10 && bbcStandard < 24) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 24 && bbcStandard < 44) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 44 && bbcStandard < 71) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 71 && bbcStandard < 102) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 102) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 120:

				if (bbcStandard < 12) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 12 && bbcStandard < 26) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 26 && bbcStandard < 47) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 47 && bbcStandard < 75) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 75 && bbcStandard < 106) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 106) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 130:

				if (bbcStandard < 14) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 14 && bbcStandard < 29) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 29 && bbcStandard < 50) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 50 && bbcStandard < 78) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 78 && bbcStandard < 111) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 111) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 140:

				if (bbcStandard < 15) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 15 && bbcStandard < 31) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 31 && bbcStandard < 53) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 53 && bbcStandard < 82) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 82 && bbcStandard < 115) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 115) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 150:

				if (bbcStandard < 17) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 17 && bbcStandard < 33) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 33 && bbcStandard < 56) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 56 && bbcStandard < 85) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 85 && bbcStandard < 119) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 119) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 160:

				if (bbcStandard < 18) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 18 && bbcStandard < 35) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 35 && bbcStandard < 59) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 59 && bbcStandard < 89) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 89 && bbcStandard < 123) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 123) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 170:

				if (bbcStandard < 19) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 19 && bbcStandard < 37) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 37 && bbcStandard < 61) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 61 && bbcStandard < 92) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 92 && bbcStandard < 127) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 127) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 180:

				if (bbcStandard < 21) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 21 && bbcStandard < 39) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 39 && bbcStandard < 64) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 64 && bbcStandard < 95) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 95 && bbcStandard < 130) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 130) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 190:

				if (bbcStandard < 22) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 22 && bbcStandard < 41) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 41 && bbcStandard < 66) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 66 && bbcStandard < 98) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 98 && bbcStandard < 133) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 133) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 200:

				if (bbcStandard < 23) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 23 && bbcStandard < 42) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 42 && bbcStandard < 68) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 68 && bbcStandard < 100) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 100 && bbcStandard < 137) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 137) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 210:

				if (bbcStandard < 25) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 25 && bbcStandard < 44) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 44 && bbcStandard < 70) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 70 && bbcStandard < 103) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 103 && bbcStandard < 140) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 140) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 220:

				if (bbcStandard < 26) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 26 && bbcStandard < 46) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 46 && bbcStandard < 73) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 73 && bbcStandard < 105) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 105 && bbcStandard < 143) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 143) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 230:

				if (bbcStandard < 27) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 27 && bbcStandard < 47) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 47 && bbcStandard < 75) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 75 && bbcStandard < 108) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 108 && bbcStandard < 145) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 145) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 240:

				if (bbcStandard < 28) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 28 && bbcStandard < 49) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 49 && bbcStandard < 77) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 77 && bbcStandard < 110) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 110 && bbcStandard < 148) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 148) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 250:

				if (bbcStandard < 30) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 30 && bbcStandard < 51) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 51 && bbcStandard < 79) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 79 && bbcStandard < 113) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 113 && bbcStandard < 151) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 151) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 260:

				if (bbcStandard < 31) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 31 && bbcStandard < 52) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 52 && bbcStandard < 80) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 80 && bbcStandard < 115) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 115 && bbcStandard < 154) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 154) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			default:

				System.out.println("\n!! Bodyweight not found within database (110-310 lbs.). Initializing averaged standards. !!");

				if (bbcStandard < 14) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bbcStandard >= 14 && bbcStandard < 31) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bbcStandard >= 31 && bbcStandard < 54) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bbcStandard >= 54 && bbcStandard < 84) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bbcStandard >= 84 && bbcStandard < 119) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bbcStandard >= 119) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;
		}
	}
}