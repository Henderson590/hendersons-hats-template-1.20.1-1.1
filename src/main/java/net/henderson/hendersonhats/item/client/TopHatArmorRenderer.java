package net.henderson.hendersonhats.item.client;

import net.henderson.hendersonhats.item.custom.TopHatArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class TopHatArmorRenderer extends GeoArmorRenderer<TopHatArmorItem> {
    public TopHatArmorRenderer() {
        super(new TopHatArmorModel());
    }
}
