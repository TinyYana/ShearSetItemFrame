package tinyyana.shearsetitemframe;

import org.bukkit.plugin.java.JavaPlugin;

public final class ShearSetItemFramePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new SetItemFrame(),this);
    }

    @Override
    public void onDisable() {
    }
}
