package org.abs;

public class LanguageDetails extends AbstractClass {
	
	public void tamil() {
		System.out.println("tamil is a language from tamil nadu");

	}
	public void english() {
		System.out.println("english is a language from america");

	}
	public static void main(String[] args) {
		
		LanguageDetails l = new LanguageDetails();
		l.tamil();
		l.english();
		l.kannada();
		
		
		
	}
	

}
