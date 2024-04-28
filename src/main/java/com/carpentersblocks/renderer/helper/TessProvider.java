package com.carpentersblocks.renderer.helper;

import net.minecraft.client.renderer.Tessellator;

public class TessProvider {
    public static Tessellator getTess() {
        return Tessellator.instance;
    }
}
