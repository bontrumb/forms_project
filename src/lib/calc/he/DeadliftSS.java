import java.util.Scanner;

public class DeadliftSS extends StrengthStandard
{
	private int rweight;

	private String gender;
	private int bodyweight_lbs;

	public DeadliftSS(String gender, int bodyweight_lbs)
	{
		this.gender = gender.toUpperCase(;
		this.bodyweight_lbs = bodyweight_lbs;
	}

	public void deadlift()
	{
		Scanner standard = new Scanner(System.in;

		System.out.print("\nEnter your one-rep max lift (lbs.): ";
		rweight = standard.nextInt(;

		if (gender.equals("M")) {
			malerweight(;
		} else if (gender.equals("F")) {
			femalerweight(;
		}
	}

	public void malerweight() // https://strengthlevel.com/strength-standards/deadlift
	{
		int weight = bodyweight_lbs;
		weight = ((weight + 5) / 10) * 10; // round to nearest ten

		switch(weight)
		{
			case 110:

				if (rweight < 96) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 96 && rweight < 144) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 144 && rweight < 205) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 205 && rweight < 275) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 275 && rweight < 353) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 353) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 120:

				if (rweight < 111) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 111 && rweight < 162) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 162 && rweight < 226) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 226 && rweight < 300) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 300 && rweight < 381) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 381) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 130:

				if (rweight < 126) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 126 && rweight < 180) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 180 && rweight < 246) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 246 && rweight < 324) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 324 && rweight < 407) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 407) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 140:

				if (rweight < 140) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 140 && rweight < 197) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 197 && rweight < 266) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 266 && rweight < 346) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 346 && rweight < 432) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 432) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 150:

				if (rweight < 154) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 154 && rweight < 213) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 213 && rweight < 285) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 285 && rweight < 368) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 368 && rweight < 457) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 457) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 160:

				if (rweight < 168) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 168 && rweight < 229) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 229 && rweight < 304) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 304 && rweight < 389) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 389 && rweight < 480) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 480) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 170:

				if (rweight < 181) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 181 && rweight < 245) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 245 && rweight < 322) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 322 && rweight < 409) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 409 && rweight < 502) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 502) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 180:

				if (rweight < 194) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 194 && rweight < 260) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 260 && rweight < 339) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 339 && rweight < 429) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 429 && rweight < 524) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 524) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 190:

				if (rweight < 207) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 207 && rweight < 275) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 275 && rweight < 356) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 356 && rweight < 448) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 448 && rweight < 545) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 545) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 200:

				if (rweight < 219) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 219 && rweight < 289) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 289 && rweight < 372) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 372 && rweight < 466) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 466 && rweight < 565) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 565) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 210:

				if (rweight < 232) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 232 && rweight < 303) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 303 && rweight < 388) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 388 && rweight < 484) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 484 && rweight < 585) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 585) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 220:

				if (rweight < 244) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 244 && rweight < 317) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 317 && rweight < 404) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 404 && rweight < 501) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 501 && rweight < 604) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 604) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 230:

				if (rweight < 255) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 255 && rweight < 330) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 330 && rweight < 419) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 419 && rweight < 518) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 518 && rweight < 622) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 622) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 240:

				if (rweight < 267) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 267 && rweight < 343) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 343 && rweight < 433) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 433 && rweight < 534) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 534 && rweight < 640) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 640) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 250:

				if (rweight < 278) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 278 && rweight < 356) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 356 && rweight < 448) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 448 && rweight < 550) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 550 && rweight < 657) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 657) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 260:

				if (rweight < 289) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 289 && rweight < 368) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 368 && rweight < 462) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 462 && rweight < 565) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 565 && rweight < 674) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 674) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 270:

				if (rweight < 300) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 300 && rweight < 380) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 380 && rweight < 475) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 475 && rweight < 580) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 580 && rweight < 691) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 691) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 280:

				if (rweight < 311) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 311 && rweight < 392) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 392 && rweight < 488) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 488 && rweight < 595) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 595 && rweight < 707) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 707) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 290:

				if (rweight < 321) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 321 && rweight < 404) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 404 && rweight < 502) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 502 && rweight < 609) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 609 && rweight < 722) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 722) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 300:

				if (rweight < 331) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 331 && rweight < 416) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 416 && rweight < 514) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 514 && rweight < 623) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 623 && rweight < 738) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 738) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 310:

				if (rweight < 341) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 341 && rweight < 427) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 427 && rweight < 527) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 527 && rweight < 637) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 637 && rweight < 752) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 752) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			default:

				Message += "\n!! Bodyweight not found within database (110-310 lbs.). Initializing averaged standards. !!";

				if (rweight < 173) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 173 && rweight < 245) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 245 && rweight < 335) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 335 && rweight < 438) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 438 && rweight < 550) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 550) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;
		}
	}

	public void femalerweight()
	{
		int weight = bodyweight_lbs;
		weight = ((weight + 5) / 10) * 10; // round to nearest ten

		switch(weight)
		{
			case 90:

				if (rweight < 53) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 53 && rweight < 90) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 90 && rweight < 139) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 139 && rweight < 198) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 198 && rweight < 264) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 264) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 100:

				if (rweight < 60) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 60 && rweight < 99) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 99 && rweight < 150) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 150 && rweight < 211) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 211 && rweight < 279) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 279) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 110:

				if (rweight < 67) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 67 && rweight < 107) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 107 && rweight < 160) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 160 && rweight < 223) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 223 && rweight < 293) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 293) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 120:

				if (rweight < 73) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 73 && rweight < 115) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 115 && rweight < 170) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 170 && rweight < 234) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 234 && rweight < 306) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 306) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 130:

				if (rweight < 79) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 79 && rweight < 123) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 123 && rweight < 179) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 179 && rweight < 245) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 245 && rweight < 318) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 318) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 140:

				if (rweight < 85) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 85 && rweight < 130) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 130 && rweight < 188) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 188 && rweight < 255) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 255 && rweight < 330) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 330) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 150:

				if (rweight < 91) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 91 && rweight < 137) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 137 && rweight < 196) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 196 && rweight < 265) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 265 && rweight < 341) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 341) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 160:

				if (rweight < 96) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 96 && rweight < 144) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 144 && rweight < 204) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 204 && rweight < 274) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 274 && rweight < 351) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 351) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 170:

				if (rweight < 102) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 102 && rweight < 150) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 150 && rweight < 212) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 212 && rweight < 283) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 283 && rweight < 361) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 361) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 180:

				if (rweight < 107) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 107 && rweight < 157) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 157 && rweight < 219) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 219 && rweight < 292) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 292 && rweight < 371) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 371) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 190:

				if (rweight < 112) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 112 && rweight < 162) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 162 && rweight < 226) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 226 && rweight < 300) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 300 && rweight < 380) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 380) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 200:

				if (rweight < 116) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 116 && rweight < 168) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 168 && rweight < 233) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 233 && rweight < 308) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 308 && rweight < 389) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 389) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 210:

				if (rweight < 121) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 121 && rweight < 174) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 174 && rweight < 239) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 239 && rweight < 315) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 315 && rweight < 397) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 397) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 220:

				if (rweight < 126) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 126 && rweight < 179) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 179 && rweight < 246) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 246 && rweight < 322) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 322 && rweight < 405) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 405) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 230:

				if (rweight < 130) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 130 && rweight < 184) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 184 && rweight < 252) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 252 && rweight < 329) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 329 && rweight < 413) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 413) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 240:

				if (rweight < 134) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 134 && rweight < 190) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 190 && rweight < 258) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 258 && rweight < 336) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 336 && rweight < 421) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 421) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 250:

				if (rweight < 138) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 138 && rweight < 194) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 194 && rweight < 263) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 263 && rweight < 343) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 343 && rweight < 428) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 428) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 260:

				if (rweight < 142) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 142 && rweight < 199) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 199 && rweight < 269) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 269 && rweight < 349) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 349 && rweight < 435) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 435) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			default:

				Message += "\n!! Bodyweight not found within database (110-310 lbs.). Initializing averaged standards. !!";

				if (rweight < 83) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 83 && rweight < 131) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 131 && rweight < 191) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 191 && rweight < 264) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 264 && rweight < 344) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 344) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;
		}
	}
}
