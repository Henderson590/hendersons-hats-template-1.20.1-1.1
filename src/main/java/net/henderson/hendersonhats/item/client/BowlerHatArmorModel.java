package net.henderson.hendersonhats.item.client;

import net.henderson.hendersonhats.HendersonsHats;
import net.henderson.hendersonhats.item.custom.BowlerHatArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class BowlerHatArmorModel extends GeoModel<BowlerHatArmorItem> {

    @Override
    public Identifier getModelResource(BowlerHatArmorItem bowlerHatArmorItem) {
        return new Identifier(HendersonsHats.MOD_ID, "geo/bowler_hat.geo.json");
    }

    @Override
    public Identifier getTextureResource(BowlerHatArmorItem bowlerHatArmorItem) {
        return new Identifier(HendersonsHats.MOD_ID, "textures/armor/bowler_hat.png");
    }

    @Override
    public Identifier getAnimationResource(BowlerHatArmorItem bowlerHatArmorItem) {
        return new Identifier(HendersonsHats.MOD_ID, "animation/bowler_hat.animation.json");
    }
}