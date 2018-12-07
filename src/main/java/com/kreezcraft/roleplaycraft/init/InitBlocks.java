package com.kreezcraft.roleplaycraft.init;

import java.util.ArrayList;
import java.util.List;

import com.kreezcraft.roleplaycraft.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class InitBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RainbowBlock = new BlockBase(Material.IRON,"rainbowblock").setHardness(10f); 
}
