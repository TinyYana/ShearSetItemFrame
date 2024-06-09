package tinyyana.shearsetitemframe;

import org.bukkit.entity.ItemFrame;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ItemType;

public class SetItemFrame implements Listener {
    @EventHandler
    public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {
        ItemStack shears = new ItemStack(ItemType.SHEARS.createItemStack());
        if (event.getRightClicked() instanceof ItemFrame && event.getPlayer().getInventory().getItemInMainHand().equals(shears)) {
            ItemFrame itemFrame = (ItemFrame) event.getRightClicked();
            itemFrame.setVisible(false);
            itemFrame.setGlowing(true);
            event.setCancelled(true);
        }
    }

}
