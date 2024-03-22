package interfaces;

/**
 * La interfaz TipoNumero define un método que debe ser implementado
 * por cualquier clase que pueda verificar un cierto tipo de número.
 */
public interface TipoNumero {

  /**
   * Método para verificar un cierto tipo de número.
   * El tipo específico de número (por ejemplo, perfecto, defectuoso, abundante) 
   * será determinado por la clase que implemente esta interfaz.
   * @param numero El número que se evaluará.
   * @return true si el número es del tipo específico, false en caso contrario.
   */
  boolean verificar(int numero);
}