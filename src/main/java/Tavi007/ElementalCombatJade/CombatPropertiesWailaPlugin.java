package Tavi007.ElementalCombatJade;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import snownee.jade.api.IWailaClientRegistration;
import snownee.jade.api.IWailaCommonRegistration;
import snownee.jade.api.IWailaPlugin;
import snownee.jade.api.WailaPlugin;

@WailaPlugin(ElementalCombatJade.MOD_ID)
public class CombatPropertiesWailaPlugin implements IWailaPlugin {

    static final ResourceLocation COMBAT_PROPERTIES = new ResourceLocation(ElementalCombatJade.MOD_ID, "combat_properties");

    @Override
    public void register(IWailaCommonRegistration registration) {
        // TODO register data providers
    }

    @Override
    public void registerClient(IWailaClientRegistration registration) {
        registration.registerEntityComponent(EntityComponentProvider.INSTANCE, LivingEntity.class);
    }
}
