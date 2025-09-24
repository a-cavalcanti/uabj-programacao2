public class Aula06Switch {
    public static void main(String[] args) {
        int dia = 2;
        switch (dia) {
            case 1:
                System.out.println("Domingo");                
            case 2:
                System.out.println("Segunda");
                
            case 3:
            case 4: // múltiplos rótulos
                System.out.println("Terça ou Quarta");
                
            default:
                System.out.println("Outro dia");
        }

        String ext = "mp3";

        switch (ext) {
            case "jpg", "jpeg", "png", "gif" -> System.out.println("imagem");
            case "pdf", "doc", "docx", "txt" -> System.out.println("documento");
            case "mp3", "wav"                -> System.out.println("áudio");
            default                          -> System.out.println("desconhecido");
        }
    }
}
