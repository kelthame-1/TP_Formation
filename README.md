# Système de Gestion de Blog & Produits (Spring Boot API)

Ce projet est une application backend développée avec **Spring Boot**. Il permet de gérer des articles de blog et des produits, tout en illustrant la gestion des relations entre entités dans une base de données.

## 🚀 Fonctionnalités principales
- **Gestion des Produits :** Opérations CRUD pour les produits.
- **Gestion du Blog :**
    - Création d'articles (Posts).
    - Ajout de commentaires associés à chaque article (Relation **One-to-Many**).
- **Base de données :** Utilisation de H2 (In-memory) pour un développement rapide.

## 🛠 Technologies utilisées
- **Langage :** Java 21
- **Framework :** Spring Boot, Spring Data JPA
- **Base de données :** H2 Database
- **Outil de test :** Postman

##  API Endpoints
Voici les routes disponibles pour interagir avec l'API :

| Méthode | Route | Description |
| :--- | :--- | :--- |
| `POST` | `/api/posts` | Créer un nouvel article |
| `GET` | `/api/posts` | Récupérer tous les articles avec leurs commentaires |
| `POST` | `/api/posts/{postId}/comments` | Ajouter un commentaire à un article spécifique |

## 📁 Structure du Projet
```text
src/main/java/com/example/TP_Formation/
├── config/         # Configuration de sécurité
├── controller/     # Endpoints de l'API
├── model/          # Entités (Post, Comment, Product)
├── repository/     # Interfaces d'accès aux données
└── TpFormationApplication.java

