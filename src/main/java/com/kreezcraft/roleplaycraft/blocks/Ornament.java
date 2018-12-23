package com.kreezcraft.roleplaycraft.blocks;

import com.kreezcraft.roleplaycraft.RoleplayCraft;
import com.kreezcraft.roleplaycraft.init.InitBlocks;
import com.kreezcraft.roleplaycraft.init.InitItems;
import com.kreezcraft.roleplaycraft.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Ornament extends Block implements IHasModel {

	protected String name;

	public Ornament(Material material, String name) {
		super(material);
		this.name = name;
		setUnlocalizedName(RoleplayCraft.MODID + "." + name);
		setCreativeTab(RoleplayCraft.tabroleplaycraft);
		setRegistryName(name);
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
	}

	@Override
	public void registerModels() {
		RoleplayCraft.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isTranslucent(IBlockState state) {
		return true;
	}

	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}
    
    
	
	
}