package handlers;

import driver.FormProjectDriver;
import gui.FifthScene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BtnViewHandler implements EventHandler<ActionEvent> {
	
	FormProjectDriver driver;
	public BtnViewHandler(FormProjectDriver driver) {
		this.driver = driver;
	}
	
	@Override
	public void handle(ActionEvent event) {
		FifthScene scene = new FifthScene(driver);
		scene.setup();
	}
}
