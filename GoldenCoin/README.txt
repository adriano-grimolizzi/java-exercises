This is my solution to the following problem:

GOAL

After overcoming a difficult video game boss, it's time for you to get your reward:
you arrive in a treasure room. In this game, your character can pick up two kinds
of items:
- Gold coins, which increase your wealth by one.
- The multipliers, which double the fortune you have at the moment of picking
them up.
So the more you are already rich, the more you get rich. The room is represented
by a square grid of size NxN, and you start in the top left corner. The objective is
to determine the sequence of movements that will allow you to maximize your
loot.

DATA

Input:

Row 1 to N + 1: the rows of the map represented by strings of N characters. The
characters in the line are either o (a part) or * (a multiplier) or . (empty).
Output
A string of characters, indicating the successive movements to be made by your
character. The possible characters are:
- ^: move one cell up
- v: move one cell down
- <: move one cell to the left
->: move one cell to the right
- x: pick up the object on the current box
It is requested that this chain indicates legal movements: the character must not
leave the edges of the grid, nor try to pick up an object on a cell containing no
object. (After being picked up, an object disappears from its cell.) It must also
reach the highest score possible.

Example:

....
o.*o
....
....

An accepted output is vx>>>x<x:
- We go down one cell (v) on the left-most coin, then pick it up (x);
- We move 3 squares to the right, to reach the room on the right (passing
above the *, which does not activate yet);
- We pick up this second room, then we move to the left on the multiplier,
which we pick up in turn.
So we get a total of 4 pieces (ie (1 + 1) × 2), that's the best we can do. For example,
if we had used the multiplier before recovering the second coin, we would have
only got 3 coins. There are other ways to move to end up having 4 pieces, which
are also accepted solutions.