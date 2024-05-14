package com.IroPlisk.eyecandycraftdecor.block;

import com.IroPlisk.eyecandycraftdecor.ECCDCreativeTab;
import com.IroPlisk.eyecandycraftdecor.EyeCandyCraftDecor;
import com.IroPlisk.eyecandycraftdecor.item.ItemInit;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, EyeCandyCraftDecor.MODID);

    //antenne
    public static final RegistryObject<Block> ANTENNA_4G = registerBlock("antenna4g",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> ANTENNA_900MHZ = registerBlock("antenna900mhz",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> ANTENNA_GP = registerBlock("antennagp",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> ANTENNA_LP = registerBlock("antennalp",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> SATELLITE_DISH = registerBlock("satellitedish",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> ANTENNA_VD = registerBlock("antennavd",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> ANTENNA_VHF = registerBlock("antennavhf",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> ANTI_PASSAGGIO = registerBlock("antipassaggio",
            () -> new BarrierBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> LATTICE_POST = registerBlock("latticepost",
            () -> new LatticeBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> ROOVY_CACCA = registerBlock("roovycacca",
            () -> new BarrierBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> STANTE = registerBlock("stante",
            () -> new LatticeBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> STANTE_SEGNALE = registerBlock("stante_segnale",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);

    // banchine
    public static final RegistryObject<Block> BANCHINA_BORDO_CON_HANDICAP = registerBlock("banchina_bordo_con_handicap",
            () -> new SlabbyBlockModel(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BANCHINA_BORDO = registerBlock("banchina_bordo",
            () -> new SlabbyBlockModel(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BANCHINA_CENTRO = registerBlock("banchina_centro",
            () -> new SlabbyBlockModel(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BANCHINA_CON_PANCHINA = registerBlock("banchina_con_panchina",
            () -> new SlabbyBlockModel(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BANCHINA_DISABILI_A_T = registerBlock("banchina_disabili_a_t",
            () -> new SlabbyBlockModel(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BANCHINA_LINEA_GIALLA_PER_DISABILI = registerBlock("banchina_linea_gialla_per_disabili",
            () -> new SlabbyBlockModel(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BANCHINA_LINEA_GIALLA = registerBlock("banchina_linea_gialla",
            () -> new SlabbyBlockModel(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);

    // bidoni

    public static final RegistryObject<Block> BIDONE_SPAZZATURA_SCUOLA = registerBlock("bidone_spazzatura_scuola",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BIDONE_SPAZZATURA_SINGOLO_PIENO = registerBlock("bidone_spazzatura_singolo_pieno",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BIDONE_SPAZZATURA_SINGOLO = registerBlock("bidone_spazzatura_singolo",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);

    //cctv
    public static final RegistryObject<Block> CCTV_BASIC_CAMERA_ROUTATA = registerBlock("cctv_basic_camera_routata",
            () -> new WallmountBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CCTV_BASIC_CAMERA = registerBlock("cctv_basic_camera",
            () -> new WallmountBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CCTV_PTZ_CAMERA = registerBlock("cctv_ptz_camera",
            () -> new WallmountBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);

    // estintori

    public static final RegistryObject<Block> ESTINTORE_CON_TARGA = registerBlock("estintoretarga",
            () -> new WallmountBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> ESTINTORE = registerBlock("estintore",
            () -> new WallmountBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);

    //luci

    public static final RegistryObject<Block> FLOODLIGHT = registerBlock("floodlight",
            () -> new WallmountBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion().lightLevel((T) -> {
                        return 15;
                    })), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> FLAT_NEON = registerBlock("flat_neon",
            () -> new RoofMountBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion().lightLevel((T) -> {
                        return 15;
                    })), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> NEON = registerBlock("neon",
            () -> new RoofMountBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion().lightLevel((T) -> {
                        return 15;
                    })), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> LAMPADARIO = registerBlock("lampadario",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion().lightLevel((T) -> {
                        return 15;
                    })), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> LED_FIXTURE_PANEL = registerBlock("led_fixture_panel",
            () -> new RoofMountBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion().lightLevel((T) -> {
                        return 15;
                    })), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> DESK_LAMP = registerBlock("desk_lamp",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion().lightLevel((T) -> {
                        return 15;
                    })), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> FARO_PAVIMENTO = registerBlock("faro_pavimento",
            () -> new DesktopBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion().lightLevel((T) -> {
                        return 15;
                    })), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> LAMPIONE_MODERNO = registerBlock("lampione_moderno",
            () -> new DesktopBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion().lightLevel((T) -> {
                        return 15;
                    })), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    //public static final RegistryObject<Block> LAMPIONE VECCHIO = registerBlock("faro_pavimento", TODO, NO TEXTURE NO BLOCK
    //        () -> new DesktopBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
    //                .strength(6f).
    //                requiresCorrectToolForDrops().noOcclusion().lightLevel((T) -> {
    //                    return 15;
    //                })), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> LAMPIONE_MODERNO_PALO = registerBlock("lampione_moderno_palo",
            () -> new DesktopBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion().lightLevel((T) -> {
                        return 15;
                    })), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> LAMPIONE_VECCHIO_PALO = registerBlock("lampione_vecchio_palo",
            () -> new DesktopBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion().lightLevel((T) -> {
                        return 15;
                    })), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);

    //trenaggio
    public static final RegistryObject<Block> BRIDGE = registerBlock("bridge",
            () -> new BridgeBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BRIDGE_S = registerBlock("bridge_s",
            () -> new BridgeBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CROCE_S_ANDREA = registerBlock("croce_s_andrea",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);

    //deco mista
    public static final RegistryObject<Block> LAPTOP = registerBlock("laptop",
            () -> new DesktopBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> OLD_PHONE = registerBlock("old_phone",
            () -> new DesktopBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> NEW_PHONE = registerBlock("new_phone",
            () -> new DesktopBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> TOWER_PC = registerBlock("tower_pc",
            () -> new DesktopBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> AR_SIREN = registerBlock("ar_siren",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> MIC = registerBlock("mic",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> TV = registerBlock("tv",
            () -> new DesktopBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> TV_WALL_MOUNT = registerBlock("tv_wall_mount",
            () -> new WallmountBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> TV_LCD = registerBlock("tv_lcd",
            () -> new WallmountBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> FOUNTAINELLE = registerBlock("fountain",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> OBLITERATOR = registerBlock("obliterator",
            () -> new WallmountBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> MODEM_SAT = registerBlock("modem_sat",
            () -> new DesktopBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CONSOLE_REGIA = registerBlock("console_regia",
            () -> new DesktopBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BANCO = registerBlock("banco",
            () -> new DesktopBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BARBED_WIRE = registerBlock("barbed_wire",
            () -> new BWBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> MISCELATORE = registerBlock("miscelatore",
            () -> new WallmountBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> OLD_RADIO = registerBlock("old_radio",
            () -> new DesktopBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CABLE_MEDIUM = registerBlock("cable_medium",
            () -> new StairBlock(Blocks.IRON_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CABLE_SMALL = registerBlock("cable_small",
            () -> new StairBlock(Blocks.IRON_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CABLE = registerBlock("cable",
            () -> new StairBlock(Blocks.IRON_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> METAL_LADDER = registerBlock("metal_ladder",
            () -> new WallmountLadderBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> OLD_TV = registerBlock("old_tv",
            () -> new DesktopBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> PALO_SCALA = registerBlock("palo_scala",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> PALO_TERM = registerBlock("palo_term",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> PANCA_DESTRA = registerBlock("panca_dx",
            () -> new SlabbyBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> PANCA_SINGLE = registerBlock("panca",
            () -> new SlabbyBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> PANCA_SINISTRA = registerBlock("panca_sx",
            () -> new SlabbyBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> SCRIVANIA = registerBlock("scrivania",
            () -> new DesktopBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> SOFFIONE = registerBlock("soffione",
            () -> new WallmountBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> TERMOSIFONE = registerBlock("termosifone",
            () -> new WallmountBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> TETTE_AMIANTO = registerBlock("tetto_amianto",
            () -> new BridgeBlockModel(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> GRAVITY_GUN = registerBlock("gravity_gun_deco",
            () -> new DesktopBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion().lightLevel((T) -> {
                        return 2;
                    })), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> PORTAL_GUN = registerBlock("portal_gun_deco",
            () -> new DesktopBlockModel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion().lightLevel((T) -> {
                        return 2;
                    })), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);








    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab){
        return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
