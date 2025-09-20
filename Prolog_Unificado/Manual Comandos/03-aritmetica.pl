% Reglas con operaciones
suma(X, Y, R) :- R is X + Y.
resta(X, Y, R) :- R is X - Y.
multiplica(X, Y, R) :- R is X * Y.
divide(X, Y, R) :- R is X / Y.
modulo(X, Y, R) :- R is X mod Y.

% Reglas con funciones
valor_absoluto(X, R) :- R is abs(X).
raiz(X, R) :- R is sqrt(X).
mayor(X, Y, R) :- R is max(X, Y).
menor(X, Y, R) :- R is min(X, Y).
redondear(X, R) :- R is round(X).
