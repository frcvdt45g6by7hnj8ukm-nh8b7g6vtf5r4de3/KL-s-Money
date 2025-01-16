package com.kaleblangley.klmoney.util.impl;

import com.kaleblangley.klmoney.api.IShop;
import net.minecraft.world.item.Item;

import java.util.Map;

public class Shop implements IShop {
    private final Map<Item, Integer> goods;

    public Shop(Map<Item, Integer> goods){
        this.goods = goods;
    }
    @Override
    public Map<Item, Integer> getGoods() {
        return this.goods;
    }

    @Override
    public void addGood(Item item, int money) {
        this.goods.put(item, money);
    }

    @Override
    public void addGoods(Map<Item, Integer> goods) {
        this.goods.putAll(goods);
    }

    @Override
    public void removeGood(Item item, int money) {
        this.goods.remove(item, money);
    }

    @Override
    public void removeGoods(Map<Item, Integer> goods) {
        goods.forEach(this.goods::remove);
    }

    @Override
    public boolean hasGood(Item item, int money) {
        return this.goods.get(item) == money;
    }
}
