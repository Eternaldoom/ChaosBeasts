package com.chaosmodders.chaosbeasts.blocks;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class LiquidDoomFluid extends Fluid
{
public LiquidDoomFluid()
{
super("liquid_doom");
setDensity(10); // How tick the fluid is, affects movement inside the liquid.
setViscosity(500); // How fast the fluid flows.
FluidRegistry.registerFluid(this); // Registering inside it self, keeps things neat :)
}
}