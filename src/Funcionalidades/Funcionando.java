package Funcionalidades;

import Cliente.Cliente;

import java.util.Scanner;

public class Funcionando {
    boolean val = false;
    int cont1 = 0;
    int cont = 0;

    Scanner scan = new Scanner(System.in);
    Cliente cliente1 =new Cliente("Gustavo Henerique", 20, "Marisa de Souza", 500, 1300);

    public void PainelOP3(){

    }
    public void rodando(){
        do {
        PainelInicial();
        cont = scan.nextInt();
        scan.nextLine();
        switch (cont){
            case 1:
                VerInformacoesOP1();
                System.out.print("\n"+"- Digite uma tecla para retornar ao menu: ");                scan.nextLine();
                break;



            case 2:
                PainelOP2();
                cont1 = scan.nextInt();
                scan.nextLine();
                switch (cont1){
                    case 1:
                        AlterandoInfoNOME();
                        System.out.print("\n"+"- Digite uma tecla para retornar ao menu: ");                        scan.nextLine();
                        break;
                    case 2:
                        AlterandoInfoIDADE();
                        System.out.print("\n"+"- Digite uma tecla para retornar ao menu: ");                        scan.nextLine();
                        break;

                    case 3:
                        AlterandoInfoNOMEDAMAE();
                        System.out.print("\n"+"- Digite uma tecla para retornar ao menu: ");
                        scan.nextLine();
                        break;
                    case 4:
                        break;
                }
      //      case 3:
            break;
            case 4:
              val=true;

        }


        } while(!val);
    }
    public void PainelInicial(){

         System.out.println("========== Painel inicial =========="+"\n"+
                 "Escolha uma opção: " +"\n"+
                 "1. Ver informações"+"\n"+
                 "2. Alterar informações"+"\n"+
                 "3. Serviços" + "\n" +
                 "4. Sair");



    }
    public void VerInformacoesOP1(){
        System.out.println(cliente1);
    }
    public void PainelOP2(){
        System.out.println("========== Alterar informações =========="+"\n"+
                "Escolha uma opção: " +"\n"+
                "1. Alterar nome"+"\n"+
                "2. Alterar idade"+"\n"+
                "3. Alterar nome da mãe" + "\n" +
                "4. Retornar");

    }

    public void AlterandoInfoNOME(){
        System.out.println("========== Alterando NOME! ==========");
        System.out.print("Digite o novo nome: ");
        cliente1.setNome(scan.nextLine());
        System.out.println("\n"+"\n");
        System.out.println("Nome alterado para " + cliente1.getNome() + "!");


    }

    public void AlterandoInfoIDADE(){
        System.out.println("========== Alterando IDADE! ==========");
        System.out.print("Digite a nova idade: ");
        cliente1.setIdade(scan.nextInt());
        scan.nextLine();
        System.out.println("\n"+"\n");
        System.out.println("Idade alterada para " + cliente1.getIdade() + "!");
    }

    public void AlterandoInfoNOMEDAMAE(){
        System.out.println("========== Alterando NOME DA MÃE! ==========");
        System.out.print("Digite o nome da mãe: ");
        cliente1.setNomeDaMae(scan.nextLine());
        System.out.println("\n"+"\n");
        System.out.println("Nome alterado para " + cliente1.getNomeDaMae() + "!");

    }
}
