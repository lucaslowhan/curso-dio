/* <h1>SmartTV</h1>
* A SmartTV simula um SmartTV real, onde criamos um objeto chamado smartTV e podemos alterar
* canais, alterar volumes ligar e desligar.<p>
* Inicialmente tem um loop onde pergunta se o usuario deseja ligar ou não a TV.
* Caso ele escolha ligar a TV irá para um novo loop de comandos onde ele pode alterar canais,volume e também desligar a TV.
* Caso ele escolha uma opção incorreta, irá retornar o loop e pedir para ele escolher a opção correta.
*
* @author Lucas Lowhan
*/

package edu.lucaslowhan.metodos;
import java.util.Scanner;

public class Usuario {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        SmartTV smartTV = new SmartTV();
        int ligar = 0,opcao,canal;
        while (ligar != 1 && ligar !=2) {
            System.out.println("Deseja ligar a tv? \n 1-Ligar \n 2-Não");
            ligar = s.nextInt();
            if (ligar == 1) {
                smartTV.ligar();
            } else if (ligar == 2) {
                System.out.println("Tv desligada!");
            } else {
                System.out.println("Opção incorreta!");
            }
        }

        while (smartTV.ligada == true){
            System.out.println("Escolha uma das opções: \n \n 1-Aumentar canal \n 2-Diminuir canal \n 3-Mudar canal");
            System.out.println(" 4-Aumentar volume \n 5-Diminuir volume \n 0-Desligar");
                opcao = s.nextInt();
                    if (opcao == 1){
                        smartTV.aumentarCanal();
                    }
                    else if (opcao == 2){
                        smartTV.diminuirCanal();
                    }
                    else if (opcao == 3){
                        System.out.println("Digite o canal desejado:");
                            canal = s.nextInt();
                        smartTV.mudarCanal(canal);
                    }
                    else if (opcao == 4){
                        smartTV.aumentarVolume();
                    }
                    else if (opcao == 5){
                        smartTV.diminuirVolume();
                    }
                    else if (opcao == 0){
                        smartTV.desligar();
                    }
                    else{
                        System.out.println("Opção invalida, digite novamente");
                    }
        }
    }

}
