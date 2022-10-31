package tech.lq0.providencraft;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import tech.lq0.providencraft.init.*;

@Mod("providencraft")
public class Utils {
    public static final String MOD_ID = "providencraft";

    public Utils() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);

        ItemRegistry.ITEMS.register(eventBus);
        EffectRegistry.EFFECTS.register(eventBus);
        PotionRegistry.POTION_TYPES.register(eventBus);
        EnchantRegistry.ENCHANTMENTS.register(eventBus);
        SoundRegistry.SOUNDS.register(eventBus);
        EntityRegistry.ENTITY_TYPES.register(eventBus);
        VillagerInit.POINTS_OF_INTEREST.register(eventBus);
        VillagerInit.PROFESSIONS.register(eventBus);
        BlockRegistry.BLOCKS.register(eventBus);
        AttributeRegistry.ATTRIBUTES.register(eventBus);
        ParticleRegistry.PARTICLE_TYPES.register(eventBus);
        TileEntityRegistry.TILE_ENTITY_TYPES.register(eventBus);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {

    }
}
