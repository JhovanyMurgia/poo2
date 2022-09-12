package fabrica.abstrata;

import fabrica.abstrata.modelo.EnvioSMSClaro;
import fabrica.abstrata.modelo.EnvioSMS;
import fabrica.abstrata.modelo.CobrancaClaro;
import fabrica.abstrata.modelo.Cobranca;


public class FabricaClaro extends FabricaAbstrataEnvios{
    
    @Override
    public EnvioSMS criaEnvioSMS () {
        return new EnvioSMSTim("Assincrono");
    }
    @Override
    public Cobranca criaCobranca() {
        return new CobrancaClaro();
    }
}
