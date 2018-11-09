import java.time.LocalDate
import java.time.LocalDateTime

object Gigasecond {
  val timeInSeconds = 1000000000

  def add(startDate: LocalDate): LocalDateTime = startDate.atStartOfDay().plusSeconds(timeInSeconds)

  def add(startDateTime: LocalDateTime): LocalDateTime = startDateTime.plusSeconds(timeInSeconds)
}
