package simplepets.brainsynder.nms.entities.v1_8_R3.list;

import net.minecraft.server.v1_8_R3.World;
import simplepets.brainsynder.nms.entities.type.IEntitySpiderPet;
import simplepets.brainsynder.nms.entities.v1_8_R3.EntityPet;
import simplepets.brainsynder.pet.IPet;

/**
 * @Deprecated Will be removed when MC version 1.13 is released
 */
@Deprecated
public class EntitySpiderPet extends EntityPet implements IEntitySpiderPet {
    public EntitySpiderPet(World world, IPet pet) {
        super(world, pet);
    }

    public EntitySpiderPet(World world) {
        super(world);
    }

    @Override
    protected String getIdleSound() {
        return null;
    }

    @Override
    protected String getDeathSound() {
        return null;
    }

}
