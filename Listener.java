import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Listener {
	public static void readInput(ArrayList<String> quotes, String fileName) {
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
		/****** Start of ONE QUOTE PER DAY feature test *****/
		ArrayList<String> quotes = new ArrayList<String>();
		String quotesFileName = "quotes.txt";
		boolean start = true;
		
		int sampleHour = 12;
		int sampleMinute = 46;
		int sampleSecond = 0;
		
		PrintQuote p = new PrintQuote(sampleHour, sampleMinute, sampleSecond);
		readInput(quotes, quotesFileName);
		
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
		
		/****** End of test ******/
		
		/*****************/
		// Assuming we already generated a text file from the user's speech
		// Comment this part out to test the "ONE QUOTE EVERY MORNING" feature
		ArrayList<String> temp = new ArrayList<String>();
		ArrayList<String> keywords = new ArrayList<String>();
		String speechFileName = "userSpeech.txt";
		
		GenerateKeywords gk = new GenerateKeywords();
		
		readInput(temp, speechFileName);

		
		keywords = gk.splitToWords(temp);
		keywords = gk.removeSpecialChar(keywords);
		
		for (int i = 0; i < keywords.size(); i++) {
			System.out.println(keywords.get(i));
		}
	}
}
