package com.undefinedlabs.scope.scalacheck

import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, PropSpec}

final class ScalaCheckStringSpec extends PropSpec with PropertyChecks with Matchers {

  property("startsWith") {
    forAll { (a: String, b: String) =>
      (a+b) should startWith (a)
    }
  }

  property("concatenate") {
    forAll { (a: String, b: String) =>
      (a+b).length should (be >= a.length)
      (a+b).length should (be >= b.length)
    }
  }

  property("substring") {
    forAll { (a: String, b: String, c: String) =>
      (a+b+c).substring(a.length, a.length+b.length) should be (b)
    }
  }
}
