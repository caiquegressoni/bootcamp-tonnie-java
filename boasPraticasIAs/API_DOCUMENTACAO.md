# Documentação da API de Produtos

Esta API permite gerenciar produtos, incluindo operações de criação, listagem, atualização e remoção.  
Abaixo estão descritos os endpoints, exemplos de uso, validações e **erros encontrados no código**, além de sugestões de correção.

---

## Endpoints

### 1. Listar todos os produtos

- **GET** `/api/products/`
- **Resposta:**  
  - 200 OK  
  - Exemplo:  
    ```json
    [
      {
        "id": 1,
        "name": "Produto Exemplo",
        "price": 10.5
      }
    ]
    ```

---

### 2. Buscar produto por ID

- **GET** `/api/products/{id}`
- **Resposta:**  
  - 200 OK  
  - 404 Not Found (se não existir)
- **Exemplo de resposta de erro:**  
  ```json
  { "message": "Produto não encontrado" }
  ```

---

### 3. Criar produto

- **POST** `/api/products/`
- **Body (JSON):**
  ```json
  {
    "name": "Nome do Produto",
    "price": 99.99
  }
  ```
- **Validações:**
  - `name`: string, mínimo 3 caracteres, obrigatório
  - `price`: número positivo, obrigatório
- **Respostas:**
  - 201 Created (produto criado)
  - 400 Bad Request (validação falhou)
- **Exemplo de erro de validação:**
  ```json
  { "message": "\"name\" is required" }
  ```

---

### 4. Atualizar produto

- **PUT** `/api/products/{id}`
- **Body (JSON):**
  ```json
  {
    "name": "Novo Nome",
    "price": 150.00
  }
  ```
- **Validações:** iguais ao POST
- **Respostas:**
  - 200 OK (produto atualizado)
  - 404 Not Found (produto não existe)
  - 400 Bad Request (validação falhou)

---

### 5. Remover produto

- **DELETE** `/api/products/{id}`
- **Respostas:**
  - 204 No Content (removido)
  - 404 Not Found (produto não existe)

---

## Validação

A validação dos dados é feita com o pacote **Joi**.  
Se algum campo obrigatório faltar ou estiver inválido, a API retorna erro 400 com mensagem descritiva.

---

## **Erros Encontrados no Código**

### 1. Erro de Importação das Rotas

No arquivo [`src/index.js`](src/index.js):

```js
const productRoutes = require('./route/productsRoute');
...
app.use('/api/products', productRoutes);
```
**Problema:**  
O arquivo [`src/route/productsRoute.js`](src/route/productsRoute.js) exporta um objeto `{ router }`, mas está sendo importado diretamente.  
**Solução:**  
Altere a exportação para:
```js
module.exports = router;
```
Ou, na importação:
```js
const { router: productRoutes } = require('./route/productsRoute');
```

---

### 2. Parâmetros dos Controllers Invertidos

No arquivo [`src/controller/productController.js`](src/controller/productController.js):

```js
const getAllProducts = (res, req) => { ... }
```
**Problema:**  
A ordem correta dos parâmetros é `(req, res)`, não `(res, req)`.  
**Solução:**  
Troque para:
```js
const getAllProducts = (req, res) => { ... }
```
Faça isso para todos os métodos do controller.

---

### 3. Variáveis com Nomes Iguais

No controller, há redefinição de variáveis, por exemplo:
```js
const products = products.find(...)
```
**Problema:**  
Está sobrescrevendo o array `products` com um único produto.
**Solução:**  
Use nomes diferentes, por exemplo:
```js
const product = products.find(...)
```

---

### 4. Métodos Exportados com Nomes Diferentes

No controller:
```js
const updateProducts = ...
const deleteProducts = ...
```
No router:
```js
const { updateProduct, deleteProduct } = require('../controller/productController');
```
**Problema:**  
Os nomes exportados e importados não batem.
**Solução:**  
Padronize os nomes para `updateProduct` e `deleteProduct` em todos os arquivos.

---

### 5. Model Vazio

O arquivo [`src/models/productModel.js`](src/models/productModel.js) está vazio.  
**Sugestão:**  
Se não for usar um banco de dados, pode remover ou implementar lógica de persistência futura.

---

### 6. Nome do Arquivo de Validador

O arquivo está como `productValitador.js` (com erro de digitação).  
**Sugestão:**  
Renomeie para `productValidator.js` para manter o padrão e evitar confusão.

---

## Exemplo de Requisições com cURL

**Criar produto:**
```bash
curl -X POST http://localhost:3000/api/products \
-H "Content-Type: application/json" \
-d '{"name":"Produto Teste","price":10.5}'
```

**Atualizar produto:**
```bash
curl -X PUT http://localhost:3000/api/products/1 \
-H "Content-Type: application/json" \
-d '{"name":"Produto Atualizado","price":20.0}'
```

---

## Observações Finais

- Corrija os erros acima para garantir o funcionamento correto da API.
- Considere implementar persistência em arquivo ou banco de dados para uso real.
- Sempre valide os dados de entrada para evitar problemas de integridade.

