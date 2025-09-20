% Estructuras complejas
persona(nombre(juan), edad(25), ciudad(madrid)).
punto(x(10), y(20)).
fecha(dia(15), mes(marzo), año(2024)).

% Acceso a estructuras
obtener_nombre(persona(nombre(N), _, _), N).
