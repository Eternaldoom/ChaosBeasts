package com.chaosmodders.chaosbeasts.generic;

import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;

import com.chaosmodders.chaosbeasts.ChaosBeasts;

public class DimensionCommand extends CommandBase{

	@Override
	public String getCommandName() {
		return "dimension";
	}

	@Override
	public String getCommandUsage(ICommandSender var1) {
		return "/dimension <var1> <dimension>";
	}

	@Override
	public void processCommand(ICommandSender var1, String[] var2) {
		EntityPlayerMP playerMP = (EntityPlayerMP)var1;
		if(!playerMP.worldObj.isRemote){
			if (var2[0].equalsIgnoreCase("End")) {
				if (playerMP.dimension != 1) {
					playerMP.mcServer.getConfigurationManager().transferPlayerToDimension(playerMP, 1);
				}
			}

			if (var2[0].equalsIgnoreCase("Overworld")) {
				if (playerMP.dimension != 0) {
					playerMP.travelToDimension(0);
				}
			}
			
			if (var2[0].equalsIgnoreCase("Water")) {
				if (playerMP.dimension != ChaosBeasts.WaterDimensionId) {
					playerMP.mcServer.getConfigurationManager().transferPlayerToDimension(playerMP, ChaosBeasts.WaterDimensionId);
				}
			}
			if (var2[0].equalsIgnoreCase("Doomed")) {
				if (playerMP.dimension != ChaosBeasts.DoomDimensionId) {
					for(int i = 0; i<2; i++)
					{
					playerMP.travelToDimension(ChaosBeasts.DoomDimensionId);
					}
				}
			}
		}
	}

	@Override
	public int getRequiredPermissionLevel() {
		return 1;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender par1ICommandSender, String[] par2) {
		return par2.length == 1 ? getListOfStringsMatchingLastWord(par2, new String[] {"End", "Overworld", "Water", "Doomed"}) : null;
	}
}