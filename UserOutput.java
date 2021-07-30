import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

//Output area
public class UserOutput extends Advice{

	//Framework Strings
	public static String ToxicSet;
	public static String GrowthSet;
	public static String ShortGrowthSet;
	public static String AdviceSet;
	
	// Advice Strings
	public static String Advice1;
	StringBuffer Space1 = new StringBuffer();
	public static String Advice2;
	StringBuffer Space2 = new StringBuffer();
	public static String Advice3;
	StringBuffer Space3 = new StringBuffer();
	public static String Advice4;
	StringBuffer Space4 = new StringBuffer();
	public static String Advice5;
	StringBuffer Space5 = new StringBuffer();
	public static String Advice6;
	StringBuffer Space6 = new StringBuffer();
	public static String Advice7;
	StringBuffer Space7 = new StringBuffer();
	public static String AdviceLat;
	StringBuffer SpaceLat = new StringBuffer();
	public static String AdviceGen;
	StringBuffer SpaceGen = new StringBuffer();
	//Results area
	static GraphicsConfiguration gc;
	static JTextArea ReportGen,Title, ValuesTitle, Values, ResultTitle1, ResultTitle2, AdviceTitle, Result, Toxicity, Advice, FINAL;
	BoxLayout boxLayout;
	String newSpace = System.lineSeparator();
	public void GiveResult() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime Time = LocalDateTime.now();  
		// A. fundyense value
		switch (Afun) {
		 // 0 = No predictable bloom, 1= 10-20, 2 = 20-30, 3 = 30-50, 4 = 50-100, 5 = 100-200, 6 - 200-300, 7= 300-400, 8 = 400-500, 9 = 500-700, 10 = 700-1000, 11 = 1000-2000, 12 = 2000+
		case (0):
			AfunString = "No predictable bloom";
		break;
		case (1):
			AfunString = "10 - 20";
		break;
		case (2):
			AfunString = "20 - 30";
		break;
		case (3):
			AfunString = "30 - 50";
		break;
		case (4):
			AfunString = "50 - 100";
		break;
		case (5):
			AfunString = "100 - 200";
		break;
		case (6):
			AfunString = "200 - 300";
		break;
		case (7):
			AfunString = "300 - 400";
		break;
		case (8):
			AfunString = "400 - 500";
		break;
		case (9):
			AfunString = "500 - 700";
		break;
		case (10):
			AfunString = "700 - 1000";
		break;
		case (11):
			AfunString = "1000 - 2000";
		break;
		case (12):
			AfunString = "< 2000";
		break;

		}
		switch (AfunShort) {
		 // 0 = No predictable bloom, 1= 10-20, 2 = 20-30, 3 = 30-50, 4 = 50-100, 5 = 100-200, 6 - 200-300, 7= 300-400, 8 = 400-500, 9 = 500-700, 10 = 700-1000, 11 = 1000-2000, 12 = 2000+
		case (0):
			AfunStringShort = "No predictable bloom";
		break;
		case (1):
			AfunStringShort = "10 - 20";
		break;
		case (2):
			AfunStringShort = "20 - 30";
		break;
		case (3):
			AfunStringShort = "30 - 50";
		break;
		case (4):
			AfunStringShort = "50 - 100";
		break;
		case (5):
			AfunStringShort = "100 - 200";
		break;
		case (6):
			AfunStringShort = "200 - 300";
		break;
		case (7):
			AfunStringShort = "300 - 400";
		break;
		case (8):
			AfunStringShort = "400 - 500";
		break;
		case (9):
			AfunStringShort = "500 - 700";
		break;
		case (10):
			AfunStringShort = "700 - 1000";
		break;
		case (11):
			AfunStringShort = "1000 - 2000";
		break;
		case (12):
			AfunStringShort = "< 2000";
		break;

		}
		GrowthSet = ("The Estimated Range of Cells per Liter for A. fundyense for the peak of the bloom is: ");
		ShortGrowthSet = ("The Estimated Range of Cells per Liter for A. fundyense for the short term prediction of the bloom is: ");
		// Toxicity value
		if (ToxicVal == 0) {
			ToxicString = "Not Enough Information to calculate Toxicity";
		}
		if (0< ToxicVal && ToxicVal < 1.5) {
			ToxicString = "Low";
		}
		if (1.5 <= ToxicVal && ToxicVal < 2.5) {
			ToxicString = "Medium";
		}
		if (2.5 <= ToxicVal && ToxicVal <= 3) {
			ToxicString = "High";
		}
		ToxicSet = ("The Estimated Toxicity for this A. fundyense Bloom is: ");
		//Advice Area
		Advice1 = ("Ammonium Advice: " + AmmOut + newSpace);
		Advice2 = ("Phosphate Advice: " + PhosOut+ newSpace);
		Advice3 = ("Nitrate Advice: " + NitOut + newSpace);
		Advice4 = ("DIN Advice: " + DINOut + newSpace);
		Advice5 = ("Timeframe Advice: " + MonthOut + newSpace);
		Advice6 = ("Distance Range Advice: " + DistOut + newSpace);
		Advice7 = ("A. fundyense level Advice: " + AfunOut + newSpace);
		AdviceLat = ("Lattitude Message: " + LatMessage + newSpace);
		AdviceGen = ("General Advice: " + GeneralAdvice + newSpace);
		
