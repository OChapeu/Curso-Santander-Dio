# Atividade do Bootcamp Santander 2024

Java RESTful API criada para uma atividade do Bootcamp.

## Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
  class Game {
    Long id
    String title
    String genre
    String platform
    int hoursPlayed
  }

  class User {
    Long id
    String username
    String email
    String password
  }

  Game "1" *-- "1..*" User
```
