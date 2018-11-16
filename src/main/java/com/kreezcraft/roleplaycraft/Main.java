package com.avanyt.roleplaycraft;

import com.avanyt.roleplaycraft.proxy.CommonProxy;
import com.avanyt.roleplaycraft.tabs.tabRoleplayCraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Main.MODID, name=Main.NAME, version=Main.VERSION, acceptedMinecraftVersions="[1.12.2]")
public class Main
{
  public static final String MODID = "roleplaycraft";
  public static final String NAME = "RoleplayCraft";
  public static final String VERSION = "@VERSION@";
  
  public static final CreativeTabs tabroleplaycraft = new tabRoleplayCraft("tabroleplaycraft");
  @Mod.Instance
  public static Main instance;
  @SidedProxy(clientSide="com.kreezcraft.roleplaycraft.proxy.ClientProxy", serverSide="com.kreezcraft.roleplaycraft.proxy.CommonProxy")
  public static CommonProxy proxy;
  
  @Mod.EventHandler
  public void PreInit(FMLPreInitializationEvent event) {}
  
  @Mod.EventHandler
  public void init(FMLInitializationEvent event) {}
  
  @Mod.EventHandler
  public void PostInit(FMLPostInitializationEvent event) {}
}

