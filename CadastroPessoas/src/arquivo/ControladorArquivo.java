package arquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ControladorArquivo {
	
	public static File criarArquivo(String doc){		
		File arq = new File(doc);
		try {	
			arq.createNewFile();
					
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arq;	
	}	
	public static void escreverArquivo(File arq) { 
		
		Scanner entrada = new Scanner(System.in);
    	System.out.println("Digite um nome:");
    	String nome = entrada.nextLine();
    	System.out.println("Digite a idade:");
    	int idade = entrada.nextInt();
    	System.out.println("Digite a altura:");
    	float altura = entrada.nextFloat();
    	
        try {
        	FileWriter escrita = new FileWriter(arq.getName(),true);      	
        		escrita.write("Nome: " + nome + ";"+ "idade:" + idade + ";" + "Altura: " + altura + ";");
            	escrita.close();
        		
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}	
	public static void  lerArquivo(File arq){	
		try {
			Scanner leitura = new Scanner(arq);
			while (leitura.hasNextLine()) {
	            String linhaAtual = leitura.nextLine();
	            String [] la = linhaAtual.split(";");
	            	System.out.println(linhaAtual);
			}    
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
	}
	
}
	
