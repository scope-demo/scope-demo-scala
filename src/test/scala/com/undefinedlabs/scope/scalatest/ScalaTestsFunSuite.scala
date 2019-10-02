package com.undefinedlabs.scope.scalatest

import org.scalatest.FunSuite

class ScalaTestsFunSuite extends FunSuite {

  test("test_succeed") {
    assert(1 == 1)
  }

  test("test_failed") {
    assert( 1 != 1)
  }

  test("test_error") {
    throw new RuntimeException("an Exception")
  }

  ignore("test_skipped"){
    assert(1 == 1)
  }

  test("test_canceled") {
    cancel("this test has been canceled")
  }

  test("test_assumed") {
    assume(1 != 1, "The database was down again")
  }

}