---
```// filepath: c:\Users\caique.gressoni\Desktop\Cursos_DIO\BootCamp_TonnieJava\bootcamp-tonnie-java\boasPraticasIAs\API_DOCUMENTACAO.md

# Documentação da API de Produtos

Esta API permite gerenciar produtos, incluindo operações de criação, listagem, atualização e remoção.  
Abaixo estão descritos os endpoints, exemplos de uso, validações e **erros encontrados no código**, além de sugestões de correção.

---

## Endpoints

### 1. Listar todos os produtos

- **GET** `/api/products/`
- **Resposta:**  
  - 200 OK  
  - Exemplo:  
    ```json
    [
      {
        "id": 1,
        "name": "Produto Exemplo",
        "price": 10.5
      }
    ]
    ```

---

### 2. Buscar produto por ID

- **GET** `/api/products/{id}`
- **Resposta:**  
  - 200 OK  
  - 404 Not Found (se não existir)
- **Exemplo de resposta de erro:**  
  ```json
  { "message": "Produto não encontrado" }
  ```

---

### 3. Criar produto

- **POST** `/api/products/`
- **Body (JSON):**
  ```json
  {
    "name": "Nome do Produto",
    "price": 99.99
  }
  ```
- **Validações:**
  - `name`: string, mínimo 3 caracteres, obrigatório
  - `price`: número positivo, obrigatório
- **Respostas:**
  - 201 Created (produto criado)
  - 400 Bad Request (validação falhou)
- **Exemplo de erro de validação:**
  ```json
  { "message": "\"name\" is required" }
  ```

---

### 4. Atualizar produto

- **PUT** `/api/products/{id}`
- **Body (JSON):**
  ```json
  {
    "name": "Novo Nome",
    "price": 150.00
  }
  ```
- **Validações:** iguais ao POST
- **Respostas:**
  - 200 OK (produto atualizado)
  - 404 Not Found (produto não existe)
  - 400 Bad Request (validação falhou)

---

### 5. Remover produto

- **DELETE** `/api/products/{id}`
- **Respostas:**
  - 204 No Content (removido)
  - 404 Not Found (produto não existe)

---

## Validação

A validação dos dados é feita com o pacote **Joi**.  
Se algum campo obrigatório faltar ou estiver inválido, a API retorna erro 400 com mensagem descritiva.

---

## **Erros Encontrados no Código**

### 1. Erro de Importação das Rotas

No arquivo [`src/index.js`](src/index.js):

```js
const productRoutes = require('./route/productsRoute');
...
app.use('/api/products', productRoutes);
```
**Problema:**  
O arquivo [`src/route/productsRoute.js`](src/route/productsRoute.js) exporta um objeto `{ router }`, mas está sendo importado diretamente.  
**Solução:**  
Altere a exportação para:
```js
module.exports = router;
```
Ou, na importação:
```js
const { router: productRoutes } = require('./route/productsRoute');
```

---

### 2. Parâmetros dos Controllers Invertidos

No arquivo [`src/controller/productController.js`](src/controller/productController.js):

```js
const getAllProducts = (res, req) => { ... }
```
**Problema:**  
A ordem correta dos parâmetros é `(req, res)`, não `(res, req)`.  
**Solução:**  
Troque para:
```js
const getAllProducts = (req, res) => { ... }
```
Faça isso para todos os métodos do controller.

---

### 3. Variáveis com Nomes Iguais

No controller, há redefinição de variáveis, por exemplo:
```js
const products = products.find(...)
```
**Problema:**  
Está sobrescrevendo o array `products` com um único produto.
**Solução:**  
Use nomes diferentes, por exemplo:
```js
const product = products.find(...)
```

---

### 4. Métodos Exportados com Nomes Diferentes

No controller:
```js
const updateProducts = ...
const deleteProducts = ...
```
No router:
```js
const { updateProduct, deleteProduct } = require('../controller/productController');
```
**Problema:**  
Os nomes exportados e importados não batem.
**Solução:**  
Padronize os nomes para `updateProduct` e `deleteProduct` em todos os arquivos.

---

### 5. Model Vazio

O arquivo [`src/models/productModel.js`](src/models/productModel.js) está vazio.  
**Sugestão:**  
Se não for usar um banco de dados, pode remover ou implementar lógica de persistência futura.

---

### 6. Nome do Arquivo de Validador

O arquivo está como `productValitador.js` (com erro de digitação).  
**Sugestão:**  
Renomeie para `productValidator.js` para manter o padrão e evitar confusão.

---

## Exemplo de Requisições com cURL

**Criar produto:**
```bash
curl -X POST http://localhost:3000/api/products \
-H "Content-Type: application/json" \
-d '{"name":"Produto Teste","price":10.5}'
```

**Atualizar produto:**
```bash
curl -X PUT http://localhost:3000/api/products/1 \
-H "Content-Type: application/json" \
-d '{"name":"Produto Atualizado","price":20.0}'
```

---

## Observações Finais

- Corrija os erros acima para garantir o funcionamento correto da API.
- Considere implementar persistência em arquivo ou banco de dados para uso real.
- Sempre valide os dados de entrada para evitar problemas de integridade.

---

# Link de Projeto Referencia
*https://github.com/alinealien/boas-praticas-para-IAs*