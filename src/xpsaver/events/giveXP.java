package xpsaver.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

import static xpsaver.xpConverter.ConvertXP.levelsToXp;

public class giveXP implements Listener {
    @EventHandler
    public static void onPlayerXp(ExpBottleEvent event) {
        ItemMeta Entity = event.getEntity().getItem().getItemMeta();
        if (Entity.getDisplayName().contains("XP Store")) {
            List<String> lore = Entity.getLore();
            String value = lore.get(1);
            int lvl = Integer.parseInt(value.substring(0, value.indexOf(".0")));
            int exp = levelsToXp(lvl);
            event.setExperience(exp);
        }
    }
}
