object Bob {
  def response(statement: String): String = {

  	var justLetters = statement.filter(_.isLetter)
  	println(justLetters)

  	if ((justLetters.equals(justLetters.toUpperCase()) &&(justLetters.length !=0))){
  		"Whoa, chill out!"
  	} else if (statement.trim.endsWith("?")){
  		"Sure."
  	} else if (statement.trim.length == 0){
  		"Fine. Be that way!"
  	} else {
  		"Whatever."
  	}
  }
}