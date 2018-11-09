object Etl {
  def transform(oldData: Map[Int, Seq[String]]): Map[String, Int] = {
    oldData.map {
      case (key, stringSeq) => stringSeq.map(s => (s.toLowerCase, key))
    }
  }.flatten.toMap
}
