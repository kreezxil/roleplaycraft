package com.kreezcraft.roleplaycraft.init;

import java.util.ArrayList;
import java.util.List;

import com.kreezcraft.roleplaycraft.items.ItemBase;

import net.minecraft.item.Item;

public class InitItems
{
  public static final List<Item> ITEMS = new ArrayList();
  
  public static final Item Ingot_Red = new ItemBase("ingot_red");
  public static final Item Heart = new ItemBase("heart");
  public static final Item LGBTHeart = new ItemBase("lgbt_heart");
  public static final Item Broken_Heart = new ItemBase("broken_heart");
  public static final Item Raw_Poop = new ItemBase("raw_poop");
  public static final Item Cooked_Poop = new ItemBase("cooked_poop");
  public static final Item Rainbow_Ingot = new ItemBase("rainbow_ingot");
  public static final Item LoveEmoji = new ItemBase("loveemoji");
  public static final Item KissEmoji = new ItemBase("kissemoji");
  public static final Item CoolEmoji = new ItemBase("coolemoji");
  
  //heart parts
  public static final Item LeftLove = new ItemBase("left_love");
  public static final Item RightLove = new ItemBase("right_love");
  public static final Item LeftDesire = new ItemBase("left_desire");
  public static final Item RightDesire = new ItemBase("right_desire");
  
  //ornaments
  public static final Item BlueOrnament = new ItemBase("ornament_blue");
  public static final Item GreenOrnament = new ItemBase("ornament_green");
  public static final Item MagentaOrnament = new ItemBase("ornament_magenta");
  public static final Item RedOrnament = new ItemBase("ornament_red");
  public static final Item WhiteOrnament = new ItemBase("ornament_white");
  public static final Item YellowOrnament = new ItemBase("ornament_yellow");

}

