# BlackJack

A terminal-based Blackjack simulator written in Java, with multiple players, configurable decks, betting, and an optional card-counting advisor.

> University project — *Programmazione con Laboratorio*, BSc in Applied Mathematics, University of Verona (2019).
> Built as a team of four. Archived and kept public as a record of early coursework.

---

## What it does

The program runs a full Blackjack session against a computer-controlled dealer:

- **Table setup** — choose the number of players and the number of decks in the shoe.
- **Player setup** — each player picks a name, a starting budget, and a card-counting mode.
- **Betting** — every round starts with each player placing a bet from their budget.
- **Moves** — hit, stand, double down, and split, enabled according to the table configuration.
- **Dealer logic** — the dealer draws until reaching a score above 17, following standard house rules.
- **Card counting** — the program keeps a running count of the shoe and flags rounds where the count favours the player.
- **End of session** — play continues until every player has either run out of money or chosen to leave the table.

In-game rules and help text are in Italian (see `help.txt`).

## Running it

The project has no external dependencies — a JDK is all that's needed.

```bash
git clone https://github.com/DavideFornari/BlackJack.git
cd BlackJack
javac *.java
java BlackJack
```

## Project structure

The game is split into single-responsibility classes:

| Class | Responsibility |
|---|---|
| `Carta` | A single card: value, rank, suit, and its display form |
| `Mazzo` | The shoe: shuffling and drawing |
| `Mano` | A hand: the object a player actually acts on |
| `Giocatore` | A player: budget, bets, and counting mode |
| `Banco` | The dealer, with its fixed drawing rules |
| `Partita` | Round flow and the set of legal moves |
| `BlackJack` | Entry point (`main`) |

Naming is in Italian, matching the course conventions of the time.

## Rules reference

`help.txt` contains the rules the implementation follows: card values, the 3:2 payout on a natural blackjack, the conditions for double down and split, bust handling, and the dealer's drawing threshold.

## Team

Davide Fornari · Luca De Togni · Malina Elena Gradinaru · Enrico Negro

## Status

Not maintained. Kept public as-is.
