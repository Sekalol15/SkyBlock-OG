package plugin.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class island : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        if(sender !is Player) {slushy_sausage9
            sender.sendMessage("You aren't a Player!")
            return true

        }

        else {
            sender.sendMessage("Generating island....")
            return true


        }
    }
}