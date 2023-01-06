package br.com.one.conversorMoedas;

import javax.swing.JOptionPane;

public class ConverteMoedas {

	public void converterReaisParaDolares(double valorRecebido) {
		double moedaDolar = valorRecebido / 5.35;
		moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " Dólares");
	}

	public void converterReaisParaEuros(double valorRecebido) {
		double moedaEuro = valorRecebido / 5.63;
		moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " Euros");
	}

	public void converterReaisParaLibras(double valorRecebido) {
		double moedaLibra = valorRecebido / 6.33;
		moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibra + "Libras");
	}

	public void converterReaisParaPesosArgentinos(double valorRecido) {
		double moedaPesoArgentino = valorRecido / 0.030;
		moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoArgentino + "Pesos Argentinos");
	}

	public void converterReaisParaPesosChilenos(double valorRecebido) {
		double moedaPesoChileno = valorRecebido / 0.0063;
		moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoChileno + "Pesos Chilenos");
	}
}
