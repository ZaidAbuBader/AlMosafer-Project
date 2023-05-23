import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class Parameters222 {

	WebDriver driver = new ChromeDriver();
	String TheWebsite = "https://www.almosafer.com/en";
	Assertion MyAssert = new Assertion();

	String Expected_Arabic_lang = "العربية";
	String ExpectedCurrency = "SAR";
	String ExpectedTitle = "Almosafer: Flights, Hotels, Activities & Airlines Ticket Booking";

	String ExpectedContact = "+966554400000";

}
