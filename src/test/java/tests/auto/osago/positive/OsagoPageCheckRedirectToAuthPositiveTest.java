package tests.auto.osago.positive;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.MAIN_PAGE_URL;

public class OsagoPageCheckRedirectToAuthPositiveTest extends BaseTest {

    @Test
    @Story("checkIsRedirectToAuth")
    @Description("checkIsRedirectToAuth")
    public void checkIsRedirectToAuth() {
        basePage.goToUrl(MAIN_PAGE_URL);
        basePage.isConfidentialityAlertPresent();
        basePage.selectCloseConfidentialityAlert();
        basePage.selectLinkToOsagoPage();
        osagoPage.selectCalculateAndBuyPolicy();
        basePage.isAuthWidgetPresent();
    }
}
