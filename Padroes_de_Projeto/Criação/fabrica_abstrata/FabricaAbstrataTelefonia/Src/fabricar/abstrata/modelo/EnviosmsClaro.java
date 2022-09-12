package fabrica.abstrata.modelo;

import fabrica.abstrata.modelo.EnvioSMS;
import fabrica.abstrata.modelo.Mensagem;


public class EnvioSMSClaro implements EnvioSMS{

    public EnvioSMSClaro(String config){
        //realiza configuracao especifica para claro.
    }
    @Override
    public boolean enviar(Mensagem msg, int telefone) {
        System.out.println("Enviando mensagem:" +  msg.texto + 
                " para o telefone claro:" + telefone );
        return true;
    }
}
