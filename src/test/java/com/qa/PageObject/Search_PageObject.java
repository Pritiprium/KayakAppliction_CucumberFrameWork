package com.qa.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Browser_Utility;

public class Search_PageObject {
	
	public Search_PageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH,using = "//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/*[local-name()='svg'][1]/*[name()='use'][1]")
	WebElement crossbtn;
	
	@FindBy(how = How.XPATH, using = "//input[@type='text'][@aria-label='Flight origin input'][@smarty='true'][@name='origin'][@style='opacity: 1;'][@placeholder='From?']")
	WebElement originCity;
	
	@FindBy(how = How.XPATH, using ="//div[contains(text(),\"O'Hare Intl\")]")
	WebElement originAirport;	////div[contains(text(),\"O'Hare Intl\")]
	
	@FindBy(how = How.XPATH, using ="//div[@data-placeholder='To?'and@aria-label='Flight destination input']")
	WebElement to;
	
	@FindBy(how = How.XPATH, using ="//input[@name='destination'][@placeholder='To?']")
	WebElement destinCity;
	
	@FindBy(how = How.XPATH, using ="//div[contains(text(),'Denver Intl')]")
	WebElement destinAirport;	////div[contains(text(),'Denver Intl')]
	
	@FindBy(how = How.CSS, using ="body.keel.kl.kl-override.FlightsSearch.en_US.horizon:nth-child(2) div.Common-Page-StandardPage.Base-Search-LandingPage.Base-Search-SearchPage.Flights-Search-FlightSearchPage.cur_usd.a11y-focus-outlines.vm-fd:nth-child(1) div.Common-Layout-StandardBody.withFooter main.pageContent:nth-child(6) div.SearchPage__FrontDoor div.Base-Frontdoor-FrontDoor.Flights-Frontdoor-FlightFrontDoor div.Common-Frontdoor-HarmonizedFrontDoorContent div.coverPhotoContainer.splash div._jcP._jcQ._ia2 div.primary-content section.form-section.noBg div.keel-container.form-container.s-t-bp.no-edges.edges-s div.Base-Search-SearchForm.Flights-Search-StyleJamFlightSearchForm.size-xs.size-s.size-m.size-l._iMI._mpe div.js-searchForm:nth-child(2) form.js-rtow.searchform._ijX._iAB.roundtrip div.search-form-inner div.keel-grid._iCe._kP2._iaU._kP3._iAO._iaO._iaP._iaA._iyF._iAN._kP4._j2g div.col._iac._iad._iae._i0p._iaa._i0q._iab._iys._iyv._i5L._iyq._iAV._iA1._h-8._ij0:nth-child(1) div.keel-grid._icA._ica._icB._icb._icC._iyY._icc._iaA._icD._ib9._iy1._iAO._iaO._iaP._iyF._iAN div.col._icy._iaS._iaU._iaV._iaW._iaX._icu._icv._icw._icx._ia0._ics._ict._ize._is9._iaR._iac._iad._iae._iaa._iab._iys._iyv._iyq._iAU._iAV._izh._h-8:nth-child(4) div.Common-Widgets-Datepicker-DateModal._ibU._ibV._iaf._idE._h-Y._im4._iai._ihz._j0g._jy1._iDB div._iaf._iEc._ia1._i7r._iv1._j0z._iPK._j0x._j0B._iai:nth-child(1) > div._iaf._iEU._iam._iai:nth-child(1)")
	WebElement calendar;
	
	@FindBy(how = How.XPATH, using ="//div[@aria-label=\"July 29\"]")
	WebElement departDate;		////div[@aria-label=\"July 29\"]
	
	@FindBy(how = How.XPATH, using ="//div[@aria-label=\"August 9\"]")
	WebElement returnDate;
	
	@FindBy(how = How.XPATH, using ="//div[@class='search-form-inner']//button[@type='submit'][@title='Search flights'][@tabindex='0']")
	WebElement searchBtn;
	
	
	public void closeBtn() {
		Browser_Utility.waitforVisiblity(crossbtn);
		crossbtn.click();
	}
	public void selectAirport() throws Exception {
		Browser_Utility.waitforVisiblity(originCity);
		originCity.sendKeys("Chi");
		Thread.sleep(2000);
		originAirport.click();
		Thread.sleep(2000);
	}
	
	public void toBtn() {
		Browser_Utility.waitforVisiblity(to);
		to.click();
		
	}
	public void destin_City() throws Exception {
		Browser_Utility.waitforVisiblity(destinCity);
		destinCity.sendKeys("Den");
		Thread.sleep(2000);
		destinAirport.click();
	}
	
	public void calendar() throws Exception {
		Browser_Utility.waitforVisiblity(calendar);
		calendar.click();
		Thread.sleep(2000);
	}
	
	public void departDate() {
		Browser_Utility.waitforVisiblity(departDate);
		departDate.click();
	}
	
	public void Return_date() throws Exception {
		Browser_Utility.waitforVisiblity(returnDate);
		returnDate.click();
		Thread.sleep(2000);
	}
	
	public void searchBtn() {
		Browser_Utility.waitforVisiblity(searchBtn);
		searchBtn.click();
	}

}
