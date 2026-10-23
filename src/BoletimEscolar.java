import java.util.ArrayList;
import java.util.Scanner;

/**
 * Boletim Escolar - mini projeto de console em Java.
 *
 * Conceitos praticados:
 *  - Array: guarda as 4 notas de cada aluno (tamanho fixo)
 *  - ArrayList: guarda a lista de alunos (tamanho dinamico)
 *  - For-each: percorre notas e alunos para calcular e exibir resultados
 *
 * Funcionalidades:
 *  1 - Cadastrar aluno e suas notas
 *  2 - Listar boletim completo
 *  3 - Ver estatisticas da turma
 *  0 - Sair
 */
public class BoletimEscolar {

    // Constantes: valores fixos que facilitam a manutencao do codigo
    private static final int QTD_NOTAS = 4;
    private static final double MEDIA_APROVACAO = 6.0;

    // Duas listas "paralelas": a posicao i de uma corresponde a posicao i da outra
    private static final ArrayList<String> nomes = new ArrayList<>();
    private static final ArrayList<double[]> notasDosAlunos = new ArrayList<>();

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    listarBoletim();
                    break;
                case 3:
                    exibirEstatisticas();
                    break;
                case 0:
                    System.out.println("\nEncerrando o sistema. Ate logo!");
                    break;
                default:
                    System.out.println("\nOpcao invalida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    // ---------------------------------------------------------------
    // MENU
    // ---------------------------------------------------------------

    private static void exibirMenu() {
        System.out.println("\n===== BOLETIM ESCOLAR =====");
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Listar boletim");
        System.out.println("3 - Estatisticas da turma");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opcao: ");
    }

    private static int lerOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1; // cai no "default" do switch
        }
    }

    // ---------------------------------------------------------------
    // CADASTRO
    // ---------------------------------------------------------------

    private static void cadastrarAluno() {
        System.out.print("\nNome do aluno: ");
        String nome = scanner.nextLine().trim();

        if (nome.isEmpty()) {
            System.out.println("O nome nao pode ficar vazio.");
            return;
        }

        // Array com tamanho fixo: sempre QTD_NOTAS notas por aluno
        double[] notas = new double[QTD_NOTAS];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = lerNota(i + 1);
        }

        nomes.add(nome);
        notasDosAlunos.add(notas);

        System.out.println("Aluno cadastrado com sucesso!");
    }

    /** Pede uma nota ate o usuario digitar um valor valido entre 0 e 10. */
    private static double lerNota(int numeroDaNota) {
        while (true) {
            System.out.print("Nota " + numeroDaNota + " (0 a 10): ");
            try {
                // replace permite digitar 7,5 ou 7.5
                double nota = Double.parseDouble(scanner.nextLine().trim().replace(",", "."));

                if (nota >= 0 && nota <= 10) {
                    return nota;
                }
                System.out.println("A nota deve estar entre 0 e 10.");
            } catch (NumberFormatException e) {
                System.out.println("Valor invalido. Digite um numero.");
            }
        }
    }

    // ---------------------------------------------------------------
    // LISTAGEM
    // ---------------------------------------------------------------

    private static void listarBoletim() {
        if (nomes.isEmpty()) {
            System.out.println("\nNenhum aluno cadastrado ainda.");
            return;
        }

        System.out.println("\n===== BOLETIM =====");

        // For classico: precisamos do indice para ligar o nome as suas notas
        for (int i = 0; i < nomes.size(); i++) {
            double[] notas = notasDosAlunos.get(i);
            double media = calcularMedia(notas);

            System.out.println("\nAluno: " + nomes.get(i));
            System.out.print("Notas: ");

            // For-each: percorre cada nota sem precisar de indice
            for (double nota : notas) {
                System.out.printf("%.1f  ", nota);
            }

            System.out.printf("%nMedia: %.2f - %s%n", media, situacao(media));
        }
    }

    // ---------------------------------------------------------------
    // ESTATISTICAS
    // ---------------------------------------------------------------

    private static void exibirEstatisticas() {
        if (nomes.isEmpty()) {
            System.out.println("\nNenhum aluno cadastrado ainda.");
            return;
        }

        double somaDasMedias = 0;
        double melhorMedia = -1;
        String melhorAluno = "";
        int aprovados = 0;

        // Usamos o indice (i) so para buscar o nome correspondente ao aluno
        int i = 0;
        for (double[] notas : notasDosAlunos) {
            double media = calcularMedia(notas);
            somaDasMedias += media;

            if (media > melhorMedia) {
                melhorMedia = media;
                melhorAluno = nomes.get(i);
            }
            if (media >= MEDIA_APROVACAO) {
                aprovados++;
            }
            i++;
        }

        int total = nomes.size();

        System.out.println("\n===== ESTATISTICAS DA TURMA =====");
        System.out.println("Total de alunos: " + total);
        System.out.printf("Media da turma: %.2f%n", somaDasMedias / total);
        System.out.printf("Melhor desempenho: %s (%.2f)%n", melhorAluno, melhorMedia);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + (total - aprovados));
    }

    // ---------------------------------------------------------------
    // METODOS AUXILIARES
    // ---------------------------------------------------------------

    /** Soma as notas com for-each e divide pela quantidade de notas. */
    private static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    private static String situacao(double media) {
        return media >= MEDIA_APROVACAO ? "APROVADO" : "REPROVADO";
    }
}
