package _00_Text_Funkifier;

public class PairFlipString extends SpecialString {

	public PairFlipString(String s) {
		super(s);
	}
	
	@Override
	public String funkifyText(String s) {
		char[] temp = s.toCharArray();
		
		for(int j = 0; j < s.length(); j = j+2) {
			if(j+1 < s.length()) {
				char holder = temp[j];
				temp[j] = temp[j+1];
				temp[j+1] = holder;
			}
		}
		
		return String.valueOf(temp);
	}

}
