% Hechos
padre(juan, pedro).
madre(maria, pedro).
hermano(pedro, luis).
primo(pedro, ana).

% Reglas
abuelos(X, Z, N) :- padre(X, N), madre(Z, N).
progenitor(X, Y) :- padre(X, Y); madre(X, Y).
pariente(X, Y) :- hermano(X, Y); primo(X, Y).
no_padre(X, Y) :- \+ padre(X, Y).
hijo_unico(X) :- padre(_, X), \+ (hermano(X, _)).

