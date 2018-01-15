import java.util.Scanner;

public class VakantieSpel {
	
	static boolean appLoopt = true;
	
	public static void main(String[] args) {
		eersteWoord();
		
		
	}
	
	static void eersteWoord() {
		
		Scanner invoer = new Scanner(System.in);
		
		while(appLoopt) {
			String woordInvoer = invoer.nextLine();
			int nummerLaatst = woordInvoer.length() -1;
			char laatsteLetter = woordInvoer.charAt(nummerLaatst);
			System.out.println(laatsteLetter);
			
			String nieuwWoord = invoer.nextLine();
			char eersteLetter = nieuwWoord.charAt(0);
			//if() {
			//}
			if(laatsteLetter == eersteLetter) {
				System.out.println("Super");
			} else {
				System.out.println("Jammer");
			}
			
			
		}
	}	

}
