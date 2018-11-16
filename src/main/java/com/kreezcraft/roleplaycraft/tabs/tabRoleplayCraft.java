package com.avanyt.roleplaycraft.tabs;

import com.avanyt.roleplaycraft.init.ItemsInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class tabRoleplayCraft
  extends CreativeTabs
{
  public tabRoleplayCraft(String label)
  {
    super("tabroleplaycraft");
  }
  
  public ItemStack getTabIconItem()
  {
    return new ItemStack(ItemsInit.LGBTHeart);
  }
}

