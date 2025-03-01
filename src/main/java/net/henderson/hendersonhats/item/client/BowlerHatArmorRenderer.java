package net.henderson.hendersonhats.item.client;

import net.henderson.hendersonhats.item.custom.BowlerHatArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BowlerHatArmorRenderer extends GeoArmorRenderer<BowlerHatArmorItem> {
    public BowlerHatArmorRenderer() {
        super(new BowlerHatArmorModel());
    }
}
