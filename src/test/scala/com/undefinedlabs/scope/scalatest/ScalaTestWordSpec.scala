package com.undefinedlabs.scope.scalatest

import org.scalatest.WordSpec

class ScalaTestWordSpec extends WordSpec {

    "In this test dashboard" when {
      "this test" should {
        "return a test succeed" in {
          assert(1 == 1)
        }
      }

      "this test" should {
        "return a test failed" in {
          assert( 1 != 1)
        }
      }

      "this test" should {
        "return a test error" in {
          throw new RuntimeException("an Exception")
        }
      }

      "this test" should {
        "return an skipped test" ignore {
          assert(1 == 1)
        }
      }

      "this test" should {
        "return a canceled test" in {
          cancel("this test has been canceled")
        }
      }

      "this test" should {
        "return a canceled test by assumption" in {
          assume(1 != 1, "Assumption has not been fulfilled")
        }
      }
    }

}
