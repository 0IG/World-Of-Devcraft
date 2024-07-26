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
            PlayMobile(player)
        }
        "Cyber Security" -> {
            PlayCyber(player)
        }
        "QA Engineer" -> {
            println("QA chosen but not game path not yet written")
        }
        else -> {
            println("Game path not yet written")
        }
    }


}