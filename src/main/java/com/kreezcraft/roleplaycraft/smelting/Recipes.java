package com.kreezcraft.roleplaycraft.smelting;

import com.kreezcraft.roleplaycraft.init.InitBlocks;
import com.kreezcraft.roleplaycraft.init.InitItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {
	
	Item temp = null;

	public static void init() {
		//cook that shit!
		GameRegistry.addSmelting(InitItems.Raw_Poop, new ItemStack(InitItems.Cooked_Poop), 1f); 
		
	}

}