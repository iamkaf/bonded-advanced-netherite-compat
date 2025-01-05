package com.iamkaf.bondedan.mixin;

import com.autovw.advancednetherite.common.item.AdvancedArmorItem;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(AdvancedArmorItem.class)
public class AdvancedArmorItemMixin extends ArmorItem {
    public AdvancedArmorItemMixin(Holder<ArmorMaterial> material, Type type, Properties properties) {
        super(material, type, properties);
    }

    @Inject(method = "appendHoverText", at = @At("HEAD"))
    private void bondedCompat$appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip,
            TooltipFlag flag, CallbackInfo ci) {
        super.appendHoverText(stack, context, tooltip, flag);
    }
}
