package com.automation.steps;

import java.util.List;

import com.automation.pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class LoginPageSteps extends LoginPage{

	@When("User login with <userName> and <password>")
	public void user_login_with_user_name_and_password(DataTable dataTable) {
			List<List<String>> loginData=dataTable.asLists(String.class);
			 for (List<String> columns : loginData) {
				 login(columns.get(0), columns.get(1));
			    }
	}
}
