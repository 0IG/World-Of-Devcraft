class PlayerCreator constructor() {
    val devsCraft : Map<Int, String> = mapOf(1 to "Web Developer", 2 to "Mobile Developer", 3 to "Cyber Security", 4 to "Data Analyst", 5 to "QA Engineer")
    lateinit var tools : MutableList <String>
    fun createPlayer() : Player{

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
        val craftKey = readln().toInt()
        val craft = devsCraft[craftKey]

        // Assign Tools To Player.
        fun assignTools(craft : String): MutableList<String> {

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
            return tools
        }

        assignTools(craft!!)

        println("$name is a $craft and is a level : 1")
        return Player(name = name, craft = craft, exp = 0, tools = tools)
    }
}