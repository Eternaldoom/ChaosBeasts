package com.chaosmodders.chaosbeasts.worldgen;

import net.minecraft.util.ChunkCoordinates;

public class DoomPortalPosition extends ChunkCoordinates
{
public long field_85087_d;
final DoomTeleporter field_85088_e;
public DoomPortalPosition(DoomTeleporter doomTeleporter, int par2, int par3, int par4, long par5)
{
super(par2, par3, par4);
this.field_85088_e = doomTeleporter;
this.field_85087_d = par5;
}
}