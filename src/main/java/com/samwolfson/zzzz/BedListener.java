package main.java.com.samwolfson.zzzz;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class BedListener implements Listener {
    private static final String PREFIX = "[IN BED]";

    @EventHandler
    public void playerSleeps(PlayerBedEnterEvent event) {
        if (!event.getBedEnterResult().equals(PlayerBedEnterEvent.BedEnterResult.OK)) {
            return;
        }

        String oldHeader = event.getPlayer().getPlayerListName();
        event.getPlayer().setPlayerListName(PREFIX + " " + oldHeader);
    }

    @EventHandler
    public void playerUnsleeps(PlayerBedLeaveEvent event) {
        String oldHeader = event.getPlayer().getPlayerListName();

        int index = oldHeader.lastIndexOf(PREFIX);

        String after = oldHeader.substring(index + PREFIX.length());
        after = after.replaceAll("^[ \t]+|[ \t]+$", "");

        event.getPlayer().setPlayerListName(after);
    }
}
