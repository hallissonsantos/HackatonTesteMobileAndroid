package pageobjects;

import static org.junit.Assert.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddNotaPage {

	public AddNotaPage(AppiumDriver<WebElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(accessibility = "New text note")
	private MobileElement btnAddNota;

	@AndroidFindBy(id = "com.google.android.keep:id/editable_title")
	private MobileElement campoTitulo;

	@AndroidFindBy(id = "com.google.android.keep:id/edit_note_text")
	private MobileElement campoNota;

	@AndroidFindBy(accessibility = "Navigate up")
	private MobileElement btnVoltarMenu;

	@AndroidFindBy(xpath = "//androidx.cardview.widget.CardView[@content-desc=\"nota titulo. nota descricao. \"]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[1]")
	private MobileElement notaSalva;

	@AndroidFindBy(id = "com.google.android.keep:id/bs_action_button")
	private MobileElement btnOpcoes;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Color Orange\"]/android.widget.ImageView")
	private MobileElement cor;

	@AndroidFindBy(id = "com.google.android.keep:id/touch_outside")
	private MobileElement clicarFora;

	@AndroidFindBy(xpath = "//androidx.cardview.widget.CardView[@content-desc=\"nota colorida. Azul. \"]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[1]")
	private MobileElement notaSalvaColor;

	@AndroidFindBy(accessibility = "Reminder")
	private MobileElement btnAlarme;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]")
	private MobileElement selecaoAlarme;

	@AndroidFindBy(id = "com.google.android.keep:id/browse_reminder_chip")
	private MobileElement notaComAlarme;
	

	public void clicarBtnAddNota() throws InterruptedException {
		Thread.sleep(10000);
		btnAddNota.click();

	}

	public void escreverTitulo(String titulo) throws InterruptedException {
		Thread.sleep(2000);
		campoTitulo.sendKeys(titulo);
	}

	public void escreverNota(String nota) {
		campoNota.sendKeys(nota);
	}

	public void verificarNota() {
		btnVoltarMenu.click();
		String nota = notaSalva.getText();
		assertEquals("nota titulo", nota);
	}

	public void clicarOpcoes() {
		btnOpcoes.click();
	}

	public void clicarCor() {
		cor.click();
	}

	public void verificarNotaColorida() {
		clicarFora.click();
		//btnVoltarMenu.click();
		btnVoltarMenu.click();
		//String nota = notaSalvaColor.getText();
		//assertEquals("nota colorida", nota);
	}

	public void clicarAlarme() {
		btnAlarme.click();
	}

	public void selecionarAlarme() {
		selecaoAlarme.click();
		btnVoltarMenu.click();

	}

	public void validarNotaAlarme() {

		assertTrue(notaComAlarme.isEnabled());

	}
}
