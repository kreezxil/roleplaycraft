package com.kreezcraft.roleplaycraft.init;

import java.util.ArrayList;
import java.util.List;

import com.kreezcraft.roleplaycraft.blocks.BlockBase;
import com.kreezcraft.roleplaycraft.blocks.Ornament;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class InitBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RainbowBlock = new BlockBase(Material.IRON,"rainbowblock").setHardness(10f); 
	
	public static final Block BlueOrnament = new Ornament(Material.GLASS,"ornament_blue").setHardness(1f);
	public static final Block GreenOrnament = new Ornament(Material.GLASS,"ornament_green").setHardness(1f);
	public static final Block MagentaOrnament = new Ornament(Material.GLASS,"ornament_magenta").setHardness(1f);
	public static final Block RedOrnament = new Ornament(Material.GLASS,"ornament_red").setHardness(1f);
	public static final Block WhiteOrnament = new Ornament(Material.GLASS,"ornament_white").setHardness(1f);
	public static final Block YellowOrnament = new Ornament(Material.GLASS,"ornament_yellow").setHardness(1f);
}
