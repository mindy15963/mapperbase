package tv.mapper.mapperbase.data.gen;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import tv.mapper.mapperbase.block.BaseBlocks;
import tv.mapper.mapperbase.data.BaseTags;

public class BaseBlockTags extends BlockTagsProvider
{
    public BaseBlockTags(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    public void registerTags()
    {
        this.getBuilder(BlockTags.STAIRS).add(BaseBlocks.STEEL_STAIRS.get(), BaseBlocks.CONCRETE_STAIRS.get(), BaseBlocks.ASPHALT_STAIRS.get());
        this.getBuilder(BlockTags.SLABS).add(BaseBlocks.STEEL_SLAB.get(), BaseBlocks.CONCRETE_SLAB.get(), BaseBlocks.ASPHALT_SLAB.get());
        this.getBuilder(BlockTags.WALLS).add(BaseBlocks.STEEL_WALL.get(), BaseBlocks.CONCRETE_WALL.get());
        this.getBuilder(BlockTags.FENCES).add(BaseBlocks.STEEL_FENCE.get(), BaseBlocks.CONCRETE_FENCE.get());
        this.getBuilder(Tags.Blocks.FENCE_GATES).add(BaseBlocks.STEEL_FENCE_GATE.get(), BaseBlocks.CONCRETE_FENCE_GATE.get());
        this.getBuilder(Tags.Blocks.FENCES).add(BaseBlocks.STEEL_FENCE.get(), BaseBlocks.CONCRETE_FENCE.get());
        this.getBuilder(Tags.Blocks.STORAGE_BLOCKS).add(BaseBlocks.STEEL_BLOCK.get(), BaseBlocks.BITUMEN_BLOCK.get());
        this.getBuilder(Tags.Blocks.ORES).add(BaseBlocks.BITUMEN_ORE.get());
        this.getBuilder(BaseTags.ForgeBlocks.ORES_BITUMEN).add(BaseBlocks.BITUMEN_ORE.get());
        this.getBuilder(BaseTags.ForgeBlocks.STORAGE_BLOCKS_BITUMEN).add(BaseBlocks.BITUMEN_BLOCK.get());
        this.getBuilder(BaseTags.ForgeBlocks.STORAGE_BLOCKS_STEEL).add(BaseBlocks.STEEL_BLOCK.get());
        this.getBuilder(BaseTags.ForgeBlocks.PRESSURE_PLATES).add(BaseBlocks.STEEL_PRESSURE_PLATE.get(), BaseBlocks.CONCRETE_PRESSURE_PLATE.get(), BaseBlocks.ASPHALT_PRESSURE_PLATE.get());
        this.getBuilder(BaseTags.Blocks.CONCRETE).add(BaseBlocks.CONCRETE.get());
        this.getBuilder(BaseTags.Blocks.ASPHALT).add(BaseBlocks.ASPHALT.get());
    }
}