import java.util.Scanner;
/**Calculates and returns Lifting Stats values.
 */
public class Lifting_Stats extends Calc_Abstract
{
	private String BC, BP, DL, SP, SQ;
	private static String gender;
	private static int bodyweight_lbs;
	// private String[] LS_Array; //= {BC, BP, DL, SP, SQ}; 
	/**Constructor for the class that uses #UserData.
	 * @param	z	User's data.
	 */
	public Lifting_Stats(UserData z) {
		super(z, "Lifting Stats", "");
	}
	/**The body of the calculations.
	 * @param	use	Instance of using the user's values
	 *			to calculate the value of the class.
	 */
	public Object Result(int choice) {
		String[] LS_Array = {BC, BP, DL};
		return LS_Array[choice];
	}
	protected Object Method(UserData_Tools use) {
		this.gender = (String) use.Get("Gender");
		System.out.println(this.gender);
		this.bodyweight_lbs = (int) ((double) use.Get("Weight"));
		System.out.println(this.bodyweight_lbs);
		this.BC = Calc_BC(this.gender, this.bodyweight_lbs);
		this.BP = null;
		this.DL = null;
		this.SP = null;
		this.SQ = null;
		return null;
	}
	// Barbell Curls
	private String Calc_BC(String gender, int weight) {
		Scanner standard = new Scanner(System.in);
		System.out.print("\nEnter your one-rep max lift (lbs.): ");
		int bbcStandard = standard.nextInt();

		if (gender.equals("M")) {
			return maleBBCStandard(bbcStandard, weight);
		} else if (gender.equals("F")) {
			return femaleBBCStandard(bbcStandard, weight);
		} else {
			return "No Info!";
		}
	}

	private String maleBBCStandard(int bbcStandard, int weight) {
		int temp_bodyweight = weight;
		temp_bodyweight = ((temp_bodyweight + 5) / 10) * 10; // round to nearest ten

		switch(temp_bodyweight)
		{
			case 110:

				if (bbcStandard < 20) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 20 && bbcStandard < 39) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 39 && bbcStandard < 67) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 67 && bbcStandard < 102) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 102 && bbcStandard < 142) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 142) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				}
				

			case 120:

				if (bbcStandard < 23) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 23 && bbcStandard < 44) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 44 && bbcStandard < 73) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 73 && bbcStandard < 110) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 110 && bbcStandard < 151) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 151) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				}
				

			case 130:

				if (bbcStandard < 27) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 27 && bbcStandard < 49) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 49 && bbcStandard < 80) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 80 && bbcStandard < 117) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 117 && bbcStandard < 160) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 160) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				}
				

			case 140:

				if (bbcStandard < 30) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 30 && bbcStandard < 54) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 54 && bbcStandard < 86) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 86 && bbcStandard < 125) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 125 && bbcStandard < 169) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 169) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				}
				

			case 150:

				if (bbcStandard < 34) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 34 && bbcStandard < 58) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 58 && bbcStandard < 91) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 91 && bbcStandard < 132) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 132 && bbcStandard < 177) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 177) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				}
				

			case 160:

				if (bbcStandard < 37) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 37 && bbcStandard < 63) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 63 && bbcStandard < 97) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 97 && bbcStandard < 138) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 138 && bbcStandard < 185) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 185) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				}
				

			case 170:

				if (bbcStandard < 41) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 41 && bbcStandard < 67) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 67 && bbcStandard < 102) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 102 && bbcStandard < 145) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 145 && bbcStandard < 192) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 192) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				}
				

			case 180:

				if (bbcStandard < 44) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 44 && bbcStandard < 72) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 72 && bbcStandard < 108) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 108 && bbcStandard < 151) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 151 && bbcStandard < 199) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 199) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				}
				

			case 190:

				if (bbcStandard < 47) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 47 && bbcStandard < 76) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 76 && bbcStandard < 113) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 113 && bbcStandard < 157) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 157 && bbcStandard < 206) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 206) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				}
				

			case 200:

				if (bbcStandard < 51) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 51 && bbcStandard < 80) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 80 && bbcStandard < 118) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 118 && bbcStandard < 163) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 163 && bbcStandard < 213) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 213) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				}
				

			case 210:

				if (bbcStandard < 54) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 54 && bbcStandard < 84) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 84 && bbcStandard < 123) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 123 && bbcStandard < 169) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 169 && bbcStandard < 220) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 220) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				}
				

			case 220:

				if (bbcStandard < 57) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 57 && bbcStandard < 88) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 88 && bbcStandard < 127) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 127 && bbcStandard < 174) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 174 && bbcStandard < 226) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 226) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				}
				

			case 230:

				if (bbcStandard < 60) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 60 && bbcStandard < 91) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 91 && bbcStandard < 132) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 132 && bbcStandard < 179) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 179 && bbcStandard < 232) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 232) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				}
				

			case 240:

				if (bbcStandard < 63) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 63 && bbcStandard < 95) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 95 && bbcStandard < 136) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 136 && bbcStandard < 185) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 185 && bbcStandard < 238) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 238) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				}
				

			case 250:

				if (bbcStandard < 66) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 66 && bbcStandard < 99) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 99 && bbcStandard < 140) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 140 && bbcStandard < 190) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 190 && bbcStandard < 243) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 243) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				}
				

			case 260:

				if (bbcStandard < 69) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 69 && bbcStandard < 102) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 102 && bbcStandard < 145) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 145 && bbcStandard < 194) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 194 && bbcStandard < 249) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 249) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				}
				

			case 270:

				if (bbcStandard < 71) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 71 && bbcStandard < 106) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 106 && bbcStandard < 149) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 149 && bbcStandard < 199) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 199 && bbcStandard < 254) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 254) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				}
				

			case 280:

				if (bbcStandard < 74) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 74 && bbcStandard < 109) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 109 && bbcStandard < 153) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 153 && bbcStandard < 204) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 204 && bbcStandard < 259) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 259) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				}
				

			case 290:

				if (bbcStandard < 77) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 77 && bbcStandard < 112) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 112 && bbcStandard < 157) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 157 && bbcStandard < 208) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 208 && bbcStandard < 265) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 265) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				}
				

			case 300:

				if (bbcStandard < 80) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 80 && bbcStandard < 116) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 116 && bbcStandard < 161) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 161 && bbcStandard < 213) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 213 && bbcStandard < 269) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 269) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				}
				

			case 310:

				if (bbcStandard < 82) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 82 && bbcStandard < 119) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 119 && bbcStandard < 164) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 164 && bbcStandard < 217) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 217 && bbcStandard < 274) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 274) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				}
				

			default:

				System.out.println("\n!! Bodyweight not found within database (110-310 lbs.). Initializing averaged standards. !!");

				if (bbcStandard < 38) {
					return "\n**You are stronger than 0% of lifters.";					
				} else if (bbcStandard >= 38 && bbcStandard < 66) {
					return "\n**You are stronger than 5% of lifters (BEGINNER).";
				} else if (bbcStandard >= 66 && bbcStandard < 104) {
					return "\n**You are stronger than 20% of lifters (NOVICE).";
				} else if (bbcStandard >= 104 && bbcStandard < 149) {
					return "\n**You are stronger than 50% of lifters (INTERMEDIATE).";
				} else if (bbcStandard >= 149 && bbcStandard < 201) {
					return "\n**You are stronger than 80% of lifters (ADVANCED).";
				} else if (bbcStandard >= 201) {
					return "\n**You are stronger than 95% of lifters (ELITE).";
				} else {
					return "No info!";
				}
		}
	}

	private String femaleBBCStandard(int bbcStandard, int weight) {
		return "Hah";
	}
}
