package xpsaver.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

import static xpsaver.xpConverter.ConvertXP.levelsToXp;
import static xpsaver.xpConverter.ConvertXP.xpToLevels;

public class itemManager {

    public static ItemStack createXP(Player player) {
        ItemStack item = new ItemStack(Material.EXPERIENCE_BOTTLE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("XP Store");
        List<String> lore = new ArrayList<>();
        float exp = xpToLevels((levelsToXp(player.getLevel()))/2);
        String expString = String.valueOf(exp);
        player.setLevel(0);
        String name = player.getName();
        lore.add(name);
        lore.add(expString);
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        return item;
    }
}
