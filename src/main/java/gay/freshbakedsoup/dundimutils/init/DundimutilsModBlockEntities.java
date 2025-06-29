
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package gay.freshbakedsoup.dundimutils.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import gay.freshbakedsoup.dundimutils.block.entity.FilmPortalBlockEntity;
import gay.freshbakedsoup.dundimutils.block.entity.CubePortalBlockEntity;
import gay.freshbakedsoup.dundimutils.DundimutilsMod;

public class DundimutilsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, DundimutilsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> FILM_PORTAL = register("film_portal", DundimutilsModBlocks.FILM_PORTAL, FilmPortalBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CUBE_PORTAL = register("cube_portal", DundimutilsModBlocks.CUBE_PORTAL, CubePortalBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
