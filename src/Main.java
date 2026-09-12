//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    Carro meuCarro = new Carro(10);
   meuCarro.marca = "Chevrolet";
   meuCarro.cor = "Azul";
   meuCarro.modelo = "Chevett";
    System.out.println("Carro da marca: " + meuCarro.marca + ", modelo: "+ meuCarro.modelo +", cor: "+meuCarro.cor);
   boolean subindo = true;
   do {
       meuCarro.acelerar(subindo);
        if (meuCarro.velocidadeAtual >= 80) {
            subindo = false;

        }

   }while(meuCarro.velocidadeAtual>0);

    System.out.println("\nO carro parou totalmente");
}

