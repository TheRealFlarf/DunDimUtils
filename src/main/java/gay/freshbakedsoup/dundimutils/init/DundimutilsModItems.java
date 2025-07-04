
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package gay.freshbakedsoup.dundimutils.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import gay.freshbakedsoup.dundimutils.DundimutilsMod;

public class DundimutilsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DundimutilsMod.MODID);
	public static final RegistryObject<Item> FILM_PORTAL = block(DundimutilsModBlocks.FILM_PORTAL);
	public static final RegistryObject<Item> CUBE_PORTAL = block(DundimutilsModBlocks.CUBE_PORTAL);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
