libro("El Hobbit", fantasia).
libro("1984", ciencia_ficcion).
libro("It", terror).

recomendar_libro(Genero, Libro) :- libro(Libro, Genero).