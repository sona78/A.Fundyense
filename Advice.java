
public class Advice extends Toxicity {
	public static String AmmOut;
	public static String NitOut;
	public static String PhosOut;
	public static String MonthOut;
	public static String DistOut;
	public static String DINOut;
	public static String AfunOut;
	public static String GeneralAdvice;
	public static Double Choice;
	public void ReturnChoice() {
		//Maximum value
		Choice = Math.max(Math.max(AmmVal, PhosVal),Math.max(AmmVal, NitVal));
		//Growth Advice
		if (AmmVal >= 10 || Choice == AmmVal) {
			AmmOut = (" ***** High levels of ammonium in the water dramatically increase the A. fundyense bloom since the dinoflagellates use the nitrogen for nutrients. A few possible causes for the high ammonium level may be agricultural runoff (Fertilizer, Livestock Waste) or atmospheric deposition due to combustion processes in the"
					+ " region. The next course of action is to limit factory usage in the area and manage farmland fertilizer to prevent runoff.");
		}
		if (NitVal >= 9 || Choice == NitVal) {
			NitOut = (" ***** Low nitrate levels are actually necessary for high A. fundyense growth, contrary to belief. Natural increase of nitrates actually reduce the A. fundyense level so periods of low nitrates during the peak season should be avoided.");
		}
		if (PhosVal >= 9 || Choice == PhosVal) {
			PhosOut = (" ***** High Phosphate levels can be an increasing factor on A. fundyense due to the water conditions. The next course of action is to replace traditional fertilizers with a no-phosphorus fertilizer to reduce runoff. Other options include reducing organic matter that is polluting the ocean.");
		}
		if (Month == 5) {
			MonthOut = (" ***** As May is usually the peak of any algal bloom, a course of action is to increase prevention methods to stop bloom and toxicity from escalating in this period.");
		}
		if (0< Dist && Dist <= 10) {
			DistOut = (" ***** As this bloom is occuring so close to the coast, the intensity is much greater, so a course of action is to secure all runoff into the ocean.");
		}
		
		if (DIN >= 1.5) {
			DINOut = ("***** Dissolved Inorganic Nitrogen includes nitrates, nitrites, ammonium, and other forms of nitrogen. The next course of action is to limit fertilizer runoff into the ocean and manage septic security in the watershed to avoid an increase in the bloom as well as avoid ideal conditions for A. fundyense.");
		}
		if (10<= Afun) {
			AfunOut = (" ***** Due to the high concentration of A. fundyense cells, this bloom will have a high level of toxicity. A further course of action is to expedite general action to resolve the Harmful Algal Bloom to mitigate the effects it will have.");
		}
		GeneralAdvice = (" ******* This bloom should be mitigated by limiting all fertilizer and sewage runoff that may be polluting the watershed, continuing to secure the area to prevent human contact with the algal bloom, continuing clay application to mitigate the bloom, and regularly testing the water for the prescence of A. fundyense.");
		// Null values
		if (AmmVal == 0) {
			AmmOut = ("No Value Entered for Advice");
		}
		if (NitVal == 0) {
			NitOut = ("No Value Entered for Advice");
		}
		if (PhosVal == 0) {
			PhosOut = ("No Value Entered for Advice");
		}
		if (DIN == 1030) {
			DINOut = ("No Value Entered for Advice");
		}
		if (Month == 1030) {
			MonthOut = ("No Value Entered for Advice");
		}
		if (Dist == 0) {
			DistOut = "";
		}
		if (Afun == 0) {
			GeneralAdvice = ("No Values Entered for Advice");
		}
		if (LatMessage == null) {
			LatMessage = "";
		}
		// If the value is not in the advice range
		if (AmmVal < 10 ) {
			AmmOut = ("");
		}
		if (NitVal < 9) {
			NitOut = ("");
		}
		if (PhosVal < 9) {
			PhosOut = ("");
		}
		if (DIN < 1.5) {
			DINOut = ("");
		}
		if (Month != 5) {
			MonthOut = ("");
		}
		if (Dist > 10) {
			DistOut = ("");
		}
		if (Afun < 10) {
			AfunOut = ("");
		}
		//Move to next class
		UserOutput GiveRes = new UserOutput();
		GiveRes.GiveResult();
	}
	}

