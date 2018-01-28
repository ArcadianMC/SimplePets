package simplepets.brainsynder.nms;

import simplepets.brainsynder.PetCore;
import simplepets.brainsynder.nms.registry.PetRegistry;
import simplepets.brainsynder.reflection.ReflectionUtil;

public class VersionNMS extends ReflectionUtil {
    private static PetRegistry register;

    public static void registerPets() {
        PetCore.get().debug("Registering Pets...");
        getRegister().registerAll();
    }

    private static PetRegistry getRegister() {
        if (register == null)
            register = new PetRegistry();
        return register;
    }

    public static void unregisterPets() {
        if (ReflectionUtil.getVersionInt() >= 111) {
            return;
        }
        getRegister().unregisterAll();
    }
}
