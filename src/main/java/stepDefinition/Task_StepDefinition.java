package stepDefinition;

import com.qa.pages.TaskPage;
import com.qa.utils.TestBase;

import io.cucumber.java.en.Then;

public class Task_StepDefinition extends TestBase {

	public Task_StepDefinition() throws InterruptedException {
		super();
	}
	TaskPage tp = new TaskPage();
	@Then("User Mouseover to New Task")
	public void user_mouseover_to_new_task() {
		tp.moveovertonewtask();
	}

	@Then("Add details {string} {string} {string} {string}")
	public void add_details(String string, String string2, String string3, String string4) throws InterruptedException {
		tp.addNewTask(string, string2, string3, string4);
	}
	
	
	@Then("verify Added Tasl")
	public void verify_added_tasl() {
	  tp.verifyaddedtask();
	}




}
