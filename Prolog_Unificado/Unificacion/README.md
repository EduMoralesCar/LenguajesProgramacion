# EJecución
> Abre la terminal integrada
```bash
# Inicializamos Prolog
swipl

# Cargar tu archivo
?- consult('01-app.pl').

```

# Practica 1

```prolog
# Consultas esperadas:
 ?- es_carnivoro(leon).
 true.
 ?- es_carnivoro(elefante).
 false.
```

# Practica 2
```prolog
# Consultas esperadas:
?- hermanos(ana, pedro).
 true.
 ?- abuelo(juan, Y).
 false.
```

# Practica 3
```prolog
# Consulta esperada:
?- recomendar_libro(fantasia, Libro).
 Libro = "El Hobbit"
```

# Practica 4
```prolog
# Consultas esperadas:
 ?- invertir([1,2,3], X).
 X = [3,2,1].
 ?- eliminar_duplicados([1,2,2,3,3,3], X).
 X = [1,2,3].
```
