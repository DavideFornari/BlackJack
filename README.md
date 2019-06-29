# BlackJack
Progetto Programmazione con Laboratorio

Creatori:
  Davide Fornari
  Luca De Togni
  Malina Elena Gradinaru
  Enrico Negro
  
Programma java eseguibile da terminale che simula una partita di BlackJack, con il giocatore che interagisce attivamente nella partita

Strutturato in più sotto classi:
  - Carta, con le caratteristiche peculiari come valore, numero, seme e metodo toString adatto
  - Mazzo, con i metodi di estrazione della carta e di mescolamento
  - Mano, che è l'oggetto che il giocatore effettivamente modifica con le sue giocate
  - Giocatore, l'oggetto che simula il giocatore stesso
  - Banco, oggetto che simula il banco del BlackJack
  - Partita, che permette al gioco di svolgersi e contiene tutti i metodi per le mosse che può eseguire il giocatore
  - BlackJack, classe contenente il main

Il programma permette all'utente di:
  - Scegliere quanti giocatori giocheranno
  - Numero di mazzi da utilizzare
  - Ogni giocatore sceglie il proprio nome, tipo di conteggio per le carte e budget iniziale
  - Ad ogni turno inizialmente il giocatore scelglie quanto puntare e poi compie la sua strategia tramite le mosse consentite in base alla configurazione della partita
  
Il programma termina quando tutti i giocatori o hanno perso tutti i loro soldi o hanno scelto di smettere di giocare
