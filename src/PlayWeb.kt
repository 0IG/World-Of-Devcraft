import kotlin.random.Random

class PlayWeb(player: Player) {

    val playerName = player.name
    val playerCraft = player.craft
    var playerExp = player.exp
    var playerTools = player.tools

    init {
        println("Hello welcome to Devcraft $playerName, you seem to be a $playerCraft. You have $playerExp xp points!")
        println("Let me introduce you to your tool set.")
        println(playerTools)
        println("__________________________________________________________")
        println(
            "                               __________\n" +
                    "                      ________|          |________\n" +
                    "                     |       /   ||||||   \\       |\n" +
                    "                     |     ,'              `.     |\n" +
                    "                     |   ,'                  `.   |\n" +
                    "                     | ,'   ||||||||||||||||   `. |\n" +
                    "                     ,'  /____________________\\  `.\n" +
                    "                    /______________________________\\\n" +
                    "                   |                                |\n" +
                    "                   |                                |\n" +
                    "                   |                                |\n" +
                    "                   |________________________________|\n" +
                    "                     |____________________------__|\n" +
                    "\n" +
                    "         ,----------------------------------------------------,\n" +
                    "         | [][][][][]  [][][][][]  [][][][]  [][__]  [][][][] |\n" +
                    "         |                                                    |\n" +
                    "         |  [][][][][][][][][][][][][][_]    [][][]  [][][][] |\n" +
                    "         |  [_][][][][][][][][][][][][][ |   [][][]  [][][][] |\n" +
                    "         | [][_][][][][][][][][][][][][]||     []    [][][][] |\n" +
                    "         | [__][][][][][][][][][][][][__]    [][][]  [][][]|| |\n" +
                    "         |   [__][________________][__]              [__][]|| |\n" +
                    "         `----------------------------------------------------'"
        )
        println("You'll use this skill set to earn XP and become a stronger Developer!\nAs you progress you'll grow your skill set to cover harder task to more XP!\nPress the RETURN key if you're ready for your first task.")
        readln()
        print("Congratulations new developer you have the skills but now its time to apply jobs...\nFirst things first how many do you want to apply to?\nEnter the number of jobs you'd like to apply to:")
        val jobApplications = readln().toInt()

        fun diceRoll(): Int {
            val roll: Int = Random.nextInt(1, 13)
            println("You rolled a: $roll out of 12")
            return roll
        }


        fun jobRoll(jobApplications: Int): String {
            if (jobApplications > 0){
                for (numberOfApps in 1..jobApplications) {
                    if (diceRoll() == 12) {
                        return "You got the job!"
                    }
                }
                return ""
            } else {
                return ""
            }
        }


        println(jobRoll(jobApplications))


    }


}