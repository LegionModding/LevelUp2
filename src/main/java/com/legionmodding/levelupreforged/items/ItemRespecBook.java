package com.legionmodding.levelupreforged.items;

import com.legionmodding.levelupreforged.LevelUpReforged;

import net.minecraft.item.Item;

public class ItemRespecBook extends Item
{
    public ItemRespecBook()
    {
        super(new Item.Properties().stacksTo(1).tab(LevelUpReforged.CREATIVE_TAB));
    }

/*    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        ItemStack stack = player.getHeldItem(hand);

        if (world.isRemote) {
            LevelUp2.proxy.openSpecializationGui();
            return new ActionResult<>(EnumActionResult.SUCCESS, stack);
        }
        return new ActionResult<>(EnumActionResult.FAIL, stack);
    }*/
}

