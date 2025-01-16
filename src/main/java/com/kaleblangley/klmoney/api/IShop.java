package com.kaleblangley.klmoney.api;

import net.minecraft.world.item.Item;

import java.util.Map;

public interface IShop {
    Map<Item, Integer> getGoods();
    void addGood(Item item, int money);
    void addGoods(Map<Item, Integer> goods);
    void removeGood(Item item, int money);
    void removeGoods(Map<Item, Integer> goods);
    boolean hasGood(Item item, int money);
}
