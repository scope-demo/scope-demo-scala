package com.undefinedlabs.scope.scalatest

import org.scalatest.FunSpec

class ScalaTestsFunSpec extends FunSpec {

  describe("In this test dashboard") {
    describe("this test") {
      it("should return a test succeed") {
        assert(1 == 1)
      }

      it("should return a test failed") {
        assert( 1 != 1)
      }

      it("should return a test error") {
        throw new RuntimeException("an Exception")
      }

      ignore("should return an skipped test") {
        assert(1 == 1)
      }

      it("should return a canceled test") {
        cancel("this test has been canceled")
      }

      it("should return a canceled test by assumption") {
        assume(1 != 1, "Assumption has not been fulfilled")
      }
    }
  }

}
