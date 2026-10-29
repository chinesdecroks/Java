package nt.Meios;

import nt.Notificador.*;

public class NotificadorEmail implements Notificador {

    @Override
    public void enviar (String mensagem)
    {
        System.out.println("Notificação via e-mail: " + mensagem);
    }
}
