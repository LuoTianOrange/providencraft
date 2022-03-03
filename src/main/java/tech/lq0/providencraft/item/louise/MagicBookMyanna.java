package tech.lq0.providencraft.item.louise;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tech.lq0.providencraft.group.ModGroup;
import tech.lq0.providencraft.init.EffectRegistry;
import tech.lq0.providencraft.init.SoundRegistry;

import javax.annotation.Nullable;
import java.util.List;

public class MagicBookMyanna extends Item {
    public MagicBookMyanna() {
        super(new Properties().group(ModGroup.itemgroup).maxStackSize(1));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
        ItemStack heldItem = player.getHeldItem(hand);

        if(!world.isRemote){
            player.addPotionEffect(new EffectInstance(EffectRegistry.BLESS_OF_DARK_ELF.get(),600,1));
            player.addPotionEffect(new EffectInstance(Effects.REGENERATION,600,1));
            player.addPotionEffect(new EffectInstance(Effects.STRENGTH,600,1));
            player.getCooldownTracker().setCooldown(heldItem.getItem(),2400);
        }
        world.playSound(player,player.getPosition(),
                SoundRegistry.MYANNA.get(), SoundCategory.AMBIENT,0.5f,1f);

        return new ActionResult<>(ActionResultType.SUCCESS,heldItem);
    }

    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add((new TranslationTextComponent("magic_book_myanna_func")).mergeStyle(TextFormatting.AQUA));
        tooltip.add((new TranslationTextComponent("magic_book_myanna_des")).mergeStyle(TextFormatting.GRAY));
    }


}
