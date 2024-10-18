## Projeto Rest para aprender a publicar API na nuvem
<ul>
  <li>Spring Boot 3</li>
  <li>Java 17</li>
  <li>Railway</li>
  <li>H2 database</li>
  <li>PostgresSQL</li>
  <li>Gradle</li>
</ul>

## Diagrama de classes
```mermaid
classDiagram
    class User {
        -String name
        -Account account
        -Feature[] features
        -Card[] card
        -News[] news
    }

    class Account {
        -String number
        -String agency
        -double balance
        -double limit
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String number
        -double limit
    }

    class News {
        -String icon
        -String description
    }

    User "1" *--> "1" Account
    User "1" *--> "N" Feature
    User "1" *--> "1" Card
    User "1" *--> "N" News

```
