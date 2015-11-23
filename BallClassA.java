class Ball {
  float diameter = 30;
  float poolT, poolB, poolR, poolL;
  float posX, posY;
  float movX, movY;
  float a, b, c;
  float posWall;
  boolean wall;
  float wallPos;

  Ball( float Top, float Bottom, float Right, float Left, boolean W, float wallX ) {
    posY = random(Top + diameter/2, Bottom - diameter/2);
    posX = random(Left + diameter/2, Right - diameter/2);
    movX = random(-2, 2);
    movY = random(-2, 2);
    a = random(255);
    b = random(255);
    c = random(255);
    int(a); int(b); int(c); //converting to ints
    poolT = Top;
    poolB = Bottom;
    poolR = Right;
    poolL = Left;
    wall = W;      //boolean for if wall is there
    wallX = wallPos;
  }

  void display(int number) {
    //displays ball and ball #
    fill(a, b, c);
    ellipse(posX + 3, posY, diameter, diameter);
    fill(255);
    text (number, posX, posY - diameter/2);
  }
  void movement() {
    posX += movX;
    posY += movY;
  }
  void Collisions() {
    //handling all collisions
    if ( posX > poolR - diameter/2 || posX < poolL + diameter/2 ) movX *= -1;
    if ( posY < poolT + diameter/2 || posY > poolB - diameter/2 ) movY *= -1;
    if ( wall = true){
      if ( posX < wallPos ) movX *= -1;
    }
  }
}



/*
 
 void resetBall1(){
 redX  = random(wallR + ballDia/2, tableR - ballDia/2);
 redY  = random(tableT + ballDia/2, tableB - ballDia/2);
 redDX = random(-2, 2);
 redDY = random(-2, 2);
 }
 
 void resetBall2(){
 bluX  = random(wallR + ballDia/2, tableR - ballDia/2);
 bluY  = random(tableT + ballDia/2, tableB - ballDia/2);
 bluDX = random(-2, 2);
 bluDY = random(-2, 2);
 }
 
 void resetBall3(){
 yelX  = random(wallR + ballDia/2, tableR - ballDia/2);
 yelY  = random(tableT + ballDia/2, tableB - ballDia/2);
 yelDX = random(-2, 2);
 yelDY = random(-2, 2);
 }
 */
