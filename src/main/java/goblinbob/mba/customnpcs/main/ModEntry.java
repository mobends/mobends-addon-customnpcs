package goblinbob.mba.customnpcs.main;

import goblinbob.mobends.core.addon.AddonHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ModEntry.MODID,
     name = ModEntry.NAME,
     version = ModEntry.VERSION,
     dependencies = "required-after:mobends;required-after:customnpcs")
public class ModEntry
{

    public static final String MODID = "gb-mba-customnpcs";
    public static final String NAME = "Mo' Bends Addon - Custom NPCs";
    public static final String VERSION = "0.1.0";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // Registering the addon.
        AddonHelper.registerAddon(MODID, new AddonEntry());
    }

}
