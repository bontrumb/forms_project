package handlers;

import driver.FormProjectDriver;
import gui.FourthScene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BtnNewUserHandler implements EventHandler<ActionEvent>{
	
	FormProjectDriver driver;
	public BtnNewUserHandler(FormProjectDriver driver) {
		this.driver = driver;
	}
	
	@Override
	public void handle(ActionEvent event) {
		FourthScene scene = new FourthScene(driver);
		scene.setup();
		
		
	}
}
