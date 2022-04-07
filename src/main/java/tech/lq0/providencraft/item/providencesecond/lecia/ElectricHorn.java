package tech.lq0.providencraft.item.providencesecond.lecia;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import tech.lq0.providencraft.Utils;
import tech.lq0.providencraft.group.ModGroup;
import tech.lq0.providencraft.models.ElectricHornModel;

import javax.annotation.Nullable;

public class ElectricHorn extends ArmorItem {
    public ElectricHorn() {
        super(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Properties().defaultMaxDamage(1145).group(ModGroup.itemgroup));
    }

    @Nullable
    @Override
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        return (A) new ElectricHornModel<>();
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return Utils.MOD_ID + ":textures/models/armor/electric_horn_model_texture.png";
    }
}
