import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;

/**
 * Created by jov on 05/10/15.
 */
public class StepBase {
    protected static HttpResponse restCallResponse;

    public static String getAPIUrl() {
        return APIUrl;
    }

    protected static String APIUrl="https://api.twitter.com/1.1/";

    public Request get(String uri) {
        return Request.Get(uri);
    }

    public Request post(String uri) {
        return Request.Post(uri);
    }

    public Request put(String uri) {
        return Request.Put(uri);
    }

    public Request postWithBody(String uri) {
        return Request.Post(uri);
    }



}
