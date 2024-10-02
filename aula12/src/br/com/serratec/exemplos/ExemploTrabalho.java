package br.com.serratec.exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class ExemploTrabalho {

	public static void main(String[] args) {
		
		try {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite o nome do arquivo: ");
			String nomeArquivo = ler.next();
			
			Scanner sc = new Scanner(new File(nomeArquivo));
			List<Empregado> empregados = new ArrayList<>();
			while (sc.hasNext()) {

				String linha = sc.nextLine();
				//System.out.println(linha);
				
				if (!linha.isEmpty()) {
					
					String[] dadosDaLinha = linha.split(";");
					String nome = dadosDaLinha[0];
					String profissao = dadosDaLinha[1];
					empregados.add(new Empregado(nome, profissao));
					
				}
			}
			sc.close();
			
		
			BufferedWriter bw = new BufferedWriter(new FileWriter("/home/user/curso/empregados_saida.csv"));
			for (Empregado empregado : empregados) {
				bw.append(empregado.getNome() + ";" + empregado.getProfissao() + "\n");
				
			}
			bw.close();
			System.out.println("Arquivo Gravado!!");
			
		} catch (Exception e) {
			
			System.err.println("Erro: ");
		}
		
		

	}

}
