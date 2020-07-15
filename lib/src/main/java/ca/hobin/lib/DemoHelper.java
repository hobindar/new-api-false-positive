package ca.hobin.lib;

import java.util.Optional;

public final class DemoHelper {

    public Optional returnOptional() {
        return Optional.of(""); // "of" is underlined in Android Studio 4.0.0 and 4.0.1, false positive lint warning
    }

}
