package com.chaosmodders.chaosbeasts.blocks;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ArgonFluid extends Fluid {
	public ArgonFluid() {
		super("argon");
		setDensity(-100);
		setViscosity(1000);
		setGaseous(true);
		FluidRegistry.registerFluid(this);
	}
}