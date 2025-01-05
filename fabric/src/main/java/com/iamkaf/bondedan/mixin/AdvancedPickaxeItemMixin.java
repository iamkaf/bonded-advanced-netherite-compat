package com.iamkaf.bondedan.mixin;

import com.autovw.advancednetherite.common.item.AdvancedPickaxeItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(AdvancedPickaxeItem.class)
public class AdvancedPickaxeItemMixin extends PickaxeItem {
    public AdvancedPickaxeItemMixin(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @Inject(method = "appendHoverText", at = @At("HEAD"))
    private void bondedCompat$appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip,
            TooltipFlag flag, CallbackInfo ci) {
        super.appendHoverText(stack, context, tooltip, flag);
    }
}
