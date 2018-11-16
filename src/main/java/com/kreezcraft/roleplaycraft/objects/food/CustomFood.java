package com.avanyt.roleplaycraft.objects.food;

import com.avanyt.roleplaycraft.Main;
import com.avanyt.roleplaycraft.init.ItemsInit;
import com.avanyt.roleplaycraft.util.IHasModel;
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
    setCreativeTab(Main.tabroleplaycraft);
    
    ItemsInit.ITEMS.add(this);
  }
  
  public void registerModels() {}
}

