package net.henderson.hendersonhats.item.client;

import net.henderson.hendersonhats.HendersonsHats;
import net.henderson.hendersonhats.item.custom.CowboyHatArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class CowboyHatArmorModel extends GeoModel<CowboyHatArmorItem> {

    @Override
    public Identifier getModelResource(CowboyHatArmorItem cowboyHatArmorItem) {
        return new Identifier(HendersonsHats.MOD_ID, "geo/cowboy_hat.geo.json");
    }

    @Override
    public Identifier getTextureResource(CowboyHatArmorItem cowboyHatArmorItem) {
        return new Identifier(HendersonsHats.MOD_ID, "textures/armor/cowboy_hat.png");
    }

    @Override
    public Identifier getAnimationResource(CowboyHatArmorItem cowboyHatArmorItem) {
        return new Identifier(HendersonsHats.MOD_ID, "animation/cowboy_hat.animation.json");
    }
}