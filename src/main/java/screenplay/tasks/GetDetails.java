package screenplay.tasks;

import screenplay.actors.ApiClient;
import screenplay.models.Task;
import static io.restassured.RestAssured.get;

public class GetDetails implements Task<ApiClient> {

    String apiName;

    GetDetails(String apiName) {
        this.apiName = apiName;
    }

    public static GetDetails fromNameStreet(final String apiName) {
        return new GetDetails(apiName);
    }

    @Override
    public void perform(final ApiClient actor) {
        String apiQuery = actor.getApiBaseUrl() + apiName + "/json";
        actor.setResponse(get(apiQuery));
        logger.info(() -> actor.name() + " got details from cep " + apiName + "(" + apiQuery + ")");
    }
}
