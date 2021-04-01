package functional;

import org.testng.annotations.Test;
import screenplay.abilities.MakeApiCalls;
import screenplay.actors.ApiClient;
import screenplay.models.Actor;
import screenplay.questions.TheStreetName;
import screenplay.tasks.GetDetails;

public class CheckStreetByCepTest {

    private static final String URL_VIA_CEP = "http://viacep.com.br/ws/";

    Actor correios = new ApiClient("Correios do Brasil").whoCan(MakeApiCalls.at(URL_VIA_CEP));

    @Test
    public void shouldBeAbleToCheckStreetAddressTest(){
        correios.attemptsTo(GetDetails.fromNameStreet("91060900"));
        correios.shouldSeeThat(TheStreetName.namesContain("Avenida Assis Brasil 3940"));
    }
}
