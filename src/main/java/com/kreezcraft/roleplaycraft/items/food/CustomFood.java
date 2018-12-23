package com.kreezcraft.roleplaycraft.items.food;

import com.kreezcraft.roleplaycraft.RoleplayCraft;
import com.kreezcraft.roleplaycraft.init.InitItems;
import com.kreezcraft.roleplaycraft.interfaces.IHasModel;

import java.util.List;
import net.minecraft.item.ItemFood;

public class CustomFood
  extends ItemFood
  implements IHasModel
{
  public CustomFood(String name, int amount, boolean isWolfFood)
  {
    super(amount, isWolfFood);
   setUnlocalizedName(name);
    setRegistryName(name);
    setCreativeTab(RoleplayCraft.tabroleplaycraft);
    
    InitItems.ITEMS.add(this);
  }
  
  @Override
  public void registerModels() {}
}

