package me.dyzzal.mfjeo;

import me.dyzzal.mfjeo.CommandCreateStand;
import org.bukkit.entity.Player;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ArmorStand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.entity.ArmorStand.LockType;

public final class Jeopardy extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("Jeopardy is loaded");

        getServer().getPluginManager().registerEvents(this, this);
        this.getCommand("createstand").setExecutor(new CommandCreateStand());
    }

    @EventHandler
    public void onUseArmorStand(PlayerInteractAtEntityEvent e){
        System.out.println(e.getRightClicked().getName());
        if(e.getRightClicked().getName()=="stand"){
            Player player = e.getPlayer();
            ArmorStand stand = (ArmorStand) e.getRightClicked();
            stand.addEquipmentLock(EquipmentSlot.HEAD, LockType.REMOVING_OR_CHANGING);
            System.out.println(player.getName());
        }
    }

    @Override
    public void onDisable() {
        System.out.println("Jeopardy is unloaded");
    }
}