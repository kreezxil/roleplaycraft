package com.kreezcraft.roleplaycraft.Handlers;

import net.minecraft.block.BlockPlanks;
import net.minecraft.init.Blocks;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class makeOrnaments {

@SubscribeEvent
public static void xmas(PlaceEvent event) {
	
	if (event.getPlayer()!=null) return; //cause we don't want to generate one when the player places leaves
	if (event.getPlacedBlock().getBlock()==Blocks.LEAVES) {
		
	}
	
}
}
