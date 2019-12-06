import java.util.Scanner;

public class DeadliftSS extends StrengthStandard
{
	private int dlfStandard;

	private String gender;
	private int bodyweight_lbs;

	public DeadliftSS(String gender, int bodyweight_lbs)
	{
		this.gender = gender.toUpperCase();
		this.bodyweight_lbs = bodyweight_lbs;
	}

	public void deadlift()
	{
		Scanner standard = new Scanner(System.in);

		System.out.print("\nEnter your one-rep max lift (lbs.): ");
		dlfStandard = standard.nextInt();

		if (gender.equals("M")) {
			maleDLFStandard();
		} else if (gender.equals("F")) {
			femaleDLFStandard();
		}
	}

	public void maleDLFStandard() // https://strengthlevel.com/strength-standards/deadlift
	{
		int weight = bodyweight_lbs;
		weight = ((weight + 5) / 10) * 10; // round to nearest ten

		switch(weight)
		{
			case 110:

				if (dlfStandard < 96) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 96 && dlfStandard < 144) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 144 && dlfStandard < 205) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 205 && dlfStandard < 275) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 275 && dlfStandard < 353) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 353) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 120:

				if (dlfStandard < 111) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 111 && dlfStandard < 162) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 162 && dlfStandard < 226) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 226 && dlfStandard < 300) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 300 && dlfStandard < 381) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 381) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 130:

				if (dlfStandard < 126) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 126 && dlfStandard < 180) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 180 && dlfStandard < 246) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 246 && dlfStandard < 324) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 324 && dlfStandard < 407) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 407) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 140:

				if (dlfStandard < 140) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 140 && dlfStandard < 197) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 197 && dlfStandard < 266) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 266 && dlfStandard < 346) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 346 && dlfStandard < 432) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 432) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 150:

				if (dlfStandard < 154) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 154 && dlfStandard < 213) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 213 && dlfStandard < 285) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 285 && dlfStandard < 368) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 368 && dlfStandard < 457) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 457) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 160:

				if (dlfStandard < 168) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 168 && dlfStandard < 229) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 229 && dlfStandard < 304) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 304 && dlfStandard < 389) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 389 && dlfStandard < 480) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 480) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 170:

				if (dlfStandard < 181) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 181 && dlfStandard < 245) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 245 && dlfStandard < 322) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 322 && dlfStandard < 409) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 409 && dlfStandard < 502) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 502) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 180:

				if (dlfStandard < 194) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 194 && dlfStandard < 260) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 260 && dlfStandard < 339) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 339 && dlfStandard < 429) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 429 && dlfStandard < 524) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 524) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 190:

				if (dlfStandard < 207) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 207 && dlfStandard < 275) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 275 && dlfStandard < 356) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 356 && dlfStandard < 448) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 448 && dlfStandard < 545) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 545) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 200:

				if (dlfStandard < 219) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 219 && dlfStandard < 289) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 289 && dlfStandard < 372) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 372 && dlfStandard < 466) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 466 && dlfStandard < 565) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 565) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 210:

				if (dlfStandard < 232) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 232 && dlfStandard < 303) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 303 && dlfStandard < 388) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 388 && dlfStandard < 484) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 484 && dlfStandard < 585) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 585) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 220:

				if (dlfStandard < 244) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 244 && dlfStandard < 317) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 317 && dlfStandard < 404) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 404 && dlfStandard < 501) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 501 && dlfStandard < 604) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 604) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 230:

				if (dlfStandard < 255) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 255 && dlfStandard < 330) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 330 && dlfStandard < 419) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 419 && dlfStandard < 518) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 518 && dlfStandard < 622) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 622) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 240:

				if (dlfStandard < 267) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 267 && dlfStandard < 343) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 343 && dlfStandard < 433) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 433 && dlfStandard < 534) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 534 && dlfStandard < 640) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 640) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 250:

				if (dlfStandard < 278) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 278 && dlfStandard < 356) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 356 && dlfStandard < 448) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 448 && dlfStandard < 550) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 550 && dlfStandard < 657) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 657) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 260:

				if (dlfStandard < 289) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 289 && dlfStandard < 368) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 368 && dlfStandard < 462) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 462 && dlfStandard < 565) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 565 && dlfStandard < 674) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 674) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 270:

				if (dlfStandard < 300) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 300 && dlfStandard < 380) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 380 && dlfStandard < 475) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 475 && dlfStandard < 580) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 580 && dlfStandard < 691) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 691) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 280:

				if (dlfStandard < 311) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 311 && dlfStandard < 392) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 392 && dlfStandard < 488) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 488 && dlfStandard < 595) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 595 && dlfStandard < 707) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 707) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 290:

				if (dlfStandard < 321) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 321 && dlfStandard < 404) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 404 && dlfStandard < 502) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 502 && dlfStandard < 609) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 609 && dlfStandard < 722) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 722) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 300:

				if (dlfStandard < 331) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 331 && dlfStandard < 416) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 416 && dlfStandard < 514) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 514 && dlfStandard < 623) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 623 && dlfStandard < 738) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 738) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 310:

				if (dlfStandard < 341) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 341 && dlfStandard < 427) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 427 && dlfStandard < 527) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 527 && dlfStandard < 637) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 637 && dlfStandard < 752) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 752) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			default:

				System.out.println("\n!! Bodyweight not found within database (110-310 lbs.). Initializing averaged standards. !!");

				if (dlfStandard < 173) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 173 && dlfStandard < 245) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 245 && dlfStandard < 335) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 335 && dlfStandard < 438) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 438 && dlfStandard < 550) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 550) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;
		}
	}

	public void femaleDLFStandard()
	{
		int weight = bodyweight_lbs;
		weight = ((weight + 5) / 10) * 10; // round to nearest ten

		switch(weight)
		{
			case 90:

				if (dlfStandard < 53) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 53 && dlfStandard < 90) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 90 && dlfStandard < 139) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 139 && dlfStandard < 198) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 198 && dlfStandard < 264) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 264) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 100:

				if (dlfStandard < 60) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 60 && dlfStandard < 99) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 99 && dlfStandard < 150) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 150 && dlfStandard < 211) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 211 && dlfStandard < 279) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 279) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 110:

				if (dlfStandard < 67) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 67 && dlfStandard < 107) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 107 && dlfStandard < 160) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 160 && dlfStandard < 223) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 223 && dlfStandard < 293) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 293) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 120:

				if (dlfStandard < 73) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 73 && dlfStandard < 115) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 115 && dlfStandard < 170) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 170 && dlfStandard < 234) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 234 && dlfStandard < 306) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 306) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 130:

				if (dlfStandard < 79) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 79 && dlfStandard < 123) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 123 && dlfStandard < 179) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 179 && dlfStandard < 245) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 245 && dlfStandard < 318) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 318) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 140:

				if (dlfStandard < 85) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 85 && dlfStandard < 130) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 130 && dlfStandard < 188) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 188 && dlfStandard < 255) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 255 && dlfStandard < 330) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 330) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 150:

				if (dlfStandard < 91) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 91 && dlfStandard < 137) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 137 && dlfStandard < 196) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 196 && dlfStandard < 265) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 265 && dlfStandard < 341) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 341) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 160:

				if (dlfStandard < 96) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 96 && dlfStandard < 144) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 144 && dlfStandard < 204) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 204 && dlfStandard < 274) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 274 && dlfStandard < 351) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 351) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 170:

				if (dlfStandard < 102) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 102 && dlfStandard < 150) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 150 && dlfStandard < 212) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 212 && dlfStandard < 283) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 283 && dlfStandard < 361) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 361) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 180:

				if (dlfStandard < 107) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 107 && dlfStandard < 157) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 157 && dlfStandard < 219) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 219 && dlfStandard < 292) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 292 && dlfStandard < 371) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 371) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 190:

				if (dlfStandard < 112) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 112 && dlfStandard < 162) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 162 && dlfStandard < 226) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 226 && dlfStandard < 300) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 300 && dlfStandard < 380) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 380) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 200:

				if (dlfStandard < 116) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 116 && dlfStandard < 168) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 168 && dlfStandard < 233) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 233 && dlfStandard < 308) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 308 && dlfStandard < 389) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 389) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 210:

				if (dlfStandard < 121) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 121 && dlfStandard < 174) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 174 && dlfStandard < 239) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 239 && dlfStandard < 315) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 315 && dlfStandard < 397) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 397) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 220:

				if (dlfStandard < 126) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 126 && dlfStandard < 179) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 179 && dlfStandard < 246) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 246 && dlfStandard < 322) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 322 && dlfStandard < 405) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 405) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 230:

				if (dlfStandard < 130) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 130 && dlfStandard < 184) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 184 && dlfStandard < 252) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 252 && dlfStandard < 329) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 329 && dlfStandard < 413) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 413) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 240:

				if (dlfStandard < 134) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 134 && dlfStandard < 190) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 190 && dlfStandard < 258) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 258 && dlfStandard < 336) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 336 && dlfStandard < 421) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 421) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 250:

				if (dlfStandard < 138) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 138 && dlfStandard < 194) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 194 && dlfStandard < 263) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 263 && dlfStandard < 343) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 343 && dlfStandard < 428) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 428) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 260:

				if (dlfStandard < 142) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 142 && dlfStandard < 199) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 199 && dlfStandard < 269) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 269 && dlfStandard < 349) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 349 && dlfStandard < 435) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 435) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			default:

				System.out.println("\n!! Bodyweight not found within database (110-310 lbs.). Initializing averaged standards. !!");

				if (dlfStandard < 83) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (dlfStandard >= 83 && dlfStandard < 131) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (dlfStandard >= 131 && dlfStandard < 191) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (dlfStandard >= 191 && dlfStandard < 264) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (dlfStandard >= 264 && dlfStandard < 344) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (dlfStandard >= 344) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;
		}
	}
}
