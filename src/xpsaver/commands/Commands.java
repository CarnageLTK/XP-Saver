package xpsaver.commands;

import xpsaver.items.itemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can run this command!");
            return true;
        }
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("givexp")){
            player.getInventory().addItem(itemManager.createXP(player));
            System.out.println(player.getDisplayName() + " has redeemed their Exp");
        }
        return true;
    }
}
