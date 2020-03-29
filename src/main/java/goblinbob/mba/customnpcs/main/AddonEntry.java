package goblinbob.mba.customnpcs.main;

import goblinbob.mobends.core.addon.IAddon;
import goblinbob.mobends.core.bender.AddonAnimationRegistry;
import goblinbob.mobends.standard.client.renderer.entity.mutated.BipedRenderer;
import noppes.npcs.entity.EntityCustomNpc;

public class AddonEntry implements IAddon
{

    @Override
    public void registerAnimatedEntities(AddonAnimationRegistry registry)
    {
        registry.registerNewEntity(EntityCustomNpc.class, CustomNpcData::new, CustomNpcMutator::new, new BipedRenderer<>(),
                "head", "body", "leftArm", "rightArm", "leftForeArm", "rightForeArm",
                "leftLeg", "rightLeg", "leftForeLeg", "rightForeLeg");
    }

    @Override
    public String getDisplayName()
    {
        return "GoblinBob's CustomNPCs";
    }

}
