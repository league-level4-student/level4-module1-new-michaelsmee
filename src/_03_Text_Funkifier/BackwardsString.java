package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
    	String str = "";
    	for(int i = unfunkifiedText.length(); i>0; i--) {
    		 str+=unfunkifiedText.substring(i-1, i);
    	}
        return str;

    }
}
