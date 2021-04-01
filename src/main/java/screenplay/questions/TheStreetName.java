package screenplay.questions;

import screenplay.actors.ApiClient;
import screenplay.models.Question;
import static org.hamcrest.CoreMatchers.*;

public class TheStreetName implements Question<ApiClient> {

    String expectedName;

    TheStreetName(String expectedName) {
        this.expectedName = expectedName;
    }

    public static TheStreetName namesContain(String expectedName) {
        return new TheStreetName(expectedName);
    }

    @Override
    public void ask(final ApiClient actor) {
        actor.getResponse().then().body("logradouro", is(expectedName));
        logger.info(() -> actor.name() + " saw that the band members list contains " + expectedName);
    }
}
