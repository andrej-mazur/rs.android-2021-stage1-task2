package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String =
        try {
            LocalDate.of(year.toInt(), month.toInt(), day.toInt()).format(formatter)
        } catch (e: Exception) {
            "Такого дня не существует"
        }

    companion object {
        val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale("ru"))
    }

}
