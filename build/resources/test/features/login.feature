@LOGIN
Feature: Login for twitter

  Scenario: Login to twitter
    Given I do a rest get from "search/tweets.json?q=%40twitterapi"
    And the rest response code is "400"