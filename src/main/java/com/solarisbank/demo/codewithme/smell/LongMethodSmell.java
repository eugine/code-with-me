package com.solarisbank.demo.codewithme.smell;

public class LongMethodSmell {

    public static final String BACKSTAGE_NAME = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_NAME = "Sulfuras, Hand of Ragnaros";
    public static final String AGED_BRIE_NAME = "Aged Brie";

    private static class LongMethodSmellItem {
        String name;
        int quality;
        int sellIn;
    }

    public void updateQuality(LongMethodSmellItem[] items) {
        for (LongMethodSmellItem item : items) {
            preprocessQuantity(item);
            processSellIn(item);
            postProcessQuantity(item);
        }
    }

    private void postProcessQuantity(LongMethodSmellItem item) {
        if (item.sellIn < 0) {
            if (isNameNotEqual(item, AGED_BRIE_NAME)) {
                if (isNameEqual(item, BACKSTAGE_NAME)) {
                    decreaseQuantityIfNotSulfuras(item);
                } else {
                    item.quality = 0;
                }
            } else {
                increaseQuantityIfLessThan50(item);
            }
        }
    }

    private void processSellIn(LongMethodSmellItem item) {
        if (isNameNotEqual(item, SULFURAS_NAME)) {
            item.sellIn = item.sellIn - 1;
        }
    }

    private void preprocessQuantity(LongMethodSmellItem item) {
        if (isNameNotEqual(item, AGED_BRIE_NAME) && isNameNotEqual(item, BACKSTAGE_NAME)) {
            decreaseQuantityIfNotSulfuras(item);
        } else {
            if (item.quality < 50) {
                item.quality++;
                if (isNameEqual(item, BACKSTAGE_NAME)) {
                    if (item.sellIn < 11) {
                        increaseQuantityIfLessThan50(item);
                    }

                    if (item.sellIn < 6) {
                        increaseQuantityIfLessThan50(item);
                    }
                }
            }
        }
    }

    private void decreaseQuantityIfNotSulfuras(LongMethodSmellItem item) {
        if (item.quality > 0 && isNameNotEqual(item, SULFURAS_NAME)) {
            item.quality--;
        }
    }

    private void increaseQuantityIfLessThan50(LongMethodSmellItem item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    private boolean isNameEqual(LongMethodSmellItem item, String name) {
        return item.name.equals(name);
    }

    private boolean isNameNotEqual(LongMethodSmellItem item, String name) {
        return !isNameEqual(item, name);
    }

}
