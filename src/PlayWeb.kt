class PlayWeb(player: Player) {

    val playerName = player.name
    val playerCraft = player.craft
    var playerExp = player.exp



    init {
        println("Hello welcome to Devcraft $playerName, you seem to be a $playerCraft. You have $playerExp xp points!")
        println("Let me introduce you to your tool set.")
    }
}