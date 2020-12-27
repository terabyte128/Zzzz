package main.java.com.samwolfson.zzzz;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        if (e.getPlayer().isSleeping()) {
            // replace a-z and 0-9 with z and A-Z with Z (keep punctuation and spaces)
            String newMessage = e.getMessage().replaceAll("[a-z0-9]", "z").replaceAll("[A-Z]", "Z");
            e.setMessage(newMessage);
        }
    }
}
