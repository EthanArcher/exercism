object Pangrams {
  def isPangram(input: String): Boolean = {
    val alphabet = 'a' to 'z'
    alphabet.map(letter => input.toLowerCase.contains(letter)).foldLeft(true)(_ && _)
  }
}

