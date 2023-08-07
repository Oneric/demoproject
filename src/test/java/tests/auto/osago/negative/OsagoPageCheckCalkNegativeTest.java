package tests.auto.osago.negative;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.OsagoPrecalc.CITY;
import static constants.Constant.OsagoPrecalc.ERROR_MESSAGE;
import static constants.Constant.Urls.MAIN_PAGE_URL;

public class OsagoPageCheckCalkNegativeTest extends BaseTest {

    @Test
    @Story("Test1")
    @Description("Test1")
    public void ceckIsFastCalcErrorMessage() {
        basePage.goToUrl(MAIN_PAGE_URL);
        basePage.isConfidentialityAlertPresent();
        basePage.selectCloseConfidentialityAlert();
        basePage.selectLinkToOsagoPage();
        osagoPage.enterCity(CITY);
        osagoPage.waitForListLoad();
        osagoPage.selectOptionIndex(2);
        osagoPage.selectCalculateButton();
        osagoPage.isCalculateFormErrorPresent(ERROR_MESSAGE);
    }
}
