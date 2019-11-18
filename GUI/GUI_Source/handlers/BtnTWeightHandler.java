package handlers;

import driver.FormProjectDriver;
import gui.EighthScene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BtnTWeightHandler implements EventHandler<ActionEvent> {
	
	FormProjectDriver driver;
	public BtnTWeightHandler(FormProjectDriver driver) {
		this.driver = driver;
	}
	
	@Override
	public void handle(ActionEvent event) {
		EighthScene scene = new EighthScene(driver);
		scene.setup();
	}
}
