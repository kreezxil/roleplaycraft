package com.avanyt.roleplaycraft.Handlers;

import com.avanyt.roleplaycraft.init.ItemsInit;
import com.avanyt.roleplaycraft.util.IHasModel;
import java.util.List;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

@Mod.EventBusSubscriber
public class RegHandler
{
  @SubscribeEvent
  public static void onItemRegister(RegistryEvent.Register<Item> event)
  {
    event.getRegistry().registerAll((IForgeRegistryEntry[])ItemsInit.ITEMS.toArray(new Item[0]));
  }
  
  @SubscribeEvent
  public static void onModelRegister(ModelRegistryEvent event)
  {
    for (Item item : ItemsInit.ITEMS) {
      if ((item instanceof IHasModel)) {
        ((IHasModel)item).registerModels();
      }
    }
  }
}
