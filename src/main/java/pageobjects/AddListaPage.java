package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddListaPage {
	public AddListaPage(AppiumDriver<WebElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(id = "com.google.android.keep:id/new_list_button")
	private MobileElement btnAddLista;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[3]/"
			+ "android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/"
			+ "android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.EditText")
	private MobileElement campo1;

	@AndroidFindBy(id = "com.google.android.keep:id/add_item_text_view")
	private MobileElement btnAddItem;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/"
			+ "android.widget.RelativeLayout/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.view.ViewGroup/"
			+ "android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.EditText")
	private MobileElement campo2;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/"
			+ "android.widget.RelativeLayout/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.view.ViewGroup/"
			+ "android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.EditText")
	private MobileElement campo3;

	@AndroidFindBy(id = "com.google.android.keep:id/editable_title")
	private MobileElement tituloLista;

	@AndroidFindBy(accessibility = "Open navigation drawer")
	private MobileElement voltarInicio;

	@AndroidFindBy(id = "com.google.android.keep:id/description")
	private MobileElement verificaLista;

	public void clicarAddLista() {
		btnAddLista.click();
	}

	public void preencherCampo1(String itema) {
		campo1.sendKeys(itema);
		btnAddItem.click();
	}

	public void preencherCampo2(String itemb) {
		campo2.sendKeys(itemb);
		btnAddItem.click();
	}

	public void preencherCampo3(String itemc) {
		campo3.sendKeys(itemc);
	}

	public void preenchertituloLista(String titulo) {
		tituloLista.sendKeys(titulo);
	}

	public void validarListaSalva() {
		voltarInicio.click();
		assertTrue(verificaLista.isEnabled());

	}

}
