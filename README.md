# Capco
Projet de démo

D'abord j'utilise spring initializr pour générer un projet maven, java 21
Je crée une architecture hexagonal générique

j'ajouter un Controller rest basique juste pour pouvoir démarrer le serveur

mvn clean install
mvn test

sont fonctionnels

ensuite
panier-client$ mvn spring-boot:run
en ligne de commande démarre le serveur à http://localhost:8080/calcul-panier

push sur git

ensuite je crée les classes domain, susceptibles de varier ensuite mais donnent une base de travail de départ.
Par défaut, je les crée en immutables.

Etape suivante je crée le useCase, son implementation et son test qui échoue puisque je n'ai pas codé la logic métier.

Maintenant on crée une version basique qui fonctionne avec le test.