		AdviceSet = ("Advice in order to stop the bloom: ");

		JFrame Results = new JFrame (gc);
		Results.setTitle("Results for A. fundyense Application");
		boxLayout = new BoxLayout(Results.getContentPane(), BoxLayout.Y_AXIS);
		Results.setLayout(boxLayout);
		Results.pack();
		//Results.setSize(1000,1500);
		Results.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		Results.setVisible(true);
		Results.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ReportGen = new JTextArea("The Report was generated on " + dtf.format(Time));
		ReportGen.setFont(new Font("Serif", Font.BOLD, 14));
		ReportGen.setEditable(false);
		
		Title = new JTextArea ("                                        Results for A. fundyense Prediction Application                                        ");
		Title.setFont(new Font("Serif", Font.BOLD, 48));
		Title.setLineWrap(true);
		Title.setEditable(false);
		
		ValuesTitle = new JTextArea("Your Given Values Are: ");
		ValuesTitle.setFont(new Font("Serif", Font.BOLD, 24));
		ValuesTitle.setLineWrap(true);
		ValuesTitle.setEditable(false);
		//Values = new String("Ammonium Content (μM per L): " + Amm + newSpace + "Nitrate Content (μM per L): " + Nit + newSpace + "Phosphate Content (μM per L): " + Phos + newSpace + "Water Salinity (ppt): " + Sal + newSpace + "Water Temperature (°C): " + Temp + newSpace + "Silicate Level (μM per L): " + Sil + newSpace + "Month of the Year: " + Month + newSpace + "Lattitude: " + Lat + newSpace + "Dissolved Inorganic Nitrogen Content(DIN)(μM per L): " + DIN + newSpace + "Dissolved Organic Nitrogen Content(DON)(μM per L): " + DON + newSpace + "Distance from the Coast(miles): " + Dist + newSpace);
		Values = new JTextArea("Ammonium Content (μM per L): " + Amm + newSpace
								+ "Nitrate Content (μM per L): " + Nit + newSpace
								+ "Phosphate Content (μM per L): " + Phos + newSpace
								+ "Water Salinity (ppt): " + Sal + newSpace
								+ "Water Temperature (°C): " + Temp + newSpace
								+ "Silicate Level (μM per L): " + Sil + newSpace
								+ "Month of the Year: " + Month + newSpace
								+ "Lattitude: " + Lat + newSpace
								+ "Dissolved Inorganic Nitrogen Content(DIN)(μM per L): " + DIN + newSpace
								+ "Dissolved Organic Nitrogen Content(DON)(μM per L): " + DON + newSpace
								+ "Distance from the Coast(miles): " + Dist + newSpace);
		Values.setFont(new Font("Serif", Font.PLAIN, 14));
		Values.setLineWrap(true);
		Values.setEditable(false);
		
		ResultTitle1 = new JTextArea ("Results for A. fundyense Bloom: ");
		ResultTitle1.setFont(new Font("Serif", Font.BOLD, 24));
		ResultTitle1.setLineWrap(true);
		ResultTitle1.setEditable(false);
		
		Result = new JTextArea (GrowthSet + AfunString + newSpace + ShortGrowthSet + AfunStringShort);
		Result.setFont(new Font("Serif", Font.PLAIN, 14));
		Result.setLineWrap(true);
		Result.setEditable(false);
		
		ResultTitle2 = new JTextArea ("Results for A. fundyense Toxicity: ");
		ResultTitle2.setFont(new Font("Serif", Font.BOLD, 24));
		ResultTitle2.setLineWrap(true);
		ResultTitle2.setEditable(false);
		
		Toxicity = new JTextArea (ToxicSet + ToxicString );
		Toxicity.setFont(new Font("Serif", Font.PLAIN, 14));
		Toxicity.setLineWrap(true);
		Toxicity.setEditable(false);
		
		AdviceTitle = new JTextArea (AdviceSet);
		AdviceTitle.setFont(new Font("Serif", Font.BOLD, 24));
		AdviceTitle.setLineWrap(true);
		AdviceTitle.setEditable(false);
		
		Advice = new JTextArea (Advice1 + Space1
								+ Advice2 + Space2
								+ Advice3 + Space3
								+ Advice4 + Space4
								+ Advice5 + Space5
								+ Advice6 + Space6
								+ Advice7 + Space7
								+ AdviceLat + SpaceLat
								+ AdviceGen + SpaceGen);
		Advice.setFont(new Font("Serif", Font.PLAIN, 14));
		Advice.setLineWrap(true);
		Advice.setEditable(false);
		
		FINAL = new JTextArea ("Thank you for using this A. fundyense prediction application!");
		FINAL.setFont(new Font("Serif", Font.BOLD, 14));
		FINAL.setLineWrap(true);
		FINAL.setEditable(false);
		
		//Display all results
		Results.add(ReportGen);
	
		Results.add(Title);
		
		Results.add(ValuesTitle);
		
		Results.add(Values);
		Results.add(ResultTitle1);
		Results.add(Result);
		Results.add(ResultTitle2);
		Results.add(Toxicity);
		Results.add(AdviceTitle);
		Results.add(Advice);
		Results.add(FINAL);
		

	}
}
