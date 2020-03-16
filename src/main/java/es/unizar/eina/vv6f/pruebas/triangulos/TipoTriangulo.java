package es.unizar.eina.vv6f.pruebas.triangulos;

/**
 * Clase que enumera los distintos tipos en los que puede clasificarse un
 * triángulo (equilátero, isósceles y escaleno) atendiendo a la longitud de sus
 * lados.
 */
public enum TipoTriangulo {
	EQUILATERO("equilátero"),
	ISOSCELES("isósceles"),
	ESCALENO("escaleno");

	/**
	 * Nombre "visualizable" de este tipo de triángulo
	 */
	private final String nombre;

	/**
	 * Construye un objeto de este enum inicializando el nombre "visualizable"
	 * del objeto
	 *
	 * @param nombre
	 *            nombre "visualizable" de este tipo de triángulo
	 */
	TipoTriangulo(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el nombre "visualizable" de este objeto enum
	 */
	@Override
	public String toString() {
		return nombre;
	}
}
