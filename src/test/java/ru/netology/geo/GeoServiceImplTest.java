package ru.netology.geo;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeoServiceImplTest {
    @Test
    void testByIp() {
        GeoService geoService = new GeoServiceImpl();
        Location actual = geoService.byIp("172.0.32.11");
        Location expected = new Location("Moscow", Country.RUSSIA, "Lenina", 15);
        assertEquals(expected, actual);
    }
}
