package org.itech.locatorform.qaframework.automation;

import org.itech.locatorform.qaframework.automation.test.TestBase;

import io.cucumber.java.en.When;

public class LocatorFormSteps extends TestBase{

    @When("User Logs in to the Health Desk View")
    public void userLogsToHealthDeskView(){
        System.out.println("User Logs in to the Health Desk View");
    }

    @When("User Goes to the Public View")
    public void usergoesToPublicView(){
        System.out.println("User Goes to the Public View");
    }  
}
