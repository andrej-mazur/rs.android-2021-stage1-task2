package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        var lastMatchIndexA = -1
        var counter = 0
        loopB@ for (indexB in b.indices) {
            for (indexA in (lastMatchIndexA + 1) until a.length) {
                if (a[indexA].equals(b[indexB], ignoreCase = true)) {
                    lastMatchIndexA = indexA
                    counter++
                    continue@loopB
                } else if (a[indexA].isUpperCase()) {
                    break@loopB
                }
            }
        }
        return if (counter == b.length) "YES" else "NO"
    }

}
