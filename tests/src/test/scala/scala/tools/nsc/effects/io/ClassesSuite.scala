package scala.tools.nsc.effects.io

import org.scalatest.FunSuite
import scala.tools.nsc.effects.testing.TestMacros._

import scala.annotation.effects._

class ClassesSuite extends FunSuite {


  @pure
  trait T {
    val x = 1
//    println()
  }

//  def f: T @pure = new T {}


  @pure
  class C extends T {
    val y = 2
  }

  def gg: C @pure = new C

/*
  class K {
    val a = 3
    // error has additional message "type error occured during effect inference"
//    val y: K = ""

    // illegal cyclic reference, reported error says "need to annotate constructor effect"
//    val x: K = new K()

    // secondary constructor *always* needs effect annotation: the self constructor invocation always
    // goes through overloading resolution which forces the type of each alternative - including the
    // one that we're currently type checking.
    def this(x: Int) {
      this()
//      println()
    }

    // reported error says "constructor needs effect annotation"
//    val z = new K()

  }

  def mK: K @pure = new K()
  def mk2: K @pure = new K(1)
*/





  /*
  case class Cc(x: Int) {
    // un-commenting makes constructor impure
//    println()
  }
  object Cc {
    println()
    val f = 10
  }

  def compObj: Cc.type @pure = Cc

  def toStr: String @pure = Cc.toString

  def mkC: Cc @pure = Cc(1)

  def getX: Int @pure = mkC.x

  def testF: Int @pure = Cc.f

  class C {
    var x = 1
  }

  def inc(i: Int) = i + 1

  def computeInt() = {println(); 102}


  class A {
    val field = inc(10)

    var vf = 102

    def incr(): Unit @pure = { vf = vf + 10 }

    // makes the constructor non-pure
//    val fold = computeInt()

    // also makes constr impure
//    println()

    def readField = field
  }

  def makeA: A @pure = new A
  def testA: Int @pure = makeA.field

  def testA1: Unit @pure = makeA.incr()

//  test("constructor effects are inferred") {
//    val t1 = new { def makeA = new A }
//    assert(isSubtype[{def makeA: A @pure}](t1))
//  }
  */
}
