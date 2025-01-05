package com.iamkaf.bondedan.neoforge;

import net.neoforged.fml.common.Mod;

import com.iamkaf.bondedan.BondedAN;

@Mod(BondedAN.MOD_ID)
public final class BondedANNeoForge {
    public BondedANNeoForge() {
        // Run our common setup.
        BondedAN.init();
    }
}
