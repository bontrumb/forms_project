package calc;

import data.UserData;

import java.util.ArrayList;
/**Class that stores all results of the calculations.
 */
public class UserData_Calc
{
	/**Object for Display_Caloric.
	 */
	private Display_Caloric DC;
	/**Object for Basal_Metabolic.
	 */
	private Basal_Metabolic BM;
	/**Object for FFMI.
	 */
	private FFMI FFMI;
	/**Object for VO2_Max.
	 */
	private VO2_Max VO2_Max;
	/**Object for BMI.
	 */
	private BMI BMI;
	/**Sets the array of calculations to be accessed.
	 */
	private Barbell_Curl BC;
	private Bench_Press BP;
	private Deadlift DL;
	private Shoulder_Press SP;
	private Squat SQ;
	private Calc_Abstract[] List_Calc = {DC, BM, FFMI, 
		BMI, VO2_Max, BC, BP, DL, SP, SQ
	};
	/**An ArrayList object for all the calculations.
	 */
	private ArrayList<Calc_Abstract> ArrayCalc = new ArrayList<Calc_Abstract>();
	/**Constructs the results of the #UserData.
	 * @param	z	User's data.
	 */
	public UserData_Calc(UserData z) {
		DC = new Display_Caloric(z);
		BM = new Basal_Metabolic(z);
		FFMI = new FFMI(z);
		//VO2_Max = new VO2_Max(z);
		BMI = new BMI(z);
		//LS = new Lifting_Stats(z);
		BC = new Barbell_Curl(z);
		BP = new Bench_Press(z);
		DL = new Deadlift(z);
		SP = new Shoulder_Press(z);
		SQ = new Squat(z);
		//
		Init_Data();
	}
	// get methods
	/**Returns Display_Caloric values.
	 */
	public Object GetDC() {
		return DC.Result();
	}
	/**Returns Basal_Metabolic values.
	 */
	public Object GetBM() {
		return BM.Result();
	}
	/**Returns FFMI values.
	 */
	public Object GetFFMI() {
		return FFMI.Result();
	}
	/**Returns VO2_Max values.
	 */
	public Object GetVO2_Max() {
		return VO2_Max.Result();
	}
	/**Returns BMI values.
	 */
	public Object GetBMI() {
		return BMI.Result();
	}
	//
	public Object GetBC() {
		return BC.Result();
	}
	public Object GetBP() {
		return BP.Result();
	}
	public Object GetDL() {
		return DL.Result();
	}
	public Object GetSP() {
		return SP.Result();
	}
	public Object GetSQ() {
		return SQ.Result();
	}
	//
	/**Initializes the calculation values into #ArrayCalc.
	 */
	private void Init_Data() {
		for (Calc_Abstract o : List_Calc) {
			this.ArrayCalc.add(o);
		}
	}
}
