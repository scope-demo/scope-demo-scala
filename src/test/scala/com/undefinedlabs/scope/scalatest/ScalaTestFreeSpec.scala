package com.undefinedlabs.scope.scalatest

import org.scalatest.FreeSpec

class ScalaTestFreeSpec extends FreeSpec {

  "In this test dashboard" - {
    "this test" - {
      "return a test succeed" in {
        assert(1 == 1)
      }
    }

    "this test" - {
      "return a test failed" in {
        assert( 1 != 1)
      }
    }

    "this test" - {
      "return a test error" in {
        throw new RuntimeException("an Exception")
      }
    }

    "this test" - {
      "return an skipped test" ignore {
        assert(1 == 1)
      }
    }

    "this test" - {
      "return a canceled test" in {
        cancel("this test has been canceled")
      }
    }

    "this test" - {
      "return a canceled test by assumption" in {
        assume(1 != 1, "Assumption has not been fulfilled")
      }
    }
  }

}
