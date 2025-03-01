package net.henderson.hendersonhats.item.client;

import net.henderson.hendersonhats.item.custom.CowboyHatArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CowboyHatArmorRenderer extends GeoArmorRenderer<CowboyHatArmorItem> {
    public CowboyHatArmorRenderer() {
        super(new CowboyHatArmorModel());
    }
}
