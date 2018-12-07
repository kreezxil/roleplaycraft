package com.kreezcraft.roleplaycraft.tabs;

import com.kreezcraft.roleplaycraft.init.InitItems;
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
    return new ItemStack(InitItems.LGBTHeart);
  }
}

