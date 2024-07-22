import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val playerCreator = PlayerCreator()

    print(" __    __           _     _     ___  __      ___            ___           __ _   \n" +
            "/ / /\\ \\ \\___  _ __| | __| |   /___\\/ _|    /   \\_____   __/ __\\ __ __ _ / _| |_ \n" +
            "\\ \\/  \\/ / _ \\| '__| |/ _` |  //  // |_    / /\\ / _ \\ \\ / / / | '__/ _` | |_| __|\n" +
            " \\  /\\  / (_) | |  | | (_| | / \\_//|  _|  / /_//  __/\\ V / /__| | | (_| |  _| |_ \n" +
            "  \\/  \\/ \\___/|_|  |_|\\__,_| \\___/ |_|   /___,' \\___| \\_/\\____/_|  \\__,_|_|  \\__|\n" +
            "                                                                                 \n" +
            "\n")

    val player = playerCreator.createPlayer()


    when (player.craft) {
        "Web Developer" -> {
            PlayWeb(player)
        }
        "Mobile Developer" -> {
            PlayMobile()
        }
        "Cyber Security" -> {
            PlayCyber()
        }
        "QA Engineer" -> {
            println("QA chosen but not game path not yet written")
        }
        else -> {
            println("Game path not yet written")
        }
    }
    // Dice roll function
    fun diceRoll() : Int {
        val roll : Int = Random.nextInt(1, 12)
        println("You rolled a: $roll out of 12")
        return roll
    }

    // Function to give players their tools based on Craft
    fun craftsTools(craft: String){
        val tools : MutableList<String>
        when (craft) {
            "Web Developer" -> {
                tools = mutableListOf("React", "JavaScript", "PostgreSQL", "Node")
            }
            "Mobile Developer" -> {
                tools = mutableListOf("Android Studio", "Kotlin", "AWS", "Firebase")
            }
            "Cyber Security" -> {
                tools = mutableListOf("Kali Linux", "WireShark", "Metasploit", "Nmap")
            }
            "Data Analyst" -> {
                tools = mutableListOf("Python", "R", "Tableau", "Excel")
            }
            "QA Engineer" -> {
                tools = mutableListOf("Postman", "Jira", "Apache", "Selenium")
            }
        }
    }

}