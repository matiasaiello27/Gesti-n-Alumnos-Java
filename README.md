# Gestión-Alumnos-Java
# 🎓 Gestor de Alumnos (Arrays vs Collections)

Este proyecto académico ha sido diseñado para comparar y demostrar el uso de estructuras de datos estáticas (Arrays) y dinámicas (ArrayList) en Java, centrándose en la gestión eficiente de objetos.

## 🛠️ Tecnologías y Conceptos

- **Lenguaje:** Java 17+
- **Estructuras de Datos:** - **Arrays:** Gestión manual de índices y control de desbordamiento.
  - **ArrayList:** Implementación de la interfaz `List` para manejo dinámico de memoria.
- **Patrones de Recorrido:** Implementación de `Iterator` para el borrado seguro de elementos en tiempo de ejecución.
- **Robustez:** Validación de entradas mediante el manejo de excepciones (`InputMismatchException`) y estandarización regional con `Locale.US`.

## ⚙️ Funcionalidades Principaless

1. **Modo Array:** Limitado a un máximo de 3 alumnos para demostrar la gestión de espacios nulos y límites de memoria física.
2. **Modo ArrayList:** Sin límite de capacidad, con funciones avanzadas de:
   - **Búsqueda:** Algoritmo de filtrado por nombre (ignore case).
   - **Eliminación Segura:** Uso de iteradores para evitar errores de concurrencia.
   - **Listado Completo:** Visualización formateada mediante la sobrescritura del método `toString()`.

## 👨‍💻 Autor

**Matias Aiello**
Estudiante de Desarrollo de Aplicaciones Multiplataforma (DAM).
- www.linkedin.com/in/matiasAiello27

