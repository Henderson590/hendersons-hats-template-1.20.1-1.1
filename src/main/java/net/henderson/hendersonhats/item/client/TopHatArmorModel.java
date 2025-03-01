package net.henderson.hendersonhats.item.client;

import net.henderson.hendersonhats.HendersonsHats;
import net.henderson.hendersonhats.item.custom.TopHatArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class TopHatArmorModel extends GeoModel<TopHatArmorItem> {
    @Override
    public Identifier getModelResource(TopHatArmorItem topHatArmorItem) {
        return new Identifier(HendersonsHats.MOD_ID, "geo/top_hat.geo.json");
    }

    @Override
    public Identifier getTextureResource(TopHatArmorItem topHatArmorItem) {
        return new Identifier(HendersonsHats.MOD_ID, "textures/armor/tophat.png");
    }

    @Override
    public Identifier getAnimationResource(TopHatArmorItem topHatArmorItem) {
        return new Identifier(HendersonsHats.MOD_ID, "animation/model.animation.json");
    }
}
