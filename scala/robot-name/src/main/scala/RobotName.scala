import scala.util.Random

class Robot {

  var name = NameGenerator.generateUniqueName

  def reset() = {
    name = NameGenerator.generateUniqueName
  }
}

object NameGenerator {

  var nameRepo = Set.empty[String]
  var name = generateName

  def generateUniqueName = {
    while (nameRepo.contains(name)) {
      name = generateName
    }
    nameRepo += name
    name
  }

  def generateName: String = {
    val letters = Random.alphanumeric.filter(_.isLetter).take(2).mkString.toUpperCase
    val numbers = Random.alphanumeric.filter(_.isDigit).take(3).mkString
    letters + numbers
  }

}
