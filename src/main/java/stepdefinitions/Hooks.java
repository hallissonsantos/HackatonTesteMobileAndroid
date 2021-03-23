package stepdefinitions;

import static utils.Utils.acessarApp;

import java.net.MalformedURLException;

import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setUp() throws MalformedURLException, InterruptedException {
		
		acessarApp();
	}
}