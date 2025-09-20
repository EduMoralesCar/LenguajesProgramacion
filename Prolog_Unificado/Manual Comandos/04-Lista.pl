% Declaración de listas
lista([1, 2, 3, 4]).
nombres([juan, maria, pedro]).
vacia([]).

% Último elemento
ultimo(X, [X]).
ultimo(X, [_|T]) :- ultimo(X, T).

% Suma de elementos
suma([], 0).
suma([H|T], S) :- suma(T, S1), S is H + S1.

% Contar elementos
contar([], 0).
contar([_|T], N) :- contar(T, N1), N is N1 + 1.

% Verificar si está vacía
es_vacia([]).

% Duplicar elementos
duplicar([], []).
duplicar([H|T], [H2|T2]) :- H2 is H * 2, duplicar(T, T2).
