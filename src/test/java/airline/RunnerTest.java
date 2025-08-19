package airline;

import com.intuit.karate.junit5.Karate;

class RunnerTest {

    @Karate.Test
    Karate testAirline() {
        return Karate.run("Airline").relativeTo(getClass());
    }
}