package com.TestScript;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Utility.Browser_Utility;
import com.Utility.TestBase;
import com.itextpdf.text.log.SysoCounter;

public class TrialForXpat extends TestBase {

	public static String getCurrentDay() {
		// Create a Calendar Object
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());

		// Get Current Day as a number
		int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("Today Int: " + todayInt + "\n");

		// Integer to String Conversion
		String todayStr = Integer.toString(todayInt);
		System.out.println("Today Str: " + todayStr + "\n");

		return todayStr;
	}

	public static void main(String[] args) throws Exception {

		Browser_Utility.launchbrwsr();
		JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;

//		WebElement flight = driver
//				.findElement(By.xpath("//li[@class='col js-vertical-flights _iMq _ia1 _iaL _irH _ics']"));
//		Browser_Utility.waitforVisiblity(flight);
//		flight.click();
//		Thread.sleep(2000);
		WebElement crossbtn = driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/*[local-name()='svg'][1]/*[name()='use'][1]"));
		Browser_Utility.waitforVisiblity(crossbtn);
		crossbtn.click();
//		WebElement from = driver
//				.findElement(By.xpath("//div[@aria-label='Flight origin input'][@data-placeholder='From?']"));
//
//		Browser_Utility.waitforVisiblity(from);
//		from.click();

		WebElement originCity = driver.findElement(By.xpath(
				"//input[@type='text'][@aria-label='Flight origin input'][@smarty='true'][@name='origin'][@style='opacity: 1;'][@placeholder='From?']"));
		Browser_Utility.waitforVisiblity(originCity);
		originCity.sendKeys("Chi");
		Thread.sleep(2000);
		WebElement oHare= driver.findElement(By.xpath("//div[contains(text(),\"O'Hare Intl\")]"));
		Browser_Utility.waitforVisiblity(oHare);
		oHare.click();
		Thread.sleep(2000);
		WebElement to = driver
				.findElement(By.xpath("//div[@data-placeholder='To?'and@aria-label='Flight destination input']"));
		Browser_Utility.waitforVisiblity(to);
		to.click();

		WebElement desti = driver.findElement(By.xpath("//input[@name='destination'][@placeholder='To?']"));
		Browser_Utility.waitforVisiblity(desti);
		desti.sendKeys("Den");
		Thread.sleep(2000);
		
		WebElement denver=driver.findElement(By.xpath("//div[contains(text(),'Denver Intl')]"));
		Browser_Utility.waitforVisiblity(denver);
		denver.click();
		Thread.sleep(2000);
		WebElement calendar = driver.findElement(By.cssSelector(
				"body.keel.kl.kl-override.FlightsSearch.en_US.horizon:nth-child(2) div.Common-Page-StandardPage.Base-Search-LandingPage.Base-Search-SearchPage.Flights-Search-FlightSearchPage.cur_usd.a11y-focus-outlines.vm-fd:nth-child(1) div.Common-Layout-StandardBody.withFooter main.pageContent:nth-child(6) div.SearchPage__FrontDoor div.Base-Frontdoor-FrontDoor.Flights-Frontdoor-FlightFrontDoor div.Common-Frontdoor-HarmonizedFrontDoorContent div.coverPhotoContainer.splash div._jcP._jcQ._ia2 div.primary-content section.form-section.noBg div.keel-container.form-container.s-t-bp.no-edges.edges-s div.Base-Search-SearchForm.Flights-Search-StyleJamFlightSearchForm.size-xs.size-s.size-m.size-l._iMI._mpe div.js-searchForm:nth-child(2) form.js-rtow.searchform._ijX._iAB.roundtrip div.search-form-inner div.keel-grid._iCe._kP2._iaU._kP3._iAO._iaO._iaP._iaA._iyF._iAN._kP4._j2g div.col._iac._iad._iae._i0p._iaa._i0q._iab._iys._iyv._i5L._iyq._iAV._iA1._h-8._ij0:nth-child(1) div.keel-grid._icA._ica._icB._icb._icC._iyY._icc._iaA._icD._ib9._iy1._iAO._iaO._iaP._iyF._iAN div.col._icy._iaS._iaU._iaV._iaW._iaX._icu._icv._icw._icx._ia0._ics._ict._ize._is9._iaR._iac._iad._iae._iaa._iab._iys._iyv._iyq._iAU._iAV._izh._h-8:nth-child(4) div.Common-Widgets-Datepicker-DateModal._ibU._ibV._iaf._idE._h-Y._im4._iai._ihz._j0g._jy1._iDB div._iaf._iEc._ia1._i7r._iv1._j0z._iPK._j0x._j0B._iai:nth-child(1) > div._iaf._iEU._iam._iai:nth-child(1)"));
		Browser_Utility.waitforVisiblity(calendar);
		// div[@id='tSDW-depart']//div[@aria-label='Calendar
		// icon']//*[local-name()='svg']
		js.executeScript("arguments[0].click();", calendar);
		Thread.sleep(2000);

//		WebElement tablebody = driver.findElement(By.xpath("html/body"));
//		Thread.sleep(3000);
//		List<WebElement> header = tablebody.findElements(By.tagName("th"));
//		List<WebElement> rows = tablebody.findElements(By.tagName("keel-grid _ib1"));
//		Thread.sleep(2000);
//		List<WebElement> columns = tablebody.findElements(By.tagName("gridcell"));
//		String today = getCurrentDay();
//		System.out.println("Today's number: " + today + "\n");
//		System.out.println(header.size());
//		System.out.println(rows.size());
//		System.out.println(columns.size());
//		for (WebElement cell : columns) {
//			System.out.println(cell.getText());
//			/*
//			 * //If you want to click 18th Date if (cell.getText().equals("18")) {
//			 */
//			// Select Today's Date
//			if (cell.getText().equals(today)) {
//				cell.click();
//				break;
//			}
//		}
//
//		// Wait for 4 Seconds to see Today's date selected.
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		WebElement july29 = driver.findElement(By.xpath("//div[@aria-label=\"July 29\"]"));
		Browser_Utility.waitforVisiblity(july29);
		js.executeScript("arguments[0].click();", july29);
		Thread.sleep(2000);
		
		WebElement aug9=driver.findElement(By.xpath("//div[@aria-label=\"August 9\"]"));
		Browser_Utility.waitforVisiblity(aug9);
		js.executeScript("arguments[0].click();", aug9);
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.xpath(
				"//div[@class='search-form-inner']//button[@type='submit'][@title='Search flights'][@tabindex='0']"));
		Browser_Utility.waitforVisiblity(search);
		search.click();
//		Alert alt = TestBase.driver.switchTo().alert();
//		alt.dismiss();

		Thread.sleep(8000);
		Browser_Utility.Tearoff();
//
	}

}
