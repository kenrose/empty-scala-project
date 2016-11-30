import org.scalatest._

class ApplicationSpec extends WordSpec with Matchers {
  "Application.returnFive" should {
    "always return 5" in {
      Application.returnFive shouldBe 5
    }
  }
}
