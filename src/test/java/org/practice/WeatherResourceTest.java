package org.practice;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

@QuarkusTest
class WeatherResourceTest {

    private WeatherResource weatherResource = new WeatherResource();

    @ParameterizedTest
    @ValueSource(strings = {"London", "Mumbai", "Paris"})
    public void getWeatherResponseTest(final String param) {
        Optional<WeatherResponse> response = weatherResource.getWeatherResponse(param);
        assertNotNull(response);
    }
}