% Cut (!)
max(X, Y, X) :- X >= Y, !.
max(X, Y, Y).

factorial(0, 1) :- !.
factorial(N, F) :- N > 0, N1 is N - 1, factorial(N1, F1), F is N * F1.

% Fail
mostrar_todos(X) :- datos(X), write(X), nl, fail.
mostrar_todos(_).
