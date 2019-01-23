/** Generic JSON writer; this might be library code.
  * This Json AST defines how to persist classes to JSON */
sealed trait Json

final case class JsObject(get: Map[String, Json]) extends Json

final case class JsString(get: String) extends Json

final case class JsNumber(get: Double) extends Json

case object JsNull extends Json


object Json {
  def toJson[A](value: A)(implicit w: JsonWriter[A]): Json = w.write(value)
}


/** This is a typeclass.
  * The "serialize to Json" behaviour will be encoded in this trait's implementations */
trait JsonWriter[A] {
  def write(value: A): Json
}
