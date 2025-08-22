package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser lb=new Browser();
		String launchBrowser = lb.launchBrowser("Edge Browser");
	    System.out.println(launchBrowser);
	    String url = lb.loadUrl();
	    System.out.println(url);
	}
	}

