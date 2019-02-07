object House {

  def recite(startVerse: Int, endVerse: Int): String ={
    (startVerse to endVerse).map(verse).mkString("This is ", "the house that Jack built.\nThis is ", "the house that Jack built.\n\n")
  }

  def verse(verseNumber:Int) : String = verseNumber match {
    case 1 => ""
    case 2 => "the malt that lay in "
    case 3 => "the rat that ate " + verse(verseNumber -1)
    case 4 => "the cat that killed " + verse(verseNumber -1)
    case 5 => "the dog that worried " + verse(verseNumber -1)
    case 6 => "the cow with the crumpled horn that tossed " + verse(verseNumber -1)
    case 7 => "the maiden all forlorn that milked " + verse(verseNumber -1)
    case 8 => "the man all tattered and torn that kissed " + verse(verseNumber -1)
    case 9 => "the priest all shaven and shorn that married " + verse(verseNumber -1)
    case 10 => "the rooster that crowed in the morn that woke " + verse(verseNumber -1)
    case 11 => "the farmer sowing his corn that kept " + verse(verseNumber -1)
    case 12 => "the horse and the hound and the horn that belonged to " + verse(verseNumber -1)
  }

}
