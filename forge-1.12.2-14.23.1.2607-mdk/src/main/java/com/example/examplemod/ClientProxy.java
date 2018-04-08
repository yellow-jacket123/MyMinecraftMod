package com.example.examplemod;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber()
public class ClientProxy extends CommonProxy 
{
    @Override
    public void preInit(FMLPreInitializationEvent e) 
    {
        super.preInit(e);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) 
    {
    	ModBlocks.initModels();
    	ModItems.initModels();
    }
}
