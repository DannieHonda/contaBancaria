import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                **********************
                Dados do cliente:
                                
                                
                Nome: Danielle Honda
                Tipo conta: Corrente
                Saldo:
                *********************""");


        Scanner digitarOpcao = new Scanner(System.in);
        Scanner digitarValor = new Scanner(System.in);
        int operacaoEscolhida = 0;
        double saldoDisponivel = 2500.0;


        while (operacaoEscolhida != 4) {
            System.out.println("""
                    
                    
                    Digite a opção desejada
                    1- Consultar Saldo
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    """);

            operacaoEscolhida = digitarOpcao.nextInt();

            if (operacaoEscolhida == 1) {
                System.out.println("Seu saldo é de: R$" + saldoDisponivel);
            } else if (operacaoEscolhida == 2) {
                System.out.println("Digite o valor a receber: ");
                double valorRecebido = Double.parseDouble(digitarValor.nextLine());
                saldoDisponivel += valorRecebido;
                System.out.println("Novo saldo: R$" + saldoDisponivel);
            } else if (operacaoEscolhida == 3) {
                System.out.println("Quanto você deseja transferir?: ");
                double valorTransferido = Double.parseDouble(digitarValor.nextLine());
                saldoDisponivel -= valorTransferido;
                if (valorTransferido > saldoDisponivel) {
                    System.out.println("Saldo insuficiente");
                }else {
                    System.out.println("""
                Transferência realizada!
                Seu saldo é de: R$""" + saldoDisponivel);
                }

            }
            if (operacaoEscolhida == 4) {
                System.out.println("Sair");
            }
        }
    }
}