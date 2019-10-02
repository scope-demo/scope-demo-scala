package com.undefinedlabs.scope.scalatest

import org.scalatest.{Matchers, PropSpec}

class ScalaTestPropSpec extends PropSpec with Matchers{

  property("should return a succeed test") {
    1 should be (1)
  }

  property("should return a failed test") {
    1 should not be (1)
  }

  property("should return a error test") {
    throw new RuntimeException("an Exception")
  }

  ignore("should return an skipped test") {
    1 should be (1)
  }

  property("should return a canceled test") {
    cancel("this test has been canceled")
  }

  property("should return a canceled test by assumption") {
    assume(1 != 1, "Assumption has not been fulfilled")
  }

}
