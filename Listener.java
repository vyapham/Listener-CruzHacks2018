import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Listener {
	public static void quotesInput(ArrayList<String> quotes, String fileName) {
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
		String fileName = "quotes.txt";
		boolean start = true;
		
		int sampleHour = 12;
		int sampleMinute = 46;
		int sampleSecond = 0;
		
		PrintQuote p = new PrintQuote(sampleHour, sampleMinute, sampleSecond);
		quotesInput(quotes, fileName);
		
		// ......
		int cursor = 0;
		while (start) {
			if (cursor >= quotes.size()) {
				cursor = 0;
			}
			if (!p.equals(p)) {
				continue;
			}
			System.out.println(quotes.get(cursor));
			cursor++;
			start = false;
			
			while (!start) {
				if (!p.equals(p)) {
					start = true;
				}
			}
			
		}
		// What if users decide to disable this feature ???
	}
}
