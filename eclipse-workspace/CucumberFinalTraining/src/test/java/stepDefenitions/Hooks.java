package stepDefenitions;

import java.util.Date;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
@Before
public void beforeHooks() {
	Date d = new Date();
	System.out.println("Before :" +d);

}
@After
public void AfterHooks() {
	Date d = new Date();
	System.out.println("Time After Hook :" +d);


}

}
