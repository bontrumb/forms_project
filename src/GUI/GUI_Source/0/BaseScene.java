package gui;

import driver.FormProjectDriver;
import javafx.scene.Scene;

public abstract class BaseScene {
	private Scene scene;	//The scene where we are drawing
	private FormProjectDriver driver;	//Access to driver
	
	public BaseScene(FormProjectDriver driver) {
		this.driver = driver;
	}
	
	//Getters and setters
	public Scene getScene() {
		return scene;
	}
	
	public void setScene(Scene scene) {
		this.scene = scene;
	}
	
	public FormProjectDriver getDriver() {
		return driver;
	}
	
	/**
	 * Sets up the scene (the actual drawing)
	 */
	public abstract void setup();
	
	protected void display() {
		driver.setScene(this.scene);
	}
}
