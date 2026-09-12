public class Carro {
    //Aqui eu defini os atributos do carro, como caracteristicas fisicas e velocidades
    String modelo;
    String cor;
    String marca;
    double velocidadeAtual = 0;
    double taxaAceleracao;

    /*aqui eu criei um método chamado "Carro" como classe construtora, onde eu fiz a atribuição dos valores de aceleração e
    velocidade atual, para que eu fizesse a chamada na classe Main



     */
   public Carro(double taxaAceleracao){
       this.taxaAceleracao = taxaAceleracao;
   }
   public void acelerar(boolean aceleracao){
       if (aceleracao){
           this.velocidadeAtual += taxaAceleracao;
           System.out.println("Acelerando o veículo: "+this.velocidadeAtual+"KM/H");
       }
       else{
           this.velocidadeAtual -= taxaAceleracao;
           System.out.println("Desacelerando o veículo: "+this.velocidadeAtual+"KM/H");
       }

   }
}
