
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gonzalo
 */
public class Taller01Sismos {
    
    
    
    
    
    
    

    public static void main(String[] args) {
        double[] sismos = new double[70];
        
        int rep=0;
        
        
        do {
            switch (selecionOpciones()) {
            case 1:
                generarSismos(sismos);
                
                break;
            case 2:
                mayorSismo(sismos);
                break;
            case 3:
                mayoresSismos(sismos);
                break;
            case 4:
                envioSMS(sismos);
                break;
            case 5:
                rep=1;
                break;
            default:
                System.out.println("ingrese una opcion valida");
        }
            
        } while (rep==0);
     
        

        
        
        
        

    }

    public static void generarSismos(double[] sismos) {
        double num;
        DecimalFormat formato= new DecimalFormat("#.00");
        for (int j = 0; j < sismos.length; j++) {
            num= (Math.random()*10);
            formato.format(num);
            sismos[j]=num ;
            
            
          

        }
        
    }
    
        public static void mostrarSismos(double[] sismos) {
        for (int j = 0; j < sismos.length; j++) {
            System.out.println(sismos[j]);
          

        }
    }

    public static void mayoresSismos(double[] sismos) {
        int sismosM=0;
        for (int j = 0; j < sismos.length; j++) {
            if (sismos[j] >= 5) {
                sismosM +=1;

            }

        }
        System.out.println("han habido "+sismosM+ " sismos mayores a 5");
    }
    
    
    
    
  public static void mayorSismo(double[] sismos) {
      DecimalFormat formato= new DecimalFormat("#.00");
        double mayor = sismos[0];
        for (int x = 1; x < sismos.length; x++) {
			if (sismos[x] > mayor) {
				mayor = sismos[x];
                                
			}
		}
       
        System.out.println("El mayor es "+formato.format(mayor));
    }
      public static void envioSMS(double[] sismos) {
        int sismosM=0;
        for (int j = 0; j < sismos.length; j++) {
            if (sismos[j] >= 7) {
                System.out.println("Alerta!!! se debe evacuar zona costera");
                sismosM +=1;

            }

        }
          System.out.println("Se han enviado "+sismosM+" mensajes" );
    }
    
    
    
    
    
    

    public static int selecionOpciones() {
        int cantOP = 5;
        int opcion=0;
        do {
            Scanner teclado = new Scanner(System.in);
            try {
                System.out.println(".........{Ingrese su opcion}........");
                System.out.println("[1] Ingresar Datos");
                System.out.println("[2] Mostrar sismo de mayor magnitud");
                System.out.println("[3] Contar sismos mayores o iguales a 5");
                System.out.println("[4] Enviar SMS");
                System.out.println("[5] SALIR");

                opcion = teclado.nextInt();
                if (opcion <= 0 || opcion >= cantOP + 1) {
                    System.out.println("No existe esa opcion");
                    System.out.println("Selecione una correcta");
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("No es una exprecion numerica");
                System.out.println("Por favor intentelo denuevo");
                teclado.next();

            }

        } while (opcion <= 0 || opcion >= cantOP + 1);

        return opcion;

    }

}
