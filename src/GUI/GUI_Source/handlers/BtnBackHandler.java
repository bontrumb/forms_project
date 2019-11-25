package handlers;

import driver.FormProjectDriver;
import gui.SeventhScene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BtnBackHandler implements EventHandler<ActionEvent> {
	
	FormProjectDriver driver;
	public BtnBackHandler(FormProjectDriver driver) {
		this.driver = driver;
	}
	
	@Override
	public void handle(ActionEvent event) {
		SeventhScene scene = new SeventhScene(driver);
		scene.setup();
	}

}
