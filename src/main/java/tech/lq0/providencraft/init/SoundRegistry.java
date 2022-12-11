package tech.lq0.providencraft.init;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tech.lq0.providencraft.Utils;

public class SoundRegistry {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Utils.MOD_ID);

    public static final RegistryObject<SoundEvent> MYANNA = SOUNDS.register("myanna", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "myanna")));
    public static final RegistryObject<SoundEvent> HAIPLATE = SOUNDS.register("haiplate", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "haiplate")));
    public static final RegistryObject<SoundEvent> KERORO_SNEEZE = SOUNDS.register("keroro_sneeze", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "keroro_sneeze")));
    public static final RegistryObject<SoundEvent> BLADE = SOUNDS.register("blade", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "blade")));
    public static final RegistryObject<SoundEvent> YYKY_SCREAM_1 = SOUNDS.register("yyky_scream_1", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "yyky_scream_1")));
    public static final RegistryObject<SoundEvent> YYKY_SCREAM_2 = SOUNDS.register("yyky_scream_2", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "yyky_scream_2")));
    public static final RegistryObject<SoundEvent> YYKY_SCREAM_3 = SOUNDS.register("yyky_scream_3", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "yyky_scream_3")));
    public static final RegistryObject<SoundEvent> YYKY_SCREAM_4 = SOUNDS.register("yyky_scream_4", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "yyky_scream_4")));
    public static final RegistryObject<SoundEvent> YYKY_SCREAM_5 = SOUNDS.register("yyky_scream_5", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "yyky_scream_5")));
    public static final RegistryObject<SoundEvent> HOW_HOLD_BLOOD = SOUNDS.register("how_hold_blood", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "how_hold_blood")));
    public static final RegistryObject<SoundEvent> WHY_NOT_DIE = SOUNDS.register("why_not_die", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "why_not_die")));
    public static final RegistryObject<SoundEvent> SORRY = SOUNDS.register("sorry", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "sorry")));
    public static final RegistryObject<SoundEvent> BABY_MEOW = SOUNDS.register("baby_meow", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "baby_meow")));
    public static final RegistryObject<SoundEvent> SHUTTER = SOUNDS.register("shutter", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "shutter")));
    public static final RegistryObject<SoundEvent> LECIA_HOWL = SOUNDS.register("lecia_howl", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "lecia_howl")));
    public static final RegistryObject<SoundEvent> LECIA_SCREAM = SOUNDS.register("lecia_scream", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "lecia_scream")));
    public static final RegistryObject<SoundEvent> LECIA_CAST_1 = SOUNDS.register("lecia_cast_1", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "lecia_cast_1")));
    public static final RegistryObject<SoundEvent> LECIA_CAST_2 = SOUNDS.register("lecia_cast_2", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "lecia_cast_2")));

    public static final RegistryObject<SoundEvent> CHIRAM_BOLSTER = SOUNDS.register("chiram_bolster", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "chiram_bolster")));
    public static final RegistryObject<SoundEvent> CHIRAM_INTRO = SOUNDS.register("chiram_intro", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "chiram_intro")));
    public static final RegistryObject<SoundEvent> CHIRAM_TALES = SOUNDS.register("chiram_tales", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "chiram_tales")));
    public static final RegistryObject<SoundEvent> HAINE_BROADCAST = SOUNDS.register("haine_broadcast", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "haine_broadcast")));
    public static final RegistryObject<SoundEvent> HAINE_TAUNT = SOUNDS.register("haine_taunt", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "haine_taunt")));
    public static final RegistryObject<SoundEvent> HAINE_HAIPLATE = SOUNDS.register("haine_haiplate", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "haine_haiplate")));
    public static final RegistryObject<SoundEvent> EKIRA_STAR = SOUNDS.register("ekira_star", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "ekira_star")));
    public static final RegistryObject<SoundEvent> EKIRA_TAUNT = SOUNDS.register("ekira_taunt", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "ekira_taunt")));
    public static final RegistryObject<SoundEvent> EKIRA_GOURMET = SOUNDS.register("ekira_gourmet", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "ekira_gourmet")));
    public static final RegistryObject<SoundEvent> KERORO_ELECTRIC_FROG = SOUNDS.register("keroro_electric_frog", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "keroro_electric_frog")));
    public static final RegistryObject<SoundEvent> KERORO_FROG_CROWN = SOUNDS.register("keroro_frog_crown", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "keroro_frog_crown")));
    public static final RegistryObject<SoundEvent> KERORO_WALKING = SOUNDS.register("keroro_walking", () -> new SoundEvent(new ResourceLocation(Utils.MOD_ID, "keroro_walking")));
}
