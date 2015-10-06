import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;

import java.io.IOException;
import java.text.ParseException;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by jov on 05/10/15.
 */
public class Restdefs extends StepBase {
    @Then("^I do a rest (get|post|delete) (from|to) \"([^\"]*)\"$")
    public void I_do_a_rest_get_from(String method,String fromTo, String path) throws Throwable {

        if (method.equalsIgnoreCase("get")) {
            restCallResponse = get(getAPIUrl() + path)
                    .execute().returnResponse();
        } else if (method.equalsIgnoreCase("post")) {
            restCallResponse = post(getAPIUrl() + path)
                    .bodyString(null, ContentType.APPLICATION_JSON)
                    .execute().returnResponse();
        } else if (method.equalsIgnoreCase("delete")) {
            restCallResponse = put(getAPIUrl() + path)
                    .bodyString(null, ContentType.APPLICATION_JSON)
                    .execute().returnResponse();
        }
    }


    @When("^I do a rest (post|put) (from|to) \"(.*)\" with the body as$")
    public void i_post_put_with_body(String method, String fromTo, String path, String bodyOf) throws IOException, ParseException {

        if (method.equalsIgnoreCase("post")) {
            restCallResponse = post(getAPIUrl() + path)
                    .bodyString(bodyOf, ContentType.APPLICATION_JSON)
                    .execute().returnResponse();
        } else if (method.equalsIgnoreCase("put")) {
            restCallResponse = put(getAPIUrl() + path)
                    .bodyString(bodyOf, ContentType.APPLICATION_JSON)
                    .execute().returnResponse();
        }
    }

    @When("I do a rest (post|put) \"(.*)\" to \"(.*)\"$")
    public void i_post_put_with_string(String method, String body, String path) throws IOException {
        if (method.equalsIgnoreCase("post")) {
            restCallResponse = post(getAPIUrl() + path)
                    .bodyString(body, ContentType.APPLICATION_JSON)
                    .execute().returnResponse();
        } else if (method.equalsIgnoreCase("put")) {
            restCallResponse = Request.Put(getAPIUrl() + path)
                    .bodyString(body, ContentType.APPLICATION_JSON)
                    .execute().returnResponse();
        }
    }

    @When("the rest response code is \"(.*)\"$")
    public void rest_response_assert(String code) throws IOException {
        assertThat(restCallResponse.getStatusLine().getStatusCode()).isEqualTo(code);
    }

}
