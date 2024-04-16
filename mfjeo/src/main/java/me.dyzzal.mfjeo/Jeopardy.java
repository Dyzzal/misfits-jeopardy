package me.dyzzal.mfjeo;

import me.dyzzal.mfjeo.CommandCreateStand;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ArmorStand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.DisplaySlot;
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
    public void PlayerJoin(PlayerJoinEvent e) {    
        final Player p = e.getPlayer();     
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        final Scoreboard board = manager.getNewScoreboard();
        final Objective objective = board.registerNewObjective("score", "dummy", "Score");        
        objective.setDisplaySlot(DisplaySlot.PLAYER_LIST);
        p.setScoreboard(board);
    }

    @EventHandler
    public void onUseArmorStand(PlayerInteractAtEntityEvent e){
        System.out.println(e.getRightClicked().getName()); //this was for debugging
        ArmorStand stand = (ArmorStand) e.getRightClicked();
        if(stand.getName().equals("stand")){
            Player player = e.getPlayer();
            //System.out.println(player.getName()); this was for debugging
        }
    }

    @Override
    public void onDisable() {
        System.out.println("Jeopardy is unloaded");
    }
}