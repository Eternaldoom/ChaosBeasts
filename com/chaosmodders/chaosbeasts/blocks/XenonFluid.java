package com.chaosmodders.chaosbeasts.blocks;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class XenonFluid extends Fluid {
	public XenonFluid() {
		super("xenon");
		setDensity(1);
		setViscosity(1000);
		setGaseous(true);
		setTemperature(350);
		setLuminosity(150);
		FluidRegistry.registerFluid(this);
	}
}