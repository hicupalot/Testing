package God;

import org.bukkit.Statistic;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerEvent;

import java.util.Objects;

public class GodMode implements Listener {
    @EventHandler
    public void NoDamage(EntityDamageByEntityEvent e) {
        if (e.getEntity().hasPermission("god")) {
            e.setDamage(0);
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void Damaging(EntityDamageByEntityEvent e) {
        if (e.getDamager().getType().equals(EntityType.PLAYER)) {
            if (e.getDamager().hasPermission("god") && !e.getEntity().hasPermission("god")) {
                int Time = e.getDamager().getServer().getPlayer(String.valueOf(e.getDamager())).getStatistic(Statistic.PLAY_ONE_MINUTE);
                int Level = Time / 1200; //Solves for minutes alive
                e.setDamage(Level * 10);
            }
        }
    }
    @EventHandler
    public void Fly(PlayerEvent e){
        if (e.getPlayer().hasPermission("god")){
            e.getPlayer().setAllowFlight(true);

        }

    }
}