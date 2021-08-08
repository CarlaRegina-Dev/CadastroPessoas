package arquivo;

import java.util.Scanner;

public class ArquivoMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		ControladorArquivo.criarArquivo("pessoa.txt");
		String opcao ="X";
		while(!opcao.equals("3")){
            System.out.println("O que deseja fazer ?" + "\n" 
                    + "1) Listar pessoas" + "\n"
                    + "2) Cadastrar pessoa" + "\n"
                    + "3) sair");
            opcao = entrada.next();
                if(opcao.equals("1")){
                    ControladorArquivo.lerArquivo(ControladorArquivo.criarArquivo("pessoa.txt"));
                }else if(opcao.equals("2")){
                	ControladorArquivo.escreverArquivo(ControladorArquivo.criarArquivo("pessoa.txt"));           	
                }else if(opcao.equals("3")) {
                	System.out.println("Fim do Programa!");
                }
		}
	}
}
