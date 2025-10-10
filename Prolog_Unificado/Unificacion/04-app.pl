invertir([], []).
invertir([H|T], L) :- invertir(T, R), append(R, [H], L).


eliminar_duplicados([], []).
eliminar_duplicados([H|T], R) :- member(H, T), eliminar_duplicados(T, R).
eliminar_duplicados([H|T], [H|R]) :- not(member(H, T)), 
eliminar_duplicados(T, R).