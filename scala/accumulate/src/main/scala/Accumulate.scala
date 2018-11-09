class Accumulate {
  def accumulate[A, B](f: (A) => B, list : List[A]): List[B] = {
    var resultList = List[B]()
    list.foreach(x => resultList = resultList :+ f(x))
    resultList
  }
}