# 🚀 User API - Spring Boot

Esta é uma API REST simples desenvolvida com Spring Boot para gerenciar usuários em memória (sem uso de banco de dados).

## 📦 Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Web
- Lombok
- Maven

## 📘 Endpoints da API

### 🔹 GET `/users`

📄 **Descrição:** Retorna todos os usuários cadastrados.

📤 **Resposta (`200 OK`):**
```json
[
  {
    "id": 1,
    "name": "Maria",
    "age": 25
  },
  {
    "id": 2,
    "name": "João",
    "age": 30
  }
]
```

### 🔹 POST `/users`

📄 **Descrição:** Cria um novo usuário.

📥 **Requisição (JSON):**
```json
{
  "name": "Carlos",
  "age": 28
}
```

📤 **Resposta (`201 Created`):**
```json
{
  "id": 3,
  "name": "Carlos",
  "age": 28
}
```

📑 **Status Codes:**
- `201 Created` – Usuário criado com sucesso
- `400 Bad Request` – Requisição inválida

### 🔹 PUT `/users/{id}`

📄 **Descrição:** Atualiza um usuário existente pelo ID.

📥 **Requisição (JSON):**
```json
{
  "name": "Carlos Silva",
  "age": 29
}
```

📤 **Resposta (`200 OK`):**
```json
{
  "id": 3,
  "name": "Carlos Silva",
  "age": 29
}
```

📑 **Status Codes:**
- `200 OK` – Usuário atualizado com sucesso
- `404 Not Found` – Usuário não encontrado

### 🔹 DELETE `/users/{id}`

📄 **Descrição:** Remove um usuário existente pelo ID.

📤 **Resposta (`204 No Content`)**
Sem corpo na resposta.

📑 **Status Codes:**
- `204 No Content` – Usuário removido com sucesso
- `404 Not Found` – Usuário não encontrado

## ✅ Exemplos com curl

```bash
# Criar usuário
curl -X POST http://localhost:8080/users \
-H "Content-Type: application/json" \
-d '{"name": "Joana", "age": 35}'

# Listar usuários
curl-X GET http://localhost:8080/users

# Atualizar usuário
curl -X PUT http://localhost:8080/users/1 \
-H "Content-Type: application/json" \
-d '{"name": "Joana Costa", "age": 36}'

# Deletar usuário
curl -X DELETE http://localhost:8080/users/1
```

## 📁 Estrutura do Projeto

```
src/main/java/com/example/Usuario
│
├── controller
│   └── UserController.java
├── model
│   └── User.java
├── service
│   └── UserService.java
└── UserApiApplication.java
```

## 🟢 Como rodar o projeto

1. Clone o repositório
2. Importe o projeto no IntelliJ ou VS Code
3. Execute a classe `UsuarioApplication`
4. Acesse http://localhost:8080/users 