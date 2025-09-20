# EJecución
> Abre la terminal integrada
```bash
swipl

# Cargar tu archivo
?- consult('01-OperadoresLogicos.pl').

```

# 🧠 Operadores Logicos
## Pruebas de Consulta

```prolog
?- abuelos(X, Z, luis).
?- progenitor(X, pedro).
?- pariente(pedro, ana).
?- no_padre(maria, luis).
?- hijo_unico(pedro).
```

# 🧮 Operadores de Comparación
## Pruebas de Consulta
```prolog
?- mayor(maria, juan).
?- igual_edad(juan, maria).
?- diferente(juan, maria).
?- edad(X, E), E >= 30.
```

# 🔢 Aritmetica
## Pruebas de Consulta
```prolog
?- suma(5, 3, R).
?- raiz(25, R).
?- redondear(3.7, R).
```

> Tambien se puede hacer Operaciones dentro de SEI.Prolog

```prolog
# Operaciones Basicas
?- X is 5 + 3.        % X = 8
?- Y is 10 - 4.       % Y = 6
?- Z is 6 * 7.        % Z = 42
?- W is 20 / 4.       % W = 5.0
?- R is 17 mod 5.     % R = 2

# Funciones matemáticas
?- X is abs(-5).         % X = 5
?- Y is sqrt(16).        % Y = 4.0
?- Z is max(10, 20).     % Z = 20
?- W is min(5, 8).       % W = 5
?- A is round(3.7).      % A = 4

```

# 📋 Listas
## Pruebas de Consulta
```prolog
?- lista(L).
?- nombres(N).
?- ultimo(X, [a, b, c, d]).
?- suma([1, 2, 3, 4], S).
?- contar([a, b, c], N).
?- es_vacia([]).
?- duplicar([2, 4, 6], R).
```

# 📦 Estructuras de Datos
## Pruebas de Consulta
```prolog
?- persona(nombre(N), edad(E), ciudad(C)).
?- obtener_nombre(persona(nombre(ana), edad(30), ciudad(lima)), N).
```

# 🔁 Control de Flujo
## Pruebas de Consulta
```prolog
?- max(5, 3, R).
?- max(2, 7, R).
?- factorial(5, F).
?- mostrar_todos(X).
```


# Entrada y Salida
## Pruebas de Consulta
```prolog
?- write('Hola mundo').
?- writeln('Línea completa').
?- nl.
?- tab(5).
?- read(X).
?- get_char(C).
?- read_string(user_input, 100, S).
?- format('El valor es ~w~n', [Variable]).
?- format('Número: ~d, Flotante: ~2f~n', [42, 3.14159]).
```
