package com.iamkaf.bondedan.mixin;

import com.autovw.advancednetherite.common.item.AdvancedArmorItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(AdvancedArmorItem.class)
public class AdvancedArmorItemMixin extends ArmorItem {
    public AdvancedArmorItemMixin(ArmorMaterial armorMaterial, ArmorType armorType, Properties properties) {
        super(armorMaterial, armorType, properties);
    }

    @Inject(method = "appendHoverText", at = @At("HEAD"))
    private void bondedCompat$appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip,
            TooltipFlag flag, CallbackInfo ci) {
        super.appendHoverText(stack, context, tooltip, flag);
    }
}
