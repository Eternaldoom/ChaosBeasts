package com.chaosmodders.chaosbeasts.blocks;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class DryWaterFluid extends Fluid
{
public DryWaterFluid()
{
super("dry_water");
setDensity(-100);
setViscosity(1000);
this.setGaseous(isGaseous);
FluidRegistry.registerFluid(this);
}
}