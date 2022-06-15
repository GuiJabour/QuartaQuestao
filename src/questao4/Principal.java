package questao4;

import java.util.ArrayList;
import java.util.List;

/*4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

SP – R$67.836,43
RJ – R$36.678,66
MG – R$29.229,88
ES – R$27.165,48
Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.*/

//GUILHERME HENRIQUE CHAVES JABOUR
public class Principal {

	public static void main(String[] args) {
		
		double total = 0;
		
		/*Aqui, crio uma lista de faturamentos e defino os valores por estado*/
		List<Faturamento> faturamentos = new ArrayList<>();
		
		Faturamento faturamentoSP = new Faturamento();
		faturamentoSP.setEstado("SP");
		faturamentoSP.setValor(76836.43);
		faturamentos.add(faturamentoSP);
		
		Faturamento faturamentoRJ = new Faturamento();
		faturamentoRJ.setEstado("RJ");
		faturamentoRJ.setValor(36678.66);
		faturamentos.add(faturamentoRJ);
		
		Faturamento faturamentoMG = new Faturamento();
		faturamentoMG.setEstado("MG");
		faturamentoMG.setValor(29229.88);
		faturamentos.add(faturamentoMG);
		
		Faturamento faturamentoES = new Faturamento();
		faturamentoES.setEstado("ES");
		faturamentoES.setValor(27165.48);
		faturamentos.add(faturamentoES);
		
		Faturamento faturamentoOutros = new Faturamento();
		faturamentoOutros.setEstado("Outros");
		faturamentoOutros.setValor(19849.53);
		faturamentos.add(faturamentoOutros);
		
		for (Faturamento faturamento : faturamentos) {
			total += faturamento.getValor();
		}
		System.out.println("Total: " + total);
		for (Faturamento faturamento : faturamentos) {
			faturamento.setPercentual(((100 * faturamento.getValor())/total));
			System.out.println("O valor de porcentagem referente ao estado " + faturamento.getEstado() + " é " + faturamento.getPercentual());
		}
		
		
	}
}
