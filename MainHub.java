import java.time.LocalDate;
public class MainHub extends UserOutput{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserInput Gather = new UserInput();
		//Growth is initialized by UserInput
		//Toxicity CalToxic = new Toxicity();
		//Advice GiveAct = new Advice();
		//UserOutput GiveRes = new UserOutput();
		
		// UserInput gathers Data in JFrame
		Gather.Input();


		// Toxicity class finds toxicity of bloom in ranges of low, medium, high
		//CalToxic.ToxicityOutput();
		
		// Advice class presents a caption on how to stop and prevent bloom
		//GiveAct.ReturnChoice();
		
		// Output class compiles all results and gives back in Jframe
		//GiveRes.GiveResult();

		}
		
	}


