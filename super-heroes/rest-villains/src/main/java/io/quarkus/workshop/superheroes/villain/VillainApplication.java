package io.quarkus.workshop.superheroes.villain;

import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Application;

@ApplicationScoped
@OpenAPIDefinition(
    info = @Info(title = "Villain API",
        description = "This API allows CRUD operations on a villain",
        version = "1.0",
        contact = @Contact(name = "Quarkus", url = "https://github.com/quarkusio")),
    servers = {
        @Server(url = "http://localhost:8084")
    },
    externalDocs = @ExternalDocumentation(url = "https://github.com/quarkusio/quarkus-workshop", description = "All the Quarkus workshops")
)
public class VillainApplication extends Application {
    // Body-nya kosong
}
