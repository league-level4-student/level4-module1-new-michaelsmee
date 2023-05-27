package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier{

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		String str = "";
		str+= unfunkifiedText.substring(0,1).toLowerCase();
		for(int i = 1; i<unfunkifiedText.length(); i++) {
			if(i%2 ==1 && !unfunkifiedText.substring(i, i+1).equals(" ")) {
				str += unfunkifiedText.substring(i, i+1).toUpperCase();
			}
			else {
				str += unfunkifiedText.substring(i, i+1);
			}
		}
		
		return str;
	}

}
