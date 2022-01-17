package get_http_request_methods;

import org.junit.Test;

public class Get01 {

     /*
     Given https://restful-booker.herokuapp.com/booking/3

        When user sends a GET request to the url

        Then HTTP status code should be 200

        And   content type should be Json

        And status line should be HTTP/1.1 200 OK
     */

    @Test
    public void get01() {

        //set the URL

        String str="https://restful-booker.herokuapp.com/booking/3";

        //Set the excepted data

        //Send request and get response

        Repsonse response=given().accept("application/json").when().get(url)
    }
}