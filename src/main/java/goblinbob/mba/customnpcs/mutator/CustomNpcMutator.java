package goblinbob.mba.customnpcs.mutator;

import goblinbob.mba.customnpcs.data.CustomNpcData;
import goblinbob.mobends.core.data.IEntityDataFactory;
import goblinbob.mobends.standard.mutators.BipedMutator;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import noppes.npcs.entity.EntityCustomNpc;

public class CustomNpcMutator extends BipedMutator<CustomNpcData, EntityCustomNpc, ModelBiped>
{

    public CustomNpcMutator(IEntityDataFactory<EntityCustomNpc> dataFactory)
    {
        super(dataFactory);
    }

    public void storeVanillaModel(ModelBiped model)
    {
        ModelBiped vanillaModel = new ModelBiped(0.0F);
        this.vanillaModel = vanillaModel;
        super.storeVanillaModel(model);
    }

    public boolean shouldModelBeSkipped(ModelBase model)
    {
        return !(model instanceof ModelBiped);
    }

}
