import org.specs2.mock.mockito.ArgThat
import org.specs2.mutable.Specification

class ArgThatBugSpec extends Specification with ArgThat {

  val items: Seq[String] = Seq()

  "Things" should {
    "Fail 1" in {
      items must have size greaterThan(1000)
      items must have size lessThan(-1000)
    }
    "Fail 2" in {
      items must haveSize(greaterThan(1000))
      items must haveSize(lessThan(-1000))
    }
  }
}
