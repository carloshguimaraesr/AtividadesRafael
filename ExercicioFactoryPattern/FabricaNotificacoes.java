package org.example;


public class FabricaNotificacoes {
    public static Notificacao criarNotificacao(String tipo) {
        switch (tipo) {
            case "1":
                return new NotificacaoEmail();
            case "2":
                return new NotificacaoSMS();
            case "3":
                return new NotificacaoPush();
            default:
                throw new IllegalArgumentException("Tipo de notificação inválido");
        }
    }
}
