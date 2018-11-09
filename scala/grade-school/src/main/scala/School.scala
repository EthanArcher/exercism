import scala.collection.immutable.ListMap

class School {

  var names: Seq[String] = Seq()
  type DB = Map[Int, Seq[String]]
  var roster: DB = Map()

  def add(name: String, g: Int) = {
    names = grade(g) :+ name
    roster += (g -> names)
  }

  def db: DB = roster

  def grade(g: Int): Seq[String] = {
    roster.getOrElse(g, Seq())
  }

  def sorted: DB = {
    val sortedRoster = ListMap(roster.toSeq.sortBy(_._1):_*)
    val newData = sortedRoster.map { case (key, value) => key -> value.sortWith(_<_)}

    newData
  }
}