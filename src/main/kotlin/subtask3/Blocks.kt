package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any =
        when (blockB) {
            String::class -> {
                blockA.filterIsInstance<String>().joinToString(separator = "")
            }
            Int::class -> {
                blockA.filterIsInstance<Int>().sum()
            }
            LocalDate::class -> {
                blockA.filterIsInstance<LocalDate>().max()!!.format(formatter)
            }
            else -> {
                throw IllegalArgumentException()
            }
        }

    companion object {
        val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
    }

}
