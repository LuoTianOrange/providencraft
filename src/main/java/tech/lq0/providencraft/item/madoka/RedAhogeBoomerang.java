package tech.lq0.providencraft.item.madoka;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tech.lq0.providencraft.entity.AhogeBoomerangEntity;
import tech.lq0.providencraft.group.ModGroup;
import tech.lq0.providencraft.tiers.ModItemTier;

import javax.annotation.Nullable;
import java.util.List;

public class RedAhogeBoomerang extends SwordItem {
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack item = playerIn.getHeldItem(handIn);
        if(!worldIn.isRemote()){
            if(item.getDamage()<item.getMaxDamage() - 5) {
                AhogeBoomerangEntity ahogeBoomerangEntity = new AhogeBoomerangEntity(worldIn,playerIn);
                ahogeBoomerangEntity.func_234612_a_(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0f, 3.0f, 0.2f);
                worldIn.addEntity(ahogeBoomerangEntity);
                item.setDamage(item.getDamage() + 5);
                playerIn.getCooldownTracker().setCooldown(item.getItem(), 40);
            }
        }

        return new ActionResult<>(ActionResultType.SUCCESS,item);
    }

    public RedAhogeBoomerang() {
        super(ModItemTier.RED_AHOGE, 3, -2, new Item.Properties().group(ModGroup.itemgroup));
    }

    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add((new TranslationTextComponent("red_ahoge_boomerang_func")).mergeStyle(TextFormatting.AQUA));
        tooltip.add((new TranslationTextComponent("red_ahoge_sword_des1")).mergeStyle(TextFormatting.GRAY));
        tooltip.add((new TranslationTextComponent("red_ahoge_sword_des2")).mergeStyle(TextFormatting.GRAY));
        tooltip.add((new TranslationTextComponent("red_ahoge_boomerang_des")).mergeStyle(TextFormatting.GRAY));
        tooltip.add((new TranslationTextComponent("red_ahoge_sword_des4")).mergeStyle(TextFormatting.GRAY).mergeStyle(TextFormatting.STRIKETHROUGH));
    }

}
