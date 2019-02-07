object BeerSong{

  def recite(numberOfStartingBeers: Int, numberOfVerses: Int): String ={
    var numberOfBeers = numberOfStartingBeers
    val output = StringBuilder.newBuilder.append(beersOnTheWall(numberOfBeers))
    numberOfBeers -= 1
    for (remainingBeers <- (numberOfBeers) until (numberOfStartingBeers-numberOfVerses) by -1){
      output.append("\n")
      output.append(beersOnTheWall(remainingBeers))
    }
    output.toString()
  }

  def beersOnTheWall(numberOfBeers:Int): String ={
    if (numberOfBeers==0) noMoreBeer else lineOne(numberOfBeers) + lineTwo(numberOfBeers)
  }

  def lineOne(numberOfBeers:Int): String ={
    val multiple = if (numberOfBeers == 1) "" else "s"
    s"$numberOfBeers bottle$multiple of beer on the wall, $numberOfBeers bottle$multiple of beer.\n"
  }

  def lineTwo(numberOfBeers:Int): String ={
    var reference = "one"
    var remaining = if (numberOfBeers==2) "1 bottle" else s"${numberOfBeers-1} bottles"
    if (numberOfBeers==1) {
      remaining = "no more bottles"
      reference = "it"
    }
    s"Take $reference down and pass it around, $remaining of beer on the wall.\n"
  }

  def noMoreBeer: String =
    "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"
}
