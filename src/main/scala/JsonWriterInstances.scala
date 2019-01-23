/** Typeclasses (typeclass instances) for implicitly converting instances of various types to JSON.
  * This might be application-specific code, or it might be library code, or a bit of both. */
object JsonWriterInstances {
  implicit val stringWriter: JsonWriter[String] =
    (value: String) => JsString(value)

  implicit val personWriter: JsonWriter[Person] =
    (value: Person) => JsObject(Map(
      "name"  -> JsString(value.name),
      "email" -> JsString(value.email)
    ))
}
