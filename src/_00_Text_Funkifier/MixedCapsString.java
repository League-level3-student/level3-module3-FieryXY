package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		
		char[] temp = s.toCharArray();
		
		for(int j = 0; j < s.length(); j++) {
			if(j % 2 == 0) {
				temp[j] = Character.toLowerCase(temp[j]);
			}
			else {
				temp[j] = Character.toUpperCase(temp[j]);
			}
		}
		return String.valueOf(temp);
	}

}
