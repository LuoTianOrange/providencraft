package tech.lq0.providencraft.item.providencefirst.usa;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tech.lq0.providencraft.entity.KurumiBoomerangEntity;
import tech.lq0.providencraft.group.ModGroup;
import tech.lq0.providencraft.init.SoundRegistry;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

public class KurumiBoomerang extends Item {
    public KurumiBoomerang(){
        super(new Properties().group(ModGroup.itemgroup));
    }

    @OnlyIn(Dist.CLIENT)
    @ParametersAreNonnullByDefault
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add((new TranslationTextComponent("kurumi_boomerang_des")).mergeStyle(TextFormatting.GRAY));
        tooltip.add((new TranslationTextComponent("description_zero")).mergeStyle(TextFormatting.LIGHT_PURPLE).mergeStyle(TextFormatting.BOLD));
    }

    @Override
    @Nonnull
    @ParametersAreNonnullByDefault
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack item = playerIn.getHeldItem(handIn);
        worldIn.playSound(null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), SoundRegistry.HOW_HOLD_BLOOD.get(), SoundCategory.NEUTRAL, 0.5F, 1.0F);
        if (!worldIn.isRemote()) {
            KurumiBoomerangEntity kurumiBoomerangEntity = new KurumiBoomerangEntity(worldIn, playerIn);
            kurumiBoomerangEntity.func_234612_a_(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0f, 3.0f, 0.2f);
            worldIn.addEntity(kurumiBoomerangEntity);
            item.shrink(1);
        }

        return new ActionResult<>(ActionResultType.SUCCESS, item);
    }
}
