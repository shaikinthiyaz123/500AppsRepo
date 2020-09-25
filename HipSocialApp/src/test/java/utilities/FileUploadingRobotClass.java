package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUploadingRobotClass {

	

	public static void uploadfile(String path) throws AWTException {
		
		 Robot robot = new Robot();
		System.out.println(System.getProperty("user.dir")+"\\"+path);
	       robot.setAutoDelay(1000);
		 StringSelection selection = new StringSelection(System.getProperty("user.dir")+"\\"+path);
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
	 
	        robot.setAutoDelay(1000);
	 
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        
	        robot.setAutoDelay(1000);

	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyRelease(KeyEvent.VK_V);
	 
	        robot.setAutoDelay(1000);
	 
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        robot.setAutoDelay(1000);
	}

}
