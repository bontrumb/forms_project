package handlers;

import driver.FormProjectDriver;
import gui.ThirdScene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BtnBack1Handler implements EventHandler<ActionEvent> {
	
	FormProjectDriver driver;
	public BtnBack1Handler(FormProjectDriver driver) {
		this.driver = driver;
	}
	
	@Override
	public void handle(ActionEvent event) {
		ThirdScene scene = new ThirdScene(driver);
		scene.setup();
	}

}