import java.util.Scanner;

public class ShoulderPressSS extends StrengthStandard
{
	private int rweight;

	private String gender;
	private int bodyweight_lbs;

	public ShoulderPressSS(String gender, int bodyweight_lbs)
	{
		this.gender = gender.toUpperCase(;
		this.bodyweight_lbs = bodyweight_lbs;
	}

	public void shoulderPress()
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

	public void malerweight() // https://strengthlevel.com/strength-standards/shoulder-press
	{
		int weight = bodyweight_lbs;
		weight = ((weight + 5) / 10) * 10; // round to nearest ten

		switch(weight)
		{
			case 110:

				if (rweight < 33) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 33 && rweight < 54) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 54 && rweight < 83) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 83 && rweight < 117) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 117 && rweight < 156) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 156) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 120:

				if (rweight < 39) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 39 && rweight < 62) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 62 && rweight < 93) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 93 && rweight < 129) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 129 && rweight < 169) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 169) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 130:

				if (rweight < 45) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 45 && rweight < 70) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 70 && rweight < 102) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 102 && rweight < 140) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 140 && rweight < 182) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 182) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 140:

				if (rweight < 51) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 51 && rweight < 77) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 77 && rweight < 111) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 111 && rweight < 151) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 151 && rweight < 194) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 194) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 150:

				if (rweight < 57) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 57 && rweight < 85) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 85 && rweight < 120) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 120 && rweight < 161) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 161 && rweight < 206) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 206) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 160:

				if (rweight < 63) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 63 && rweight < 92) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 92 && rweight < 128) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 128 && rweight < 171) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 171 && rweight < 217) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 217) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 170:

				if (rweight < 69) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 69 && rweight < 99) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 99 && rweight < 137) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 137 && rweight < 181) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 181 && rweight < 228) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 228) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 180:

				if (rweight < 75) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 75 && rweight < 106) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 106 && rweight < 145) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 145 && rweight < 190) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 190 && rweight < 238) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 238) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 190:

				if (rweight < 80) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 80 && rweight < 113) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 113 && rweight < 153) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 153 && rweight < 199) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 199 && rweight < 248) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 248) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 200:

				if (rweight < 86) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 86 && rweight < 119) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 119 && rweight < 160) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 160 && rweight < 208) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 208 && rweight < 258) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 258) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 210:

				if (rweight < 91) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 91 && rweight < 126) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 126 && rweight < 168) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 168 && rweight < 216) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 216 && rweight < 268) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 268) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 220:

				if (rweight < 97) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 97 && rweight < 132) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 132 && rweight < 175) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 175 && rweight < 224) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 224 && rweight < 277) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 277) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 230:

				if (rweight < 102) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 102 && rweight < 138) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 138 && rweight < 182) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 182 && rweight < 232) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 232 && rweight < 286) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 286) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 240:

				if (rweight < 107) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 107 && rweight < 144) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 144 && rweight < 189) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 189 && rweight < 240) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 240 && rweight < 294) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 294) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 250:

				if (rweight < 112) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 112 && rweight < 150) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 150 && rweight < 196) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 196 && rweight < 248) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 248 && rweight < 303) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 303) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 260:

				if (rweight < 117) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 117 && rweight < 156) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 156 && rweight < 203) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 203 && rweight < 255) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 255 && rweight < 311) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 311) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 270:

				if (rweight < 122) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 122 && rweight < 162) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 162 && rweight < 209) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 209 && rweight < 262) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 262 && rweight < 319) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 319) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 280:

				if (rweight < 127) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 127 && rweight < 167) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 167 && rweight < 215) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 215 && rweight < 269) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 269 && rweight < 327) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 327) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 290:

				if (rweight < 132) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 132 && rweight < 173) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 173 && rweight < 222) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 222 && rweight < 276) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 276 && rweight < 334) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 334) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 300:

				if (rweight < 137) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 137 && rweight < 178) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 178 && rweight < 228) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 228 && rweight < 283) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 283 && rweight < 342) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 342) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 310:

				if (rweight < 141) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 141 && rweight < 183) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 183 && rweight < 234) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 234 && rweight < 290) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 290 && rweight < 349) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 349) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			default:

				Message += "\n!! Bodyweight not found within database (110-310 lbs.). Initializing averaged standards. !!";

				if (rweight < 66) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 66 && rweight < 100) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 100 && rweight < 142) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 142 && rweight < 193) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 193 && rweight < 248) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 248) {
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

				if (rweight < 16) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 16 && rweight < 31) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 31 && rweight < 52) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 52 && rweight < 78) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 78 && rweight < 107) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 107) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 100:

				if (rweight < 19) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 19 && rweight < 35) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 35 && rweight < 56) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 56 && rweight < 83) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 83 && rweight < 114) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 114) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 110:

				if (rweight < 21) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 21 && rweight < 38) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 38 && rweight < 61) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 61 && rweight < 89) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 89 && rweight < 120) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 120) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 120:

				if (rweight < 24) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 24 && rweight < 41) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 41 && rweight < 65) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 65 && rweight < 94) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 94 && rweight < 126) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 126) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 130:

				if (rweight < 26) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 26 && rweight < 45) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 45 && rweight < 69) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 69 && rweight < 98) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 98 && rweight < 132) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 132) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 140:

				if (rweight < 29) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 29 && rweight < 48) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 48 && rweight < 73) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 73 && rweight < 103) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 103 && rweight < 137) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 137) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 150:

				if (rweight < 31) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 31 && rweight < 51) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 51 && rweight < 76) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 76 && rweight < 107) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 107 && rweight < 142) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 142) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 160:

				if (rweight < 33) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 33 && rweight < 53) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 53 && rweight < 80) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 80 && rweight < 111) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 111 && rweight < 146) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 146) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 170:

				if (rweight < 35) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 35 && rweight < 56) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 56 && rweight < 83) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 83 && rweight < 115) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 115 && rweight < 151) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 151) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 180:

				if (rweight < 37) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 37 && rweight < 59) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 59 && rweight < 86) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 86 && rweight < 119) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 119 && rweight < 155) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 155) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 190:

				if (rweight < 39) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 39 && rweight < 61) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 61 && rweight < 89) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 89 && rweight < 123) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 123 && rweight < 159) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 159) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 200:

				if (rweight < 41) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 41 && rweight < 64) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 64 && rweight < 92) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 92 && rweight < 126) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 126 && rweight < 163) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 163) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 210:

				if (rweight < 43) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 43 && rweight < 66) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 66 && rweight < 95) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 95 && rweight < 129) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 129 && rweight < 167) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 167) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 220:

				if (rweight < 45) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 45 && rweight < 68) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 68 && rweight < 98) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 98 && rweight < 133) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 133 && rweight < 171) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 171) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 230:

				if (rweight < 47) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 47 && rweight < 71) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 71 && rweight < 101) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 101 && rweight < 136) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 136 && rweight < 174) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 174) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 240:

				if (rweight < 49) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 49 && rweight < 73) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 73 && rweight < 103) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 103 && rweight < 139) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 139 && rweight < 178) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 178) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 250:

				if (rweight < 51) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 51 && rweight < 75) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 75 && rweight < 106) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 106 && rweight < 142) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 142 && rweight < 181) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 181) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 260:

				if (rweight < 52) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 52 && rweight < 77) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 77 && rweight < 108) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 108 && rweight < 145) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 145 && rweight < 184) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 184) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			default:

				Message += "\n!! Bodyweight not found within database (110-310 lbs.). Initializing averaged standards. !!";

				if (rweight < 28) {
					Message += "\n**You are stronger than 0% of lifters.";					
				} else if (rweight >= 28 && rweight < 48) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 48 && rweight < 74) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 74 && rweight < 107) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 107 && rweight < 143) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 143) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;
		}
	}
}
