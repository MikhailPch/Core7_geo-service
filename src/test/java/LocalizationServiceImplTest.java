import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {
    @Test
    void testLocale() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        String actual = localizationService.locale(Country.BRAZIL);
        String expected = "Welcome";
        Assertions.assertEquals(expected, actual);
    }
}
