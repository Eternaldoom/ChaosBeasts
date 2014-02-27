package com.chaosmodders.chaosbeasts.blocks;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ArgonFluid extends Fluid {
	public ArgonFluid() {
		super("argon");
		setDensity(1);
		setViscosity(700);
		setGaseous(true);
		setTemperature(350);
		setLuminosity(150);
		FluidRegistry.registerFluid(this);
	}
}