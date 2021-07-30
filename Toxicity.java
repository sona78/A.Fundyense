
public class Toxicity extends Growth{
	public static double ToxicVal; // 1 = low, 2 = medium, 3= high
	public static int ToxicDiv;
	public static String ToxicString;
	public void ToxicityOutput() {

		ToxicDiv = 5;
		ToxicVal = 0;
		// Null Values
				if (Amm == 1030) {
					Amm = 0.0;
					ToxicDiv --;
				}
				if (Nit == 1030) {
					Nit = 0.0;
				}
				if (Phos == 1030) {
					Phos = 0.0;
				}
				if (Sal == 1030) {
					Sal = 0.0;
					ToxicDiv--;
				}
				if (Temp == 1030) {
					Temp = 0.0;
				}
				if (Sil == 1030) {
					Sil = 0.0;
				}
				if (Month == 1030) {
					Month = 0.0;
					ToxicDiv--;
				}
				if (Lat == 1030) {
					Lat = 0.0;
				}
				if(DIN == 1030) {
					DIN = 0.0;
					ToxicDiv--;
				}
				if (DON == 1030) {
					DON = 0.0;
				}
				if (Dist == 1030) {
					Dist = 0.0;
				}
				if (Afun == 1030) {
					ToxicDiv --;
				}
		if (0<= Amm && Amm <= 2 && Amm != 1030.0) {
			if (0<= Amm && Amm <= 0.5) {
				ToxicVal += 1;
			}
			if (0.5< Amm && Amm < 1) {
				ToxicVal += 2;
			}
			if (1<= Amm) {
				ToxicVal += 3;
			}
		}
		if (30<= Sal && Sal <= 35 && Sal != 1030.0) {
			if (33<= Sal) {
				ToxicVal += 1;
			}
			if (32< Sal && Sal < 33) {
				ToxicVal += 2;
			}
			if (32>= Sal) {
				ToxicVal += 3;
			}
		}
		if (4<= Month && Month <= 6 && Month != 1030.0) {
			if (4<= Month && Month <= 6) {
				ToxicVal += 2;
			}
			if (Month == 5) {
				ToxicVal += 1;
			}
		}
		if (0 < DIN && DIN <= 2 && DIN != 1030.0) {
			if (0.75>= DIN && DIN >= 0) {
				ToxicVal += 1;
			}
			if (0.75< DIN && DIN < 1.5) {
				ToxicVal += 2;
			}
			if (DIN >= 1.5&&DIN <= 2) {
				ToxicVal += 3;
			}
		}
		if (0<= Afun && Afun <= 12) {
			if (1<= Afun && Afun < 8) {
				ToxicVal += 1;
			}
			if (8<= Afun&& Afun < 11) {
				ToxicVal += 2;
			}
			if (11<= Afun) {
				ToxicVal += 3;
			}
		}

		ToxicVal /= ToxicDiv ;
		//Move to next class
		Advice GiveAct = new Advice();
		GiveAct.ReturnChoice();
	}
		
}
