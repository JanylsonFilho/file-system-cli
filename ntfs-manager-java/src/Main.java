
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileManager fm = new FileManager();

        while (true) {
            System.out.println("\n=== Gerenciador NTFS ===");
            System.out.println("1) Listar diretório");
            System.out.println("2) Ler arquivo (mostrar no console)");
            System.out.println("3) Escrever/Salvar arquivo (sobrescrever)");
            System.out.println("4) Acrescentar ao arquivo (append)");
            System.out.println("5) Apagar arquivo");
            System.out.println("6) Substituir arquivo (copiar sobre)");
            System.out.println("7) Renomear arquivo");
            System.out.println("8) Mover arquivo");
            System.out.println("9) Informações do arquivo");
            System.out.println("0) Sair");
            System.out.print("Escolha: ");

            String opt = sc.nextLine().trim();
            try {
                switch (opt) {
                    case "1":
                        System.out.print("Caminho do diretório: ");
                        fm.listDirectory(sc.nextLine().trim());
                        break;
                    case "2":
                        System.out.print("Caminho do arquivo: ");
                        fm.readFile(sc.nextLine().trim());
                        break;
                    case "3":
                        System.out.print("Caminho do arquivo: ");
                        String path = sc.nextLine().trim();
                        System.out.println(
                                "Digite o conteúdo (linha única). Para múltiplas linhas, use \n dentro do texto):");
                        String content = sc.nextLine();
                        fm.writeFile(path, content, false);
                        break;
                    case "4":
                        System.out.print("Caminho do arquivo: ");
                        path = sc.nextLine().trim();
                        System.out.println("Texto a acrescentar:");
                        content = sc.nextLine();
                        fm.writeFile(path, content, true);
                        break;
                    case "5":
                        System.out.print("Caminho do arquivo: ");
                        fm.deleteFile(sc.nextLine().trim());
                        break;
                    case "6":
                        System.out.print("Caminho origem: ");
                        String src = sc.nextLine().trim();
                        System.out.print("Caminho destino: ");
                        String dest = sc.nextLine().trim();
                        fm.replaceFile(src, dest);
                        break;
                    case "7":
                        System.out.print("Caminho do arquivo: ");
                        String original = sc.nextLine().trim();
                        System.out.print("Novo nome (apenas o nome, sem caminho): ");
                        String newName = sc.nextLine().trim();
                        fm.renameFile(original, newName);
                        break;
                    case "8":
                        System.out.print("Caminho origem: ");
                        src = sc.nextLine().trim();
                        System.out.print("Caminho destino (pasta): ");
                        String targetDir = sc.nextLine().trim();
                        fm.moveFile(src, targetDir);
                        break;
                    case "9":
                        System.out.print("Caminho do arquivo: ");
                        fm.fileInfo(sc.nextLine().trim());
                        break;
                    case "0":
                        System.out.println("Saindo...\n");
                        sc.close();
                        return;
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}