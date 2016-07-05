/**
 * 
 */
package Composite;

/**
 * @author JuanClavero
 *
 */
public class Archivo extends Directorio{
	private String atajo;
	private int pesoMB;
	
@Override
public int calcularPeso() {
	return pesoMB;
	// TODO Auto-generated method stub

}

/**
 * @return the atajo
 */
public String getAtajo() {
	return atajo;
}

/**
 * @param atajo the atajo to set
 */
public void setAtajo(String atajo) {
	this.atajo = atajo;
}

/**
 * @return the pesoMB
 */
public int getPesoMB() {
	return pesoMB;
}

/**
 * @param pesoMB the pesoMB to set
 */
public void setPesoMB(int pesoMB) {
	this.pesoMB = pesoMB;
}
}
