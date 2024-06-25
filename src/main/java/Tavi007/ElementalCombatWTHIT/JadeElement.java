package Tavi007.ElementalCombatWTHIT;

import java.awt.Dimension;

import com.mojang.blaze3d.vertex.PoseStack;

import Tavi007.ElementalCombat.api.ElementalCombatDataRenderAPI;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec2;
import snownee.jade.api.ui.Element;

public class JadeElement extends Element {

    private LivingEntity entity;

    public JadeElement(LivingEntity entity) {
        this.entity = entity;
    }

    @Override
    public Vec2 getSize() {
        Dimension dims = ElementalCombatDataRenderAPI.getTooltipDimension(ClientConfig.isDefenseDoubleRow(), entity);
        return new Vec2(dims.width, dims.height);
    }

    @Override
    public void render(PoseStack poseStack, float x, float y, float maxX, float maxY) {
        ElementalCombatDataRenderAPI.renderTextAndIcons(poseStack, (int) x, (int) y, ClientConfig.isDefenseDoubleRow(), entity);
    }

}
