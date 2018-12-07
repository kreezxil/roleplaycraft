package com.kreezcraft.roleplaycraft.blocks;

import com.kreezcraft.roleplaycraft.RoleplayCraft;
import com.kreezcraft.roleplaycraft.init.InitBlocks;
import com.kreezcraft.roleplaycraft.init.InitItems;
import com.kreezcraft.roleplaycraft.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

	protected String name;

	public BlockBase(Material material, String name) {
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

}