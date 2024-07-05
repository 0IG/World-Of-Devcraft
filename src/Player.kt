package Player


class Player(val name: String, val craft: String, val exp: Int) {
    var level: Int = 1
    val levelMap : Map<Int, Int> = mapOf(1 to 100, 2 to 225, 3 to 375, 4 to 550, 5 to 750, 6 to 975, 7 to 1225, 8 to 1500, 9 to 1800, 10 to 2125)
    val devsCraft : Map<Int, String> = mapOf(1 to "Web Developer", 2 to "Mobile Developer", 3 to "Cyber Security", 4 to "Data Analyst", 5 to "QA Engineer")

    init {

        // Finding Players Level
        for (points in levelMap){
            if (exp >= points.value){
                level = points.key
            }
        }

        // Setting Player Name
        println("What is your name?")
        val name = readln()

        // Setting Players Craft
        println("What craft would you like to go down?")
        println("1: Web Developer")
        println("2: Mobile Developer")
        println("3: Cyber Security")
        println("4: Data Analyst")
        println("5: QA Engineer")
        println("Please input the number of the craft you'd like to go down.")
        val craft = readln().toInt()

        println("$name is a ${devsCraft[craft]} and is a level : $level")
    }

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