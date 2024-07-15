class Player (val name: String, val craft: String, val exp: Int) {
    var level: Int = 1


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
