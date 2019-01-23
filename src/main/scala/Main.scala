object Main extends App {
  import JsonWriterInstances._

  val personDave = Person("Dave", "dave@example.com")
  val result = Json.toJson(personDave)
  // result: Json = JsObject(Map(name -> JsString(Dave), email -> JsString(dave@example.com)))
  println(result)
}
