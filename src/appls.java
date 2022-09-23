import java.util.Scanner;
import java.util.Scanner;


public class appls {

    public static void main(String[] args) throws Exception {
        
         // for (int i = 0; i <= 10; i++){
           // for (int j = 0; j<=10; j++){
             //   System.out.println("e isso aqui "+i + " vezes isso aqui " + j + " que da = " + i*j );
            //}
          //}
          saudacao();
        





 
        

       
         
        //for (int i=0; i <numeros.length; i++){
            
        }

      public static void saudacao(){          
  int number;
  int nota = 0;
  float media = 0;
  int j = 0;
  
     
     Scanner obj=new Scanner(System.in); 

     System.out.print("Total de notas: ");    
     number=obj.nextInt();   

     int[] array = new int[number];
     
     System.out.println("entra com as suas notas: ");  
     
     
     for(int i=0; i<number; i++)  
     {     
    
     array[i]=obj.nextInt(); //lendo os elementos dos usuarios
     } 

     System.out.println("as suas notas são:  "); 

     while(j<number)  
     {  
     System.out.println( "São "+ array[j]);  
     nota += array[j];
     j++;
     
     }
     
     System.out.println("sua nota e "+ nota +" tamanho e " + array.length );

     media = nota/array.length;
     System.out.println("a media e " + media);
      }



}


