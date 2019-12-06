import java.util.Scanner;

public class SquatSS extends StrengthStandard
{
	private int rweight;

	private String gender;
	private int bodyweight_lbs;

	public SquatSS(String gender, int bodyweight_lbs)
	{
		this.gender = gender.toUpperCase(;
		this.bodyweight_lbs = bodyweight_lbs;
	}

	public void squat()
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

	public void malerweight() // https://strengthlevel.com/strength-standards/squat
	{
		int weight = bodyweight_lbs;
		weight = ((weight + 5) / 10) * 10; // round to nearest ten
		String Message = "";
		switch(weight)
		{
			case 110:

				if (rweight < 73) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 73 && rweight < 114) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 114 && rweight < 167) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 167 && rweight < 229) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 229 && rweight < 298) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 298) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 120:

				if (rweight < 86) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 86 && rweight < 130) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 130 && rweight < 186) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 186 && rweight < 252) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 252 && rweight < 324) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 324) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 130:

				if (rweight < 99) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 99 && rweight < 146) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 146 && rweight < 205) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 205 && rweight < 274) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 274 && rweight < 349) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 349) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 140:

				if (rweight < 112) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 112 && rweight < 162) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 162 && rweight < 224) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 224 && rweight < 295) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 295 && rweight < 373) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 373) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 150:

				if (rweight < 125) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 125 && rweight < 177) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 177 && rweight < 241) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 241 && rweight < 315) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 315 && rweight < 395) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 395) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 160:

				if (rweight < 137) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 137 && rweight < 192) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 192 && rweight < 258) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 258 && rweight < 335) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 335 && rweight < 417) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 417) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 170:

				if (rweight < 150) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 150 && rweight < 206) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 206 && rweight < 275) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 275 && rweight < 354) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 354 && rweight < 438) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 438) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 180:

				if (rweight < 162) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 162 && rweight < 220) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 220 && rweight < 291) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 291 && rweight < 372) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 372 && rweight < 459) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 459) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 190:

				if (rweight < 174) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 174 && rweight < 234) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 234 && rweight < 307) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 307 && rweight < 390) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 390 && rweight < 479) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 479) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 200:

				if (rweight < 185) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 185 && rweight < 248) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 248 && rweight < 323) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 323 && rweight < 407) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 407 && rweight < 498) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 498) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 210:

				if (rweight < 197) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 197 && rweight < 261) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 261 && rweight < 337) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 337 && rweight < 424) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 424 && rweight < 516) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 516) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 220:

				if (rweight < 208) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 208 && rweight < 273) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 273 && rweight < 352) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 352 && rweight < 441) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 441 && rweight < 534) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 534) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 230:

				if (rweight < 219) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 219 && rweight < 286) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 286 && rweight < 366) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 366 && rweight < 456) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 456 && rweight < 552) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 552) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 240:

				if (rweight < 229) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 229 && rweight < 298) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 298 && rweight < 380) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 380 && rweight < 472) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 472 && rweight < 569) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 569) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 250:

				if (rweight < 240) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 240 && rweight < 310) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 310 && rweight < 394) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 394 && rweight < 487) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 487 && rweight < 585) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 585) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 260:

				if (rweight < 250) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 250 && rweight < 322) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 322 && rweight < 407) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 407 && rweight < 502) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 502 && rweight < 601) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 601) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 270:

				if (rweight < 260) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 260 && rweight < 334) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 334 && rweight < 420) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 420 && rweight < 516) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 516 && rweight < 617) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 617) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 280:

				if (rweight < 270) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 270 && rweight < 345) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 345 && rweight < 433) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 433 && rweight < 530) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 530 && rweight < 633) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 633) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 290:

				if (rweight < 280) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 280 && rweight < 356) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 356 && rweight < 445) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 445 && rweight < 544) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 544 && rweight < 648) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 648) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 300:

				if (rweight < 290) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 290 && rweight < 367) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 367 && rweight < 457) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 457 && rweight < 557) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 557 && rweight < 662) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 662) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 310:

				if (rweight < 299) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 299 && rweight < 378) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 378 && rweight < 469) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 469 && rweight < 570) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 570 && rweight < 676) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 676) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			default:

				String b + "\n!! Bodyweight not found within database (110-310 lbs.). Initializing averaged standards. !!";

				if (rweight < 141) {
					Message += b + "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 141 && rweight < 205) {
					Message += b + "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 205 && rweight < 286) {
					Message += b + "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 286 && rweight < 380) {
					Message += b + "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 380 && rweight < 482) {
					Message += b + "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 482) {
					Message += b + "\n**You are stronger than 95% of lifters (ELITE).";
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

				if (rweight < 39) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 39 && rweight < 70) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 70 && rweight < 113) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 113 && rweight < 166) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 166 && rweight < 226) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 226) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 100:

				if (rweight < 45) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 45 && rweight < 78) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 78 && rweight < 123) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 123 && rweight < 178) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 178 && rweight < 241) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 241) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 110:

				if (rweight < 51) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 51 && rweight < 86) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 86 && rweight < 133) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 133 && rweight < 190) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 190 && rweight < 254) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 254) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 120:

				if (rweight < 56) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 56 && rweight < 93) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 93 && rweight < 142) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 142 && rweight < 201) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 201 && rweight < 266) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 266) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 130:

				if (rweight < 62) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 62 && rweight < 100) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 100 && rweight < 151) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 151 && rweight < 211) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 211 && rweight < 278) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 278) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 140:

				if (rweight < 67) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 67 && rweight < 107) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 107 && rweight < 159) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 159 && rweight < 221) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 221 && rweight < 289) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 289) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 150:

				if (rweight < 72) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 72 && rweight < 113) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 113 && rweight < 167) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 167 && rweight < 230) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 230 && rweight < 299) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 299) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 160:

				if (rweight < 77) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 77 && rweight < 120) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 120 && rweight < 174) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 174 && rweight < 238) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 238 && rweight < 309) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 309) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 170:

				if (rweight < 82) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 82 && rweight < 126) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 126 && rweight < 181) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 181 && rweight < 247) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 247 && rweight < 319) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 319) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 180:

				if (rweight < 87) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 87 && rweight < 131) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 131 && rweight < 188) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 188 && rweight < 255) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 255 && rweight < 328) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 328) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 190:

				if (rweight < 91) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 91 && rweight < 137) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 137 && rweight < 195) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 195 && rweight < 263) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 263 && rweight < 337) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 337) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 200:

				if (rweight < 96) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 96 && rweight < 142) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 142 && rweight < 201) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 201 && rweight < 270) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 270 && rweight < 345) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 345) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 210:

				if (rweight < 100) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 100 && rweight < 147) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 147 && rweight < 207) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 207 && rweight < 277) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 277 && rweight < 353) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 353) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 220:

				if (rweight < 104) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 104 && rweight < 152) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 152 && rweight < 213) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 213 && rweight < 284) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 284 && rweight < 361) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 361) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 230:

				if (rweight < 108) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 108 && rweight < 157) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 157 && rweight < 219) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 219 && rweight < 291) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 291 && rweight < 369) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 369) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 240:

				if (rweight < 112) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 112 && rweight < 162) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 162 && rweight < 225) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 225 && rweight < 297) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 297 && rweight < 376) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 376) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 250:

				if (rweight < 116) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 116 && rweight < 167) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 167 && rweight < 230) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 230 && rweight < 303) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 303 && rweight < 383) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 383) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 260:

				if (rweight < 120) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 120 && rweight < 171) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 171 && rweight < 235) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 235 && rweight < 310) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 310 && rweight < 390) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 390) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			default:

				String b = "\n!! Bodyweight not found within database (90-260 lbs.). Initializing averaged standards. !!";

				if (rweight < 64) {
					Message += b + "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 64 && rweight < 105) {
					Message += b + "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 105 && rweight < 160) {
					Message += b + "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 160 && rweight < 225) {
					Message += b + "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 225 && rweight < 298) {
					Message += b + "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 298) {
					Message += b + "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;
		}
	}
}
