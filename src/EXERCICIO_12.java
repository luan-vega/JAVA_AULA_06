import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Scanner;

public class EXERCICIO_12 {

    public static void main(String[] args) {
        // Obtém a data de nascimento do usuário
        int diaNasc = 23;
        int mesNasc = 9;
        int anoNasc = 1990;

        // Converte a data de nascimento para um objeto LocalDate
        LocalDate dataNascimento = LocalDate.of(anoNasc, mesNasc, diaNasc);

        // Calcula a idade do usuário
        LocalDate hoje = LocalDate.now();
        int idade = Period.between(dataNascimento, hoje).getYears();
        System.out.println("Sua idade é: " + idade);

        // Obtém o dia da semana em que o usuário nasceu
        DayOfWeek diaSemana = dataNascimento.getDayOfWeek();
        System.out.println("Você nasceu em um(a) " + diaSemana);

        // Verifica se o ano de nascimento era bissexto
        boolean bissexto = Year.of(anoNasc).isLeap();
        if (bissexto) {
            System.out.println("O ano em que você nasceu era bissexto.");
        } else {
            System.out.println("O ano em que você nasceu não era bissexto.");
        }

        Scanner entrada = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("Escolha uma opção:");
            System.out.println("Menu principal.");
            System.out.println("1 - Calcular idade.");
            System.out.println("2 - Calcular ano de nascimento.");
            System.out.println("3 - Calcuilar bissesto.");
            System.out.println("4 - Sair.");

        }
    }
}
