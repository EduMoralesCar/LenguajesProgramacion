% Hechos
edad(juan, 25).
edad(maria, 30).

% Reglas
mayor(X, Y) :- edad(X, EX), edad(Y, EY), EX > EY.
igual_edad(X, Y) :- edad(X, EX), edad(Y, EY), EX =:= EY.
diferente(X, Y) :- edad(X, EX), edad(Y, EY), EX =\= EY.
