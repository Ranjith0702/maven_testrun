package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class tablesteps {
    @Given("I have the following student details")
    public void i_have_the_following_student_details(io.cucumber.datatable.DataTable dataTable) {
        System.out.println("Student list : ");
        List<List<String>> student = dataTable.cells();
        String  student_22 = student.get(2).get(0);
        System.out.println("Student :" + student);
        System.out.println("Student with age 22 : "+student_22);

    }
    @Then("I find 1 student")
    public void i_find_student() {

    }

    @When("I search for a student with age {int}")
    public void iSearchForAStudentWithAge(int arg0) {
    }
}
