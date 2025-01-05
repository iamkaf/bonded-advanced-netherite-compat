package com.iamkaf.bondedan.mixin;

import com.autovw.advancednetherite.common.item.AdvancedAxeItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.TooltipFlag;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(AdvancedAxeItem.class)
public class AdvancedAxeItemMixin extends AxeItem {
    public AdvancedAxeItemMixin(ToolMaterial toolMaterial, float f, float g, Properties properties) {
        super(toolMaterial, f, g, properties);
    }

    @Inject(method = "appendHoverText", at = @At("HEAD"))
    private void bondedCompat$appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip,
            TooltipFlag flag, CallbackInfo ci) {
        super.appendHoverText(stack, context, tooltip, flag);
    }
}
