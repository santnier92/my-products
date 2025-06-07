# 🛍️ My Products - Gestión de Productos Tecnológicos

Este proyecto es una **aplicación fullstack** diseñada para la gestión de productos tecnológicos. Su objetivo es proporcionar una herramienta completa para registrar, visualizar y administrar productos a través de una interfaz web intuitiva y una arquitectura escalable.

Actualmente, se encuentra desarrollada la capa **frontend** utilizando **Angular** y **Angular Material**, ofreciendo una experiencia de usuario moderna, modular y eficiente. Próximamente se incorporará la lógica de **backend** para completar la funcionalidad integral del sistema.

## ⚙️ Tecnologías previstas

### Frontend
- Angular
- Angular Material
- TypeScript
- SCSS
- Jasmine / Karma (testing)

### Backend (por integrar)
- Node.js / Java (opcional)
- Express / Spring Boot
- MongoDB / PostgreSQL

## 📂 Componentes actuales

### `ProductForm`
Formulario para agregar productos. Implementado con componentes de Angular Material (`MatFormField`, `MatInput`, `MatButton`).

### `ProductList`
Componente para listar los productos agregados. Preparado para integrarse con el backend.

### `App`
Componente raíz que estructura la aplicación y gestiona la navegación.

## 🧪 Pruebas

El componente `ProductList` incluye una prueba unitaria para verificar su creación adecuada:

```ts
it('should create', () => {
  expect(component).toBeTruthy();
});
