package com.kaleblangley.klmoney;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Money.MODID)
public class Money {
    public static final String MODID = "klmoney";
    public static final Logger LOGGER = LogUtils.getLogger();
    public Money() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}
