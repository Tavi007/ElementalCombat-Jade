package Tavi007.ElementalCombatWTHIT;

import net.minecraft.resources.ResourceLocation;
import snownee.jade.api.IWailaClientRegistration;
import snownee.jade.api.IWailaCommonRegistration;
import snownee.jade.api.IWailaPlugin;
import snownee.jade.api.WailaPlugin;

@WailaPlugin
public class CombatPropertiesWailaPlugin implements IWailaPlugin {

    static final ResourceLocation COMBAT_PROPERTIES = new ResourceLocation(ElementalCombatJade.MOD_ID, "combat_properties");

    @Override
    public void register() {
        // registrar.registerComponentProvider(EntityComponentProvider.INSTANCE, TooltipPosition.BODY, LivingEntity.class);
        ElementalCombatJade.LOGGER.info("Jade Plugin registered.");
    }

    @Override
    public void register(IWailaCommonRegistration registration) {
        // TODO register data providers
    }

    @Override
    public void registerClient(IWailaClientRegistration registration) {
        // TODO register component providers, icon providers, callbacks, and config options here
    }
}
