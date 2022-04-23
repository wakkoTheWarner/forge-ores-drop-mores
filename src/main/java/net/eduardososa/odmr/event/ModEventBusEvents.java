package net.eduardososa.odmr.event;

import net.eduardososa.odmr.OdmrMod;
import net.eduardososa.odmr.event.loot.ancientDebrisShardFromAcientDebris;
import net.eduardososa.odmr.event.loot.moreDropsFromOres;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = OdmrMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new moreDropsFromOres.Serializer().setRegistryName
                        (new ResourceLocation(OdmrMod.MOD_ID,"more_coal_drop")),
                new moreDropsFromOres.Serializer().setRegistryName
                        (new ResourceLocation(OdmrMod.MOD_ID,"more_deepcoal_drop")),
                new moreDropsFromOres.Serializer().setRegistryName
                        (new ResourceLocation(OdmrMod.MOD_ID,"more_iron_drop")),
                new moreDropsFromOres.Serializer().setRegistryName
                        (new ResourceLocation(OdmrMod.MOD_ID,"more_deepiron_drop")),
                new moreDropsFromOres.Serializer().setRegistryName
                        (new ResourceLocation(OdmrMod.MOD_ID,"more_gold_drop")),
                new moreDropsFromOres.Serializer().setRegistryName
                        (new ResourceLocation(OdmrMod.MOD_ID,"more_deepgold_drop")),
                new moreDropsFromOres.Serializer().setRegistryName
                        (new ResourceLocation(OdmrMod.MOD_ID,"more_diamond_drop")),
                new moreDropsFromOres.Serializer().setRegistryName
                        (new ResourceLocation(OdmrMod.MOD_ID,"more_deepdiamond_drop")),
                new moreDropsFromOres.Serializer().setRegistryName
                        (new ResourceLocation(OdmrMod.MOD_ID,"more_emerald_drop")),
                new moreDropsFromOres.Serializer().setRegistryName
                        (new ResourceLocation(OdmrMod.MOD_ID,"more_deepemerald_drop")),
                new moreDropsFromOres.Serializer().setRegistryName
                        (new ResourceLocation(OdmrMod.MOD_ID,"more_lapiz_drop")),
                new moreDropsFromOres.Serializer().setRegistryName
                        (new ResourceLocation(OdmrMod.MOD_ID,"more_deeplapiz_drop")),
                new moreDropsFromOres.Serializer().setRegistryName
                        (new ResourceLocation(OdmrMod.MOD_ID,"more_copper_drop")),
                new moreDropsFromOres.Serializer().setRegistryName
                        (new ResourceLocation(OdmrMod.MOD_ID,"more_deepcopper_drop")),
                new moreDropsFromOres.Serializer().setRegistryName
                        (new ResourceLocation(OdmrMod.MOD_ID,"more_redstone_drop")),
                new moreDropsFromOres.Serializer().setRegistryName
                        (new ResourceLocation(OdmrMod.MOD_ID,"more_deepredstone_drop")),
                new moreDropsFromOres.Serializer().setRegistryName
                        (new ResourceLocation(OdmrMod.MOD_ID,"more_quartz_drop")),
                new moreDropsFromOres.Serializer().setRegistryName
                        (new ResourceLocation(OdmrMod.MOD_ID,"more_ngold_drop")),
                new ancientDebrisShardFromAcientDebris.Serializer().setRegistryName
                        (new ResourceLocation(OdmrMod.MOD_ID, "more_ancientdebris_drop"))
        );
    }
}
