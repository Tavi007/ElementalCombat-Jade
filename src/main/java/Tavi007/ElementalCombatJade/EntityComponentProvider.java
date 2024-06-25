package Tavi007.ElementalCombatJade;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import snownee.jade.api.EntityAccessor;
import snownee.jade.api.IEntityComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;

public class EntityComponentProvider implements IEntityComponentProvider {

    static final IEntityComponentProvider INSTANCE = new EntityComponentProvider();
    static final ResourceLocation uid = new ResourceLocation(ElementalCombatJade.MOD_ID, "combat_properties");

    @Override
    public void appendTooltip(ITooltip tooltip, EntityAccessor accessor, IPluginConfig config) {
        if (accessor.getEntity() instanceof LivingEntity) {
            JadeElement element = new JadeElement((LivingEntity) accessor.getEntity());
            tooltip.add(element);
        }
    }

    @Override
    public ResourceLocation getUid() {
        return uid;
    }
}
