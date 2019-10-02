package com.undefinedlabs.scope.scalatest

import org.scalatest.{FeatureSpec, GivenWhenThen}

class ScalaTestFeatureSpec extends FeatureSpec with GivenWhenThen {

  feature("Test Dashboard") {
    scenario("Test Should PASS"){
      Given("a number")
      When("is compared with same number")
      Then("test should pass")
      assert(1 == 1)
    }

    scenario("Test Should FAILED"){
      Given("a number")
      When("is compared with other number")
      Then("test should failed")
      assert(1 != 1)
    }

    scenario("Test Should ERROR"){
      Given("an exception")
      When("when is thrown")
      Then("test should error")
      throw new RuntimeException("an Exception")
    }

    ignore("Test Should be Skipped"){
      assert(1 == 1)
    }

    scenario("Test should be canceled"){
      Given("")
      When("")
      Then("")
      cancel("this test has been canceled")
    }

    scenario("Test should be canceled by assumption") {
      Given("")
      When("")
      Then("")
      assume(1 != 1, "Assumption has not been fulfilled")
    }

  }

}
