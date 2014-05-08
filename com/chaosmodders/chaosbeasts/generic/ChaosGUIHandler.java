package com.chaosmodders.chaosbeasts.generic;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.chaosmodders.chaosbeasts.blocks.TileEntityEnergyReactor;
import com.chaosmodders.chaosbeasts.generic.GUI.ContainerEnergyReactor;
import com.chaosmodders.chaosbeasts.generic.GUI.GUIEnergyReactor;

import cpw.mods.fml.common.network.IGuiHandler;

public class ChaosGUIHandler implements IGuiHandler{

	public static int guiID = 0;
    public static int energyReactor = guiID++;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(ID == energyReactor){
			return new ContainerEnergyReactor(player.inventory, (TileEntityEnergyReactor)entity);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);

		if(ID == energyReactor){
			return new GUIEnergyReactor(player.inventory, (TileEntityEnergyReactor)entity);
		}
		return null;
	}

}