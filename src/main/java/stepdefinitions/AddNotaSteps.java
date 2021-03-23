package stepdefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageobjects.AddNotaPage;
import utils.Utils;

public class AddNotaSteps extends Utils {

	AddNotaPage a = new AddNotaPage(driver);

	@Dado("que o usuario clique no botao de adicionar")
	public void queOUsuarioCliqueNoBotaoDeAdicionar() throws InterruptedException {

		a.clicarBtnAddNota();

	}

	@Quando("preencher o campo titulo com {string}")
	public void preencherOCampoTituloCom(String arg1) throws InterruptedException {

		a.escreverTitulo(arg1);
	}

	@Quando("preencher o campo {string}")
	public void preencherOCampo(String arg1) {
		a.escreverNota(arg1);
	}

	@Quando("clicar no botao de opcoes")
	public void clicarNoBotaoDeOpcoes() {
		a.clicarOpcoes();
	}

	@Quando("escolher a cor da nota")
	public void escolherACorDaNota() {
		a.clicarCor();

	}

	// VALIDACAO NOTA SIMPLES
	@Entao("o app salvara a nota automaticamente e a exibira na tela inicial")
	public void oAppSalvaraANotaAutomaticamenteEAExibiraNaTelaInicial() {
		a.verificarNota();
	}

	// VALIDACAO NOTA COLORIDA
	@Entao("o app salvara a nota automaticamente e a exibira anota colorida na tela inicial")
	public void oAppSalvaraANotaAutomaticamenteEAExibiraAnotaColoridaNaTelaInicial() {
		a.verificarNotaColorida();
	}

	@Quando("clicar no botao de Alarme")
	public void clicarNoBotaoDeAlarme() {
		a.clicarAlarme();
	}

	@Quando("escolher o primeiro alarme")
	public void escolherOPrimeiroAlarme() {
		a.selecionarAlarme();
	}

	// VALIDACAO NOTA COM ALARME
	@Entao("o app salvara a nota automaticamente e a com o lembrete Do Alarme selecionado")
	public void oAppSalvaraANotaAutomaticamenteEAComOLembreteDoAlarmeSelecionado() {
		a.validarNotaAlarme();
	}

}
