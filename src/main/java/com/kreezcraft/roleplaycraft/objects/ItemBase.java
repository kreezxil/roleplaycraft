package com.avanyt.roleplaycraft.objects;

import com.avanyt.roleplaycraft.Main;
import com.avanyt.roleplaycraft.init.ItemsInit;
import com.avanyt.roleplaycraft.proxy.CommonProxy;
import com.avanyt.roleplaycraft.util.IHasModel;
import java.util.List;
import net.minecraft.item.Item;

public class ItemBase
  extends Item
  implements IHasModel
{
  public ItemBase(String name)
  {
    setUnlocalizedName(name);
    setRegistryName(name);
    setCreativeTab(Main.tabroleplaycraft);
    
    ItemsInit.ITEMS.add(this);
  }
  
  public void registerModels()
  {
    Main.proxy.registerItemRenderer(this, 0, "inventory");
  }
}

