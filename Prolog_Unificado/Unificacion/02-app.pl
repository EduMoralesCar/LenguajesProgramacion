padre(juan, ana).
madre(maria, ana).
padre(juan, pedro).
madre(maria, pedro).

hermanos(X, Y) :- padre(P, X), padre(P, Y), X \= Y.
abuelo(X, Y) :- padre(X, Z), padre(Z, Y).