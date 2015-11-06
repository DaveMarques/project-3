# project-3:

Redo project 2, using Objects (classes for Ball, Button, etc.)

Table has four sides, plus a "wall" down the middle (as in the midterm exam).  
 * Use a *while* loop to display blades of grass evenly spaced along the bottom of the screen.  
 * Use a *for* loop to display a random number of small clouds drifting left to right above the table.  
 **(A new random number of clouds, from one to seven, is computed when clouds disappear to the right.)**

FIVE pool balls, each with a different color and a different number on it.  
The "cue" ball is white, with no number; it starts at rest, in the middle of the LEFT half of the table.  
Balls bounce off sides of table (left or wall, top, right, bottom), and collide "elastically" with one another.  
(In an "elastic" collision, velocities are exchanged, i.e. DX & DY of one ball become DX & DY of the other ball!)  

Add **buttons** to do the following:

  - RESET:  Reset four balls to a random velocities and positions on the right half.  
  Also restore the "wall" and reset cue ball with NO velocity, centered within LEFT half of table.

  - WALL:  Remove the "wall" (and allow balls to move anywhere within the table).
  
  - BIRD:  An **animated** bird flies across the table from right to left.  
  If this button is clicked AGAIN while bird is still visible on the screen,  
  the bird drops a "bomb" which falls downward with increasing Y and DY (but the same DX as the bird).

  - RAT:   An **animated** "rat" appears on the left side of the table at random Y,
  and runs across the table from left to right (with random random DY and random but positive DX, each frame).  

When the "rat" collides with a ball, the ball stop moving (DX=0, DY=0),
but the rat continues to get random DX and DY each frame.

The score is increased by ONE for each ball-to-ball collision,  
but the score is reduced by TEN when the rat hits a ball.

Clicking on any ball should reset ONLY that ball, and deducts FIVE points from the score.
Clicking on the "rat" makes it disappear, and adds FIFTY points to the score.

