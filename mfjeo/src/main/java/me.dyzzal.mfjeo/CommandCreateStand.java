package me.dyzzal.mfjeo;

import org.bukkit.RegionAccessor;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ArmorStand;

public class CommandCreateStand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;

            ArmorStand stand = (ArmorStand) ((Player)sender).getWorld().spawnEntity(((Player)sender).getLocation(), EntityType.ARMOR_STAND);
            stand.setCustomName("stand");
            stand.addEquipmentLock(EquipmentSlot.HEAD, ArmorStand.LockType.REMOVING_OR_CHANGING);
            System.out.println("Created a new stand");
        }

        return true;
    }
}