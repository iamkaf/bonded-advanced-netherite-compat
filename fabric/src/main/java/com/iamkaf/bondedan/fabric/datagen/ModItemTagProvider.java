package com.iamkaf.bondedan.fabric.datagen;

import com.iamkaf.bonded.registry.Tags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        getOrCreateTagBuilder(Tags.MELEE_WEAPONS).forceAddTag(advancedNetheriteTag("sword/netherite_iron"))
                .forceAddTag(advancedNetheriteTag("sword/netherite_gold"))
                .forceAddTag(advancedNetheriteTag("sword/netherite_emerald"))
                .forceAddTag(advancedNetheriteTag("sword/netherite_diamond"));
        getOrCreateTagBuilder(Tags.DIGGING_EQUIPMENT).forceAddTag(advancedNetheriteTag("pickaxe/netherite"));
        getOrCreateTagBuilder(Tags.DIGGING_EQUIPMENT).forceAddTag(advancedNetheriteTag("axe/netherite"));
        getOrCreateTagBuilder(Tags.DIGGING_EQUIPMENT).forceAddTag(advancedNetheriteTag("shovel/netherite"));
        getOrCreateTagBuilder(Tags.DIGGING_EQUIPMENT).forceAddTag(advancedNetheriteTag("hoe/netherite"));
    }

    private TagKey<Item> advancedNetheriteTag(String id) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("advancednetherite", id));
    }
}
