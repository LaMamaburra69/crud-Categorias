# CRUD de Categorías con Spring Boot

API REST de categorías. Comparte la base de datos MySQL con `crud-productos`
(mismo esquema `productosdb`, tabla `categoria` separada de `producto`).

## Ejecutar junto con crud-productos (Docker)

Este proyecto se construye desde el `docker-compose.yml` de `crud-productos`,
que debe estar en una carpeta hermana a esta (`../crud-categorias`).

```bash
cd ../crud-productos
docker compose up --build
```

La API queda en `http://localhost:8081/api/categorias`.

## Ejecutar solo, con H2 (desarrollo en IntelliJ)

Ejecutar `CategoriasApplication`. Corre en el puerto 8081 con una base en memoria.

## Endpoints

| Método | URL                     | Descripción     |
|--------|-------------------------|-----------------|
| GET    | /api/categorias         | Listar todas    |
| GET    | /api/categorias/{id}    | Obtener por id  |
| POST   | /api/categorias         | Crear           |
| PUT    | /api/categorias/{id}    | Actualizar      |
| DELETE | /api/categorias/{id}    | Eliminar        |
