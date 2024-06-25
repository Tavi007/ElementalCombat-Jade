package Tavi007.ElementalCombatWTHIT;

import mcp.mobius.waila.api.IRegistrar;
import mcp.mobius.waila.api.IWailaPlugin;
import mcp.mobius.waila.api.TooltipPosition;
import mcp.mobius.waila.api.WailaPlugin;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

@WailaPlugin
public class CombatPropertiesWailaPlugin implements IWailaPlugin {

    static final ResourceLocation COMBAT_PROPERTIES = new ResourceLocation(ElementalCombatJade.MOD_ID, "combat_properties");

    @Override
    public void register(IRegistrar registrar) {
        registrar.registerComponentProvider(EntityComponentProvider.INSTANCE, TooltipPosition.BODY, LivingEntity.class);
        ElementalCombatJade.LOGGER.info("Jade Plugin registered.");
    }
}
