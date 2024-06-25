package Tavi007.ElementalCombatWTHIT;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;

@Mod("elementalcombat_jade")
public class ElementalCombatJade {

    public static ElementalCombatJade instance;
    public static final String MOD_ID = "elementalcombat_jade";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public ElementalCombatJade() {
        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
        ModLoadingContext.get().registerConfig(Type.CLIENT, ClientConfig.CONFIG_SPEC, ElementalCombatJade.MOD_ID + "-client.toml");
    }
}
