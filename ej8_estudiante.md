# Ejercicio 8: Estudiante

## Explicación Lógica
1. **Estructura Dinámica:** Se utilizó la colección `ArrayList<Double>` para almacenar un número indeterminado de notas, instanciándola dentro del constructor.
2. **Validación de Rango:** El método `agregarNota()` verifica que la calificación esté dentro del intervalo válido `[0.0, 10.0]` antes de añadirla a la lista.
3. **Promedio y Resultado:** `calcularPromedio()` recorre la lista con un bucle *for-each*, acumula los valores y calcula la media dividiendo por `calificaciones.size()`. El método `haAprobado()` evalúa si dicho promedio es mayor o igual a `6.0`.