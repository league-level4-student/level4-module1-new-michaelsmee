package _03_Text_Funkifier;

public class funky implements TextFunkifier{
	private String unfunkifiedText;
	
	public funky(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }
	
	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		String str = ""; 
				for(int i = 0; i<unfunkifiedText.length(); i++) {
					if(unfunkifiedText.substring(i, i+1).equals("a") || unfunkifiedText.substring(i, i+1).equals("e") || unfunkifiedText.substring(i, i+1).equals("i") || unfunkifiedText.substring(i, i+1).equals("o") || unfunkifiedText.substring(i, i+1).equals("u")) {
						str += "!";
						
					}
					else {
						str += unfunkifiedText.substring(i,i+1);
					}
				}
		
		return str;
	}

}
