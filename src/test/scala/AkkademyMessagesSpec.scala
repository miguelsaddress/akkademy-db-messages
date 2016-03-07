import org.scalatest._
import com.akkademy.messages._

class AkkademyMessagesSpec extends FlatSpec with Matchers {

    "SetRequest message" should "retain key and value" in {
        val request = SetRequest("key", "value")
        request.key should === ("key")
        request.value should === ("value")
    }

    "GetRequest message" should "retain key" in {
        val request = GetRequest("key")
        request.key should === ("key")
    }

    "KeyNotFoundException message" should "contain key" in {
        val e = KeyNotFoundException("key")
        e.key should === ("key")
    }

}
