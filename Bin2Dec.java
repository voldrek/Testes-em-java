import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha a operação:");
        System.out.println("1 - Converter de Binário para Decimal");
        System.out.println("2 - Converter de Decimal para Binário");

        int escolha = leitor.nextInt();

        switch (escolha) {
            case 1:
                // Conversão de Binário para Decimal
                System.out.println("Insira um número em Binário (até 8 dígitos): ");
                String binario = leitor.next();
                if (validarEntradaBinaria(binario)) {
                    int decimal = converterBinarioParaDecimal(binario);
                    System.out.println("Valor em Decimal: " + decimal);
                } else {
                    System.out.println("Erro: A entrada deve conter apenas 0s e 1s, e ter no máximo 8 dígitos.");
                }
                break;

            case 2:
                // Conversão de Decimal para Binário
                System.out.println("Insira um número Decimal: ");
                int decimal = leitor.nextInt();
                if (decimal >= 0) {
                    String binarioConvertido = converterDecimalParaBinario(decimal);
                    System.out.println("Valor em Binário: " + binarioConvertido);
                } else {
                    System.out.println("Erro: O número Decimal deve ser não negativo.");
                }
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }

    private static boolean validarEntradaBinaria(String entrada) {
        return entrada.matches("[01]+") && entrada.length() <= 8;
    }

    private static int converterBinarioParaDecimal(String binario) {
        int potencia = 0;
        int decimal = 0;

        for (int i = binario.length() - 1; i >= 0; i--) {
            decimal += Math.pow(2, potencia) * Character.getNumericValue(binario.charAt(i));
            potencia++;
        }

        return decimal;
    }

    private static String converterDecimalParaBinario(int decimal) {
        return Integer.toBinaryString(decimal);
    }
}
