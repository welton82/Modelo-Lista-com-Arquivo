package Program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Product p = new Product();
		Scanner scan= new Scanner(System.in);
		try {
			operacao(scan);	
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	public static int menu(Scanner scan) {
		System.out.println("========== LISTA DE MENU ==============="); 
		System.out.println("1 - Inserir");
		System.out.println("2 - Listar");
		System.out.println("3 - Gerar Arquivo .txt");
		System.out.println("4 - Ler Arquivo Criado");
		System.out.print("Operação: ");
		int menu = scan.nextInt();
		scan.nextLine();
		return menu;
	}
	public static void operacao(Scanner scan) throws IOException {
		
		Product  product = new Product();
		
		
		int op = 0;
		while(op != 5) {
			
			op = menu(scan);
			
			switch(op) {
			
				case 1:
					//sempre gerar um objeto novo
					Product p = new Product();
					System.out.print("Nome: ");
					p.setName(scan.nextLine());
					
					System.out.print("Preço: ");
					p.setPrice(scan.nextDouble());
					product.setProduct(p);
					
					break;
				case 2:
					product.getList();
					//System.out.println(product.toString());
					break;
				case 3:
					System.out.print("Informe Um caminho: ");
					
					String path = scan.nextLine();
					String[]lines = {product.toString()};
					
					//coloca o caminho no File
					
					try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
						
					
						
						for(String l: lines) {
							bw.write(l);
							bw.newLine();
														
						}
						System.out.println("Sucess!!!");
					}
					break;
					
				case 4:
					FileReader fR = null;
					BufferedReader bR = null;
					System.out.print("Informe O arquivo para leitura: ");
					path = scan.next();
					
					fR = new FileReader(path);
					bR = new BufferedReader(fR);
					
					String line = bR.readLine();
					while(line != null) {
						System.out.println(line);
						line = bR.readLine();
					}
					System.out.println();
					break;
				case 5:
					System.out.println("Sair....");
					default :
						System.out.println("Operação incorreta");
						break;
			}
			
		}
	}
	
	

}












