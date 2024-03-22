Cosas que añadí para la solución del problema:

Interfaz CalculadorNumero:
La interfaz CalculadorNumero define métodos para determinar si un número es perfecto, defectuoso o abundante. 
Estos métodos son esPerfecto, esDefectivo y esAbundante.

Clase Numero:
La clase Numero implementa la interfaz CalculadorNumero y encapsula la lógica para verificar los tipos de números, contiene un constructor que recibe un número entero y métodos para calcular si es perfecto, defectuoso o abundante, utilicé ciclos y operaciones matemáticas para calcular y compararla con el número en cuestión.

Clase NumeroPerfecto:
La clase NumeroPerfecto extiende la clase Numero y sobrescribe el método esPerfecto para determinar si un número es perfecto, implemente la lógica específica para verificar si la suma de los divisores de un número es igual al número mismo.

Clase NumeroDefectivo:
La clase NumeroDefectivo extiende la clase Numero y sobrescribe el método esDefectivo para determinar si un número es defectuoso, implemente la lógica específica para verificar si la suma de los divisores de un número es menor que el número mismo.

Clase NumeroAbundante:
La clase NumeroAbundante extiende la clase Numero y sobrescribe el método esAbundante para determinar si un número es abundante, implemente la lógica específica para verificar si la suma de los divisores de un número es mayor que el doble del número mismo.
