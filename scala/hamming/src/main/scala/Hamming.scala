case class Hamming()

object Hamming {
  def distance(initial: String, mutation: String) = {
    if (initial.length == mutation.length){
      var result = 0
      for (i <- 0 until initial.length) {
        if (initial.charAt(i) != mutation.charAt(i)) result += 1
      }
      Some(result)
    }
    else None
  }
}
