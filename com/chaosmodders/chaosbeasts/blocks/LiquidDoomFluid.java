package com.chaosmodders.chaosbeasts.blocks;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class LiquidDoomFluid extends Fluid {
	public LiquidDoomFluid() {
		super("liquid_doom");
		setDensity(10);
		setViscosity(500);
		FluidRegistry.registerFluid(this);
	}
}