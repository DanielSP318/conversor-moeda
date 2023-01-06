package br.com.one.conversorMoedas;

import javax.swing.JOptionPane;

public class ConverteMoedasParaReais {

	public void converterDolaresParaReais(double valorRecebido) {
		double moedaDolar = valorRecebido * 5.35;
		moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem R$ " + moedaDolar + " Reais");
	}

	public void converterEurosParaReais(double valorRecebido) {
		double moedaEuro = valorRecebido * 6.63;
		moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem R$ " + moedaEuro + " Reais");
	}

	public void converterLibrasParaReais(double valorRecebido) {
		double moedaLibra = valorRecebido * 6.38;
		moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem R$ " + moedaLibra + " Reais");
	}

	public void converterPesosArgentinosParaReais(double valorRecebido) {
		double moedaPesoArgentino = valorRecebido * 0.030;
		moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem R$" + moedaPesoArgentino + " Reais");
	}

	public void converterPesosChilenosParaReais(double valorRecebido) {
		double moedaPesoChileno = valorRecebido * 0.0063;
		moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem R$" + moedaPesoChileno + " Reais");
	}

}
