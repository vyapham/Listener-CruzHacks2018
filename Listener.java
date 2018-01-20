import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Listener {
	public void quotesInput(ArrayList<String> quotes, String fileName) {
		try {
			File file = new File(fileName);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			// StringBuffer stringBuffer = new StringBuffer();
			String line = null;
	
			while ((line = bufferedReader.readLine()) != null) {
				quotes.add(line);
			}
			fileReader.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		ArrayList<String> quotes = new ArrayList<String>();
		String fileName = "";
		
		int sampleHour = 8;
		int sampleMinute = 00;
		int sampleSecond = 00;
		
		PrintQuote p = new PrintQuote(sampleHour, sampleMinute, sampleSecond);
		
		// ........
	}
}
