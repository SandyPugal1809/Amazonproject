package com.stepdefinition;

import java.io.FileNotFoundException; 
import java.io.IOException;
import com.base.BaseClassMaven;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



public class HooksClass extends BaseClassMaven {
	
	
	public static Scenario scenario;
	@Before
	public void beforeScenario(Scenario sc) throws FileNotFoundException, IOException {
		scenario=sc;

		launchBrowser(getProprtiesFileValue("url"));
		maximize();
		implicityWait();

	}
	
	@After
	public void afterScenario(Scenario scenario) {
		boolean b = scenario.isFailed();
	
		if(b) {
			scenario.attach(byteTakeScreenShotBase(),"output.image/png", "Every failed scenario");
		}
	allWindow();
		}

	
}
