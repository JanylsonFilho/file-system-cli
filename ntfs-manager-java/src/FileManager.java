import java.io.*;
import java.nio.file.*;
import java.util.stream.Stream;

public class FileManager {

    public void listDirectory(String path) {
        try (Stream<Path> paths = Files.list(Paths.get(path))) {
            paths.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Erro ao listar diretório: " + e.getMessage());
        }
    }

    public void readFile(String path) {
        try {
            String content = Files.readString(Paths.get(path));
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }

    public void writeFile(String path, String content, boolean append) {
        try {
            if (append) {
                Files.write(Paths.get(path), content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } else {
                Files.write(Paths.get(path), content.getBytes());
            }
            System.out.println("Arquivo salvo com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao escrever arquivo: " + e.getMessage());
        }
    }

    public void deleteFile(String path) {
        try {
            Files.delete(Paths.get(path));
            System.out.println("Arquivo deletado.");
        } catch (IOException e) {
            System.out.println("Erro ao deletar arquivo: " + e.getMessage());
        }
    }

    public void replaceFile(String src, String dest) {
        try {
            Files.copy(Paths.get(src), Paths.get(dest), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Arquivo copiado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao copiar arquivo: " + e.getMessage());
        }
    }

    public void renameFile(String path, String newName) {
        try {
            Path oldPath = Paths.get(path);
            Path newPath = oldPath.getParent().resolve(newName);
            Files.move(oldPath, newPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Arquivo renomeado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao renomear arquivo: " + e.getMessage());
        }
    }

    public void moveFile(String src, String targetDir) {
        try {
            Path srcPath = Paths.get(src);
            Path destPath = Paths.get(targetDir).resolve(srcPath.getFileName());
            Files.move(srcPath, destPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Arquivo movido com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao mover arquivo: " + e.getMessage());
        }
    }

    public void fileInfo(String path) {
        try {
            File file = new File(path);
            System.out.println("Nome: " + file.getName());
            System.out.println("Caminho: " + file.getAbsolutePath());
            System.out.println("Tamanho: " + file.length() + " bytes");
            System.out.println("Última modificação: " + new java.util.Date(file.lastModified()));
        } catch (Exception e) {
            System.out.println("Erro ao obter informações: " + e.getMessage());
        }
    }
}