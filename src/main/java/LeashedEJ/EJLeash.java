package LeashedEJ;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EJLeash implements Listener {
    @EventHandler
    public void Move(PlayerMoveEvent e) {
        if (e.getPlayer().hasPermission("EJ.Leasher")) {
            if (e.getFrom().length() - e.getTo().length() != 0) {
                double leashedx = e.getPlayer().getLocation().getX() - 1;
                double leashedAH = e.getPlayer().getLocation().getX();
                double leashedy = e.getPlayer().getLocation().getY();
                double leashedz = e.getPlayer().getLocation().getZ();
                Player leashed = (Player) Bukkit.getOnlinePlayers().remove(e.getPlayer().hasPermission("EH.Leasher")); //Need to make an Object of the leasher or will cause errors
                if (leashed.hasPermission("EJ.leashed")) {
                    Location location = new Location(e.getPlayer().getWorld(), leashedx, leashedy, leashedz);
                    Location locationahh = new Location(e.getPlayer().getWorld(), leashedAH, leashedy, leashedz);
                    if (location.getBlock().getRelative(BlockFace.DOWN).getType().isAir()) {
                        leashed.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 5, 200, true, false));
                        leashed.teleport(location);
                        if (location.getBlock().getType().isSolid()) {
                            leashed.teleport(locationahh);


                        }

                    }

                }
            }
        }
    }
}
