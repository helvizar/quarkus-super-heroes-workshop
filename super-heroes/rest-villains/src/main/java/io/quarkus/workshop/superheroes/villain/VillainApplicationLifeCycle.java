package io.quarkus.workshop.superheroes.villain;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import org.jboss.logging.Logger;

import javax.enterprise.event.Observes;

public class VillainApplicationLifeCycle {

    private static final Logger LOGGER = Logger.getLogger(VillainApplicationLifeCycle.class);

    void onStart(@Observes StartupEvent ev) {
        LOGGER.info(" ___   ___   ______   __       __   __   ________     ");
        LOGGER.info("/__/\\ /__/\\ /_____/\\ /_/\\     /_/\\ /_/\\ /_______/\\    ");
        LOGGER.info("\\::\\ \\\\  \\ \\\\::::_\\/_\\:\\ \\    \\:\\ \\\\ \\ \\\\__.::._\\/    ");
        LOGGER.info(" \\::\\/_\\ .\\ \\\\:\\/___/\\\\:\\ \\    \\:\\ \\\\ \\ \\  \\::\\ \\     ");
        LOGGER.info("  \\:: ___::\\ \\\\::___\\/_\\:\\ \\____\\:\\_/.:\\ \\ _\\::\\ \\__  ");
        LOGGER.info("   \\: \\ \\\\::\\ \\\\:\\____/\\\\:\\/___/\\\\ ..::/ //__\\::\\__/\\ ");
        LOGGER.info("    \\__\\/ \\::\\/ \\_____\\/ \\_____\\/ \\___/_( \\________\\/ ");
    }

    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("The application VILLAIN is stopping...");
    }
}
