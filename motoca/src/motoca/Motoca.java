package motoca;

import java.util.Scanner;

class Pessoa {

    String nome;
    int idade;

    public Pessoa(String nome, int idade) { //nao eh metodo, eh invocado automaticaticamente na criacao
        this.nome = nome;
        this.idade = idade;
    }
}

public class Motoca {

    Pessoa pessoa;
    int potencia;
    int tempo;

    public Motoca() {
        this.potencia = potencia;
    }

    void embarcar(Pessoa pessoa) {
        if (this.pessoa == null) {
            this.pessoa = pessoa;
        } else {
            System.out.println("Ja tem gente na motoca");
        }
    }
    
    void pagar(){
        
    }

    void desembarcar() {
        if (this.pessoa != null) {
            this.pessoa = null;
        } else {
            System.out.println("Nao tem ninguem na moto");
        }
    }

    void dirigir() {
        if (this.pessoa == null) {
            System.out.println("Nao tem ninguem na moto");
            return;
        } else if (this.pessoa.idade < 2) {
            System.out.println("Muito pequeno pra andar de moto");
        } else if (this.pessoa.idade > 10) {
            System.out.println("Muito grande pra andar de moto");
        } else if (this.potencia == 1) {
            System.out.println(this.pessoa.nome + ": RUN....");
        } else if (this.potencia == 2) {
            System.out.println(this.pessoa.nome + ": RUN RUN.....");
        } else if (this.potencia == 3) {
            System.out.println(this.pessoa.nome + ": RUN RUN RUN...");
        } else {
            System.out.println("Esta moto passou do limite de velocidade e provavelmente " + this.pessoa.nome + " está morto.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Motoca motoca = new Motoca();
        while (true) {
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            if (ui[0].equals("end")) {
                break;
            } else if (ui[0].equals("embarcar")) { //nome  idade
                int idade = Integer.parseInt(ui[2]);
                motoca.embarcar(ui[1], new Pessoa = ui[1]);
            } else if (ui[0].equals("desembarcar")) {
                motoca.desembarcar();
            } else if (ui[0].equals("dirigir")) {
                motoca.dirigir();
            } else {
                System.out.println("Comando invalido");
            }
        }
        scanner.close();
    }

}
