package week1.day2;

public class Browser {
	public String launchBrowser(String browserName) {
		return browserName;
	}
	public String loadUrl() {
		return ("Url loaded successfully");
	}
	public static void main(String[] args) {
		Browser lb=new Browser();
		String launchBrowser = lb.launchBrowser("Chrome");
	    System.out.println(launchBrowser);
	    String url = lb.loadUrl();
	    System.out.println(url);
	}
}

