import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.util.Locale;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws Exception {
         
    Scanner scan=new Scanner(System.in);
    principal();

int refazer;

  System.out.println("Deseja refazer alguma operação? 1 para sim 0 para nao");
  refazer = scan.nextInt(); 

  while(refazer ==1){ // entra num loop ate a pessoa não querer mais utilizar o sistema
    if (refazer ==1){
        principal();
      }  
  System.out.println("Deseja refazer alguma operação? 1 para sim 0 para nao");
  refazer = scan.nextInt();
  }
  System.out.println("Obrigado por utilizar o sistema");

}
        
    public static void principal() { //função que da opção para ir para boletim ou formatura

      
      
  Scanner scan=new Scanner(System.in);
  int opcao;
  
  System.out.println("Bem vindo ao Santo inacio o que deseja? ");
  System.out.println("aperte 1 para ir para o boletim online");
  System.out.println("Aperte 2 para ir para Formatura e saber onde sera");
  opcao = scan.nextInt();

  if (opcao ==1){
    boletim();
  }else if(opcao ==2){
    formatura();
  }else{
    System.out.println("Opção invalida favor informa somente opções validas.");
  }

     
}
    public static void boletim(){ // função do boletim dando media e etc

 

    Scanner scan = new Scanner(System.in);

    int number;
    String nome;
    int media= 0;

    
    

    System.out.println("Seu nome? ");
    nome=scan.nextLine();
      System.out.print("Total de notas: ");    
      number=scan.nextInt();
      
     
      int[] nota = new int [number];
      

   for(int i =0; i <number; i++){
    System.out.print("qual a sua: "); 
    nota[i] = scan.nextInt();
    media = media + nota[i];
   }
  
   media = media/number;
   System.out.println("sua media é: " +media);
 
if (media >= 7) {
            System.out.println("Você esta aprovado " +nome.toUpperCase());
        }else if  (media >= 6){
            System.out.println("Você esta de recuperação "+nome.toUpperCase());

        }else{
            System.out.println("Voce esta reprovado "+nome.toUpperCase());
        }
  

        Locale brasil = new Locale("pt","BR");
        
        LocalDate hoje = LocalDate.now();

        LocalDateTime agora = LocalDateTime.now();

        System.out.println("Bem vindo " +nome + " hoje é "+ hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));  
        
    }
    public static void formatura(){ // função da formatura informando horario e local
    Scanner scan = new Scanner(System.in);

        int Ano;
        String turno;
        int lek;
        System.out.println("turno manha = 0; tarde =1; noite = 2;");
        System.out.println("Qual seu turno");
        lek = scan.nextInt();

        System.out.println("Qual Seu ano de Nascimento? ");
        Ano = scan.nextInt();
        System.out.println("Carregando sistema ");
       

    if(Ano == 2004 && lek == 0){
        System.out.println("Sua formatura e do terceiro ano  e sendo da manha, ela sera de 10hrs as 21hrs no clube flamengo");
        
     }
    else if(Ano == 2004 &&  lek == 1){
        System.out.println("Sua formatura e do terceiro ano da tarde, ela sera de 13hrs ás 23hrs no clube fluminense");
     }
    else if(Ano == 2004 && lek == 2){
        System.out.println("Sua formatura e do terceiro ano da Noite, ela sera de 13hrs ás 23hrs no clube fluminense");
     }
      else if(Ano == 2001 && lek == 0){
        System.out.println("Sua formatura e do nono ano da manha, ela sera de 10hrs ás 21hrs no clube flamengo");
     }
     else if(Ano == 2001 && lek == 1){
        System.out.println("Sua formatura e do nono ano da manha, ela sera de 13hrs ás 23hrs no clube fluminense");
     }
     else if(Ano == 2001 && lek == 2){
        System.out.println("Sua formatura e do nono ano da manha, ela sera de 15hrs ás 23hrs no clube flamengo");
     }
     else{
        System.out.println("Infelizmente não encontramos formaturas para data ou turno respondido favor tentar novamente");
     }
   

    

    }

  
}
