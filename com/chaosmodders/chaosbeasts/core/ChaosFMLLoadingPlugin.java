package com.chaosmodders.chaosbeasts.core;

import java.io.File;
import java.util.Map;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.MCVersion;

@MCVersion(value = "1.7.2")
public class ChaosFMLLoadingPlugin implements IFMLLoadingPlugin {


	public static File location;

	public String[] getLibraryRequestClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getASMTransformerClass() {
	//This will return the name of the class "mod.culegooner.CreeperBurnCore.CBClassTransformer"
		return new String[]{ChaosClassTransformer.class.getName()};
	}

	@Override
	public String getModContainerClass() {
		//This is the name of our dummy container "mod.culegooner.CreeperBurnCore.CBDummyContainer"
		return ChaosDummyContainer.class.getName();
	}

	@Override
	public String getSetupClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {
		location = (File) data.get("coremodLocation");
	}

	@Override
	public String getAccessTransformerClass() {
		// TODO Auto-generated method stub
		return null;
	}

}