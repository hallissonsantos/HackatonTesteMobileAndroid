package stepdefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageobjects.AddListaPage;
import utils.Utils;

public class AddListaSteps extends Utils {

	AddListaPage l = new AddListaPage(driver);

	@Dado("que o usuario clique no botao nova Lista")
	public void queOUsuarioCliqueNoBotaoNovaLista() {
		l.clicarAddLista();
	}

	@Quando("preencher o campo a com  {string}")
	public void preencherOCampoACom(String string) {
		l.preencherCampo1(string);
	}

	@Quando("preencher o campo b com  {string}")
	public void preencherOCampoBCom(String string) {
		l.preencherCampo2(string);
	}

	@Quando("preencher o campo c com  {string}")
	public void preencherOCampoCCom(String string) {
		l.preencherCampo3(string);
	}

	@Quando("preencher o campo Titulo da lista  {string}")
	public void preencherOCampoTituloDaLista(String string) {
		l.preenchertituloLista(string);
	}

	@Entao("o app salvara a lista automaticamente e a exibira na tela inicial")
	public void oAppSalvaraAListaAutomaticamenteEAExibiraNaTelaInicial() {
		l.validarListaSalva();
	}
}
