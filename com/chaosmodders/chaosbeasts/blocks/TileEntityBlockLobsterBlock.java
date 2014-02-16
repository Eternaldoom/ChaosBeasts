package com.chaosmodders.chaosbeasts.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

public class TileEntityBlockLobsterBlock extends BlockContainer
{
	public TileEntityBlockLobsterBlock()
	{
                super(Material.rock);
                this.setCreativeTab(ChaosTabs.tabChaosBlocks);
                this.setBlockBounds(-2.0F, 0.0F, 0.0F, 3.5F, 1.5F, 1.0F);
        }

        //Make sure you set this as your TileEntity class relevant for the block!
        public TileEntity createNewTileEntity(World world, int var1) {
                return new TileEntityBlockLobsterEntity();
        }
        
        //You don't want the normal render type, or it wont render properly.
        @Override
        public int getRenderType() {
                return -1;
        }
        
        //It's not an opaque cube, so you need this.
        @Override
        public boolean isOpaqueCube() {
                return false;
        }
        
        //It's not a normal block, so you need this too.
        public boolean renderAsNormalBlock() {
                return false;
        }
        
        //This is the icon to use for showing the block in your hand.
        public void registerIcons(IIconRegister icon) {
                this.blockIcon = icon.registerIcon("doomsmod:lobster_block_icon");
        }
}