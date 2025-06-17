# Capco
Projet de démo

D'abord j'utilise spring initializr pour générer un projet maven, java 21.<br>
Je crée une architecture hexagonal générique

J'ajoute un Controller rest basique juste pour pouvoir démarrer le serveur.

mvn clean install <br>
mvn test

sont fonctionnels

ensuite<br>
panier-client$ mvn spring-boot:run<br>
en ligne de commande démarre le serveur à http://localhost:8080/calcul-panier

push sur git

Ensuite je crée les classes domain, susceptibles de varier ensuite mais donnent une base de travail de départ.
Par défaut, je les crée en immutables.

Etape suivante je crée le useCase, son implementation et son test qui échoue puisque je n'ai pas codé la logic métier.

Maintenant on crée une version basique qui fonctionne avec le test.

A présent on ajoute une factory pour créer la bonne instance de TarificationPort, ainsi non seulement on n'a pas 
de connaitre le tarificateur dans le métier et en plus on pourra facilement modifier l'implementation 
de récupération des prix sans impacter le métier.

l'appel au controleur affiche "Le client M. Dupont a un panier d'une valeur de 2700"

pour cela il suffit de taper les commande<br>
mvn clean install<br>
mvn spring-boot:run


Les tests sont en place pour controler qu'on a des résultats attendus pour particulier, pro avec CA > 10 000 000
et pro avec CA inférieur