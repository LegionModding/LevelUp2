package com.legionmodding.levelupreforged.items;

import com.legionmodding.levelupreforged.LevelUpReforged;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import javax.annotation.Nullable;
import java.util.List;

public class ItemExperienceBook extends Item
{
    public ItemExperienceBook()
    {
        super(new Item.Properties().stacksTo(1).tab(LevelUpReforged.CREATIVE_TAB));
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag)
    {
        tooltip.add(new TranslationTextComponent(LevelUpReforged.ID + ".howto.getlevels.0"));
        tooltip.add(new TranslationTextComponent(LevelUpReforged.ID + ".howto.getlevels.1"));
    }

/*    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand)
    {
        ItemStack stack = player.getHeldItem(hand);

        if (!player.isSneaking() && world.isRemote)
        {
            LevelUp2.proxy.displayGuiForPlayer(player);
        }

        else if (player.isSneaking() && !world.isRemote)
        {
            if (SkillRegistry.getPlayer(player).addLevelFromExperience(player)) {
                FMLProxyPacket pkt = SkillPacketHandler.getSkillPacket(Side.CLIENT, 0, Maps.newHashMap(), SkillRegistry.getPlayer(player).getLevelBank(), null);
                SkillPacketHandler.initChannel.sendTo(pkt, (EntityPlayerMP)player);
            }
        }
        return new ActionResult<>(EnumActionResult.FAIL, stack);
    }*/
}
