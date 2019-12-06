import java.util.Scanner;

public class BenchPressSS extends StrengthStandard
{
	private int rweight;

	private String gender;
	private int bodyweight_lbs;

	public BenchPressSS(String gender, int bodyweight_lbs)
	{
		this.gender = gender.toUpperCase(;
		this.bodyweight_lbs = bodyweight_lbs;
	}

	public void benchPress()
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

	public void malerweight() // https://strengthlevel.com/strength-standards/bench-press
	{
		int weight = bodyweight_lbs;
		weight = ((weight + 5) / 10) * 10; // round to nearest ten

		switch(weight) {

			case 110:

				if (rweight < 53) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 53 && rweight < 84) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 84 && rweight < 125) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 125 && rweight < 173) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 173 && rweight < 227) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 227) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 120:

				if (rweight < 63) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 63 && rweight < 97) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 97 && rweight < 140) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 140 && rweight < 191) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 191 && rweight < 247) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 247) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 130:

				if (rweight < 73) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 73 && rweight < 109) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 109 && rweight < 154) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 154 && rweight < 208) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 208 && rweight < 266) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 266) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 140:

				if (rweight < 83) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 83 && rweight < 121) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 121 && rweight < 168) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 168 && rweight < 224) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 224 && rweight < 285) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 285) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 150:

				if (rweight < 92) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 92 && rweight < 132) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 132 && rweight < 182) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 182 && rweight < 240) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 240 && rweight < 302) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 302) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 160:

				if (rweight < 102) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 102 && rweight < 144) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 144 && rweight < 195) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 195 && rweight < 255) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 255 && rweight < 319) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 319) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 170:

				if (rweight < 111) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 111 && rweight < 155) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 155 && rweight < 208) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 208 && rweight < 270) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 270 && rweight < 336) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 336) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 180:

				if (rweight < 120) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 120 && rweight < 166) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 166 && rweight < 221) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 221 && rweight < 284) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 284 && rweight < 352) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 352) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 190:

				if (rweight < 129) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 129 && rweight < 176) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 176 && rweight < 233) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 233 && rweight < 298) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 298 && rweight < 367) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 367) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 200:

				if (rweight < 138) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 138 && rweight < 187) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 187 && rweight < 245) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 245 && rweight < 311) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 311 && rweight < 382) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 382) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 210:

				if (rweight < 147) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 147 && rweight < 197) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 197 && rweight < 257) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 257 && rweight < 324) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 324 && rweight < 396) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 396) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 220:

				if (rweight < 156) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 156 && rweight < 207) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 207 && rweight < 268) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 268 && rweight < 337) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 337 && rweight < 410) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 410) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 230:

				if (rweight < 164) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 164 && rweight < 216) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 216 && rweight < 279) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 279 && rweight < 349) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 349 && rweight < 424) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 424) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 240:

				if (rweight < 172) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 172 && rweight < 226) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 226 && rweight < 290) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 290 && rweight < 361) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 361 && rweight < 437) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 437) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 250:

				if (rweight < 181) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 181 && rweight < 235) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 235 && rweight < 300) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 300 && rweight < 373) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 373 && rweight < 450) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 450) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 260:

				if (rweight < 189) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 189 && rweight < 244) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 244 && rweight < 311) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 311 && rweight < 385) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 385 && rweight < 463) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 463) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 270:

				if (rweight < 196) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 196 && rweight < 253) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 253 && rweight < 321) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 321 && rweight < 396) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 396 && rweight < 475) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 475) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 280:

				if (rweight < 204) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 204 && rweight < 262) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 262 && rweight < 330) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 330 && rweight < 407) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 407 && rweight < 487) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 487) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 290:

				if (rweight < 212) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 212 && rweight < 271) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 271 && rweight < 340) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 340 && rweight < 417) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 417 && rweight < 499) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 499) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 300:

				if (rweight < 219) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 219 && rweight < 279) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 279 && rweight < 349) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 349 && rweight < 428) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 428 && rweight < 510) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 510) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 310:

				if (rweight < 227) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 227 && rweight < 287) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 287 && rweight < 359) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 359 && rweight < 438) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 438 && rweight < 521) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 521) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			default:

				Message += "\n!! Bodyweight not found within database (110-310 lbs.). Initializing averaged standards. !!";

				if (rweight < 103) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 103 && rweight < 153) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 153 && rweight < 216) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 216 && rweight < 291) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 291 && rweight < 371) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 371) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;
		}
	}

	public void femalerweight()
	{
		int weight = bodyweight_lbs;
		weight = ((weight + 5) / 10) * 10; // round to nearest ten

		switch(weight) {

			case 90:

				if (rweight < 19) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 19 && rweight < 41) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 41 && rweight < 72) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 72 && rweight < 111) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 111 && rweight < 157) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 157) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 100:

				if (rweight < 23) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 23 && rweight < 47) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 47 && rweight < 79) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 79 && rweight < 121) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 121 && rweight < 169) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 169) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 110:

				if (rweight < 27) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 27 && rweight < 52) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 52 && rweight < 87) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 87 && rweight < 130) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 130 && rweight < 179) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 179) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 120:

				if (rweight < 31) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 31 && rweight < 58) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 58 && rweight < 94) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 94 && rweight < 139) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 139 && rweight < 189) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 189) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 130:

				if (rweight < 35) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 35 && rweight < 63) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 63 && rweight < 101) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 101 && rweight < 147) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 147 && rweight < 199) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 199) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 140:

				if (rweight < 39) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 39 && rweight < 68) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 68 && rweight < 107) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 107 && rweight < 154) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 154 && rweight < 208) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 208) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 150:

				if (rweight < 43) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 43 && rweight < 73) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 73 && rweight < 113) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 113 && rweight < 162) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 162 && rweight < 216) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 216) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 160:

				if (rweight < 47) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 47 && rweight < 78) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 78 && rweight < 119) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 119 && rweight < 169) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 169 && rweight < 225) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 225) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 170:

				if (rweight < 50) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 50 && rweight < 82) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 82 && rweight < 125) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 125 && rweight < 176) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 176 && rweight < 232) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 232) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 180:

				if (rweight < 54) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 54 && rweight < 87) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 87 && rweight < 130) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 130 && rweight < 182) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 182 && rweight < 240) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 240) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 190:

				if (rweight < 57) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 57 && rweight < 91) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 91 && rweight < 136) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 136 && rweight < 188) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 188 && rweight < 247) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 247) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 200:

				if (rweight < 61) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 61 && rweight < 96) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 96 && rweight < 141) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 141 && rweight < 194) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 194 && rweight < 254) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 254) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 210:

				if (rweight < 64) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 64 && rweight < 100) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 100 && rweight < 146) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 146 && rweight < 200) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 200 && rweight < 261) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 261) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 220:

				if (rweight < 67) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 67 && rweight < 104) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 104 && rweight < 150) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 150 && rweight < 206) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 206 && rweight < 267) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 267) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 230:

				if (rweight < 70) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 70 && rweight < 107) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 107 && rweight < 155) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 155 && rweight < 211) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 211 && rweight < 273) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 273) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 240:

				if (rweight < 73) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 73 && rweight < 111) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 111 && rweight < 160) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 160 && rweight < 217) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 217 && rweight < 279) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 279) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 250:

				if (rweight < 76) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 76 && rweight < 115) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 115 && rweight < 164) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 164 && rweight < 222) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 222 && rweight < 285) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 285) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 260:

				if (rweight < 79) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 79 && rweight < 119) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 119 && rweight < 168) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 168 && rweight < 227) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 227 && rweight < 291) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 291) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			default:

				Message += "\n!! Bodyweight not found within database (90-260 lbs.). Initializing averaged standards. !!";

				if (rweight < 38) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 38 && rweight < 69) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 69 && rweight < 110) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 110 && rweight < 162) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 162 && rweight < 221) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 221) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
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

		Scanner choice = new Scanner(System.in;
		Scanner Message +=Exit = new Scanner(System.in; // Message += TO CHOOSEEXERCISE() AFTER MAKING CHOICE

		while (exercise != 0) {

			System.out.print("\n==============================\n *** EXERCISES ***\n==============================\n\n   (1) Bench Press\n   (2) Squat [WIP]\n   (3) Deadlift [WIP]\n   (4) Shoulder Press [WIP]\n   (5) Barbell Curl [WIP]\n\n   (0) [BACK TO SUBMENU]\n\nPlease choose an exercise: ";
			exercise = choice.nextInt(;

			switch(exercise) {

				case 0: // [EXIT MENU]
					break;

				case 1: // BENCH PRESS
					benchPress(;
					System.out.print("\nWould you like to Message += to the EXERCISES menu? (Y/N) ";
					exit = Message +=Exit.nextLine(;
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
