class Ball {
  float diameter = 30;
  float poolT, poolB, poolR, poolL;
  float posX, posY;
  float movX, movY;
  float R, G, B;
  float posWall;
  boolean wall;
  boolean cue;
  float wallX;

  
  Ball( float Left, float Top, float Right, float Bottom, boolean cue ) {
    if(cue){
      //cue starting movement and color
      movX = 0;
      movY = 0;
      R = 255;
      G = 255;
      B = 255;
      this.cue = cue;
    }else{
      
  //where the balls will start, and assigns a color
      posY = random(Top + diameter/2, Bottom - diameter/2);
      posX = random(Left + diameter/2, Right - diameter/2);
      movX = random(-2, 2);
      movY = random(-2, 2);
      R = random(255);
      G = random(255);
      B = random(255);
    }
    int(R); int(G); int(B); //converting to ints
    
    
  }
  
 
  void borders( float poolL, float poolR,  float poolT, float poolB, float wallX ) {
    if(cue){
      posX = poolL + ((poolR - poolL)/4);
      posY = poolT + ((poolB - poolT)/2);
    }
  //setting where the balls will bounce, only needs to be run once
    this.poolT = poolT;
    this.poolB = poolB;
    this.poolR = poolR;
    this.poolL = poolL;
    
    this.wallX = wallX;
    
  }

  void displayMovement(int number) {
    //displays ball and ball #
    posX += movX;
    posY += movY;
    
    fill(R, G, B);
    ellipse(posX + 3, posY, diameter, diameter);
    fill(255);
    if(cue == false){
      //cue has no text
      text (number, posX, posY - diameter/2);
    }
  }
  
  //handling collisions with the wall and the pool table edges
  void collisions( boolean wall ) {
    this.wall = wall;
    
    if ( posX > poolR - diameter/2 || posX < poolL + diameter/2 ) movX *= -1;
    if ( posY < poolT + diameter/2 || posY > poolB - diameter/2 ) movY *= -1;
    if ( wall){
      if ( posX < wallX + diameter/2 ) movX *= -1;
    }
  }
  
  void ballCollide(Ball A) {
  //checking if balls collide and switching velocities
    float temp;
    
    if ( dist( A.posX, A.posY, this.posX, this.posY ) < diameter ) {
    temp=A.movX; A.movX=this.movX; this.movX=temp;  
    temp=A.movY; A.movY=this.movY; this.movY=temp;
    }
  }
  
  void reset(){
    if(cue){
      posX = poolL + ((poolR - poolL)/4);
      posY = poolT + ((poolB - poolT)/2);
      movX = 0;
      movY = 0;
    }else{
      posY = random(poolT + diameter/2, poolB - diameter/2);
      posX = random(wallX + diameter/2, poolR - diameter/2);
      movX = random(-2, 2);
      movY = random(-2, 2);
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
