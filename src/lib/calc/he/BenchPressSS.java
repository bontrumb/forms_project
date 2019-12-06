import java.util.Scanner;

public class BenchPressSS extends StrengthStandard
{
	private int bprStandard;

	private String gender;
	private int bodyweight_lbs;

	public BenchPressSS(String gender, int bodyweight_lbs)
	{
		this.gender = gender.toUpperCase();
		this.bodyweight_lbs = bodyweight_lbs;
	}

	public void benchPress()
	{
		Scanner standard = new Scanner(System.in);

		System.out.print("\nEnter your one-rep max lift (lbs.): ");
		bprStandard = standard.nextInt();

		if (gender.equals("M")) {
			maleBPRStandard();
		} else if (gender.equals("F")) {
			femaleBPRStandard();
		}
	}

	public void maleBPRStandard() // https://strengthlevel.com/strength-standards/bench-press
	{
		int weight = bodyweight_lbs;
		weight = ((weight + 5) / 10) * 10; // round to nearest ten

		switch(weight) {

			case 110:

				if (bprStandard < 53) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bprStandard >= 53 && bprStandard < 84) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 84 && bprStandard < 125) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 125 && bprStandard < 173) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 173 && bprStandard < 227) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 227) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 120:

				if (bprStandard < 63) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 63 && bprStandard < 97) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 97 && bprStandard < 140) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 140 && bprStandard < 191) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 191 && bprStandard < 247) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 247) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 130:

				if (bprStandard < 73) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 73 && bprStandard < 109) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 109 && bprStandard < 154) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 154 && bprStandard < 208) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 208 && bprStandard < 266) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 266) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 140:

				if (bprStandard < 83) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 83 && bprStandard < 121) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 121 && bprStandard < 168) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 168 && bprStandard < 224) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 224 && bprStandard < 285) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 285) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 150:

				if (bprStandard < 92) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 92 && bprStandard < 132) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 132 && bprStandard < 182) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 182 && bprStandard < 240) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 240 && bprStandard < 302) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 302) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 160:

				if (bprStandard < 102) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 102 && bprStandard < 144) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 144 && bprStandard < 195) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 195 && bprStandard < 255) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 255 && bprStandard < 319) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 319) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 170:

				if (bprStandard < 111) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 111 && bprStandard < 155) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 155 && bprStandard < 208) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 208 && bprStandard < 270) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 270 && bprStandard < 336) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 336) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 180:

				if (bprStandard < 120) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 120 && bprStandard < 166) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 166 && bprStandard < 221) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 221 && bprStandard < 284) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 284 && bprStandard < 352) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 352) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 190:

				if (bprStandard < 129) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 129 && bprStandard < 176) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 176 && bprStandard < 233) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 233 && bprStandard < 298) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 298 && bprStandard < 367) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 367) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 200:

				if (bprStandard < 138) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 138 && bprStandard < 187) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 187 && bprStandard < 245) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 245 && bprStandard < 311) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 311 && bprStandard < 382) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 382) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 210:

				if (bprStandard < 147) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 147 && bprStandard < 197) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 197 && bprStandard < 257) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 257 && bprStandard < 324) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 324 && bprStandard < 396) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 396) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 220:

				if (bprStandard < 156) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 156 && bprStandard < 207) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 207 && bprStandard < 268) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 268 && bprStandard < 337) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 337 && bprStandard < 410) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 410) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 230:

				if (bprStandard < 164) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 164 && bprStandard < 216) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 216 && bprStandard < 279) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 279 && bprStandard < 349) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 349 && bprStandard < 424) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 424) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 240:

				if (bprStandard < 172) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 172 && bprStandard < 226) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 226 && bprStandard < 290) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 290 && bprStandard < 361) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 361 && bprStandard < 437) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 437) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 250:

				if (bprStandard < 181) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 181 && bprStandard < 235) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 235 && bprStandard < 300) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 300 && bprStandard < 373) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 373 && bprStandard < 450) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 450) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 260:

				if (bprStandard < 189) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 189 && bprStandard < 244) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 244 && bprStandard < 311) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 311 && bprStandard < 385) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 385 && bprStandard < 463) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 463) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 270:

				if (bprStandard < 196) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 196 && bprStandard < 253) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 253 && bprStandard < 321) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 321 && bprStandard < 396) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 396 && bprStandard < 475) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 475) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 280:

				if (bprStandard < 204) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 204 && bprStandard < 262) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 262 && bprStandard < 330) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 330 && bprStandard < 407) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 407 && bprStandard < 487) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 487) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 290:

				if (bprStandard < 212) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 212 && bprStandard < 271) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 271 && bprStandard < 340) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 340 && bprStandard < 417) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 417 && bprStandard < 499) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 499) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 300:

				if (bprStandard < 219) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 219 && bprStandard < 279) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 279 && bprStandard < 349) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 349 && bprStandard < 428) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 428 && bprStandard < 510) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 510) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 310:

				if (bprStandard < 227) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 227 && bprStandard < 287) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 287 && bprStandard < 359) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 359 && bprStandard < 438) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 438 && bprStandard < 521) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 521) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			default:

				System.out.println("\n!! Bodyweight not found within database (110-310 lbs.). Initializing averaged standards. !!");

				if (bprStandard < 103) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 103 && bprStandard < 153) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 153 && bprStandard < 216) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 216 && bprStandard < 291) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 291 && bprStandard < 371) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 371) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;
		}
	}

	public void femaleBPRStandard()
	{
		int weight = bodyweight_lbs;
		weight = ((weight + 5) / 10) * 10; // round to nearest ten

		switch(weight) {

			case 90:

				if (bprStandard < 19) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 19 && bprStandard < 41) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 41 && bprStandard < 72) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 72 && bprStandard < 111) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 111 && bprStandard < 157) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 157) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 100:

				if (bprStandard < 23) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 23 && bprStandard < 47) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 47 && bprStandard < 79) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 79 && bprStandard < 121) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 121 && bprStandard < 169) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 169) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 110:

				if (bprStandard < 27) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 27 && bprStandard < 52) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 52 && bprStandard < 87) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 87 && bprStandard < 130) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 130 && bprStandard < 179) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 179) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 120:

				if (bprStandard < 31) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 31 && bprStandard < 58) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 58 && bprStandard < 94) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 94 && bprStandard < 139) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 139 && bprStandard < 189) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 189) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 130:

				if (bprStandard < 35) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 35 && bprStandard < 63) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 63 && bprStandard < 101) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 101 && bprStandard < 147) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 147 && bprStandard < 199) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 199) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 140:

				if (bprStandard < 39) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 39 && bprStandard < 68) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 68 && bprStandard < 107) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 107 && bprStandard < 154) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 154 && bprStandard < 208) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 208) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 150:

				if (bprStandard < 43) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 43 && bprStandard < 73) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 73 && bprStandard < 113) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 113 && bprStandard < 162) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 162 && bprStandard < 216) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 216) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 160:

				if (bprStandard < 47) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 47 && bprStandard < 78) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 78 && bprStandard < 119) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 119 && bprStandard < 169) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 169 && bprStandard < 225) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 225) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 170:

				if (bprStandard < 50) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 50 && bprStandard < 82) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 82 && bprStandard < 125) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 125 && bprStandard < 176) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 176 && bprStandard < 232) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 232) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 180:

				if (bprStandard < 54) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 54 && bprStandard < 87) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 87 && bprStandard < 130) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 130 && bprStandard < 182) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 182 && bprStandard < 240) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 240) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 190:

				if (bprStandard < 57) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 57 && bprStandard < 91) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 91 && bprStandard < 136) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 136 && bprStandard < 188) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 188 && bprStandard < 247) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 247) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 200:

				if (bprStandard < 61) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 61 && bprStandard < 96) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 96 && bprStandard < 141) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 141 && bprStandard < 194) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 194 && bprStandard < 254) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 254) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 210:

				if (bprStandard < 64) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 64 && bprStandard < 100) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 100 && bprStandard < 146) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 146 && bprStandard < 200) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 200 && bprStandard < 261) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 261) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 220:

				if (bprStandard < 67) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 67 && bprStandard < 104) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 104 && bprStandard < 150) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 150 && bprStandard < 206) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 206 && bprStandard < 267) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 267) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 230:

				if (bprStandard < 70) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 70 && bprStandard < 107) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 107 && bprStandard < 155) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 155 && bprStandard < 211) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 211 && bprStandard < 273) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 273) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 240:

				if (bprStandard < 73) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 73 && bprStandard < 111) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 111 && bprStandard < 160) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 160 && bprStandard < 217) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 217 && bprStandard < 279) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 279) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 250:

				if (bprStandard < 76) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 76 && bprStandard < 115) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 115 && bprStandard < 164) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 164 && bprStandard < 222) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 222 && bprStandard < 285) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 285) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 260:

				if (bprStandard < 79) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 79 && bprStandard < 119) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 119 && bprStandard < 168) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 168 && bprStandard < 227) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 227 && bprStandard < 291) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 291) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			default:

				System.out.println("\n!! Bodyweight not found within database (90-260 lbs.). Initializing averaged standards. !!");

				if (bprStandard < 38) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 38 && bprStandard < 69) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 69 && bprStandard < 110) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 110 && bprStandard < 162) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 162 && bprStandard < 221) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard >= 221) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;
		}
	}
}

/*
	@Override
	public void chooseExercise()
	{
		int exercise = -1;
		String exit;

		Scanner choice = new Scanner(System.in);
		Scanner returnExit = new Scanner(System.in); // RETURN TO CHOOSEEXERCISE() AFTER MAKING CHOICE

		while (exercise != 0) {

			System.out.print("\n==============================\n *** EXERCISES ***\n==============================\n\n   (1) Bench Press\n   (2) Squat [WIP]\n   (3) Deadlift [WIP]\n   (4) Shoulder Press [WIP]\n   (5) Barbell Curl [WIP]\n\n   (0) [BACK TO SUBMENU]\n\nPlease choose an exercise: ");
			exercise = choice.nextInt();

			switch(exercise) {

				case 0: // [EXIT MENU]
					break;

				case 1: // BENCH PRESS
					benchPress();
					System.out.print("\nWould you like to return to the EXERCISES menu? (Y/N) ");
					exit = returnExit.nextLine();
					if (exit.equals("N")) {
						exercise = 0;
						break;
					} else {
						break;
					}
			}
		}
	}
	*/
