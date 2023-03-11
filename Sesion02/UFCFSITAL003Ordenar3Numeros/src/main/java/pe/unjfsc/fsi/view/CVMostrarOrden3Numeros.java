package pe.unjfsc.fsi.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.entity.CEDatos;
import pe.unjfsc.fsi.entity.CEOrdenar;
import pe.unjfsc.fsi.logical.CLOrdenar;

public class CVMostrarOrden3Numeros {

    private static final Logger LOG = LoggerFactory.getLogger("CVMostrarOrden3Numeros");
    private static final String MOSTRAR_MSG = "Operacion Correcta";

    public static void main(String[] args) {
        LOG.info("[EVL] Iniciando ejecución");

        CEDatos oEntrada = new CEDatos();
        CEOrdenar oResult = new CEOrdenar();
        CLOrdenar oCLOrden = new CLOrdenar();

        LOG.info("[EVL] Instancia - CEDatos : {}", oEntrada);
        LOG.info("[EVL] Instancia - CEOrdenar : {}", oResult);
        LOG.info("[EVL] Instancia - CLOrdenar : {}", oCLOrden);

        oEntrada.setA(17);
        oEntrada.setB(20);
        oEntrada.setC(15);

        oResult = oCLOrden.ordenarNumeros(oEntrada);
        LOG.info("[EVL] Ordenado1 : {}", oResult);
        LOG.info("[EVL] Ordenado1 : {}", oResult);

    }
}
