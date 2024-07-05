import Player.Player
import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val PlayMobile = PlayMobile()
    val PlayCyber = PlayCyber()
    val PlayWeb = PlayWeb()

    print(" __    __           _     _     ___  __      ___            ___           __ _   \n" +
            "/ / /\\ \\ \\___  _ __| | __| |   /___\\/ _|    /   \\_____   __/ __\\ __ __ _ / _| |_ \n" +
            "\\ \\/  \\/ / _ \\| '__| |/ _` |  //  // |_    / /\\ / _ \\ \\ / / / | '__/ _` | |_| __|\n" +
            " \\  /\\  / (_) | |  | | (_| | / \\_//|  _|  / /_//  __/\\ V / /__| | | (_| |  _| |_ \n" +
            "  \\/  \\/ \\___/|_|  |_|\\__,_| \\___/ |_|   /___,' \\___| \\_/\\____/_|  \\__,_|_|  \\__|\n" +
            "                                                                                 \n" +
            "\n")

    val Player = Player(name = "Leroy J", craft = "Unemployed", exp = 0)


    when (Player.craft) {
        "Web Developer" -> {
            PlayWeb()
        }
        "Mobile Developer" -> {
            PlayMobile()
        }
        "Cyber Security" -> {
            PlayCyber()
        }
        "Mobile Developer" -> {
            println("QA chosen but not game path not yet written")
        }
        else -> {
            println("Game path not yet written")
        }
    }

    fun diceRoll() : Int {
        val roll : Int = Random.nextInt(1, 12)
        println("You rolled a: $roll out of 12")
        return roll
    }

}