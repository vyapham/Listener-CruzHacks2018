import java.util.ArrayList;

public class GenerateKeywords {
	Listener listener = new Listener();
	
	public GenerateKeywords() {

	}
	
	public GenerateKeywords(String name) {

	}
	
	public void removeSpecialChar(ArrayList<String> text) {
		int cursor = 0;
		while (cursor < text.size()) {
			(text.get(cursor)).replaceAll("[,.!?:;]"," ");
			cursor++;
		}
	}
	
	public ArrayList<String> splitToWords(ArrayList<String> text) {
		ArrayList<String> result = new ArrayList<String>();
		
		for (int i = 0; i < text.size(); i++) {
			String[] temp = (text.get(i)).split(" ");
					//new String[((text.get(i)).split(" ")).length];
			for (int j = 0; j < temp.length; j++) {
				result.add(temp[j]);
			}
			temp = null;
		}
		return result;
	}
	
	public void toArrayList(ArrayList<String> al, String[] textInArray) {
		for (int i = 0; i < textInArray.length; i++) {
			al.add(textInArray[i]);
		}
	}
	
}
