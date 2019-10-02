package com.undefinedlabs.scope.scalatest

import org.scalatest.Ignore
import org.scalatest.refspec.RefSpec

class ScalaTestRefSpec extends RefSpec {

  object `In this test dashboard` {
    object `this test` {
      def `return a test succeed`: Unit = {
        assert(1 == 1)
      }

      def `return a test failed`: Unit = {
        assert(1 != 1)
      }

      def `return a test error`: Unit = {
        throw new RuntimeException("an Exception")
      }

      @Ignore def `return an skipped test`: Unit = {
        assert(1 == 1)
      }

      def `return a canceled test`: Unit = {
        cancel("this test has been canceled")
      }

      def `return a canceled test by assumption`: Unit = {
        assume(1 != 1, "Assumption has not been fulfilled")
      }
    }
  }
}
