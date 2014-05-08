package com.chaosmodders.chaosbeasts.blocks;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidDarknessFluid extends Fluid
{
public FluidDarknessFluid()
{
super("fluid_darkness");
setDensity(10);
setViscosity(1);
FluidRegistry.registerFluid(this);
}
}