package com.carpentersblocks.renderer;

import com.carpentersblocks.renderer.helper.TessProvider;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;

import com.gtnewhorizons.angelica.api.ThreadSafeISBRHFactory;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class BlockHandlerCarpentersPressurePlate extends BlockHandlerBase {

    private static final ThreadLocal<BlockHandlerCarpentersPressurePlate> threadRenderer = ThreadLocal
            .withInitial(BlockHandlerCarpentersPressurePlate::new);

    public ThreadSafeISBRHFactory newInstance() {
        return threadRenderer.get();
    }

    @Override
    public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderBlocks) {
        renderBlocks.setRenderBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
        TessProvider.getTess().addTranslation(0.0F, 0.4365F, 0.0F);
        super.renderInventoryBlock(block, metadata, modelID, renderBlocks);
        TessProvider.getTess().addTranslation(0.0F, -0.4365F, 0.0F);
    }
}
