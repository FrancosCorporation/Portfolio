package Padrao;

import java.awt.Desktop;
import java.net.URI;

public class webBrowser {
	
    public static void main(String[] args) {
    	String site= "https://youtu.be/Vvn0DEtiMhA";
			openWebpage(site);
    }
    public static void openWebpage(String site) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(new URI(site));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}