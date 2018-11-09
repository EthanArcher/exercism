object SpaceAge {
	def roundUp(value: Double): Double = BigDecimal(value).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble

	def onEarth(ageInSeconds: Double): Double = {
		roundUp(ageInSeconds/60/60/24/365.25)
	}

	def toEarth(ageInSeconds: Double): Double = {
		ageInSeconds/60/60/24/365.25
	}

	def onMercury(ageInSeconds: Double): Double = { roundUp(toEarth(ageInSeconds) / 0.2408467)}

	def onVenus(ageInSeconds: Double): Double = { roundUp(toEarth(ageInSeconds) / 0.61519726)}

	def onMars(ageInSeconds: Double): Double = { roundUp(toEarth(ageInSeconds) / 1.8808158)}

	def onJupiter(ageInSeconds: Double): Double = { roundUp(toEarth(ageInSeconds) / 11.862615)}

	def onSaturn(ageInSeconds: Double): Double = { roundUp(toEarth(ageInSeconds) / 29.447498)}

	def onUranus(ageInSeconds: Double): Double = { roundUp(toEarth(ageInSeconds) / 84.016846)}

	def onNeptune(ageInSeconds: Double): Double = { roundUp(toEarth(ageInSeconds) / 164.79132)}
}