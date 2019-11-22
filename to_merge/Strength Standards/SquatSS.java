import java.util.Scanner;

public class SquatSS extends StrengthStandard
{
	private int squStandard;

	private String gender;
	private int bodyweight_lbs;

	public SquatSS(String gender, int bodyweight_lbs)
	{
		this.gender = gender.toUpperCase();
		this.bodyweight_lbs = bodyweight_lbs;
	}

	public void squat()
	{
		Scanner standard = new Scanner(System.in);

		System.out.print("\nEnter your one-rep max lift (lbs.): ");
		squStandard = standard.nextInt();

		if (gender.equals("M")) {
			maleSQUStandard();
		} else if (gender.equals("F")) {
			femaleSQUStandard();
		}
	}

	public void maleSQUStandard() // https://strengthlevel.com/strength-standards/squat
	{
		int temp_bodyweight = bodyweight_lbs;
		temp_bodyweight = ((temp_bodyweight + 5) / 10) * 10; // round to nearest ten

		switch(temp_bodyweight)
		{
			case 110:

				if (squStandard < 73) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 73 && squStandard < 114) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 114 && squStandard < 167) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 167 && squStandard < 229) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 229 && squStandard < 298) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 298) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 120:

				if (squStandard < 86) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 86 && squStandard < 130) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 130 && squStandard < 186) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 186 && squStandard < 252) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 252 && squStandard < 324) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 324) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 130:

				if (squStandard < 99) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 99 && squStandard < 146) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 146 && squStandard < 205) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 205 && squStandard < 274) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 274 && squStandard < 349) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 349) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 140:

				if (squStandard < 112) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 112 && squStandard < 162) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 162 && squStandard < 224) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 224 && squStandard < 295) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 295 && squStandard < 373) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 373) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 150:

				if (squStandard < 125) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 125 && squStandard < 177) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 177 && squStandard < 241) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 241 && squStandard < 315) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 315 && squStandard < 395) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 395) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 160:

				if (squStandard < 137) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 137 && squStandard < 192) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 192 && squStandard < 258) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 258 && squStandard < 335) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 335 && squStandard < 417) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 417) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 170:

				if (squStandard < 150) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 150 && squStandard < 206) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 206 && squStandard < 275) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 275 && squStandard < 354) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 354 && squStandard < 438) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 438) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 180:

				if (squStandard < 162) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 162 && squStandard < 220) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 220 && squStandard < 291) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 291 && squStandard < 372) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 372 && squStandard < 459) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 459) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 190:

				if (squStandard < 174) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 174 && squStandard < 234) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 234 && squStandard < 307) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 307 && squStandard < 390) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 390 && squStandard < 479) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 479) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 200:

				if (squStandard < 185) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 185 && squStandard < 248) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 248 && squStandard < 323) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 323 && squStandard < 407) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 407 && squStandard < 498) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 498) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 210:

				if (squStandard < 197) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 197 && squStandard < 261) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 261 && squStandard < 337) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 337 && squStandard < 424) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 424 && squStandard < 516) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 516) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 220:

				if (squStandard < 208) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 208 && squStandard < 273) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 273 && squStandard < 352) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 352 && squStandard < 441) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 441 && squStandard < 534) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 534) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 230:

				if (squStandard < 219) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 219 && squStandard < 286) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 286 && squStandard < 366) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 366 && squStandard < 456) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 456 && squStandard < 552) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 552) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 240:

				if (squStandard < 229) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 229 && squStandard < 298) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 298 && squStandard < 380) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 380 && squStandard < 472) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 472 && squStandard < 569) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 569) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 250:

				if (squStandard < 240) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 240 && squStandard < 310) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 310 && squStandard < 394) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 394 && squStandard < 487) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 487 && squStandard < 585) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 585) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 260:

				if (squStandard < 250) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 250 && squStandard < 322) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 322 && squStandard < 407) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 407 && squStandard < 502) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 502 && squStandard < 601) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 601) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 270:

				if (squStandard < 260) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 260 && squStandard < 334) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 334 && squStandard < 420) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 420 && squStandard < 516) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 516 && squStandard < 617) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 617) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 280:

				if (squStandard < 270) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 270 && squStandard < 345) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 345 && squStandard < 433) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 433 && squStandard < 530) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 530 && squStandard < 633) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 633) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 290:

				if (squStandard < 280) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 280 && squStandard < 356) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 356 && squStandard < 445) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 445 && squStandard < 544) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 544 && squStandard < 648) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 648) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 300:

				if (squStandard < 290) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 290 && squStandard < 367) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 367 && squStandard < 457) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 457 && squStandard < 557) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 557 && squStandard < 662) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 662) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 310:

				if (squStandard < 299) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 299 && squStandard < 378) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 378 && squStandard < 469) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 469 && squStandard < 570) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 570 && squStandard < 676) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 676) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			default:

				System.out.println("\n!! Bodyweight not found within database (110-310 lbs.). Initializing averaged standards. !!");

				if (squStandard < 141) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 141 && squStandard < 205) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 205 && squStandard < 286) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 286 && squStandard < 380) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 380 && squStandard < 482) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 482) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;
		}
	}

	public void femaleSQUStandard()
	{
		int temp_bodyweight = bodyweight_lbs;
		temp_bodyweight = ((temp_bodyweight + 5) / 10) * 10; // round to nearest ten

		switch(temp_bodyweight)
		{
			case 90:

				if (squStandard < 39) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 39 && squStandard < 70) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 70 && squStandard < 113) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 113 && squStandard < 166) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 166 && squStandard < 226) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 226) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 100:

				if (squStandard < 45) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 45 && squStandard < 78) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 78 && squStandard < 123) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 123 && squStandard < 178) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 178 && squStandard < 241) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 241) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 110:

				if (squStandard < 51) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 51 && squStandard < 86) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 86 && squStandard < 133) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 133 && squStandard < 190) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 190 && squStandard < 254) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 254) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 120:

				if (squStandard < 56) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 56 && squStandard < 93) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 93 && squStandard < 142) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 142 && squStandard < 201) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 201 && squStandard < 266) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 266) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 130:

				if (squStandard < 62) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 62 && squStandard < 100) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 100 && squStandard < 151) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 151 && squStandard < 211) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 211 && squStandard < 278) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 278) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 140:

				if (squStandard < 67) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 67 && squStandard < 107) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 107 && squStandard < 159) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 159 && squStandard < 221) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 221 && squStandard < 289) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 289) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 150:

				if (squStandard < 72) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 72 && squStandard < 113) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 113 && squStandard < 167) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 167 && squStandard < 230) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 230 && squStandard < 299) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 299) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 160:

				if (squStandard < 77) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 77 && squStandard < 120) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 120 && squStandard < 174) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 174 && squStandard < 238) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 238 && squStandard < 309) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 309) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 170:

				if (squStandard < 82) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 82 && squStandard < 126) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 126 && squStandard < 181) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 181 && squStandard < 247) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 247 && squStandard < 319) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 319) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 180:

				if (squStandard < 87) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 87 && squStandard < 131) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 131 && squStandard < 188) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 188 && squStandard < 255) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 255 && squStandard < 328) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 328) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 190:

				if (squStandard < 91) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 91 && squStandard < 137) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 137 && squStandard < 195) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 195 && squStandard < 263) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 263 && squStandard < 337) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 337) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 200:

				if (squStandard < 96) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 96 && squStandard < 142) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 142 && squStandard < 201) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 201 && squStandard < 270) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 270 && squStandard < 345) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 345) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 210:

				if (squStandard < 100) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 100 && squStandard < 147) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 147 && squStandard < 207) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 207 && squStandard < 277) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 277 && squStandard < 353) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 353) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 220:

				if (squStandard < 104) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 104 && squStandard < 152) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 152 && squStandard < 213) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 213 && squStandard < 284) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 284 && squStandard < 361) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 361) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 230:

				if (squStandard < 108) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 108 && squStandard < 157) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 157 && squStandard < 219) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 219 && squStandard < 291) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 291 && squStandard < 369) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 369) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 240:

				if (squStandard < 112) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 112 && squStandard < 162) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 162 && squStandard < 225) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 225 && squStandard < 297) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 297 && squStandard < 376) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 376) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 250:

				if (squStandard < 116) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 116 && squStandard < 167) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 167 && squStandard < 230) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 230 && squStandard < 303) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 303 && squStandard < 383) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 383) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 260:

				if (squStandard < 120) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 120 && squStandard < 171) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 171 && squStandard < 235) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 235 && squStandard < 310) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 310 && squStandard < 390) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 390) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			default:

				System.out.println("\n!! Bodyweight not found within database (90-260 lbs.). Initializing averaged standards. !!");

				if (squStandard < 64) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (squStandard >= 64 && squStandard < 105) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (squStandard >= 105 && squStandard < 160) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (squStandard >= 160 && squStandard < 225) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (squStandard >= 225 && squStandard < 298) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (squStandard >= 298) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;
		}
	}
}