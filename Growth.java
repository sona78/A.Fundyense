
public class Growth extends UserInput{
	public double DINDON = 1030.0;
	public double NP = 1030.0;
	public double GrowthVal; // 0 = No predictable bloom, 1= 10-20, 2 = 20-30, 3 = 30-50, 4 = 50-100, 5 = 100-200, 6 - 200-300, 7= 300-400, 8 = 400-500, 9 = 500-700, 10 = 700-1000, 11 = 1000-2000, 12 = 2000+
	// Next 11 values are to clarify ranges of each value
	public static double AmmVal = 13;
	public static double NitVal = 13;
	public static double PhosVal = 13;
	public static double SalVal = 13;
	public static double TempVal = 13;
	public static double SilVal = 13;
	public static double MonthVal = 13;
	public static String LatMessage;
	public static double DistVal = 13;
	public static double NPVal = 13;
	public static double DINDONVal = 13;
	
	int divVal = 10;
	public void GrowthOutput() {
		
		
		if (0.1 <= Amm && Amm <= 2 && Amm != 1030.0) {
			
			if (0.1 <= Amm && Amm < 0.8) {
				AmmVal = Amm/0.09;
			}
			if (0.8 <= Amm && Amm <= 2) {
				AmmVal = Amm/0.1375;
				if(AmmVal >=12) {
					AmmVal = 12;
				}
				Math.round(AmmVal);
			}
		}
		
		

		if (DIN != 0.0 && DIN != 1030.0 && DON != 1030.0 && Phos != 1030.0) {
		DINDON = DON / DIN;
		NP = DIN / Phos;
		}

		
		if (0<= Nit && Nit < 1 && Nit != 1030.0) {
			
				NitVal = 12-(Nit/0.12);
				Math.round(NitVal);
				if (NitVal>=12) {
					NitVal = 12;
				}
		}
		if (Nit >= 1 &&  Nit != 1030.0) {
			NitVal = 1;
		}
		if (0.1<= Phos && Phos < 1 && Phos != 1030.0) {
			
			if (0.1<= Phos && Phos < 0.5) {
				PhosVal = Phos/0.036;
				if (PhosVal >= 9) {
					PhosVal = 9;
				}
			}
			if (0.5<= Phos && Phos < 1) {
				PhosVal = Phos/0.06;
				
			}
			Math.round(PhosVal);
		}
		if (Phos >= 1 && Phos != 1030.0) {
			PhosVal = 11;
		}
		if (31.5<= Sal && Sal <= 33.5 && Sal != 1030.0) {
			SalVal = 11;
		}
		if (6<= Temp && Temp <= 18 && Temp != 1030.0) {
			
			if (6<= Temp && Temp < 8) {
				TempVal = (Temp/0.2)-29;
			}
			if(12< Temp && Temp <= 18) {
				TempVal = 13-(Temp*(2/3));
			}
			if (8<= Temp && Temp <= 12) {
				TempVal = 11;
			}
			Math.round(TempVal);
		}
		if (1<= Sil && Sil <= 12 && Sil != 1030.0) {
			
			if ((1<= Sil && Sil < 5)||(10< Sil && Sil <= 12)) {
				SilVal = 0;
				divVal --;
			}
			if (5<= Sil && Sil <= 10) {
				SilVal = 10;
			}
		}
			if (Month == 5 && Month != 1030.0) {
				MonthVal = 10;
			}
		if (40>= Lat || Lat >= 43 && Lat != 1030.0) {
			LatMessage = "Note to User: Entered lattitude value is improbable to have estimated bloom. Please recalculate with more probable lattitude within 40 and 43";
		}
		if (0<= Dist && Dist <= 87 && Dist != 1030.0) {
			if (0<= Dist && Dist <= 15) {
				DistVal = 9;
			}
			if (15< Dist && Dist <= 87) {
				DistVal = 0;
				divVal --;
			}
		}
		if (5<= DINDON && DINDON <= 10 && DINDON != 1030.0) {
			DINDONVal = 9;
		}
		if (2<= NP && NP <= 4 && NP != 1030.0) {
			NPVal = 9;
		}
		
		//Values in case User does not input anything for value
		if (AmmVal == 13) {
			AmmVal = 0;
			divVal --;
		}
		if (NitVal == 13) {
			NitVal = 0;
			divVal --;
		}
		if (PhosVal == 13) {
			PhosVal = 0;
			divVal --;
		}
		if (SalVal == 13) {
			SalVal = 0;
			divVal --;
		}
		if (TempVal == 13) {
			TempVal = 0;
			divVal --;
		}
		if (SilVal == 13) {
			SilVal = 0;
			divVal --;
		}
		if (MonthVal == 13) {
			MonthVal = 0;
			divVal --;
		}
		if (DistVal == 13) {
			DistVal = 0;
			divVal --;
		}
		if (DINDONVal == 13) {
			DINDONVal = 0;
			divVal --;
		}
		if (NPVal == 13) {
			NPVal = 0;
			divVal --;
		}

		
		GrowthVal = AmmVal + NitVal + PhosVal + SalVal + TempVal + SilVal + MonthVal + DistVal + DINDONVal + NPVal;
		GrowthVal /= divVal;
		AfunShort = (int)(Math.round(GrowthVal));
		//Adjust for peak of the bloom
		if (Month == 4) {
			if (GrowthVal >= 4) {
			GrowthVal += 10/GrowthVal;
		   }
			if(GrowthVal < 4) {
				GrowthVal += 2.5;
			}
		}
		if (Month == 5) {
			GrowthVal = GrowthVal;
		}
		if (Month == 6) {
			if (GrowthVal>=4) {
			GrowthVal += 12/GrowthVal;
			}
			if (GrowthVal < 4) {
				GrowthVal += 2.75;
			}
		}
		if (Month == 7) {
			if(GrowthVal >= 4) {
			GrowthVal += 13/GrowthVal;
			}
			if (GrowthVal < 4) {
				GrowthVal += 3.75;
			}
		}
		GrowthVal = new Float( Math.round(GrowthVal)) ;
		Afun = (int)GrowthVal;

		if (Afun == 1030) {
			AfunString = "No Values Entered";
		}
		if (Afun == 1030) {
			AfunString = "No Values Entered";
		}
		//Move to next class
		Toxicity CalToxic = new Toxicity();
		CalToxic.ToxicityOutput();
}
}