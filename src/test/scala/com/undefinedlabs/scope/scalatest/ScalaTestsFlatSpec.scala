package com.undefinedlabs.scope.scalatest

import org.scalatest.FlatSpec

class ScalaTestsFlatSpec extends FlatSpec {

  "This test" should "return a succeed test" in {
      assert(1 == 1)
  }

  "This test" should "return a failed test" in {
    assert (1 != 1)
  }

  "This test" should "return an error test" in {
    throw new RuntimeException("an Exception")
  }

  "This test" should "be skipped" ignore {
    assert(1 == 1)
  }

  "This test" should "be canceled" in {
    cancel("this test has been canceled")
  }

  "This test" should "be canceled when assumption is not fulfilled" in {
    assume(1 != 1, "Assumption has not been fulfilled")
  }
}
