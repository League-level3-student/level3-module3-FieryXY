package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String toReturn = sb.toString();
		return toReturn;
	}

}
