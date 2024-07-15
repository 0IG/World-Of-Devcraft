
fun main (){
    val level = Level(exp = 420)
    println(level.level)
}
class Level(val exp : Int) {
    private val levelMap : Map<Int, Int> = mapOf(1 to 100, 2 to 225, 3 to 375, 4 to 550, 5 to 750, 6 to 975, 7 to 1225, 8 to 1500, 9 to 1800, 10 to 2125)
    var level : Int = findPlayerLevel()


    // Finding Players Level
    private fun findPlayerLevel() : Int {
        var playersLevel = 0
        for (points in levelMap) {
            println(playersLevel)
            if (exp < points.value) {
                playersLevel = points.key
                break
            }
        }
        return playersLevel
    }

}