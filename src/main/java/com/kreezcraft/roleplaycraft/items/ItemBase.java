package com.kreezcraft.roleplaycraft.items;

import com.kreezcraft.roleplaycraft.RoleplayCraft;
import com.kreezcraft.roleplaycraft.init.InitItems;
import com.kreezcraft.roleplaycraft.interfaces.IHasModel;
import com.kreezcraft.roleplaycraft.proxy.CommonProxy;

import java.util.List;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(RoleplayCraft.tabroleplaycraft);

		InitItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		RoleplayCraft.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
