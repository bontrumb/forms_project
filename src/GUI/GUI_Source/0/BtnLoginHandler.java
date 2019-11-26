package handlers;

import driver.FormProjectDriver;
import gui.ThirdScene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BtnLoginHandler implements EventHandler<ActionEvent>{
	
	FormProjectDriver driver;
	public BtnLoginHandler(FormProjectDriver driver) {
		this.driver = driver;
	}
	
	@Override
	public void handle(ActionEvent event) {
		ThirdScene scene = new ThirdScene(driver);
		scene.setup();
		
		
	}
}

