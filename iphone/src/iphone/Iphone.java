package iphone;

public class Iphone {
    public static void main(String[] args) {
        iPhoneImpl iphone = new iPhoneImpl();

        // Testando o Reprodutor Musical
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.tocar();
        iphone.pausar();

        // Testando o Aparelho Telefônico
        iphone.ligar("987654321");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando o Navegador Internet
        iphone.exibirPagina("www.apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}