import Player.Player

class PlayWeb() {
    val Player = Player(name = "Bob420", craft = "Sniper", exp = 0)

    init {
        val name = Player.name
        val craft = Player.craft
        val level = Player.exp
        println("Hello welcome to Devcraft $name, you seem to be a Web Developer.")
        println("Let me introduce you to your tool set.")
    }
}