# Prolog

<p align="center">
<img src="https://www.swi-prolog.org/icons/swipl.png" alt="SWI Prolog Logo" width="120"/>
</p>

<h2 align="center">Prolog: Programación Lógica y Declarativa 🦉</h2>

---

## ¿Qué es Prolog? 🤔

**Prolog** es un lenguaje de programación lógica, ampliamente utilizado en inteligencia artificial, sistemas expertos y procesamiento de lenguaje natural. Su enfoque está en la representación de conocimientos y el razonamiento automático mediante hechos y reglas.

- 🔎 **Basado en lógica y relaciones**
- 🧠 **Ideal para IA, sistemas expertos, y resolución de problemas**
- 📋 **Sintaxis declarativa: describe qué debe cumplirse, no cómo lograrlo**
- 🔗 **Uso en aplicaciones como chatbots, motores de inferencia y análisis de datos**
- 🌍 **Comunidad activa y documentación extensa**

---


## Estructura del Proyecto 🗂️
```
├── 📁 Manual Comandos/
│   ├── 🐪 01-OperadoresLogicos.pl
│   ├── 🐪 02-OperadoresCompararion.pl
│   ├── 🐪 03-aritmetica.pl
│   ├── 🐪 04-Lista.pl
│   ├── 🐪 05-EstructuraDatos.pl
│   ├── 🐪 06-ControlFlujo.pl
│   └── 📖 README.md
├── 📁 Unificacion/
│   ├── 🐪 01-app.pl
│   ├── 🐪 02-app.pl
│   ├── 🐪 03-app.pl
│   ├── 🐪 04-app.pl
│   ├── 📖 README.md
│   └── 📕 Semana09 - Tarea PA.pdf
└── 📝 Manual_Instalacion.md
```
---

# Manual de Instalación de Prolog

## 1. Instalación de SWI-Prolog en Windows

### Descarga

1. Ve a la página oficial de SWI-Prolog:  
	 [https://www.swi-prolog.org/Download.html](https://www.swi-prolog.org/Download.html)
2. Descarga el instalador para Windows (por ejemplo, `swipl-win64.exe`).

### Instalación

1. Ejecuta el instalador descargado.
2. Sigue las instrucciones del asistente de instalación (puedes dejar las opciones por defecto).
3. Al finalizar, abre una terminal (PowerShell o CMD) y ejecuta:
	 ```pwsh
	 swipl
	 ```
	 Si ves el prompt de Prolog (`?-`), la instalación fue exitosa.

---

## 2. Uso de Prolog en la Consola

- Para iniciar Prolog, abre una terminal y ejecuta:
	```pwsh
	swipl
	```
- Para cargar un archivo Prolog (por ejemplo, `ejemplo.pl`):
	```prolog
	?- [ejemplo].
	```
- Para salir de Prolog:
	```prolog
	?- halt.
	```

---

## 3. Configuración de Prolog en Visual Studio Code

### Instalación de la extensión

1. Abre Visual Studio Code.
2. Ve a la sección de extensiones (Ctrl+Shift+X).
3. Busca e instala la extensión:  
	 **Prolog** (generalmente publicada por `arthwang` o `janbasktraining`).
	 - [Prolog Extension en Marketplace](https://marketplace.visualstudio.com/items?itemName=rebornix.prolog)

### Configuración

- Asegúrate de que la ruta de `swipl` esté en la variable de entorno `PATH` de Windows.
- Reinicia Visual Studio Code si es necesario.

### Uso en VS Code

- Abre o crea archivos con extensión `.pl`.
- Puedes ejecutar consultas directamente en la terminal integrada usando `swipl`.
- Algunas extensiones permiten ejecutar consultas desde el editor (verifica la documentación de la extensión instalada).

---

## 4. Comandos útiles en la consola

- Cargar un archivo:  
	```prolog
	?- [archivo].
	```
- Consultar un predicado:  
	```prolog
	?- predicado(argumentos).
	```
- Listar predicados cargados:  
	```prolog
	?- listing.
	```
- Salir de Prolog:  
	```prolog
	?- halt.
	```

---

## 5. Recursos adicionales

- [Documentación oficial de SWI-Prolog](https://www.swi-prolog.org/pldoc/doc_for?object=manual)
- [Tutorial básico de Prolog](https://www.swi-prolog.org/pldoc/man?section=quickstart)
