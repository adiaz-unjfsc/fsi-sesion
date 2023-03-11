package pe.unjfsc.fsi.logical;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.entity.CEDatos;
import pe.unjfsc.fsi.entity.CEOrdenar;

public class CLOrdenar {

    private static final Logger LOG = LoggerFactory.getLogger(CLOrdenar.class);

    // public o private [Tipo de dato] [Nombre del metodo](Parametros: Tipos dato nombre del tipi dato)
    public void ordenvoid(int pa, int pb, int pc) {

    }

    public String ordennumero(String pa, long pb, int pc) {
        return null;
    }

    public int[] orden(int pa, int pb, int pc) {
        return null;
    }

    public CEOrdenar ordenarNumeros(CEDatos poDato) {
        LOG.info("[EVL] Datos llegan : {}", poDato);
        CEOrdenar oResult = new CEOrdenar();

        if (poDato.getA() > poDato.getB()) {
            if (poDato.getA() > poDato.getC() && poDato.getB() > poDato.getC()) {
                oResult.setMayor(poDato.getA());
                oResult.setMedio(poDato.getB());
                oResult.setMenor(poDato.getC());
                LOG.info("[EVL] Forma 1 : {}", oResult);
            } else {
                oResult.setMayor(poDato.getA());
                oResult.setMedio(poDato.getC());
                oResult.setMenor(poDato.getB());
                LOG.info("[EVL] Forma 2 : {}", oResult);
            }
        } else {
            if (poDato.getA() > poDato.getC()) {
                if (poDato.getB() > poDato.getC()) {
                    oResult.setMayor(poDato.getB());
                    oResult.setMedio(poDato.getA());
                    oResult.setMenor(poDato.getC());
                    LOG.info("[EVL] Forma 3 : {}", oResult);
                } else {
                    oResult.setMayor(poDato.getB());
                    oResult.setMedio(poDato.getC());
                    oResult.setMenor(poDato.getA());
                    LOG.info("[EVL] Forma 4 : {}", oResult);
                }
            } else {
                if (poDato.getB() > poDato.getC()) {
                    oResult.setMayor(poDato.getB());
                    oResult.setMedio(poDato.getC());
                    oResult.setMenor(poDato.getA());
                    LOG.info("[EVL] Forma 5 : {}", oResult);
                } else {
                    oResult.setMayor(poDato.getC());
                    oResult.setMedio(poDato.getB());
                    oResult.setMenor(poDato.getA());
                    LOG.info("[EVL] Forma 6 : {}", oResult);
                }
            }
        }
        return oResult;
    }
}
