package com.solarisbank.demo.codewithme.smell;

public class LongMethodSmell {

    private static class LongMethodSmellDto {
        String Name;
        int Quality;
        int SellIn;
    }

    public void UpdateQuality(LongMethodSmellDto[] Items) {
        for (var i = 0; i < Items.length; i++) {
            if (Items[i].Name != "Aged Brie" && Items[i].Name != "Backstage passes to a TAFKAL80ETC concert") {
                if (Items[i].Quality > 0) {
                    if (Items[i].Name != "Sulfuras, Hand of Ragnaros") {
                        Items[i].Quality = Items[i].Quality - 1;
                    }
                }
            } else {
                if (Items[i].Quality < 50) {
                    Items[i].Quality = Items[i].Quality + 1;

                    if (Items[i].Name == "Backstage passes to a TAFKAL80ETC concert") {
                        if (Items[i].SellIn < 11) {
                            if (Items[i].Quality < 50) {
                                Items[i].Quality = Items[i].Quality + 1;
                            }
                        }

                        if (Items[i].SellIn < 6) {
                            if (Items[i].Quality < 50) {
                                Items[i].Quality = Items[i].Quality + 1;
                            }
                        }
                    }
                }
            }

            if (Items[i].Name != "Sulfuras, Hand of Ragnaros") {
                Items[i].SellIn = Items[i].SellIn - 1;
            }

            if (Items[i].SellIn < 0) {
                if (Items[i].Name != "Aged Brie") {
                    if (Items[i].Name != "Backstage passes to a TAFKAL80ETC concert") {
                        if (Items[i].Quality > 0) {
                            if (Items[i].Name != "Sulfuras, Hand of Ragnaros") {
                                Items[i].Quality = Items[i].Quality - 1;
                            }
                        }
                    } else {
                        Items[i].Quality = Items[i].Quality - Items[i].Quality;
                    }
                } else {
                    if (Items[i].Quality < 50) {
                        Items[i].Quality = Items[i].Quality + 1;
                    }
                }
            }
        }
    }
}
