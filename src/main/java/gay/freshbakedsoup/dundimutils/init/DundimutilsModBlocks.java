
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package gay.freshbakedsoup.dundimutils.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import gay.freshbakedsoup.dundimutils.block.FilmPortalBlock;
import gay.freshbakedsoup.dundimutils.block.CubePortalBlock;
import gay.freshbakedsoup.dundimutils.DundimutilsMod;

public class DundimutilsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DundimutilsMod.MODID);
	public static final RegistryObject<Block> FILM_PORTAL = REGISTRY.register("film_portal", () -> new FilmPortalBlock());
	public static final RegistryObject<Block> CUBE_PORTAL = REGISTRY.register("cube_portal", () -> new CubePortalBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
