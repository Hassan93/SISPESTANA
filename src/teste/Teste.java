package teste;
import java.util.Scanner;

import mz.PestanaRovuma.Hotel_and_Resorts.Dao.PaisDao;
import mz.PestanaRovuma.Hotel_and_Resorts.model.Pais;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op =0;
		do{
			System.out.println("op=");
		op = sc.nextInt();	
		switch(op){
		case 1:Pais pa =new Pais();
		PaisDao pd = new PaisDao();
		//pa.setId(0);
        pa.setPrefixo(1);
       pa.setNome("Estados Unidos");
		
		
		pd.create(pa);
		System.out.println("Teste");
		break;
		}	
		}while(op!=2);

	}

}
