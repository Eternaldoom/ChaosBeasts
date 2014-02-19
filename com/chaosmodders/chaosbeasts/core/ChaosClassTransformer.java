package com.chaosmodders.chaosbeasts.core;

import java.io.File;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import net.minecraft.launchwrapper.IClassTransformer;

public class ChaosClassTransformer implements IClassTransformer {

@Override
public byte[] transform(String arg0, String arg1, byte[] arg2) {

if (arg0.equals("act") || arg0.equals("net.minecraft.item.ItemSword")) {
System.out.println("********* ChaosBeasts Now Patching: " + arg0);
arg2 = patchClassInJar(arg0, arg2, arg0, ChaosFMLLoadingPlugin.location);
}
return arg2;
}

public byte[] patchClassInJar(String name, byte[] bytes, String ObfName, File location) {
try {
ZipFile zip = new ZipFile(location);
ZipEntry entry = zip.getEntry(name.replace('.', '/') + ".class");


if (entry == null) {
System.out.println(name + " not found in " + location.getName());
} else {

//serialize the class file into the bytes array
InputStream zin = zip.getInputStream(entry);
bytes = new byte[(int) entry.getSize()];
zin.read(bytes);
zin.close();
System.out.println("[" + "ChaosBeasts" + "]: " + "Class " + name + " patched!");
}
zip.close();
} catch (Exception e) {
throw new RuntimeException("Error overriding " + name + " from " + location.getName(), e);
}

//return the new bytes
return bytes;
}
}