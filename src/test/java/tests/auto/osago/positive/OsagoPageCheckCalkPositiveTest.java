package tests.auto.osago.positive;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import tests.base.BaseTest;

import static constants.Constant.OsagoPrecalc.*;
import static constants.Constant.Urls.MAIN_PAGE_URL;

public class OsagoPageCheckCalkPositiveTest extends BaseTest {

    @Test
    @Story("checkCalulation")
    @Description("checkCalulation")
    public void checkCalulation() {
        basePage.goToUrl(MAIN_PAGE_URL);
        basePage.isConfidentialityAlertPresent();
        basePage.selectCloseConfidentialityAlert();
        basePage.selectLinkToOsagoPage();
        osagoPage.isCalcFormPresent();
        osagoPage.enterCity(CITY);
        osagoPage.waitForListLoad();
        osagoPage.selectOptionIndex(2);
        osagoPage.enterBirthDate(OWNER_BIRTHDATE);
        osagoPage.enterMark(CAR_MARK);
        osagoPage.enterCarIssueYear(CAR_ISSUE_YEAR);
        osagoPage.selectCarPowerCombobox();
        osagoPage.selectOptionIndex(3);
        osagoPage.enterDriverYearsOld(DRIVER_YEARS_OLD);
        osagoPage.enterDriverDriveExp(DRIVER_DRIVE_EXP);
        osagoPage.selectDriverNoDtpCombobox();
        osagoPage.selectOptionIndex(6);
        osagoPage.selectCalculateButton();
        osagoPage.isResultBlockPresent();
        osagoPage.isAuthInResultBlockPresent();
        osagoPage.calcResultTitleAreExpected(RESULT_TITLE);
        osagoPage.calcResultDescrAreExpected(RESULT_DESCR);
    }

    @Test
    @Story("checkCalulationWithUnlimitedDrivers")
    @Description("checkCalulationWithUnlimitedDrivers")
    public void checkCalulationWithUnlimitedDrivers() {
        basePage.goToUrl(MAIN_PAGE_URL);
        basePage.isConfidentialityAlertPresent();
        basePage.selectCloseConfidentialityAlert();
        basePage.selectLinkToOsagoPage();
        osagoPage.isCalcFormPresent();
        osagoPage.enterCity(CITY);
        osagoPage.waitForListLoad();
        osagoPage.selectOptionIndex(2);
        osagoPage.enterBirthDate(OWNER_BIRTHDATE);
        osagoPage.enterMark(CAR_MARK);
        osagoPage.enterCarIssueYear(CAR_ISSUE_YEAR);
        osagoPage.selectCarPowerCombobox();
        osagoPage.selectOptionIndex(3);
        osagoPage.setStateUnlimitedDriversCheckbox(true);
        osagoPage.selectCalculateButton();
        osagoPage.isResultBlockPresent();
        osagoPage.isAuthInResultBlockPresent();
        osagoPage.calcResultTitleAreExpected(RESULT_TITLE);
        osagoPage.calcResultDescrAreExpected(RESULT_DESCR);
    }

    @Test
    @Story("checkCalulationAnyMoreDrivers")
    @Description("checkCalulationAnyMoreDrivers")
    public void checkCalulationAnyMoreDrivers() {
        basePage.goToUrl(MAIN_PAGE_URL);
        basePage.isConfidentialityAlertPresent();
        basePage.selectCloseConfidentialityAlert();
        basePage.selectLinkToOsagoPage();
        osagoPage.isCalcFormPresent();
        osagoPage.enterCity(CITY);
        osagoPage.waitForListLoad();
        osagoPage.selectOptionIndex(2);
        osagoPage.enterBirthDate(OWNER_BIRTHDATE);
        osagoPage.enterMark(CAR_MARK);
        osagoPage.enterCarIssueYear(CAR_ISSUE_YEAR);
        osagoPage.selectCarPowerCombobox();
        osagoPage.selectOptionIndex(3);
        osagoPage.setStateUnlimitedDriversCheckbox(false);
        osagoPage.enterDriverYearsOld(DRIVER_YEARS_OLD);
        osagoPage.enterDriverDriveExp(DRIVER_DRIVE_EXP);
        osagoPage.selectDriverNoDtpCombobox();
        osagoPage.selectOptionIndex(6);
        osagoPage.selectDriversAddButton();
        osagoPage.enterDriverYearsOld(ANY_DRIVER_YEARS_OLD);
        osagoPage.enterDriverDriveExp(ANY_DRIVER_DRIVE_EXP);
        osagoPage.selectDriverNoDtpCombobox();
        osagoPage.selectOptionIndex(7);
        osagoPage.selectCalculateButton();
        osagoPage.isResultBlockPresent();
        osagoPage.isAuthInResultBlockPresent();
        osagoPage.calcResultTitleAreExpected(RESULT_TITLE);
        osagoPage.calcResultDescrAreExpected(RESULT_DESCR);
    }
}
