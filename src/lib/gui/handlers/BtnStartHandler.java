package handlers;

import driver.FormProjectDriver;
import gui.SecondScene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BtnStartHandler implements EventHandler<ActionEvent> {
	
	FormProjectDriver driver;
	public BtnStartHandler(FormProjectDriver driver) {
		this.driver = driver;
	}
	
	@Override
	public void handle(ActionEvent event) {
		SecondScene scene = new SecondScene(driver);
		scene.setup();
	}
}
