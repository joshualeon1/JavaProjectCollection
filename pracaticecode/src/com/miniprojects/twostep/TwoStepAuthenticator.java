package com.miniprojects.twostep;

import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;

public class TwoStepAuthenticator{
	
	private String genCode = "";
	
	private String generatedCode() {
		String code = "";
		for(int i=0; i<6; i++)
			code += String.valueOf((int)Math.floor(Math.random()*10));
		return code;
	}
	
	public void displayCode() {
		try{
		    //Obtain only one instance of the SystemTray object
		    SystemTray tray = SystemTray.getSystemTray();
		    Image image = Toolkit.getDefaultToolkit().createImage("some-icon.png");
		    TrayIcon trayIcon = new TrayIcon(image, "Java AWT Tray Demo");
		    trayIcon.setImageAutoSize(true);
		    trayIcon.setToolTip("System tray icon demo");
		    tray.add(trayIcon);

		    // Display info notification:
		    genCode = generatedCode();
		    trayIcon.displayMessage("2-Step Code:", genCode, MessageType.INFO);
		}catch(Exception ex){
		    System.err.print(ex);
		}
	}
	
	public boolean validCode(int code) {
		return Integer.parseInt(genCode) == code;
	}
	
}
