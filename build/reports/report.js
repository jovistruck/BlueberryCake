$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/login.feature");
formatter.feature({
  "line": 2,
  "name": "Login for twitter",
  "description": "",
  "id": "login-for-twitter",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LOGIN"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Login to twitter",
  "description": "",
  "id": "login-for-twitter;login-to-twitter",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I do a rest get from \"search/tweets.json?q\u003d%40twitterapi\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the rest response code is \"400\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "get",
      "offset": 12
    },
    {
      "val": "from",
      "offset": 16
    },
    {
      "val": "search/tweets.json?q\u003d%40twitterapi",
      "offset": 22
    }
  ],
  "location": "Restdefs.I_do_a_rest_get_from(String,String,String)"
});
formatter.result({
  "duration": 630911794,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "400",
      "offset": 27
    }
  ],
  "location": "Restdefs.rest_response_assert(String)"
});
formatter.result({
  "duration": 48749709,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[\"400\"]\u003e but was:\u003c[400]\u003e\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat Restdefs.rest_response_assert(Restdefs.java:63)\n\tat ✽.And the rest response code is \"400\"(features/login.feature:6)\n",
  "status": "failed"
});
});