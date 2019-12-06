package calc;
import data.UserData;
public class Barbell_Curl extends Lifting_Abstract
{
	public Barbell_Curl(UserData z) {
		super(z, "Barbell_Curl");
	}
	protected String MaleStandard(int weight, int rweight) {
		String Message = "";
		switch(weight)
		{
			case 110:

				if (rweight < 20) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 20 && rweight < 39) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 39 && rweight < 67) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 67 && rweight < 102) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 102 && rweight < 142) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 142) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 120:

				if (rweight < 23) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 23 && rweight < 44) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 44 && rweight < 73) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 73 && rweight < 110) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 110 && rweight < 151) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 151) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 130:

				if (rweight < 27) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 27 && rweight < 49) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 49 && rweight < 80) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 80 && rweight < 117) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 117 && rweight < 160) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 160) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 140:

				if (rweight < 30) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 30 && rweight < 54) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 54 && rweight < 86) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 86 && rweight < 125) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 125 && rweight < 169) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 169) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 150:

				if (rweight < 34) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 34 && rweight < 58) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 58 && rweight < 91) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 91 && rweight < 132) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 132 && rweight < 177) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 177) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 160:

				if (rweight < 37) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 37 && rweight < 63) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 63 && rweight < 97) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 97 && rweight < 138) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 138 && rweight < 185) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 185) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 170:

				if (rweight < 41) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 41 && rweight < 67) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 67 && rweight < 102) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 102 && rweight < 145) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 145 && rweight < 192) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 192) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 180:

				if (rweight < 44) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 44 && rweight < 72) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 72 && rweight < 108) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 108 && rweight < 151) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 151 && rweight < 199) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 199) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 190:

				if (rweight < 47) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 47 && rweight < 76) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 76 && rweight < 113) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 113 && rweight < 157) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 157 && rweight < 206) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 206) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 200:

				if (rweight < 51) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 51 && rweight < 80) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 80 && rweight < 118) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 118 && rweight < 163) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 163 && rweight < 213) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 213) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 210:

				if (rweight < 54) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 54 && rweight < 84) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 84 && rweight < 123) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 123 && rweight < 169) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 169 && rweight < 220) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 220) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 220:

				if (rweight < 57) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 57 && rweight < 88) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 88 && rweight < 127) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 127 && rweight < 174) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 174 && rweight < 226) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 226) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 230:

				if (rweight < 60) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 60 && rweight < 91) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 91 && rweight < 132) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 132 && rweight < 179) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 179 && rweight < 232) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 232) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 240:

				if (rweight < 63) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 63 && rweight < 95) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 95 && rweight < 136) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 136 && rweight < 185) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 185 && rweight < 238) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 238) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 250:

				if (rweight < 66) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 66 && rweight < 99) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 99 && rweight < 140) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 140 && rweight < 190) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 190 && rweight < 243) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 243) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 260:

				if (rweight < 69) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 69 && rweight < 102) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 102 && rweight < 145) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 145 && rweight < 194) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 194 && rweight < 249) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 249) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 270:

				if (rweight < 71) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 71 && rweight < 106) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 106 && rweight < 149) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 149 && rweight < 199) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 199 && rweight < 254) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 254) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 280:

				if (rweight < 74) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 74 && rweight < 109) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 109 && rweight < 153) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 153 && rweight < 204) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 204 && rweight < 259) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 259) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 290:

				if (rweight < 77) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 77 && rweight < 112) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 112 && rweight < 157) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 157 && rweight < 208) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 208 && rweight < 265) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 265) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 300:

				if (rweight < 80) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 80 && rweight < 116) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 116 && rweight < 161) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 161 && rweight < 213) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 213 && rweight < 269) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 269) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 310:

				if (rweight < 82) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 82 && rweight < 119) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 119 && rweight < 164) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 164 && rweight < 217) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 217 && rweight < 274) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 274) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			default:

				Message += "\n!! Bodyweight not found within database (110-310 lbs.). Initializing averaged standards. !!";

				if (rweight < 38) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 38 && rweight < 66) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 66 && rweight < 104) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 104 && rweight < 149) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 149 && rweight < 201) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 201) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;
		}
		return Message;
	}
	protected String FemaleStandard(int weight, int rweight) {
		String Message = "";
		switch(weight)
		{
			case 90:

				if (rweight < 7) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 7 && rweight < 19) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 19 && rweight < 37) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 37 && rweight < 62) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 62 && rweight < 91) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 91) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 100:

				if (rweight < 9) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 9 && rweight < 22) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 22 && rweight < 41) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 41 && rweight < 66) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 66 && rweight < 96) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 96) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 110:

				if (rweight < 10) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 10 && rweight < 24) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 24 && rweight < 44) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 44 && rweight < 71) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 71 && rweight < 102) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 102) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 120:

				if (rweight < 12) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 12 && rweight < 26) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 26 && rweight < 47) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 47 && rweight < 75) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 75 && rweight < 106) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 106) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 130:

				if (rweight < 14) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 14 && rweight < 29) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 29 && rweight < 50) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 50 && rweight < 78) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 78 && rweight < 111) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 111) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 140:

				if (rweight < 15) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 15 && rweight < 31) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 31 && rweight < 53) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 53 && rweight < 82) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 82 && rweight < 115) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 115) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 150:

				if (rweight < 17) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 17 && rweight < 33) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 33 && rweight < 56) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 56 && rweight < 85) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 85 && rweight < 119) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 119) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 160:

				if (rweight < 18) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 18 && rweight < 35) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 35 && rweight < 59) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 59 && rweight < 89) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 89 && rweight < 123) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 123) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 170:

				if (rweight < 19) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 19 && rweight < 37) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 37 && rweight < 61) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 61 && rweight < 92) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 92 && rweight < 127) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 127) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 180:

				if (rweight < 21) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 21 && rweight < 39) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 39 && rweight < 64) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 64 && rweight < 95) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 95 && rweight < 130) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 130) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 190:

				if (rweight < 22) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 22 && rweight < 41) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 41 && rweight < 66) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 66 && rweight < 98) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 98 && rweight < 133) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 133) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 200:

				if (rweight < 23) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 23 && rweight < 42) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 42 && rweight < 68) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 68 && rweight < 100) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 100 && rweight < 137) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 137) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 210:

				if (rweight < 25) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 25 && rweight < 44) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 44 && rweight < 70) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 70 && rweight < 103) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 103 && rweight < 140) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 140) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 220:

				if (rweight < 26) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 26 && rweight < 46) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 46 && rweight < 73) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 73 && rweight < 105) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 105 && rweight < 143) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 143) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 230:

				if (rweight < 27) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 27 && rweight < 47) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 47 && rweight < 75) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 75 && rweight < 108) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 108 && rweight < 145) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 145) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 240:

				if (rweight < 28) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 28 && rweight < 49) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 49 && rweight < 77) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 77 && rweight < 110) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 110 && rweight < 148) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 148) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 250:

				if (rweight < 30) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 30 && rweight < 51) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 51 && rweight < 79) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 79 && rweight < 113) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 113 && rweight < 151) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 151) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			case 260:

				if (rweight < 31) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 31 && rweight < 52) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 52 && rweight < 80) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 80 && rweight < 115) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 115 && rweight < 154) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 154) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;

			default:

				Message += "\n!! Bodyweight not found within database (110-310 lbs.). Initializing averaged standards. !!";

				if (rweight < 14) {
					Message += "\n**You are stronger than 0% of lifters.";
				} else if (rweight >= 14 && rweight < 31) {
					Message += "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (rweight >= 31 && rweight < 54) {
					Message += "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (rweight >= 54 && rweight < 84) {
					Message += "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (rweight >= 84 && rweight < 119) {
					Message += "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (rweight >= 119) {
					Message += "\n**You are stronger than 95% of lifters (ELITE).";
				}
				break;
		}
		return Message;
	}
}
