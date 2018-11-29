package masik;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
public class Runnable {
	
	

		public static void main(String[] args) {
			
			
			File f = new File("developer.txt");

			if (!f.isFile()) {
				System.out.println("A megadott fajl hibas vagy nem letezik!");
				return;
			}

			try {
				
				beolvas(f);
				System.out.println("\nSikeres Beolvasás!");
		

			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
		

		}
		
		public static void beolvas(File beFajl) throws IOException {
			BufferedReader in = null;
			String userName;
			String payment;
			String workexp;
			String sor;

			try {
				in = new BufferedReader(new FileReader(beFajl));
				System.out.println("A fájl tartalma:\n");
				while ((sor = in.readLine()) != null) {
					String tomb[] = sor.split(",");
					userName = tomb[0];
					payment = tomb[1];
					workexp= tomb[2];
					System.out.println(sor);
					
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		
	}

