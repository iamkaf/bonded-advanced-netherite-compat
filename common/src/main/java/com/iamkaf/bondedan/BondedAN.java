package com.iamkaf.bondedan;

import com.iamkaf.amber.api.core.AmberMod;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;

public class BondedAN extends AmberMod {
    public static final String MOD_ID = "bondedan";
    public static final Logger LOGGER = LogUtils.getLogger();

    public BondedAN() {
        super(MOD_ID);
    }

    public static void init() {
        LOGGER.info("Bonded x Advanced Netherite Compat");
    }

    /**
     * Creates resource location in the mod namespace with the given path.
     */
    public static ResourceLocation resource(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
