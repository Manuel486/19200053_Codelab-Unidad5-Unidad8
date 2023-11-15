# Flight Search App

Este repositorio contiene el código fuente para una aplicación de Android que permite a los usuarios buscar vuelos desde un aeropuerto de salida específico. La aplicación utiliza una base de datos prellenada para mostrar una lista de vuelos disponibles y permite a los usuarios guardar sus vuelos favoritos. La gestión de la base de datos se realiza mediante Room.

## Contenido

- [Objetivo de la Aplicación](#objetivo-de-la-aplicación)
- [Pantallas](#pantallas)
- [Codelab](#codelab)
- [Cómo Contribuir](#cómo-contribuir)

## Objetivo de la Aplicación

La aplicación tiene como objetivo principal recuperar datos de una base de datos Room que contiene dos tablas: Airports (Aeropuertos) y Favorites (Favoritos). Además, la aplicación guarda el valor de búsqueda en las preferencias del usuario para prellenar automáticamente el texto de búsqueda al volver a abrir la aplicación.

## Pantallas

- **Pantalla de Búsqueda:** Incluye un campo de texto vacío para buscar en la base de datos.
- **Texto de Búsqueda Vacío:**
  - Muestra una lista de vuelos favoritos guardados si hay vuelos guardados.
- **Ingresar Texto de Búsqueda:**
  - Muestra resultados de búsqueda, una lista de aeropuertos.
    - Hacer clic en un elemento (Aeropuerto) lleva a la pantalla de Vuelos.
- **Pantalla de Vuelos:**
  - Es una lista de vuelos frente a todos los demás aeropuertos en la base de datos.
  - Hacer clic en un vuelo lo guarda en Favoritos.

## Codelab

Para obtener instrucciones detalladas sobre cómo crear esta aplicación, consulta el [Codelab](https://developer.android.com/codelabs/basic-android-kotlin-compose-flight-search?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-6-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-flight-search#3).

## Cómo Contribuir

Por favor, siéntete libre de revisar el código, dejar comentarios o abrir problemas para discutir posibles mejoras.
