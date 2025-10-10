# 🦉 Prolog Unificado — Unificación

Este proyecto contiene ejemplos prácticos de programación en Prolog, centrados en la unificación y el razonamiento lógico. Cada práctica aborda conceptos fundamentales de Prolog mediante consultas y reglas.

---

## ⚙️ Ejecución

Para ejecutar los ejemplos, sigue estos pasos:

1. **Abre la terminal integrada** (puedes usar la de VS Code o cualquier otra).
2. **Inicia el intérprete de Prolog**:
    ```bash
    swipl
    ```
3. **Carga el archivo principal**:
    ```prolog
    ?- consult('01-app.pl').
    ```

---

## 📚 Prácticas

### 1️⃣ Práctica 1: Carnívoros 🦁

Ejemplo de consulta sobre animales carnívoros:

```prolog
?- es_carnivoro(leon).
true.

?- es_carnivoro(elefante).
false.
```

---

### 2️⃣ Práctica 2: Relaciones familiares 👨‍👩‍👧‍👦

Ejemplo de consultas para determinar hermanos y abuelos:

```prolog
?- hermanos(ana, pedro).
true.

?- abuelo(juan, Y).
false.
```

---

### 3️⃣ Práctica 3: Recomendación de libros 📖✨

Consulta para recomendar libros según el género:

```prolog
?- recomendar_libro(fantasia, Libro).
Libro = "El Hobbit"
```

---

### 4️⃣ Práctica 4: Listas en Prolog 📝

Consultas para invertir listas y eliminar duplicados:

```prolog
?- invertir([1,2,3], X).
X = [3,2,1].

?- eliminar_duplicados([1,2,2,3,3,3], X).
X = [1,2,3].
```

---

## 💡 Recomendaciones

- **Asegúrate de estar en el directorio correcto** donde se encuentra `01-app.pl` antes de ejecutar las consultas.
- Puedes modificar o crear tus propias reglas en el archivo para experimentar.
- Si tienes dudas sobre la sintaxis de Prolog, consulta la [documentación oficial](https://www.swi-prolog.org/pldoc/doc_for?object=manual).

---
