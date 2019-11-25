package handlers;

import driver.FormProjectDriver;
import gui.SixthScene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BtnTLiftHandler implements EventHandler<ActionEvent> {
	
	FormProjectDriver driver;
	public BtnTLiftHandler(FormProjectDriver driver) {
		this.driver = driver;
	}
	
	@Override
	public void handle(ActionEvent event) {
		SixthScene scene = new SixthScene(driver);
		scene.setup();
	}
}
