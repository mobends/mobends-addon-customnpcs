package goblinbob.mba.customnpcs.animation.controller;

import goblinbob.mba.customnpcs.data.CustomNpcData;
import goblinbob.mobends.core.animation.bit.AnimationBit;
import goblinbob.mobends.core.animation.controller.IAnimationController;
import goblinbob.mobends.core.animation.layer.HardAnimationLayer;
import goblinbob.mobends.standard.animation.bit.biped.JumpAnimationBit;
import goblinbob.mobends.standard.animation.bit.biped.StandAnimationBit;
import goblinbob.mobends.standard.animation.bit.biped.WalkAnimationBit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomNpcController implements IAnimationController<CustomNpcData>
{

    protected HardAnimationLayer<CustomNpcData> layerBase = new HardAnimationLayer<>();
    protected AnimationBit<CustomNpcData> bitStand = new StandAnimationBit<>();
    protected AnimationBit<CustomNpcData> bitWalk = new WalkAnimationBit<>();
    protected AnimationBit<CustomNpcData> bitJump = new JumpAnimationBit<>();

    public CustomNpcController()
    {
    }

    public Collection<String> perform(CustomNpcData npcData)
    {
        if (npcData.isOnGround() && npcData.getTicksAfterTouchdown() >= 1.0F)
        {
            if (npcData.isStillHorizontally())
            {
                this.layerBase.playOrContinueBit(this.bitStand, npcData);
            }
            else
            {
                this.layerBase.playOrContinueBit(this.bitWalk, npcData);
            }
        }
        else
        {
            this.layerBase.playOrContinueBit(this.bitJump, npcData);
        }

        List<String> actions = new ArrayList<>();
        this.layerBase.perform(npcData, actions);
        return actions;
    }

}
