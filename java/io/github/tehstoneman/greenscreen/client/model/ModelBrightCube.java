package io.github.tehstoneman.greenscreen.client.model;

import java.util.Collection;

import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.IModel;
import net.minecraftforge.common.model.IModelState;

import com.google.common.base.Function;

public class ModelBrightCube implements IModel
{

	@Override
	public Collection< ResourceLocation > getDependencies()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection< ResourceLocation > getTextures()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBakedModel bake( IModelState state, VertexFormat format, Function< ResourceLocation, TextureAtlasSprite > bakedTextureGetter )
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IModelState getDefaultState()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
