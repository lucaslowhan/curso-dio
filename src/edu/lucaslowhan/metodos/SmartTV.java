package edu.lucaslowhan.metodos;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

        public void ligar(){
            ligada=true;
            System.out.println("A tv está ligada");
        }
        public void desligar(){
            ligada=false;
            System.out.println("A tv está desligada");
        }
        public void aumentarVolume(){
            volume++;
            System.out.println("Aumentando o volume para: " + volume);
        }
        public void diminuirVolume(){
            volume--;
            System.out.println("Diminuindo o volume para: " + volume);
        }
        public void aumentarCanal(){
            canal++;
            System.out.println("Voce mudou para o canal: " + canal);
        }
        public void diminuirCanal(){
            canal--;
            System.out.println("Você mudou para o  canal: " + canal);
        }
        public void mudarCanal(int novoCanal){
            canal = novoCanal;
            System.out.println("Você mudou para o  canal: " + canal);
        }


}
