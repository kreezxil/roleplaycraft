package com.kreezcraft.roleplaycraft;

import com.kreezcraft.roleplaycraft.proxy.CommonProxy;
import com.kreezcraft.roleplaycraft.smelting.Recipes;
import com.kreezcraft.roleplaycraft.tabs.tabRoleplayCraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=RoleplayCraft.MODID, name=RoleplayCraft.NAME, version=RoleplayCraft.VERSION, acceptedMinecraftVersions="[1.12.2]")
public class RoleplayCraft
{
  public static final String MODID = "roleplaycraft";
  public static final String NAME = "RoleplayCraft";
  public static final String VERSION = "@VERSION@";
  
  public static final CreativeTabs tabroleplaycraft = new tabRoleplayCraft("tabroleplaycraft");
  @Mod.Instance
  public static RoleplayCraft instance;
  @SidedProxy(clientSide="com.kreezcraft.roleplaycraft.proxy.ClientProxy", serverSide="com.kreezcraft.roleplaycraft.proxy.CommonProxy")
  public static CommonProxy proxy;
  
  @Mod.EventHandler
  public void PreInit(FMLPreInitializationEvent event) {}
  
  @Mod.EventHandler
  public void init(FMLInitializationEvent event) {
	  Recipes.init();
  }
  
  @Mod.EventHandler
  public void PostInit(FMLPostInitializationEvent event) {}
}

