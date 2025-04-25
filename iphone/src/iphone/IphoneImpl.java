package iphone;

import iphone.interfaces.AparelhoTelefonico;
import iphone.interfaces.NavegadorInternet;
import iphone.interfaces.ReprodutorMusical;


class iPhoneImpl implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
 private String musica;
 private String numero;
 private String url;
 
 // Métodos do Reprodutor Musical
 @Override
 public void tocar() {
     System.out.println("Reproduzindo música: " + musica);
 }

 @Override
 public void pausar() {
     System.out.println("Música pausada.");
 }

 @Override
 public void selecionarMusica(String musica) {
     this.musica = musica;
     System.out.println("Música selecionada: " + musica);
 }
 
 // Métodos do Aparelho Telefônico
 @Override
 public void ligar(String numero) {
     this.numero = numero;
     System.out.println("Ligando para: " + numero);
 }

 @Override
 public void atender() {
     System.out.println("Atendendo a chamada.");
 }

 @Override
 public void iniciarCorreioVoz() {
     System.out.println("Iniciando correio de voz.");
 }

 // Métodos do Navegador Internet
 @Override
 public void exibirPagina(String url) {
     this.url = url;
     System.out.println("Exibindo página: " + url);
 }

 @Override
 public void adicionarNovaAba() {
     System.out.println("Nova aba adicionada.");
 }

 @Override
 public void atualizarPagina() {
     System.out.println("Página atualizada: " + url);
 }
}