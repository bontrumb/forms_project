import java.util.Scanner;

public class ShoulderPressSS extends StrengthStandard
{
	private int shpStandard;

	private String gender;
	private int bodyweight_lbs;

	public ShoulderPressSS(String gender, int bodyweight_lbs)
	{
		this.gender = gender.toUpperCase();
		this.bodyweight_lbs = bodyweight_lbs;
	}

	public void shoulderPress()
	{
		Scanner standard = new Scanner(System.in);

		System.out.print("\nEnter your one-rep max lift (lbs.): ");
		shpStandard = standard.nextInt();

		if (gender.equals("M")) {
			maleSHPStandard();
		} else if (gender.equals("F")) {
			femaleSHPStandard();
		}
	}

	public void maleSHPStandard() // https://strengthlevel.com/strength-standards/shoulder-press
	{
		int weight = bodyweight_lbs;
		weight = ((weight + 5) / 10) * 10; // round to nearest ten

		switch(weight)
		{
			case 110:

				if (shpStandard < 33) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 33 && shpStandard < 54) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 54 && shpStandard < 83) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 83 && shpStandard < 117) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 117 && shpStandard < 156) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 156) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 120:

				if (shpStandard < 39) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 39 && shpStandard < 62) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 62 && shpStandard < 93) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 93 && shpStandard < 129) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 129 && shpStandard < 169) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 169) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 130:

				if (shpStandard < 45) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 45 && shpStandard < 70) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 70 && shpStandard < 102) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 102 && shpStandard < 140) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 140 && shpStandard < 182) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 182) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 140:

				if (shpStandard < 51) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 51 && shpStandard < 77) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 77 && shpStandard < 111) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 111 && shpStandard < 151) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 151 && shpStandard < 194) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 194) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 150:

				if (shpStandard < 57) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 57 && shpStandard < 85) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 85 && shpStandard < 120) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 120 && shpStandard < 161) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 161 && shpStandard < 206) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 206) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 160:

				if (shpStandard < 63) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 63 && shpStandard < 92) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 92 && shpStandard < 128) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 128 && shpStandard < 171) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 171 && shpStandard < 217) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 217) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 170:

				if (shpStandard < 69) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 69 && shpStandard < 99) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 99 && shpStandard < 137) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 137 && shpStandard < 181) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 181 && shpStandard < 228) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 228) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 180:

				if (shpStandard < 75) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 75 && shpStandard < 106) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 106 && shpStandard < 145) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 145 && shpStandard < 190) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 190 && shpStandard < 238) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 238) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 190:

				if (shpStandard < 80) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 80 && shpStandard < 113) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 113 && shpStandard < 153) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 153 && shpStandard < 199) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 199 && shpStandard < 248) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 248) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 200:

				if (shpStandard < 86) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 86 && shpStandard < 119) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 119 && shpStandard < 160) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 160 && shpStandard < 208) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 208 && shpStandard < 258) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 258) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 210:

				if (shpStandard < 91) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 91 && shpStandard < 126) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 126 && shpStandard < 168) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 168 && shpStandard < 216) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 216 && shpStandard < 268) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 268) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 220:

				if (shpStandard < 97) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 97 && shpStandard < 132) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 132 && shpStandard < 175) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 175 && shpStandard < 224) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 224 && shpStandard < 277) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 277) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 230:

				if (shpStandard < 102) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 102 && shpStandard < 138) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 138 && shpStandard < 182) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 182 && shpStandard < 232) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 232 && shpStandard < 286) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 286) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 240:

				if (shpStandard < 107) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 107 && shpStandard < 144) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 144 && shpStandard < 189) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 189 && shpStandard < 240) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 240 && shpStandard < 294) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 294) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 250:

				if (shpStandard < 112) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 112 && shpStandard < 150) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 150 && shpStandard < 196) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 196 && shpStandard < 248) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 248 && shpStandard < 303) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 303) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 260:

				if (shpStandard < 117) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 117 && shpStandard < 156) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 156 && shpStandard < 203) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 203 && shpStandard < 255) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 255 && shpStandard < 311) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 311) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 270:

				if (shpStandard < 122) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 122 && shpStandard < 162) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 162 && shpStandard < 209) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 209 && shpStandard < 262) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 262 && shpStandard < 319) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 319) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 280:

				if (shpStandard < 127) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 127 && shpStandard < 167) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 167 && shpStandard < 215) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 215 && shpStandard < 269) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 269 && shpStandard < 327) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 327) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 290:

				if (shpStandard < 132) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 132 && shpStandard < 173) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 173 && shpStandard < 222) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 222 && shpStandard < 276) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 276 && shpStandard < 334) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 334) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 300:

				if (shpStandard < 137) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 137 && shpStandard < 178) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 178 && shpStandard < 228) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 228 && shpStandard < 283) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 283 && shpStandard < 342) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 342) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 310:

				if (shpStandard < 141) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 141 && shpStandard < 183) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 183 && shpStandard < 234) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 234 && shpStandard < 290) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 290 && shpStandard < 349) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 349) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			default:

				System.out.println("\n!! Bodyweight not found within database (110-310 lbs.). Initializing averaged standards. !!");

				if (shpStandard < 66) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 66 && shpStandard < 100) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 100 && shpStandard < 142) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 142 && shpStandard < 193) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 193 && shpStandard < 248) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 248) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;
		}
	}

	public void femaleSHPStandard()
	{
		int weight = bodyweight_lbs;
		weight = ((weight + 5) / 10) * 10; // round to nearest ten

		switch(weight)
		{
			case 90:

				if (shpStandard < 16) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 16 && shpStandard < 31) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 31 && shpStandard < 52) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 52 && shpStandard < 78) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 78 && shpStandard < 107) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 107) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 100:

				if (shpStandard < 19) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 19 && shpStandard < 35) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 35 && shpStandard < 56) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 56 && shpStandard < 83) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 83 && shpStandard < 114) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 114) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 110:

				if (shpStandard < 21) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 21 && shpStandard < 38) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 38 && shpStandard < 61) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 61 && shpStandard < 89) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 89 && shpStandard < 120) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 120) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 120:

				if (shpStandard < 24) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 24 && shpStandard < 41) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 41 && shpStandard < 65) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 65 && shpStandard < 94) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 94 && shpStandard < 126) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 126) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 130:

				if (shpStandard < 26) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 26 && shpStandard < 45) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 45 && shpStandard < 69) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 69 && shpStandard < 98) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 98 && shpStandard < 132) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 132) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 140:

				if (shpStandard < 29) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 29 && shpStandard < 48) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 48 && shpStandard < 73) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 73 && shpStandard < 103) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 103 && shpStandard < 137) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 137) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 150:

				if (shpStandard < 31) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 31 && shpStandard < 51) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 51 && shpStandard < 76) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 76 && shpStandard < 107) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 107 && shpStandard < 142) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 142) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 160:

				if (shpStandard < 33) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 33 && shpStandard < 53) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 53 && shpStandard < 80) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 80 && shpStandard < 111) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 111 && shpStandard < 146) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 146) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 170:

				if (shpStandard < 35) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 35 && shpStandard < 56) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 56 && shpStandard < 83) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 83 && shpStandard < 115) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 115 && shpStandard < 151) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 151) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 180:

				if (shpStandard < 37) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 37 && shpStandard < 59) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 59 && shpStandard < 86) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 86 && shpStandard < 119) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 119 && shpStandard < 155) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 155) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 190:

				if (shpStandard < 39) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 39 && shpStandard < 61) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 61 && shpStandard < 89) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 89 && shpStandard < 123) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 123 && shpStandard < 159) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 159) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 200:

				if (shpStandard < 41) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 41 && shpStandard < 64) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 64 && shpStandard < 92) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 92 && shpStandard < 126) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 126 && shpStandard < 163) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 163) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 210:

				if (shpStandard < 43) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 43 && shpStandard < 66) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 66 && shpStandard < 95) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 95 && shpStandard < 129) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 129 && shpStandard < 167) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 167) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 220:

				if (shpStandard < 45) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 45 && shpStandard < 68) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 68 && shpStandard < 98) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 98 && shpStandard < 133) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 133 && shpStandard < 171) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 171) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 230:

				if (shpStandard < 47) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 47 && shpStandard < 71) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 71 && shpStandard < 101) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 101 && shpStandard < 136) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 136 && shpStandard < 174) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 174) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 240:

				if (shpStandard < 49) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 49 && shpStandard < 73) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 73 && shpStandard < 103) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 103 && shpStandard < 139) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 139 && shpStandard < 178) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 178) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 250:

				if (shpStandard < 51) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 51 && shpStandard < 75) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 75 && shpStandard < 106) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 106 && shpStandard < 142) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 142 && shpStandard < 181) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 181) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 260:

				if (shpStandard < 52) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 52 && shpStandard < 77) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 77 && shpStandard < 108) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 108 && shpStandard < 145) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 145 && shpStandard < 184) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 184) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			default:

				System.out.println("\n!! Bodyweight not found within database (110-310 lbs.). Initializing averaged standards. !!");

				if (shpStandard < 28) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (shpStandard >= 28 && shpStandard < 48) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (shpStandard >= 48 && shpStandard < 74) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (shpStandard >= 74 && shpStandard < 107) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (shpStandard >= 107 && shpStandard < 143) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (shpStandard >= 143) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;
		}
	}
}
