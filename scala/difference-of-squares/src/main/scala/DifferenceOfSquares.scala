object DifferenceOfSquares {

  def sumOfSquares(n: Int): Int = {
    if (n > 0) (n * n) + sumOfSquares(n-1) else 0
  }

  def sum(n: Int): Int = {
    if (n > 0) n + sum(n-1) else 0
  }

  def squareOfSum(n: Int): Int = {
    Math.pow(sum(n), 2).toInt
  }

  def differenceOfSquares(n: Int): Int = squareOfSum(n) - sumOfSquares(n)
}
