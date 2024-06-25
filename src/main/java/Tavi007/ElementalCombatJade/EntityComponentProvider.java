package Tavi007.ElementalCombatJade;

import mcp.mobius.waila.api.EntityAccessor;
import mcp.mobius.waila.api.IEntityComponentProvider;
import mcp.mobius.waila.api.ITooltip;
import mcp.mobius.waila.api.config.IPluginConfig;
import net.minecraft.world.entity.LivingEntity;

public class EntityComponentProvider implements IEntityComponentProvider {

    static final IEntityComponentProvider INSTANCE = new EntityComponentProvider();

    @Override
    public void appendTooltip(ITooltip tooltip, EntityAccessor accessor, IPluginConfig config) {
        if (accessor.getEntity() instanceof LivingEntity) {
            JadeElement element = new JadeElement((LivingEntity) accessor.getEntity());
            tooltip.add(element);
        }
    }
}
